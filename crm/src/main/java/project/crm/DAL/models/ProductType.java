package project.crm.DAL.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import project.crm.DAL.models.components.BaseModel;
import project.crm.DAL.models.components.OfferingType;

@Entity
@Table(name = "ProductType")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductType extends BaseModel {

    @Embedded
    @AttributeOverride(name = "type_name", column = @Column(name = "product_type_name"))
    private OfferingType productType;

}
