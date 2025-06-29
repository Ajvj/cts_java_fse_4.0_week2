package myapp;

import jakarta.persistence.*;

@Entity
@Table(name = "app_user")  // Avoid reserved name "user"
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // ✅ Constructor
    public User() {}

    // ✅ Getter
    public String getName() {
        return name;
    }

    // ✅ Setter
    public void setName(String name) {
        this.name = name;
    }

    // ✅ Getter for ID
    public Long getId() {
        return id;
    }

    // Optional setter for ID (not required usually)
    public void setId(Long id) {
        this.id = id;
    }
}
