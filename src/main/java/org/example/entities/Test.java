package org.example.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Test {
    @Id
    private long id;
    private String nome;

}
