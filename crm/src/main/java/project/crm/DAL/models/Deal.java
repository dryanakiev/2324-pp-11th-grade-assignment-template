package project.crm.DAL.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import project.crm.DAL.models.components.BaseModel;

import java.sql.Timestamp;

@Entity
@Table(name = "Deals")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Deal extends BaseModel {

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

}
