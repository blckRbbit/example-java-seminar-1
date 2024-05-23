package lesson6.clinic.patients.impl;

import lesson6.clinic.clients.Owner;
import lesson6.clinic.patients.Animal;

import java.time.LocalDate;

public class Cat extends Animal {

    public float height;

    public Cat(float height) {
        super();
        this.height = height;
    }

    public Cat(Long id, String name, String breed, LocalDate birthDate, Owner owner, float height) {
        super(id, name, breed, birthDate, owner);
        this.height = height;
    }



}
