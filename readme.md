# Labforward Full-Stack Code Challenge

This is my implementation of the Labforward code challenge.

# Task

Develop a simple Java REST API endpoint that takes a notebook entry with text and requests the frequency of a particular word in the text. It should return the frequescy of the word and similar words to it.

## Scope of my solution
- An API controller endpoint that the frontend applicaiton can interact with
- A service interface and implementation class that handles the logic
- Unit tests on the API
- API documentation using Swagger UI

## Time spent
Frontend - 3 hours
Backend - 3 hours
Test - 1 hour

## User Interface
- A simple frontend application built with Angular using [Angular Material](https://material.angular.io/) compnents

## Likely Improvements
- More test coverage
- Aility for users to upload a text file rather than paste the content of the notebook
- Batch processing abilities using background tasks and queues


## Installation information
Backend 

    $ mvn spring-boot:run
Server is hosted at [http://localhost:8080/](http://localhost:8080/).
Swagger UI - http://localhost:8080/swagger-ui.html

Frontend

    npm install
    ng serve -o
![Frontend applicaiton](https://github.com/paulonevrything/labforward-code-challenge/blob/main/frontend-application.png)
