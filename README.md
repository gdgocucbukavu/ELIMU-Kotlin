# Fonctionnalités Mobile – Application Kotlin "Elimu"
## #RoadToMentor - GDG on Campus UCB

Ce README présente les fonctionnalités prévues pour l’application mobile **Elimu**, développée en Kotlin. Il sert de guide pour le développement et la conception UX/UI et décrit l’architecture fonctionnelle en trois parties.

---

## Partie I : Welcome & Connexion

### 1. Onboarding
L’utilisateur découvre l’application via trois pages scrollables qui présentent les missions de la plateforme :

- **Fonctionnalité des vidéos**  
  **Titre :** Plongez dans un océan de contenus vidéo  
  **Description :** Accédez à des milliers de vidéos en streaming, où que vous soyez. Profitez d’une expérience de visionnage fluide et personnalisée en découvrant des contenus passionnants, divertissants et informatifs.

- **Restez en contact avec son mentor**  
  **Titre :** Apprenez et échangez avec votre mentor  
  **Description :** Connectez-vous avec votre mentor via des vidéos interactives. Partagez vos découvertes, posez vos questions et bénéficiez d’un accompagnement personnalisé pour atteindre vos objectifs.

- **Discutez avec l’IA sur une vidéo donnée**  
  **Titre :** Explorez les vidéos avec l'IA  
  **Description :** Interagissez avec l’Intelligence Artificielle pour approfondir votre compréhension des vidéos. Obtenez des résumés, posez des questions et découvrez les informations clés en un instant.

### 2. Connexion
- **Page de connexion**  
  Après l’onboarding, l’utilisateur accède à une page de connexion affichant un message de bienvenue (« Welcome to Elimu ») et proposant un bouton de connexion via Google (Firebase Auth).

- **Sélection des détails complémentaires**  
  - **Track :** Choix parmi plusieurs options (Web, Flutter, Kotlin, Python) via une liste déroulante.
  - **Mentor :** Une page dédiée présente la liste des mentors disponibles pour le track sélectionné. Pour chaque mentor, on affiche :
    - Photo
    - Nom
    - Adresse e-mail
    - Année(s) d’expérience
    - Lien vers le profil LinkedIn ou le CV
    - Filière ou spécialité (ex. Angular/React pour le Web, Android/KMP pour Kotlin, etc.)

### 3. Confirmation
- **Page de confirmation**  
  Cette page récapitule les informations recueillies lors de la connexion :
  - Nom, e-mail et photo (issues du compte Google)
  - Track sélectionné
  - Mentor choisi

L’utilisateur confirme ou modifie ces informations avant d’accéder à l’application principale.

---

## Partie II : HomePage

### 1. Page Principale
- **En-tête**  
  - Photo de profil du mentoré  
  - Message de bienvenue personnalisé (« Salut, *prenom_du_mentoré* »)  
  - Icône de notification

- **Section Vidéos Populaires**  
  - Liste déroulante horizontalement présentant les vidéos les mieux notées du track.
  - Bouton « Voir plus… » redirigeant vers une page détaillée.

- **Section Vidéos Recommandées**  
  - Liste déroulante verticalement affichant les vidéos recommandées par le mentor.
  - Bouton « Voir plus… » pour accéder à une vue complète.

- **Barre de Navigation Inférieure**  
  - Menus principaux : **Home** et **Chat**.

### 2. Liste de Toutes les Vidéos
- **En-tête**  
  - Champ de recherche avancée.
  - Icône de filtre permettant de trier par catégorie, année de publication, note, etc.

- **Contenu**  
  - Affichage de la liste complète des vidéos du track, triées par ordre alphabétique.

### 3. Détail d’une Vidéo Unique
- **Contenu de la Page**  
  - **Lecteur Vidéo :** Intégration ou lien direct pour visionner la vidéo.
  - **Informations sur la Vidéo :**
    - Titre
    - Description
    - Note (étoiles)
    - Nombre de vues
    - Date de publication (année et mois)
  - **Bouton Chat IA :** Permet d’ouvrir une interface de discussion pour obtenir des informations ou poser des questions à l’IA.
  - **Interactions Utilisateur :**
    - Commenter la vidéo
    - Signaler la vidéo
    - Ajouter la vidéo aux favoris

---

## Partie III : ChatPage & Others

### 1. ChatPage
- **Chat avec le Mentor**  
  - Interface de discussion textuelle (évolutive vers des échanges vocaux, images, etc.).
  
- **Chat avec l’IA**  
  - Design similaire au chat mentor avec quelques ajustements pour afficher des réponses spécifiques à l’IA en fonction des demandes du Lead de l’IA.

### 2. Page de Notification
- **Design Simple et Épuré**  
  - Liste des notifications affichées de manière concise.
  - En cliquant sur une notification, l’utilisateur voit les détails essentiels ou la notification est automatiquement marquée comme lue.

### 3. Drawer (Menu Latéral)
- **Accès**  
  - Ouverture via la photo de profil dans la page Home.

- **Contenu du Drawer**
  - **Photo de Banner :** Illustration liée au track de l’utilisateur.
  - **Informations de Profil :**
    - Photo de profil (récupérée via Google)
    - Nom et e-mail
  - **Options de Navigation :**
    - Paramètres
    - Langue
    - À propos
    - Autres pages connexes
  - **Bouton de Déconnexion**  
    Positionné en bas du menu.
  - **Mention Copyright**  
    Affichée sous le bouton de déconnexion, indiquant le copyright de la team web de GDGocucb.

### 4. Profile Page
- **Accès**  
  - Redirection via la photo de profil dans le Drawer.

- **Contenu de la Page de Profil**
  - **Photo de Banner :** Différente selon le track (quatre images prédéfinies).
  - **Photo de Profil :** Issue des informations de connexion Google.
  - **Informations Personnelles :**
    - Nom et e-mail
    - Numéro WhatsApp (optionnel, à ajouter ultérieurement)
    - Track sélectionné
  - **Détails du Mentor :**  
    Affichage des informations du mentor associé.
  - **Historique de Visionnage :**  
    Liste des vidéos regardées par l’utilisateur.
  - **Vidéos Favorites :**  
    Liste des vidéos ajoutées en favoris.

---

*Ce README constitue une feuille de route pour le développement de l’application mobile Elimu en Kotlin, en décrivant l’architecture fonctionnelle et les principales interfaces utilisateur. Il pourra être enrichi au fur et à mesure de l’évolution des fonctionnalités et des retours utilisateurs.*
