    
                                                                                                                    
                                                                                 dddddddd                           
            CCCCCCCCCCCCC                                          iiii              d::::::d  1111111     999999999    
         CCC::::::::::::C                                         i::::i             d::::::d 1::::::1   99:::::::::99  
       CC:::::::::::::::C                                          iiii              d::::::d1:::::::1 99:::::::::::::99
      C:::::CCCCCCCC::::C                                                            d:::::d 111:::::19::::::99999::::::9
    C:::::C       CCCCCC   ooooooooooo vvvvvvv           vvvvvvviiiiiii     ddddddddd:::::d    1::::19:::::9     9:::::9
    C:::::C               oo:::::::::::oov:::::v         v:::::v i:::::i   dd::::::::::::::d    1::::19:::::9     9:::::9
    C:::::C              o:::::::::::::::ov:::::v       v:::::v   i::::i  d::::::::::::::::d    1::::1 9:::::99999::::::9
    C:::::C              o:::::ooooo:::::o v:::::v     v:::::v    i::::i d:::::::ddddd:::::d    1::::l  99::::::::::::::9
    C:::::C              o::::o     o::::o  v:::::v   v:::::v     i::::i d::::::d    d:::::d    1::::l    99999::::::::9
    C:::::C              o::::o     o::::o   v:::::v v:::::v      i::::i d:::::d     d:::::d    1::::l         9::::::9 
    C:::::C              o::::o     o::::o    v:::::v:::::v       i::::i d:::::d     d:::::d    1::::l        9::::::9  
     C:::::C       CCCCCCo::::o     o::::o     v:::::::::v        i::::i d:::::d     d:::::d    1::::l       9::::::9   
      C:::::CCCCCCCC::::Co:::::ooooo:::::o      v:::::::v        i::::::id::::::ddddd::::::dd111::::::111   9::::::9    
       CC:::::::::::::::Co:::::::::::::::o       v:::::v         i::::::i d:::::::::::::::::d1::::::::::1  9::::::9     
         CCC::::::::::::C oo:::::::::::oo         v:::v          i::::::i  d:::::::::ddd::::d1::::::::::1 9::::::9      
            CCCCCCCCCCCCC   ooooooooooo            vvv           iiiiiiii   ddddddddd   ddddd11111111111199999999       
                                                                                                                     
                                                                                                                     
                                                                                                                     
                                                                                                                                                                                                                                                                                                                                                         
Gegeben unten stehende  'Sighting' Klasse.
 
Du bist Covid gefährdet wenn du innerhalb eines Tages dich
in einer Entfernung von 5 Metern einer Sichtung aufhälst.
 
Bitte verwendet folgende Konzepte und erstelle die
dazugehörigen Klassen:
- Endpoint, Service, Domänen Klasse, Repository
 

           __    __  __  ____  ___    __    ____  ____    __
          /__\  (  )(  )( ___)/ __)  /__\  (  _ \( ___)  /  )
         /(__)\  )(__)(  )__)( (_-. /(__)\  ) _ < )__)    )(
        (__)(__)(______)(__)  \___/(__)(__)(____/(____)  (__)
 
1. schreibe mindestens 4 Testfälle in JUnit 
 - ähnliche Örtlichkeit, andere Zeit -> false
- andere Örtlichkeit, andere Zeit -> false
- andere Örtlichkeit, ähnliche Zeit -> false
- ähnliche Örtlichkeit, ähnliche Zeit -> true
 

           __    __  __  ____  ___    __    ____  ____    ___ 
          /__\  (  )(  )( ___)/ __)  /__\  (  _ \( ___)  (__ \
         /(__)\  )(__)(  )__)( (_-. /(__)\  ) _ < )__)    / _/
        (__)(__)(______)(__)  \___/(__)(__)(____/(____)  (____)
 
2. Implementiere die Methode closeTo(). Denke daran, dass
   es einen örtlichen und zeitlichen Aspekt gibt.
 

           __    __  __  ____  ___    __    ____  ____    ___
          /__\  (  )(  )( ___)/ __)  /__\  (  _ \( ___)  (__ )
        /(__)\  )(__)(  )__)( (_-. /(__)\  ) _ < )__)    (_ \
        (__)(__)(______)(__)  \___/(__)(__)(____/(____)  (___/
 
3. Implementiere einen http Endpunkt, der ein 'Sighting'
   entgegen nimmt und in der DB speichert
 
           __    __  __  ____  ___    __    ____  ____     __ 
          /__\  (  )(  )( ___)/ __)  /__\  (  _ \( ___)   /. |
         /(__)\  )(__)(  )__)( (_-. /(__)\  ) _ < )__)   (_  _)
        (__)(__)(______)(__)  \___/(__)(__)(____/(____)    (_)
 
4. Implementiere einen http Endpunkt, der ein 'Sighting'
   entgegen nimmt und dein Gefährdungsstatus zurück gibt
 

```java 
class Sighting {
 
    private double latitude;
    private double longitude;
 
    private Date instant;
 
    public boolean closeTo(Sighting otherSighting) {
        // implement me
        return false;
    }
}```
 
   
