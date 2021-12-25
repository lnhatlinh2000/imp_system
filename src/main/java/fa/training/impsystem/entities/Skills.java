package fa.training.impsystem.entities;

import fa.training.impsystem.consts.MessageConst;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Set;

@Entity
public class Skills {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skill_id")
    private int skillId;

    @NotBlank(message = MessageConst.INVALID_NAME)
    @Column(name = "skill_name", nullable = false)
    private String skillName;

    @Column
    private String description;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "skills")
    private Set<Recruitment> recruitments;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "skills")
    private Set<Candidates> candidates;

    public Skills() {

    }

    public Skills(int skillId, String skillName, String description) {
        this.skillId = skillId;
        this.skillName = skillName;
        this.description = description;
    }

    public int getSkillId() {
        return skillId;
    }

    public void setSkillId(int skillId) {
        this.skillId = skillId;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Recruitment> getRecruitments() {
        return recruitments;
    }

    public void setRecruitments(Set<Recruitment> recruitments) {
        this.recruitments = recruitments;
    }

    public Set<Candidates> getCandidates() {
        return candidates;
    }

    public void setCandidates(Set<Candidates> candidates) {
        this.candidates = candidates;
    }
}
