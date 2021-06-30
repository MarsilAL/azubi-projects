# NewsPaperApp
================

Tags: Authentication, SPA, Docker, API, Node.js, TestingPyramide, Agile, AdaptiveWebDesign

Der Kunde benötigt eine (Web)App, die ihr aktuelle Nachrichten zu einem Begriff anzeigt. Diese App sollte aus dem Internet erreichbar sein, jedoch nur mit einem Password verwendet werden können. Der Kunde verwendet einen Browser und ab und zu sein Handy.

Folgende API kannst du verwenden: https://sandbox-api.ipool.asideas.de. Du benötigst von uns vorher Zugangsdaten (bitte anfragen).
Um die letzten 5 Artikel zu finden, die das Wort 'Putin' beinhalten machst du folgende Anfrage:

https://sandbox-api.ipool.asideas.de/sandbox/api/search?q=Putin&limit=5
https://sandbox-api.ipool.asideas.de/swagger-ui.html#!/ipool-v-3/searchUsingGET


## Zur Vorbereitung
----------------

- Beschreibe anfangs die Nutzerinteraktion (UML interaction diagram)
- Male einen low fidelity UI Sketch für Browser und Handy 
- Überlege danach wie die Software Komponenten / Architektur aussehen könnte, bzw. wie du das Problem in Teilbereiche zerlegen kannst (pseudo UML)
- Plane die Woche mit konkreten User Stories als Issues in deinem Github Repo
- Bevor du eine Story anfängst definiere subtasks als 'github checkboxes' und bespreche diese mit uns


## Technische Aufgaben
--------------------------

Es sollte ein automatische Deployment (commit -> testing -> deployment) eingerichtet sein.
Du committest deine Änderungen, es werden Tests ausgeführt und bei Erfolg ein Deployment durchgeführt.

Bitte verwende für das Projekt die Programmiersprache Javascript und als Plattform Heroku.
Die Anwendung soll als Node.js Projekt in einem Docker Container laufen, ein Webserver liefert deine statischen Assets aus (HTML, CSS, JS).

Schreibe Unit Tests für kleine Funktionalitäten der Komponenten.
Siehe dazu auch https://github.com/as-ideas/azubi-javascript
Alternatives Testing Framework: https://jestjs.io/

Schreibe Acceptance Tests um die Nutzerinteraktion deiner Anwendung zu testen.
https://www.cypress.io/how-it-works

