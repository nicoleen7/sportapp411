package models;

import javax.persistence.*;

@Entity
public class player {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public Long id;
    public String firstName;
    public String lastName;
    public int age;

    @Override
    public String toString() {
        return "player{" +
                "first name='" + firstName + '\'' +
                ", last name='" + lastName + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}