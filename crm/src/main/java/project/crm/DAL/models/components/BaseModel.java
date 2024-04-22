package project.crm.DAL.models.components;

import jakarta.persistence.*;

import java.io.Serializable;

@MappedSuperclass
public abstract class BaseModel implements Serializable {
    public BaseModel(Long id, boolean isDeleted) {
        this.id = id;
        this.isDeleted = isDeleted;
    }

    public BaseModel() {

    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "is_deleted")
    private boolean isDeleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    @Override
    public String toString() {
        return "BaseModel{" +
                "id=" + id +
                ", isDeleted=" + isDeleted +
                '}';
    }
}
