package org.example.animals;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dog implements Animal{
    private String breed;
    private String color;

    private int age;

    public Dog() {
    }

    @Override
    public void animalPlus() {

    }

    @Override
    public void animalMinus() {

    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
