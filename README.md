# DJ Party Service

The **DJ Party Service** is a full-stack application designed to enhance DJ party experiences. It allows users to register for DJ events, submit their song preferences, and provides DJs with a curated playlist based on user inputs. This system ensures that the audience gets their favorite songs played while also helping DJs to prepare an optimal playlist efficiently. Additionally, the service ranks DJs based on user engagement.

The service features both backend and frontend components, with the backend built on Spring Boot and the frontend implemented in React.js.

## Features

### User Features
- Register for DJ events and submit up to 3 song preferences.
- View a personalized experience.

### DJ Features
- Access a consolidated song preference list.
- Generate curated playlists and track user satisfaction.

### Additional Highlights
- Integrated Swagger UI for API testing.
- Postman collection for quick API interaction.
- React-based frontend for seamless user interaction.

## Tech Stack

**Backend**  
- **Language**: Java  
- **Framework**: Spring Boot  
- **Database**: H2 In-Memory Database  
- **Documentation**: Swagger UI  

**Frontend**  
- **Language**: JavaScript  
- **Framework**: React.js  

**Build Tools**  
- **Backend**: Maven  
- **Frontend**: Node.js  

## Project Structure

### Backend
- **Language**: Java  
- **Framework**: Spring Boot  
- **Database**: H2  
- **API Documentation**: Swagger UI  

## Setup Instructions

### Prerequisites
Ensure you have the following installed on your system:
- Java (version 17 or above)
- Maven (version 3 or above)
- Node.js (version 14 or above)
- Postman (optional, for API testing)

### Backend Setup
1. Navigate to the backend directory:
   ```bash
   cd dj-party-backend

   mvn clean package

   java -jar target/dj-party-service-0.0.1-SNAPSHOT.jar

### Prerequisites
The backend provides REST APIs for user and song preference management. 
The API documentation is available through Swagger UI.

**Access the API**
The application will run on http://localhost:****

One can change the port based on port availability
****
http://localhost:9091/users
****
The application exposes one end point to get the profit for each recipe 
Request Type: GET

#### Add User

```http://localhost:****/users
  POST /users
```

#### Returns-Validation

```http
  {
  "name": "John Doe",
  "email": "johndoe@example.com",
  "songPreferences": [
    { "songName": "Song A", "artist": "Artist A" },
    { "songName": "Song B", "artist": "Artist B" }
  ]
}
```
#### Add User

```http://localhost:****/users
  GET /users
```

#### Postman Collection
** A Postman collection for testing the APIs is included. 
Save the following JSON into a file named dj-party-postman-collection.json: **

```http
{
  "info": {
    "name": "DJ Party Service",
    "schema": "https://schema.getpostman.com/json/collection/v2.1.0/collection.json"
  },
  "item": [
    {
      "name": "Add User",
      "request": {
        "method": "POST",
        "header": [
          {
            "key": "Content-Type",
            "value": "application/json"
          }
        ],
        "body": {
          "mode": "raw",
          "raw": "{\n    \"name\": \"John Doe\",\n    \"email\": \"johndoe@example.com\",\n    \"songPreferences\": [\n        { \"songName\": \"Song A\", \"artist\": \"Artist A\" },\n        { \"songName\": \"Song B\", \"artist\": \"Artist B\" }\n    ]\n}"
        },
        "url": {
          "raw": "http://localhost:8080/users",
          "protocol": "http",
          "host": ["localhost"],
          "port": "8080",
          "path": ["users"]
        }
      },
      "response": []
    },
    {
      "name": "Get All Users",
      "request": {
        "method": "GET",
        "header": [],
        "url": {
          "raw": "http://localhost:8080/users",
          "protocol": "http",
          "host": ["localhost"],
          "port": "8080",
          "path": ["users"]
        }
      },
      "response": []
    }
  ]
}
```

#### License

** This project is open-source and available for personal and educational purposes. **
