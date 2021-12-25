package fa.training.impsystem.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
public class EntryTest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int entryTestId;

}
