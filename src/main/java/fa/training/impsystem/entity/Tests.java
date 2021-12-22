package fa.training.impsystem.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Table
@Entity
@Getter
@Setter
public class Tests {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int testId;

    @Column(name = "Test_Name", nullable = false)
    private String testName;

    @Column(name = "Date_From", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateFrom;

    @Column(name = "Date_To", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateTo;

    @Column(name = "Timing", nullable = false)
    private int timing;

    @Column(name = "No_Of_Question", nullable = false)
    private int noOfQuestion;


}
