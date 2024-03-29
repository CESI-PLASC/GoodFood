insert into goodfood.categorie (id, designation) values
	(1, "Entrée"),
    (2, "Plat"),
    (3, "Déssert")
;

insert into goodfood.statut (id, designation) values
    (1, "En création"),
	(2, "En attente"),
    (3, "En cours"),
    (4, "En livraison"),
    (5, "Délivré")
;

insert into goodfood.formule (id, designation, prix, est_supprime) values
	(1, "Petit creux", 14.99, 0),
    (2, "Gourmande", 24.99, 0)
;

insert into goodfood.adresse (id, pays, code_postal, rue, ville) values
	(1, "France", "16200", "17 Route de Bellevue", "Jarnac"),
    (2, "France", "16100", "67Bis Rue François Premier", "Cognac"),
    (3, "France", "17100", "12 Route de l'insolence", "Saintes"),
    (4, "France", "79000", "27 Rue de la destiné", "Niort"),
    (5, "France", "16100", "2 Impasse de la gloire", "Chateaubernard")
;

insert into goodfood.utilisateur (id, nom, prenom, date_naissance, email, telephone_mobile, telephone_fixe, stripe) values
    (1, "Raoult", "Didier", "1952-03-13 12:00:00", "didier.raoult@gmail.com", "0505050505", "0606060606", "cus_JILchj0mIXpfYk"),
    (2, "Pesquet", "Thomas", "1978-02-27 12:00:00", "thomas.pesquet@gmail.com", "0505050505", "0606060606", "cus_JILeqep5cG0zM5"),
    (3, "Kressman", "Taylor", "1903-08-19 12:00:00", "kressman.taylor@gmail.com", null, null, "cus_JILeZrMO07qaKj"),
    (4, "Garnier", "Arnaud", "1984-06-18 12:00:00", "garnier.arnaud@gmail.com", null, null, "cus_JILfDQiSq0YrMS"),
    (5, "Gaudu", "David", "1996-10-10 12:00:00", "gaudu.david@gmail.com", null, null, "cus_JILfKfybM9nRXM")
;

insert into goodfood.franchise (id, designation, email, telephone_fixe, telephone_mobile, adresse_id) values
	(1, "Le premier franchisé", "franchise@test.fr", "0545050505", "0606060606", 1),
    (2, "Le second franchisé", "franchise2@test.fr", null, null, 2)
;

insert into goodfood.produit (id, designation, prix, categorie_id, est_supprime) values 
	(1, "Hamburger maison", 19.99, 2, 0),
    (2, "Salade césar", 14.99, 1, 0),
    (3, "Salade de fruits", 4.99, 3, 0),
    (4, "Pizza", 11.99, 2, 0)
;

insert into goodfood.commande (id, date_creation, date_donnee, statut_id, franchise_id, utilisateur_id) values 
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

insert into goodfood.localisation (utilisateur_id, adresse_id, preferee) values
    (1, 2, 1),
    (2, 2, 0),
    (5, 2, 1),
    (5, 1, 0),
    (5, 3, 0),
    (5, 4, 0),
    (5, 5, 0)
;

insert into goodfood.propose (formule_id, franchise_id) values
    (1, 1),
    (2, 1),
    (1, 2)
;

insert into goodfood.requiert (categorie_id, formule_id, quantite) values
    (1, 1, 1),
    (2, 1, 1),
    (1, 2, 1),
    (2, 2, 1),
    (3, 2, 1)
;
