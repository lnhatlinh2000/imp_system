package fa.training.impsystem.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table
@Entity
@Getter
@Setter
public class Answers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int answerId;

    @Column(name = "Answer", nullable = false)
    private String answer;

    @Column(name = "Is_Correct", nullable = false)
    private int isCorrect;
}
