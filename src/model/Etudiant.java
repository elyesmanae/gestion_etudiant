package model;

import java.util.Scanner;

public class Etudiant {

    private String nom;
    private int age;
    private double moyenne;
    private String addresse;

    public Etudiant() {
        super();
    }

    public Etudiant(String nom, int age, double moyenne, String addresse) {
        super();
        this.nom = nom;
        this.age = age;
        this.moyenne = moyenne;
        this.addresse = addresse;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        if (nom.length() < 8 || nom.length() > 30)
            throw new IllegalArgumentException("le nom doit avoir un nbre de caractères entre 8 et 30!");
        this.nom = nom;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age < 18 || age > 28)
            throw new IllegalArgumentException("l'age doit etre entre 18 et 28!");
        this.age = age;
    }

    public double getMoyenne() {
        return this.moyenne;
    }

    public void setMoyenne(double moyenne) {
        if (moyenne < 0 || moyenne > 20)
            throw new IllegalArgumentException("la moyenne doit etre entre 0 et 20!");
        this.moyenne = moyenne;
    }

    public String getAddresse() {
        return this.addresse;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public void info() {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("nom = ");
        String name = scanner.nextLine();
        this.setNom(name);

        System.out.println("age = ");
        int age = scanner.nextInt();
        this.setAge(age);

        System.out.println("moyenne = ");
        double moy = scanner.nextDouble();
        scanner.nextLine(); // Consume newline left-over, if not the address will not be read
        this.setMoyenne(moy);

        System.out.println("addresse = ");
        String address = scanner.nextLine();
        this.setAddresse(address);

        System.out.println("******** Info etudiant ********");
        System.out.println("nom : " + this.getNom());
        System.out.println("age : " + this.getAge());
        System.out.println("moyenne : " + this.getMoyenne());
        System.out.println("adresse : " + this.getAddresse());

    }

}
