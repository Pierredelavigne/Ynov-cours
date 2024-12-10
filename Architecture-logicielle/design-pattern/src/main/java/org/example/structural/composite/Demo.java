package org.example.structural.composite;

public class Demo {
    public static void main(String[] args) {
        // Création des fichiers
        File file1 = new File("File1.txt");
        File file2 = new File("File2.txt");
        File file3 = new File("File3.txt");

        // Création des dossiers
        Directory root = new Directory("Root");
        Directory folder1 = new Directory("Folder1");
        Directory folder2 = new Directory("Folder2");

        // Ajout des fichiers et dossiers
        root.add(folder1);
        root.add(folder2);
        root.add(file1);

        folder1.add(file2);
        folder2.add(file3);

        // Affichage de la structure
        root.display("");
    }
}
