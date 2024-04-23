package project.crm.DAL.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import project.crm.DAL.models.components.BaseModel;

@Entity
@Table(name = "ProductSales")
public class ProductSales extends BaseModel {

    public ProductSales(Long id, boolean isDeleted, Product product, Customer customer) {
        super(id, isDeleted);
        this.product = product;
        this.customer = customer;
    }

    public ProductSales() {}

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @Override
    public String toString() {
        return "ProductSales{" +
                "id=" + getId() +
                ", isDeleted=" + isDeleted() +
                ", product=" + product +
                ", customer=" + customer +
                '}';
    }
}
