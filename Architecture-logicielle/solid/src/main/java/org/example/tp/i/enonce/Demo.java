package org.example.tp.i.enonce;

/*

Dans ce fichier, vous trouverez une violation du Principe de Ségrégation des Interfaces (Interface Segregation Principle - ISP).
Vous devez refactoriser ce fichier.
Vous pouvez supprimer ce fichier complètement, car il ne sera pas utilisé lors de l'évaluation de la solution.

Exercice : Pratique du Principe de Ségrégation des Interfaces (ISP)

Objectif :

Apprenez à appliquer le Principe de Ségrégation des Interfaces (ISP) en Java pour améliorer la conception des classes en séparant les interfaces pour des comportements spécifiques.

Instructions :

1. **Comprendre l'ISP** : Lisez à propos du Principe de Ségrégation des Interfaces (ISP) pour comprendre son importance dans la conception orientée objet.

2. **Examinez le code original** : Examinez le code Java fourni, qui viole l'ISP en ayant une seule interface avec plusieurs méthodes, dont certaines pourraient ne pas être applicables à toutes les classes implémentant cette interface.

3. **Identifiez les violations** : Identifiez quelles méthodes dans l'interface `Worker` originale ne sont pas applicables à certaines classes implémentantes (par exemple, pour la classe `Robot`).

4. **Refactorisez le code** : Refactorisez le code original pour respecter l'ISP en séparant l'interface en plusieurs interfaces plus petites et plus ciblées pour des comportements spécifiques.

NOTE : Les tests d'évaluation reposent sur la sortie console. Assurez-vous donc d'utiliser les objets `String` appropriés lors de l'impression du texte dans la console depuis les méthodes concernées :

- "Employee is working"
- "Employee is eating"
- "Employee is sleeping"
- "Robot is working"

Respectez les noms de méthodes originaux : `work()`, `eat()`, `sleep()`.

*/

// Code client

public class Demo {
    public static void main(String[] args) {
        Worker employee = new Employee();
        employee.work();
        employee.eat();
        employee.sleep();
    }
}

interface Worker {
    void work();
    void eat();
    void sleep();
}



class Employee implements Worker {
    @Override
    public void work() {
        System.out.println("Employee is working");
    }

    @Override
    public void eat() {
        System.out.println("Employee is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Employee is sleeping");
    }
}

class Robot implements Worker {
    @Override
    public void work() {
        System.out.println("Robot is working");
    }

    @Override
    public void eat() {
        // Cette méthode n'a pas de sens pour un robot
        // L'implémentation pourrait ne pas être significative
    }

    @Override
    public void sleep() {
        // Cette méthode n'a pas de sens pour un robot
        // L'implémentation pourrait ne pas être significative
    }
}

