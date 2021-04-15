insert into goodfood.Categorie (id, designation) values
	(1, "Entrée"),
    (2, "Plat"),
    (3, "Déssert")
;

insert into goodfood.Statut (id, designation) values
	(1, "En attente"),
    (2, "En cours"),
    (3, "En livraison"),
    (4, "Délivré")
;

insert into goodfood.Formule (id, designation, prix) values
	(1, "Petit creux", 14.99),
    (2, "Gourmande", 24.99)
;

insert into goodfood.Adresse (id, pays, code_postal, rue, ville) values
	(1, "France", "16200", "17 Route de Bellevue", "Jarnac"),
    (2, "France", "16100", "67Bis Rue François Premier", "Cognac"),
    (3, "France", "17100", "12 Route de l'insolence", "Saintes"),
    (4, "France", "79000", "27 Rue de la destiné", "Niort"),
    (5, "France", "16100", "2 Impasse de la gloire", "Chateaubernard")
;

insert into goodfood.utilisateur (id, nom, prenom, date_naissance, email, telephone_mobile, telephone_fixe) values
    (1, "Raoult", "Didier", "1952-03-13 12:00:00", "didier.raoult@gmail.com", "0505050505", "0606060606"),
    (2, "Pesquet", "Thomas", "1978-02-27 12:00:00", "thomas.pesquet@gmail.com", "0505050505", "0606060606"),
    (3, "Kressman", "Taylor", "1903-08-19 12:00:00", "kressman.taylor@gmail.com", null, null),
    (4, "Garnier", "Arnaud", "1984-06-18 12:00:00", "garnier.arnaud@gmail.com", null, null),
    (5, "Gaudu", "David", "1996-10-10 12:00:00", "gaudu.david@gmail.com", null, null)
;

insert into goodfood.Franchise (id, designation, email, telephone_fixe, telephone_mobile, adresse_id) values
	(1, "Le premier franchisé", "franchise@test.fr", "0545050505", "0606060606", 1),
    (2, "Le second franchisé", "franchise2@test.fr", null, null, 2)
;

insert into goodfood.Produit (id, designation, prix) values 
	(1, "Hamburger maison", 19.99),
    (2, "Salade césar", 14.99),
    (3, "Salade de fruits", 4.99),
    (4, "Pizza", 11.99)
;

insert into goodfood.Commande (id, date_creation, date_donnee, statut_id, franchise_id, utilisateur_id) values 
	(1, "2020-01-01 12:00:00", "2020-01-01 12:00:00", 1, 1, 5),
    (2, "2020-01-01 12:00:00", "2020-01-01 12:00:00", 4, 1, 2)
;

insert into goodfood.contenu (id, formule_id, commande_id) VALUES
    (1, 1, 1),
    (2, 1, 1)
;

insert into goodfood.contient (contenu_id, produit_id, quantite) VALUES
    (1, 1, 1),
    (1, 2, 1),
    (2, 2, 2)
;

insert into goodfood.fcategorie (categorie_id, franchise_id) values
	(1, 1),
    (2, 1),
    (3, 1),
    (1, 2),
    (2, 2)
;

insert into goodfood.categorise (produit_id, categorie_id) values
	(1, 2),
    (2, 1),
    (3, 3),
    (4, 2)
;

insert into goodfood.localisation (utilisateur_id, adresse_id, preferee) values
    (1, 2, 1),
    (2, 2, 0),
    (5, 2, 1),
    (5, 1, 0),
    (5, 3, 0),
    (5, 4, 0),
    (5, 5, 0)
;

insert into goodfood.propose (formule_id, franchise_id, prix) values
    (1, 1, 14.99),
    (2, 1, 24.99),
    (1, 2, 14.99)
;

insert into goodfood.requiert (categorie_id, formule_id, quantite) values
    (1, 1, 1),
    (2, 1, 1),
    (1, 2, 1),
    (2, 2, 1),
    (3, 2, 1)
;
