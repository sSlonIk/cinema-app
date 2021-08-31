[![Build Status](https://api.travis-ci.com/den4eg007/taxi-service.svg?branch=master)](https://travis-ci.com/den4eg007/taxi-service)

## Cinema application

---
CinemaApp is an application to manage tickets bought on the occasion of a cinema session by a user. An app can be used
to organize the interactions between the customer and selling department, a user has an opportunity to choose available
sessions, purchase tickets, make an order, view order history, login and register.

### Usage

---
<h3> Guest (unauthorized and non registered) can do the following:</h3>

- register
- login

<h3>Authenticated user:</h3>

- has the same capabilities as the guest + capability to
    - view all data about movie sessions, movies and cinema halls
    - add tickets to shopping cart
    - view order history
    - complete orders
    - check current shopping cart

<h3> Admin: </h3>

- has the same capabilities of user, additionally can
    - add new movie sessions/cinema halls
    - manage movies, movies sessions and cinema halls
    - manage schedule
    - look info about users 

### Technologies

---

- Spring - Core / MVC / Security
- MySQL
- Hibernate
- Apache Maven
- Tomcat
- JSON

### Configuration

---

1. Clone this project into your local folder and open the project in an IDE.
2. Configure a Local Tomcat server: deployment - war_exploded, context address - "/"
3. Insert your own MySQL username and password in db.properties and setup new connection with:
    - user: "your username"
    - password: "your password"
    - url: jdbc:mysql://aaaa:bbbb/cccc?serverTimezone=UTC , where:
    - aaaa - host name,
    - bbbb - port,
    - cccc - database name.
4. Run a project
5. You can log in with the following:
    - Admin:(name: "bob@i.ua", password:"11111");
    - User:(name: "alice@i.ua", password:"22222");
    - or create your own in `cinema/config/DataInitializer`.