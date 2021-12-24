package fa.training.impsystem.entities;

import fa.training.impsystem.consts.CommonConst;
import fa.training.impsystem.consts.MessageConst;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;
import java.util.Set;

@Entity
public class Candidates {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "candidate_id")
    private int candidateId;

    @NotBlank(message = MessageConst.INVALID_NAME)
    @Column(name = "candidate_name", nullable = false)
    private String candidateName;

    @Size(min = 9, max = 12, message = MessageConst.INVALID_CARD)
    @Column(name = "card_id", unique = true)
    private int cardId;

    @Column(name = "card_id_date")
    @DateTimeFormat(pattern = CommonConst.FORMAT_DATE)
    @Past(message = MessageConst.INVALID_DATE)
    private Date cardIdDate;

    @NotBlank(message = MessageConst.INVALID_PHONE)
    @Column(nullable = false, unique = true)
    private String phone;

    @Column
    private boolean gender;

    @Email(message = MessageConst.INVALID_EMAIL)
    @Column(nullable = false, unique = true)
    private String email;

    @NotBlank(message = MessageConst.INVALID_EXP)
    @Column(nullable = false)
    private String experience;

    @NotBlank(message = MessageConst.INVALID_ACTIVITY)
    @Column(nullable = false)
    private String activity;

    @NotBlank(message = MessageConst.INVALID_PHOTO)
    @Column(nullable = false)
    private String photo;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "candidates")
    private Set<Report> reports;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "candidates")
    private Set<Interview> interviews;

    @NotNull(message = MessageConst.INVALID_SKILL_NULL)
    @ManyToOne
    @JoinColumn(name = "skill_id", referencedColumnName = "skill_id")
    private Skills skills;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "candidates")
    private EntryTest entryTest;

    public Candidates() {

    }

    public Candidates(int candidateId, String candidateName, int cardId, Date cardIdDate, String phone, boolean gender, String email, String experience, String activity, String photo, Skills skills) {
        this.candidateId = candidateId;
        this.candidateName = candidateName;
        this.cardId = cardId;
        this.cardIdDate = cardIdDate;
        this.phone = phone;
        this.gender = gender;
        this.email = email;
        this.experience = experience;
        this.activity = activity;
        this.photo = photo;
        this.skills = skills;
    }

    public int getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(int candidateId) {
        this.candidateId = candidateId;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public Date getCardIdDate() {
        return cardIdDate;
    }

    public void setCardIdDate(Date cardIdDate) {
        this.cardIdDate = cardIdDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Set<Report> getReports() {
        return reports;
    }

    public void setReports(Set<Report> reports) {
        this.reports = reports;
    }

    public Set<Interview> getInterviews() {
        return interviews;
    }

    public void setInterviews(Set<Interview> interviews) {
        this.interviews = interviews;
    }

    public Skills getSkills() {
        return skills;
    }

    public void setSkills(Skills skills) {
        this.skills = skills;
    }

    public EntryTest getEntryTest() {
        return entryTest;
    }

    public void setEntryTest(EntryTest entryTest) {
        this.entryTest = entryTest;
    }
}
