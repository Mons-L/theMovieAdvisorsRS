
# Document de conception du projet *The Movie Advisors*

## :black_medium_square: Description du service
Le but de notre service web est d'enregistrer et fournir des informations pour les prochaines événements, que ce soit :
  * Par région.
  * Par artiste. 
  
Nous avons donc crée un  client pour consommer ce Service Web. 
Celui-ci doit afficher les événements triés par artiste et inclure sa nationalité récupérer à partir du Service Web.
Nous avons utilisé l'API de Spotify afin de récupérer les informations nécéssaires.

## :black_medium_square: Description du client
La description du client est disponible dans ce référentiel :
 * Lien vers le référentiel du projet RS (client) : https://github.com/Salma-Bch/TheMovieAdvisorsRSClient.git

## :black_medium_square: Démonstration des fonctionnalité de l'implémentation
Nous avons crée les 3 packages suivant afin d'organiser le code :
  * event.management.web.data
  * event.management.web.resource
  * event.management.web.service

### :black_medium_small_square: Classes de données
Le package event.management.web.data contient les classes de donnée utile au projet.
* **_Artist_**
 
    Un artiste possède un id, un nom et une nationalité.
   
 * **_Event_**
 
    Une évènement possède un id, un nom, une date et une région.

### :black_medium_small_square: Ressources
Le package event.management.web.rsource contient la classe des ressources d'un évènement.
* **_EventResource_**
 
    Celle-ci contient les méthodes permettant :
    * D'ajouter un évènement.
    * De récupérer un évènement à partir d'une région
    * De récupérer un évènement à partir d'un artiste.
    * De récupérer tout les évènements.
   
### :black_medium_small_square: Services
Le package event.management.web.service contient la classe de service d'un évènement.

 * **_EventService_**
 
    Celle-ci conteint les méthodes permettant de :
    * De récupérer un nouvel identifiant.
    * D'ajouter un évènement.
    * De récupérer un évènement à partir d'une région.
    * De récupérer un évènement à partir d'un artiste.
    * De récupérer tout les évènements.
   
## :black_medium_square: Autres
Voici les liens vers les autres référentiels sur la plateforme GitHub :
  * Lien vers le référentiel du projet WS : https://github.com/Salma-Bch/theMovieAdvisorsWS.git
  * Lien vers le référentiel du projet RS : https://github.com/Mons-L/theMovieAdvisorsRS.git
  * Lien vers le référentiel du projet WS (client) : https://github.com/Salma-Bch/TheMovieAdvisorsWSClient.git
  * Lien vers le référentiel du projet RS (client) : https://github.com/Salma-Bch/TheMovieAdvisorsRSClient.git

## :black_medium_square: Auteurs
**_Projet réalisé par :_**
* **_Salma BENCHELKHA (salmabenchelkha@gmail.com)_**
* **_Mouncif LEKMITI (m.lekmiti@hotmail.com)_**

