Enkelt Spel: Striden mellan Indamons!

## Tema
För den här uppgiften kommer du att skapa ett enkelt spel i Java som involverar rörelse av spelare, poängsystem och interaktioner med fiender. Du kommer också att öva på att skapa och använda klasser i Java för att modellera dessa objekt och beteenden.

För att få ett klarare koncept, ta en titt på "Existing Code" och "Existing Tests".

### Uppgift 

Skapa en Java-klass "IndamonGame" som kommer att representera hela ditt spel. Nedan följer specifikationerna för klassens metoder:

**1. `movePlayer(direction)`** : Denna metod kommer att ta en strängparameter "direction" som kan vara "up", "down", "left" eller "right" och flytta spelaren i den angivna riktningen. Om riktningen är ogiltig, ska metoden returnera en lämpligt formaterad felmeddelande.

**2. `scorePoint()`** : Denna metod kommer att öka spelarens aktuella poäng med 1 varje gång den anropas.

**3. `encounterEnemy(indamon)`** : Denna metod kommer att acceptera en Indamon-objekt som parameter och kommer att simulera en strid mellan spelaren och den givna indamon-en. Resultatet av striden ska bestämmas av indamonens befogenheter och spelarens befogenheter och poäng.

**4. `gameStatus()`** : Denna metod ska returnera en sträng som innehåller spelarens aktuella status, inklusive hans poäng och Indamonpartnerns status.

**5. `main(args)`** : I denna metod kommer du att skapa en instans av din IndamonGame-klass och göra anrop till de andra metoderna för att demonstrera deras funktionalitet.

### Existerande Kod och Tester
För att ge dig en bättre idé om vad du arbetar mot, så här kan kod och tester för din Indamon-klass se ut.

(Fortsätt skriva existerande kod och tester här)

Använd denna kod som en vägledning för att bygga din spelklass. Din kod bör vara kompatibel med dessa tester när du är klar. 

Observera att din kod måste matcha testerna, inte tvärtom. Detta innebär att du måste använda exakt samma klassnamn, metodnamn, och parametrar som anges i testerna.

Lycka till med uppgiften! Om du har frågor eller problem, posta en fråga själv genom att skapa en [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new). Lägg till en beskrivande titel, som börjar med "Task x: summary of problem here". Du kan också fråga en TA personligen under [veckans lab](https://queue.csc.kth.se/Queue/INDA). Kontrollera ditt schema för att se när nästa labb är.