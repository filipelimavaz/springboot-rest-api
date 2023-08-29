package br.com.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Adress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String street;
    private String number;
    private String complement;
    private String district;
    private String city;
    private String state;
    private String country;
    private String cep;

    @OneToMany
    private Person person;
}
