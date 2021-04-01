Testing
=======

“Program testing can be used to show the presence of bugs, but never to show their absence!”
 -― Edsger W. Dijkstra


Hintergrund zur Software Entwicklung
------------------------------------

Du hast jetzt schon viel programmiert, die Gedanken zu Dateinamen und Variablen gemacht und es ist Zeit ein größeres Projekt zu machen. Je mehr Dateien, desto größer ist die Komplexität und damit sind wir in der Software Entwicklung angekommen. Das tolle am Programmieren ist jedoch, dass wir vieles Automatisieren können. Zum Bespiel auch, ob Aspekte unserer Anwendung funktionieren. Aber erstmal ein wenig Hintergrundwissen zum Thema Software-Engineering:  

Ein paar Videos für den soften Einstieg
- https://www.youtube.com/watch?v=jmQeKWIhD5g (must & long)
- https://www.youtube.com/watch?v=0b5vp4Z2PKE (short)
- https://www.youtube.com/watch?v=Cd3TrUK8axU (short)
 
__Aufgabe 1:__
- Was hat zur Software-Crisis geführt?
- Was bedeutet für dich Software-Engineering?
- Wo ist der Unterschied zwischen Programmieren und Software-Engineering?
- Beschreibe den Wasserfall Entwicklungs Prozess!
- Beschreibe das V-Modell! 

Testing
--------

Softer Einstieg zum Thema Testing: mit einem Video von Kent Beck: Erfinder von JUnit, TDD, Crystal, Extreme Programming (mein persönlicher Hero 😊)
https://www.youtube.com/watch?v=VVSSga1Olt8  (short)

Mehr videos zur Übersicht und verstehen der ersten Konzepte:
- https://www.youtube.com/watch?v=r9HdJ8P6GQI (must)

__Aufgabe 2:__
- Was ist TDD?
- Wie heißen die Phasen des TDD Cycles?
- Erkläre an einem Beispiel deiner Wahl den Prozess TDD.

__Aufgabe 3:__
 - Was bedeutet die Aussage von Dijkstra für das Schreiben von Tests und die Korrektheit deiner Software? 
 - Erkläre die verschiedenen Arten von Tests anhand der 'Testing Pyramid'?
 - Welche Art von Tests hast du schon geschrieben? Hast du dich an eine bestimmte Struktur gehalten?
 - Wie würdest du deine Newspaper App testen? 
 - Schau dir nochmal die UserStories und Akzeptanzkriterien an. Kannst du etwas davon als 'Testplan' wiederverwenden?
 

Challenge
----------
Schaue dir das Repo https://github.com/as-ideas/azubi-javascript an und die Array Tests hier an: https://github.com/as-ideas/azubi-javascript/tree/master/src/arrays .
 
Schreibe einen Test, der die Array [funktion includes](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/includes) testet. Du kannst auch gern das Repo forken und den Test erweitern.
 
Überlege dir vorher was sind die Testfälle sein können? Und dann schreibe dies Tests in folgender Form
 
```js 
describe(‚Array‘, () => {
 
  describe(‚includes‘, () => {

    it(‚ …. Test fall 1 … ‘ () => {})
    it(‚ …. Test fall 2 … ‘ () => {})
    it(‚ …. Test fall  … ‘ () => {})
    it(‚ …. Test fall n … ‘ () => {})

  })
})
```
