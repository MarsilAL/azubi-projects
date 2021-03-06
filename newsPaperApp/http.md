HTTP & API calls
================

Das Internet ist ein großes Netz von verschiedenen Diensten. Webseiten sind ein wichtiger Teil davon. Wenn du eine Webseite in deinem Browswer öffnest sendet dein Browser eine http GET Anfrage an den Webserver. Dieser sendet als Antwort die Inhalte. 

Aufgabe 1
---------

Speichere folgenden Inhalt in einer neuen Datei (z.b. test.html), öffne diese Datei im Browser, öffne die Entwickertools und dann die Netzwerk-Ansicht. Aktualisiere deinen Browser. Wie viele Anfragen siehst du?

( kopier die Daten von hier: https://github.com/as-ideas/azubi-projects/blob/master/newsPaperApp/http.md)

```html
<!DOCTYPE html>
<head>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js" ></script>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bulma@0.8.0/css/bulma.min.css">
</head>
<body class="container content">
    <h1 class="title is-3">Count the requests in the network tab</h1>
    <input id="count" class="input is-danger">
   
   <script>
    $.get("https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js");
    
    $("#count").on('keyup',function(element){if(element.currentTarget.value==4){$("#count").removeClass("is-danger")$("#count").addClass("is-success")}else{$("#count").removeClass("is-success");$("#count").addClass("is-danger")}});
    </script>
</body>
</html>
```


Aufgabe 2
---------

Eine Anfrage kann auch mal schief gehen. Recherchiere bitte die Bedeutung von folgenden HTTP Status-Codes:

- 200
- 204
- 400
- 401
- 403
- 418
- 404
- 500
- 503

Kannst du Anhand der ersten Ziffer (2xx, 4xx, 5xx) eine Aussage über die Kommunikation treffen?


Aufgabe 3
---------

HTTP kann nicht nur der Browser sprechen, sondern auch andere Programme auf deinem Computer. Typischerweise wird dafür "curl" oder "wget" verwendet.

Führe folgenden Befehl im Terminal aus: ```wget -O example.html https://www.example.org```

Führe folgenden Befehl im Terminal aus:  ```curl -v https://www.example.org  > example2.html```

welchen Statuscode hat der Server www.example.org gesendet? Und was war der Inhalt der Antwort?


Aufgabe 4
---------

Damit Resourcen im Internet addressieren werden können haben diese eine IP Adresse. Wenn du lokal auf deinen Rechner einen webserver laufen hast, hat dieser auch eine IP Adresse: 127.0.0.1! Umgangssprachlich sagt man dazu auch "localhost" - weil der Host eben lokal ist.

Sich Adressen aus Zahlen zu merken ist nicht so praktisch. Daher gibt es Domains. "www.google.de" ist eine solche Domain. Domains werden von einer zentralen Organisation verwaltet. Wenn dein Browser eine Anfrage nach "www.google.de" macht, wird erstmal versucht für die Domain die IP Adresse herauszufinden. Wenn eine IP Adresse gefunden wurde, dann wird die Verbindung aufgebaut und du bekommst die Suchwebseite zu sehen.

Im Internet reden wir jedoch von einer URL - Unified Resource Locator. Recherchiere die einzelnen Bestandteile einer URL:

- www.google.de
- https://www.google.de
- https://de.wikipedia.org/wiki/Demo
- https://github.com/co0p?tab=repositories&q=test&type=&language=

