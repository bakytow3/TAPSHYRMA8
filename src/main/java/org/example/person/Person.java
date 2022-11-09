package org.example.person;

import lombok.Getter;
import lombok.Setter;
import org.example.animals.Animal;
@Getter
@Setter
public class Person {
     Animal animal;
    private int age;
    private String name;

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "animal=" + animal +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
