package br.com.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String gender;
    private String age;

    @ManyToMany
    private Adress adress;
}
