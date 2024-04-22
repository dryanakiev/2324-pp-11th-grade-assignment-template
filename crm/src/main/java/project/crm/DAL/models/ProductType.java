package project.crm.DAL.models;


import jakarta.persistence.*;
import project.crm.DAL.models.components.BaseModel;
import project.crm.DAL.models.components.OfferingType;

@Entity
@Table(name = "ProductType")
public class ProductType extends BaseModel {

    public ProductType(Long id, boolean isDeleted, OfferingType productType) {
        super(id, isDeleted);
        this.productType = productType;
    }

    public ProductType() {

    }

    @Embedded
    @AttributeOverride(name = "type_name", column = @Column(name = "product_type_name"))
    private OfferingType productType;

    public OfferingType getProductType() {
        return productType;
    }

    public void setProductType(OfferingType productType) {
        this.productType = productType;
    }

    @Override
    public String toString() {
        return "ProductType{" +
                "id=" + getId() +
                ", isDeleted=" + isDeleted() +
                ", productType=" + productType +
                '}';
    }
}
