package fa.training.impsystem.entity;

import javax.persistence.*;

@Entity
@Table(name = "Vacancies")
public class Vacancies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int vacanciesId;

    @Column(name = "Vacancies_Name", nullable = false)
    private String vacanciesName;

    @Column(name = "Quantity", nullable = false)
    private int quantity;

    @Column(name = "Description")
    private String description;

    public int getVacanciesId() {
        return vacanciesId;
    }

    public void setVacanciesId(int vacanciesId) {
        this.vacanciesId = vacanciesId;
    }

    public String getVacanciesName() {
        return vacanciesName;
    }

    public void setVacanciesName(String vacanciesName) {
        this.vacanciesName = vacanciesName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
