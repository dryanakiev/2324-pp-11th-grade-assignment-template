package project.crm.DAL.models.components;

import jakarta.persistence.*;

@Embeddable
public class Authentication {

    public Authentication(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Authentication() {

    }

    @Column(name = "username", unique = true, nullable = false)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Authentication{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}



