package project.crm.DAL.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import project.crm.DAL.models.components.BaseModel;

import java.sql.Timestamp;

@Entity
@Table(name = "ProductSales")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductSales extends BaseModel {

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @Column(name = "count")
    private int count;

    @Column(name = "date")
    private Timestamp date;

}
