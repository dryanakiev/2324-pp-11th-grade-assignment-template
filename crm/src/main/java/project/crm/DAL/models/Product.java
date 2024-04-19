package project.crm.DAL.models;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import project.crm.DAL.models.components.BaseModel;
import project.crm.DAL.models.components.Offering;
import project.crm.DAL.models.components.OfferingType;

@Entity
@Table(name = "Products")
public class Product extends BaseModel {
    public Product(Long id, boolean isDeleted, Offering product) {
        super(id, isDeleted);
        this.product = product;
    }

    public Product() {

    }

    @Embedded
    private Offering product;

    @Override
    public String toString() {
        return "Product{" +
                "product=" + product +
                '}';
    }
}
