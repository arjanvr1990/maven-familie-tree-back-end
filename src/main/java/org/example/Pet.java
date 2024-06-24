package org.example;

public class Pet {
    private String petName;
    private int petAge;
    private String species;
    private Person owner;

    // Constructor zonder de eigenaar
    public Pet(String name, int age, String species) {
        this.petName = name;
        this.petAge = age;
        this.species = species;
        this.owner = null; // De eigenaar kan later worden ingesteld
    }

    public Pet() {

    }


    // Getters en Setters
    public String getPetName() {
        return petName;
    }

    public void setPetName(String name) {
        this.petName = name;
    }

    public int getPetAge() {
        return petAge;
    }

    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
