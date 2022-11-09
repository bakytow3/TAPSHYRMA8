package org.example;

import org.example.animals.Bear;
import org.example.person.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
       Person person = context.getBean("person", Person.class);
        System.out.println(person);
        Person person1=context.getBean("person1", Person.class);
        System.out.println(person1);


        context.close();
    }
}
