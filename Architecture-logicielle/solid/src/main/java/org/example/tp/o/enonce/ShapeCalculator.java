package org.example.tp.o.enonce;

/*

Dans ce fichier, vous trouverez une violation du Principe Ouvert/Fermé (Open/Closed Principle).
Vous devez refactoriser ce fichier.
Vous pouvez supprimer ce fichier complètement, car il ne sera pas utilisé lors de l'évaluation de la solution.

Titre de l'exercice : Défi de refactorisation du Principe Ouvert/Fermé (OCP)

Objectif : Dans cet exercice, vous allez vous entraîner à appliquer le Principe Ouvert/Fermé (OCP) pour refactoriser une base de code donnée. L'OCP stipule que les entités logicielles doivent être ouvertes à l'extension mais fermées à la modification. Vous allez améliorer la flexibilité et la maintenabilité de la base de code en permettant son extension facile avec de nouvelles fonctionnalités, sans modifier le code existant.

Instructions :

1. **Examinez le code fourni** : Commencez par examiner le code original fourni. Identifiez les parties où le code viole le Principe Ouvert/Fermé en nécessitant des modifications pour ajouter de nouvelles fonctionnalités.

2. **Identifiez les points d'extension** : Analysez le code pour identifier les domaines où des améliorations ou modifications futures pourraient être nécessaires. Recherchez des comportements ou des fonctionnalités qui sont susceptibles de changer ou d'être étendus à l'avenir.

3. **Refactorisez le code** : Refactorisez le code pour introduire de l'abstraction et de l'encapsulation, permettant une extension facile sans modification du code existant. Utilisez des techniques telles que l'héritage, la composition ou l'injection de dépendances pour y parvenir.

4. **Implémentez des extensions** : Créez de nouvelles classes ou modules pour implémenter des fonctionnalités ou des comportements supplémentaires. Assurez-vous que ces extensions peuvent être ajoutées sans modifier le code existant, en respectant le principe OCP.

Note : Concentrez-vous sur la conception de solutions flexibles et extensibles qui permettent une maintenance facile et des améliorations futures. Prenez en compte les bonnes pratiques, notamment la validation des entrées. Considérez les cas avec des objets ayant des valeurs nulles. N'oubliez pas d'ajouter toutes les vérifications nécessaires pour les valeurs nulles dans votre solution.


*/

import java.util.List;

public class ShapeCalculator {
    public double calculateTotalArea(List<Shape> shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                totalArea += Math.PI * Math.pow(circle.getRadius(), 2);
            } else if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                totalArea += rectangle.getWidth() * rectangle.getHeight();
            }
        }
        return totalArea;
    }
}

class Shape {

}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}

