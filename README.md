# 🏗️ Microservices avec Spring Boot

## 📖 Description
Ce projet illustre une architecture **microservices** développée avec **Spring Boot** et **Spring Cloud**, comprenant plusieurs services interconnectés.

### 🔹 Services :
- **Customer Service** : Gestion des clients.
- **Account Service** : Gestion des comptes bancaires.
- **Gateway Service** : API Gateway centralisant l’accès.
- **Discovery Service** : Service de découverte (Eureka).
- **Config Service** : Gestion centralisée de la configuration.
- **Circuit Breaker** : Protection contre les pannes (Resilience4J).
- **Docker** : Conteneurisation et orchestration.

---

## 🚀 Technologies Utilisées
- **Java 17+**
- **Spring Boot & Spring Cloud** : Web, Data JPA, Gateway, Eureka, OpenFeign, Resilience4J, Actuator.
- **Base de données** : H2 (mémoire).
- **Docker & Docker Compose** pour le déploiement.

---

## ⚙️ Installation et Exécution

1️⃣ **Cloner le projet** et naviguer vers le dossier.  
2️⃣ **Configurer les services** via les fichiers `application.yml` ou le **Config Service**.  
3️⃣ **Lancer les services individuellement** via Maven ou Gradle.  
4️⃣ **Lancer avec Docker Compose** pour exécuter tous les services en conteneurs.

Les services seront accessibles sur les ports suivants :
- **Discovery Service** : `http://localhost:8761`
- **Gateway API** : `http://localhost:8888`
- **Customer Service** : `http://localhost:8082/customers`
- **Account Service** : `http://localhost:8081/accounts`

---

## 📌 Endpoints Principaux

| Service         | Endpoint                 | Description               |
|---------------|-------------------------|---------------------------|
| **Customer**  | `/customers`             | Liste des clients         |
| **Customer**  | `/customer/{id}`         | Détails d'un client       |
| **Account**   | `/accounts`              | Liste des comptes         |
| **Account**   | `/account/{id}`          | Détails d'un compte       |
| **Gateway**   | `/service/{route}`       | Proxy vers un service     |
| **Discovery** | `/`                       | Tableau de bord Eureka    |

---

## 🛠️ Bonnes Pratiques

- **Utilisation de DTOs** pour éviter d'exposer directement les entités.
- **Feign Clients** pour la communication entre services.
- **Circuit Breaker (Resilience4J)** pour améliorer la résilience.
- **Configuration centralisée** avec **Spring Cloud Config**.

---

## 🐳 Déploiement avec Docker

1️⃣ **Construire et exécuter les conteneurs** via Docker Compose.  
2️⃣ **Vérifier les logs** pour assurer le bon fonctionnement des services.  
3️⃣ **Arrêter les conteneurs** proprement si nécessaire.

