package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users") // Avoid SQL keyword conflict
public class User {

    @Id
    private Long id;
    private String name;

    public User() {}

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    // ✅ Getter for id
    public Long getId() {
        return id;
    }

    // ✅ Setter for id
    public void setId(Long id) {
        this.id = id;
    }

    // ✅ Getter for name
    public String getName() {
        return name;
    }

    // ✅ Setter for name
    public void setName(String name) {
        this.name = name;
    }
}
