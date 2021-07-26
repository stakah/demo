package com.example.demo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@IdClass(CustomerPK.class)
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id1;

    @Id
    @Column(name = "CHAVE_1")
    private String chave1;

    private String firstName;
    private String lastName;

    protected Customer() {}

    public Customer(String chave1, String firstName, String lastName) {
        this.chave1 = chave1;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id1=%d, chave1='%s', firstName='%s', lastName='%s']",
                id1, chave1, firstName, lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}