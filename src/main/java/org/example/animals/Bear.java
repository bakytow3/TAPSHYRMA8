package org.example.animals;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bear implements Animal{
private String breed;
private String color;
private int age;
    public Bear() {
}

    @Override
    public void animalPlus() {

    }
    @Override
    public void animalMinus() {




    }

    @Override
    public String toString() {
        return "Bear{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
