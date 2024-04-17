package project.crm.DAL.models.templates;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class BaseTemplate {
    public BaseTemplate(Long id, boolean isDeleted) {
        this.id = id;
        this.isDeleted = isDeleted;
    }

    public BaseTemplate() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "isDeleted")
    private boolean isDeleted;

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
