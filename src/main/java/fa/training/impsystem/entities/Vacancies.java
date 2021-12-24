package fa.training.impsystem.entities;

import fa.training.impsystem.consts.MessageConst;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
public class Vacancies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vacancies_id")
    private int vacanciesId;

    @NotBlank(message = MessageConst.INVALID_NAME)
    @Column(name = "vacancies_name", nullable = false)
    private String vacanciesName;

    @Min(value = 1, message = MessageConst.INVALID_QUANTITY)
    @Column(nullable = false)
    private int quantity;

    @Column
    private String description;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vacancies")
    private Set<Major> major;

    @NotNull(message = MessageConst.INVALID_RECRUITMENT_NULL)
    @ManyToOne
    @JoinColumn(name = "recruitment_id", referencedColumnName = "recruitment_id")
    private Recruitment recruitment;

    public Vacancies() {

    }

    public Vacancies(int vacanciesId, String vacanciesName, int quantity, String description, Recruitment recruitment) {
        this.vacanciesId = vacanciesId;
        this.vacanciesName = vacanciesName;
        this.quantity = quantity;
        this.description = description;
        this.recruitment = recruitment;
    }

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

    public Set<Major> getMajor() {
        return major;
    }

    public void setMajor(Set<Major> major) {
        this.major = major;
    }

    public Recruitment getRecruitment() {
        return recruitment;
    }

    public void setRecruitment(Recruitment recruitment) {
        this.recruitment = recruitment;
    }
}
