# TP-REST

Ce dossier contient 3 projets:

	- HotelService : le web service REST qui gère les hotels, chambres, reservations, clients.
	- AgencesService : le web service REST qui gère les agences, a noter que ce projet propose une CLI pour reserver une chambre en passant par une agence donné.
	- TripAdvisor : ce projet ne propose pas de webservice, il s'agit simplement d'une CLI qui propose d'ajouter des agences (via l'URI de son web service), et de rechercher une chambre, les offres des agences seront comparées et les plus intéréssantes seront gardées.
	
	
Pour lancer les projets, dans l'ordre : 

- Lancez d'abord : HotelServiceApplication.java (HotelService)

	Vous pourrez consultez dans votre navigateur
	- les hotels : http://localhost:8080/hotel
	- les chambres : http://localhost:8080/chambre
	- les clients : http://localhost:8080/client
	- les reservations : http://localhost:8080/reservation
	- les partenaires : http://localhost:8080/partenaire 
	
	(Les autres mapping sont dans "ChambreController.java" et "HotelController.java")



- Ensuite lancez : AgenceServiceApplication.java (AgencesService)

	Vous pourrez consulter dans un navigateur 
	- les agences : localhost:8081/agence/ 
	- les hotels : localhost:8081/hotel/
	
	(Les autres mapping sont dans "AgenceController.java")
	Vous avez la possibilité d'utiliser une CLI (ce n'est pas obligatoire)


	
- Pour finir lancez TripAdvisorApplication.java (TripAdvisor)

	Ce projet ne propose pas de web service, c'est simplement une CLI qui vous permet de :
	- Afficher la liste des agences a comparer
	- Ajouter une agence dans le comparateur (Fournir son URI)
	- Supprimer une agence du comparateur
	- Rechercher une chambre, le comparateur vous retournera les meilleures offres 


/!\ Attention: Les dates s'écrivent comme ceci : AAAA/MM/JJ /!\   
Cela permet de les comparer plus facilement.
