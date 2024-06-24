package org.example;

import org.example.Person;
import org.example.Pet;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        Person person1 = new Person("Rob", "van", "Raamsdonk", 69, "man");
        Person person2 = new Person("Mary", "Duin", 67, "vrouw");

        persons.add(person1);
        persons.add(person2);

        Person child1 = new Person("Marloes", "van", "Raamsdonk", 37, "vrouw");
        Person child2 = new Person("Erwin", "van", "Raamsdonk", 35, "man");
        Person child3 = new Person("Arjan", "van", "Raamsdonk", 33, "man");

        child1.addParent(person1, person2);
        child2.addParent(person1, person2);
        child3.addParent(person1, person2);

        person1.addChild(child1);
        person1.addChild(child2);
        person1.addChild(child3);
        person2.addChild(child1);
        person2.addChild(child2);
        person2.addChild(child3);

        List<Pet> pets = new ArrayList<>();
        Pet pet1 = new Pet("Tara", 1, "Hond");
        Pet pet2 = new Pet("mr Pastoor", 7, "kat");
        Pet pet3 = new Pet("Pluis", 3, "kat");


        child1.addPet(pet2);
        child1.addPet(pet3);

        child3.addPet(pet1);
        pet1.setOwner(child3);

        // Output kinderen van elke persoon
        for (Person person : persons) {
            System.out.println("Kinderen van " + person.getName() + " " + person.getLastName() + ":");
            for (Person child : person.getChildren()) {
                System.out.println(child.getName() + " " + child.getLastName());
            }
        }

        // Output huisdieren van elk kind
        List<Person> children = new ArrayList<>();
        children.add(child1);
        children.add(child2);
        children.add(child3);

        for (Person child : children) {
            System.out.println("Huisdieren van " + child.getName() + ":");
            for (Pet pet : child.getPets()) {
                System.out.println(pet.getPetName() + " de " + pet.getSpecies());
            }
        }
    }
}
