create or replace view goodfood.commande_formule as 
	select *, row_number() over ( order by commande_id) as id from (
		select commande_id, formule_id from goodfood.composition
	) as compo
;
create or replace view goodfood.formule_produit as
	select *, row_number() over (order by formule_id) as id from (
		select formule_id, produit_id from goodfood.composition
	) as compo
;


select * from goodfood.formule_produit;