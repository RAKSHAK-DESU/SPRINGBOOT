package com.ChaosClub.SpringBoot.entites;

import jakarta.persistence.*;
import org.apache.catalina.User;

@Entity
@Table(name = "users")
public class user {
    @Id //marks this field as primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)// configures the id to be auto generated
    private Long id;
    private String name;
    private String email;

    public void User(){} // Required by JPA

    public void User(String name, String email){
        this.email=email;
        this.name=name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
