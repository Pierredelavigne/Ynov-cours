package org.example.tp.s.solution;

/*

Classe UserValidator :
Cette classe est responsable de la validation des entrées utilisateur, spécifiquement pour le nom d'utilisateur et le mot de passe.
Elle contient deux méthodes statiques, validateUsername et validatePassword, qui vérifient si le nom d'utilisateur et le mot de passe fournis respectent certains critères, tels que la longueur et les exigences de caractères.
En séparant la logique de validation dans sa propre classe, on favorise la réutilisabilité et on s'assure que les règles de validation sont appliquées de manière cohérente dans toute l'application.

Classe UserRegistration :
Cette classe gère l'enregistrement des utilisateurs.
La méthode registerUser prend un nom d'utilisateur et un mot de passe en entrée, les valide en utilisant la classe UserValidator, puis enregistre l'utilisateur si les entrées sont valides.
Si les entrées échouent à la validation, la méthode retourne false, indiquant que le processus d'enregistrement a échoué.
En isolant la logique d'enregistrement des utilisateurs dans sa propre classe, on facilite la compréhension et la maintenance de cette fonctionnalité.

Classe UserAuthenticator :
Cette classe est responsable de l'authentification des utilisateurs.
La méthode authenticateUser prend un nom d'utilisateur et un mot de passe en entrée et les vérifie par rapport à des identifiants prédéfinis (simulés dans cet exemple).
Si le nom d'utilisateur et le mot de passe fournis correspondent aux identifiants prédéfinis, la méthode retourne true, indiquant que l'authentification a réussi.
Sinon, elle retourne false, indiquant que le processus d'authentification a échoué.
La séparation de la logique d'authentification dans une classe dédiée permet une meilleure organisation et encapsulation de cette fonctionnalité.

Classe UserManagerApp (Classe principale) :
Cette classe contient la méthode main et sert de point d'entrée pour l'application.
Elle montre comment utiliser les classes UserRegistration et UserAuthenticator pour enregistrer et authentifier des utilisateurs.
Dans la méthode main, un nom d'utilisateur et un mot de passe sont fournis, puis la méthode registerUser est appelée pour enregistrer l'utilisateur.
Ensuite, la méthode authenticateUser est appelée pour authentifier l'utilisateur en fonction des identifiants fournis.

En séparant la logique de l'application des fonctionnalités principales d'enregistrement et d'authentification, cette classe favorise une base de code modulaire et facile à maintenir.
Dans l'ensemble, en respectant le principe de responsabilité unique (SRP) et en séparant les responsabilités distinctes dans des classes distinctes, la solution améliore la modularité, la lisibilité et la maintenabilité du code. Chaque classe a un objectif clair et unique, rendant le code plus facile à comprendre, tester et étendre.

*/


public class UserManagerApp {
    public static void main(String[] args) {
        String username = "john_doe";
        String password = "Password123";

        if (UserRegistration.registerUser(username, password)) {
            System.out.println("User registered successfully.");
        } else {
            System.out.println("User registration failed.");
        }

        if (UserAuthenticator.authenticateUser(username, password)) {
            System.out.println("User logged in successfully.");
        } else {
            System.out.println("Invalid username or password.");
        }
    }
}
