package project.crm.DAL.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import project.crm.DAL.models.components.BaseModel;

@Entity
@Table(name = "ProductType")
public class ProductType extends BaseModel {
}
