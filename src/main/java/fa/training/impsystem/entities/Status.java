package fa.training.impsystem.entities;

import fa.training.impsystem.consts.MessageConst;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Set;

@Entity
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "status_id")
    private int statusId;

    @NotBlank(message = MessageConst.INVALID_NAME)
    @Column(name = "status_name", nullable = false)
    private String statusName;

    @Column
    private String description;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "status")
    private Set<Interview> interview;

    public Status() {

    }

    public Status(int statusId, String statusName, String description) {
        this.statusId = statusId;
        this.statusName = statusName;
        this.description = description;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Interview> getInterview() {
        return interview;
    }

    public void setInterview(Set<Interview> interview) {
        this.interview = interview;
    }
}