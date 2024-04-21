package project.crm.DAL.models;

import jakarta.persistence.*;
import project.crm.DAL.models.components.BaseModel;
import project.crm.DAL.models.components.Offering;

@Entity
@Table(name = "Products")
public class Product extends BaseModel {
    public Product(Long id, boolean isDeleted, Offering product, ProductType productType) {
        super(id, isDeleted);
        this.product = product;
        this.productType = productType;
    }

    public Product() {

    }

    @Embedded
    private Offering product;

    @ManyToOne
    @JoinColumn(name = "product_type_id")
    private ProductType productType;

    public Offering getProduct() {
        return product;
    }

    public void setProduct(Offering product) {
        this.product = product;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + getId() +
                "isDeleted=" + isDeleted() +
                ", product=" + product +
                '}';
    }
}
