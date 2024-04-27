package project.crm.DAL.models;

import jakarta.persistence.*;
import project.crm.DAL.models.components.BaseModel;

import java.sql.Timestamp;

@Entity
@Table(name = "Deals")
public class Deal extends BaseModel {

    public Deal(Long id, boolean isDeleted, User manager, Client client, int count, String description, Timestamp date) {
        super(id, isDeleted);
        this.manager = manager;
        this.client = client;
        this.count = count;
        this.description = description;
        this.date = date;
    }

    public Deal() {}

    @ManyToOne
    @JoinColumn(name = "manager_id")
    private User manager;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @Column(name = "sum")
    private int count;

    @Column(name = "description")
    private String description;

    @Column(name = "date")
    private Timestamp date;

    public User getManager() {
        return manager;
    }

    public void setManager(User manager) {
        this.manager = manager;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Deals{" +
                "id=" + getId() +
                ", isDeleted=" + isDeleted() +
                ", manager=" + manager +
                ", client=" + client +
                ", count=" + count +
                ", description='" + description + '\'' +
                ", date=" + date +
                '}';
    }
}
