package project.crm.DAL.models.templates;

import jakarta.persistence.*;

@Entity
public abstract class AuthenticationTemplate extends BaseTemplate {

    public AuthenticationTemplate(Long id, boolean isDeleted, String username, String password) {
        super(id, isDeleted);
        this.username = username;
        this.password = password;
    }

    public AuthenticationTemplate(Long id, boolean isDeleted) {
        super(id, isDeleted);
    }

    public AuthenticationTemplate() {
        super();
    }

    @Column(name = "username", unique = true)
    private String username;

    @Column(name = "password")
    private String password;
}



