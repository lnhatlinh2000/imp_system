package fa.training.impsystem.entities;

import fa.training.impsystem.consts.MessageConst;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
public class Major {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "major_id")
    private int majorId;

    @NotBlank(message = MessageConst.INVALID_NAME)
    @Column(name = "major_name", nullable = false)
    private String majorName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "major")
    private Set<MajorDetail> majorDetail;

    @NotNull(message = MessageConst.INVALID_VACANCIES_NULL)
    @ManyToOne
    @JoinColumn(name = "vacancies_id", referencedColumnName = "vacancies_id")
    private Vacancies vacancies;

    public Major() {

    }

    public Major(int majorId, String majorName, Vacancies vacancies) {
        this.majorId = majorId;
        this.majorName = majorName;
        this.vacancies = vacancies;
    }

    public int getMajorId() {
        return majorId;
    }

    public void setMajorId(int majorId) {
        this.majorId = majorId;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public Set<MajorDetail> getMajorDetail() {
        return majorDetail;
    }

    public void setMajorDetail(Set<MajorDetail> majorDetail) {
        this.majorDetail = majorDetail;
    }

    public Vacancies getVacancies() {
        return vacancies;
    }

    public void setVacancies(Vacancies vacancies) {
        this.vacancies = vacancies;
    }
}
