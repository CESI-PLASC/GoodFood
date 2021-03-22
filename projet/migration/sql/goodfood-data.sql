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
	(1, "Petit creux", 20.99)
;

insert into goodfood.Adresse (id, pays, code_postal, rue, ville) values
	(1, "France", "16200", "17 Route de Bellevue", "Jarnac"),
    (2, "France", "16100", "67Bis Rue François Premier", "Cognac")
;

insert into goodfood.Franchise (id, designation, email, telephone_fixe, telephone_mobile, adresse_id) values
	(1, "Le premier franchisé", "franchise@test.fr", "0545050505", "0606060606", 1),
    (2, "Le second franchisé", "franchise2@test.fr", null, null, 2)
;

insert into goodfood.fcategorie (categorie_id, franchise_id) values
	(1, 1),
    (2, 1),
    (3, 1),
    (1, 2),
    (2, 2)
;

insert into goodfood.Produit (id, designation, prix) values 
	(1, "Hamburger maison", 19.99),
    (2, "Salade césar", 14.99)
;

insert into goodfood.categorise (produit_id, categorie_id) values
	(1, 2),
    (2, 1),
    (2, 2)
;

insert into goodfood.Commande (id, date_creation, date_donnee, statut_id, franchise_id) values 
	(1, "2020-01-01 12:00:00", "2020-01-01 12:00:00", 1, 1),
    (2, "2020-01-01 12:00:00", "2020-01-01 12:00:00", 4, 1)
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

-- insert into goodfood.Composition (commande_id, formule_id, produit_id, quantite) values
-- 	(1, 1, 1, 1),
--     (1, 1, 2, 1)
-- ;