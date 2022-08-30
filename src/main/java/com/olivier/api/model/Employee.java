package com.olivier.api.model;

import lombok.Data;

import javax.persistence.*;

@Data // annotation Lombok. Nul besoin d'ajouter les getters & setters. la librairie s'en charge
@Entity // indique que la classe correspond à une table de la bdd
@Table(name = "employees")
public class Employee {
    @Id // clé primaire de la table
    @GeneratedValue(strategy = GenerationType.IDENTITY) // permet l'auto increment
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String mail; // pas besoin d'annotation de nom colonne car le champ en table est identique

    private String password; // idem

}
