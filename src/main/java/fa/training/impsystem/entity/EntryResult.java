package fa.training.impsystem.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@Setter
@Getter
public class EntryResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int entryResultId;

    @Column(name = "No_Correct", nullable = false)
    private int noCorrect;

    @Column(name = "No_Incorrect", nullable = false)
    private int noInCorrect;

    @Column(name = "No_Unanswered", nullable = false)
    private int noUnanswered;

    @Column(name = "Score", nullable = false)
    private int score;

    @Column(name = "Rank", nullable = false)
    private int rank;

}
