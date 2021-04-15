package fr.goodfood.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

import org.springframework.stereotype.Service;

import fr.goodfood.entity.Utilisateur;
import fr.goodfood.models.CodePaiementModel;

@Service
public class PaiementService {

    public String genererCodePaiement(Utilisateur utilisateur) {
        HttpURLConnection connection = null;
        String codePaiement = null;
        Gson gson = new Gson();
        try {
            connection = (HttpURLConnection) new URL("http://localhost:5000/api/v1/paiements/utilisateurs")
                    .openConnection();
            connection.setRequestMethod("POST");
            connection.setDoOutput(true);
            connection.setRequestProperty("Content-Type", "application/json");
            connection.getOutputStream().write(gson.toJson(utilisateur).getBytes());

            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            System.out.println(response);

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // print result
            CodePaiementModel codePaiementModel = gson.fromJson(response.toString(), CodePaiementModel.class);
            codePaiement = codePaiementModel.getCodePaiement();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
        return codePaiement;
    }
}
