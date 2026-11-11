# Patron Singleton

Le Singleton garantit une instance unique d'une classe et fournit un point d'accès partagé. Son constructeur privé empêche les créations directes ; une méthode statique comme `getInstance()` crée puis renvoie l'instance. Il est utile pour centraliser une ressource, mais doit être utilisé lorsque cette unicité répond à un vrai besoin.

La variante `AppLogger` fournit un journaliseur unique à l'application. Ses méthodes `logInfo` et `logError` produisent des messages horodatés. Le client démontre que plusieurs appels à `getInstance()` renvoient le même objet.

## Dans VS Code

Ouvrez `src/variante/Client.java` et cliquez sur **Run** au-dessus de `main`. Pour l'exemple du cours, faites de même avec `src/cours/TestSingleton.java`. L'extension **Extension Pack for Java** est nécessaire.

## Dans le terminal

Depuis la racine du projet, compilez et lancez la variante :

```powershell
javac -encoding UTF-8 -d bin src\variante\AppLogger.java src\variante\Client.java
java -cp bin variante.Client
```

Pour l'exemple du cours :

```powershell
javac -encoding UTF-8 -d bin src\cours\Singleton.java src\cours\TestSingleton.java
java -cp bin cours.TestSingleton
```
