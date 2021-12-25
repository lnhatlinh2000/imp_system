package fa.training.impsystem.entities;

import fa.training.impsystem.consts.CommonConst;
import fa.training.impsystem.consts.MessageConst;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.util.Date;
import java.util.Set;

@Entity
public class Recruitment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "recruitment_id")
    private int recruitmentId;

    @Min(value = 0, message = MessageConst.INVALID_SALARY)
    @Column
    private float salary;

    @Column(name = "date_start", nullable = false)
    @DateTimeFormat(pattern = CommonConst.FORMAT_DATE)
    @Past(message = MessageConst.INVALID_DATE)
    private Date dateStart;

    @Column(name = "date_end", nullable = false)
    @DateTimeFormat(pattern = CommonConst.FORMAT_DATE)
    @Past(message = MessageConst.INVALID_DATE)
    private Date dateEnd;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "recruitment")
    private Set<Vacancies> vacancies;

    @NotNull(message = MessageConst.INVALID_USER_NULL)
    @ManyToOne
    @JoinColumn(name = "user_name", referencedColumnName = "user_name")
    private Users users;

    @NotNull(message = MessageConst.INVALID_SKILL_NULL)
    @ManyToOne
    @JoinColumn(name = "skill_id", referencedColumnName = "skill_id")
    private Skills skills;

    public Recruitment() {

    }

    public Recruitment(int recruitmentId, float salary, Date dateStart, Date dateEnd, Users users, Skills skills) {
        this.recruitmentId = recruitmentId;
        this.salary = salary;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.users = users;
        this.skills = skills;
    }

    public int getRecruitmentId() {
        return recruitmentId;
    }

    public void setRecruitmentId(int recruitmentId) {
        this.recruitmentId = recruitmentId;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public Set<Vacancies> getVacancies() {
        return vacancies;
    }

    public void setVacancies(Set<Vacancies> vacancies) {
        this.vacancies = vacancies;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Skills getSkills() {
        return skills;
    }

    public void setSkills(Skills skills) {
        this.skills = skills;
    }
}
