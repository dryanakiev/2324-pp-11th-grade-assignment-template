package project.crm.DAL.models;

import jakarta.persistence.*;
import project.crm.DAL.models.templates.AuthenticationTemplate;

@Entity
@Table(name="Users")
public class User extends AuthenticationTemplate {

    public User(Long id, boolean isDeleted) {
        super(id, isDeleted);
    }

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "phone")
    private String phone;
}

