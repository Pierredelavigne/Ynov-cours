package org.example.tp.d.enonce;

/*

Dans ce fichier, vous trouverez une violation du Principe d'Inversion de Dépendance (Dependency Inversion Principle - DIP).
Vous devez refactoriser ce fichier.
Vous pouvez supprimer ce fichier complètement, car il ne sera pas utilisé lors de l'évaluation de la solution.

### Comprendre le Principe d'Inversion de Dépendance (DIP) :

Apprenez à propos du DIP, selon lequel les modules de haut niveau ne doivent pas dépendre directement des modules de bas niveau. Les deux doivent dépendre d'abstractions.

Comprenez les avantages du DIP, tels que la flexibilité, la maintenabilité et la facilité de test.

### Identifier le Code Violant le DIP :

Examinez le code Java fourni où la classe `Car` dépend directement de la classe `Engine`.

Réfléchissez à pourquoi cela viole le DIP et à la nécessité de refactoriser.

### Refactoriser le Code selon le DIP :

Suivez la solution refactorisée : créez une interface `Engine` et des classes d'implémentation (par exemple `ElectricEngine`, `GasolineEngine`).

Comprenez comment la classe `Car` dépend désormais de l'interface `Engine`, en respectant le DIP.

NOTE : La solution sera vérifiée par des tests unitaires. Étant donné que la méthode `start()` est `void`, les tests unitaires reposent sur la sortie console. Respectez donc les exigences suivantes pour la sortie console dans les méthodes appropriées :

- "Electric engine started."
- "Gasoline engine started."

*/


public class Car {
    private Engine engine;

    public Car() {
        this.engine = new Engine();
    }

    public void start() {
        engine.start();
    }
}

class Engine {
    public void start() {
        System.out.println("Engine started.");
    }
}
