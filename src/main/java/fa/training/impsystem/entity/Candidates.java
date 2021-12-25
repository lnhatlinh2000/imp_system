package fa.training.impsystem.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Candidates")
@Getter
@Setter
public class Candidates {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int candidateId;

    @Column(name = "Candidate_Name", nullable = false)
    private String candidateName;

    @Column(name = "Card_Id", nullable = false)
    private int cardId;

    @Column(name = "Card_Id_Date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date cardIdDate;

    @Column(name = "Phone", nullable = false)
    private String phone;

    @Column(name = "Birth_Day", nullable = false)
    private Date birthDay;

    @Column(name = "Gender", nullable = false)
    private boolean gender;

    @Column(name = "Email", nullable = false)
    private String email;

    @Column(name = "Experience", nullable = false)
    private String experience;

    @Column(name = "Activity", nullable = false)
    private String activity;

    @Column(name = "Photo", nullable = false)
    private String photo;
}
