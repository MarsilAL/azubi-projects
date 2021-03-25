newsPaperApp (SPA, webapp)
=========================

Der Kunde benötigt eine (web)App, die ihr aktuelle Nachrichten zu einem Begriff anzeigt. Diese App sollte aus dem Internet erreichbar sein, jedoch nur mit einem Password verwendet werden können. Der Kunde verwendet einen Browser und ab und zu sein Handy.

Folgende API kannst du verwenden: https://sandbox-api.ipool.asideas.de

Um die letzten 5 Artikel zu finden, die das Wort 'Putin' beinhalten machst du folgende Anfrage: https://sandbox-api.ipool.asideas.de/sandbox/api/search?q=Putin&limit=5

Zeitrahmen
------------
Du hast eine Woche Zeit für die Umsetzung. 

Zur Vorbereitung
----------------
- Beschreibe anfangs die Nutzerinteraktion (UML interaction diagram)
- Male einen low fidelity UI Sketch für Browser und Handy 
- Überlege danach wie die Software Komponenten / Architektur aussehen könnte, bzw. wie du das Problem in Teilbereiche zerlegen kannst (pseudo UML)
- Plane die Woche mit konkreten User Stories als Issues in deinem Github Repo
- Bevor du eine Story anfängst definiere subtasks als 'github checkboxes' und bespreche diese mit uns


Anmerkungen
-----------

Es sollte ein automatische Deployment (commit -> testing -> deployment) eingerichtet sein. Du committest deine Änderungen, es werden Tests ausgeführt und bei Erfolg ein Deployment durchgeführt. Für das Deployment kannst du deine webseite 

- Schreibe Unit-tests für kleine Funktionalitäten der Komponenten. (jest is your friend)
- Schreibe Acceptance tests um die Nutzerinteraktion deiner Anwendung zu testen. (cypress is your friend)
- Bitte verwende für das Projekt die Programmiersprache Javascript, html und (s)css. (react? vue? vanillajs? your pick)
