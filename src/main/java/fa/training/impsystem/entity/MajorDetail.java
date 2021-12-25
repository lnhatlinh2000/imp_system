package fa.training.impsystem.entity;

import javax.persistence.*;

@Entity
@Table(name = "Major_Detail")
public class MajorDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int majorDetailId;

    @Column(name = "Major_Detail_Name", nullable = false)
    private String majorDetailName;

    public int getMajorDetailId() {
        return majorDetailId;
    }

    public void setMajorDetailId(int majorDetailId) {
        this.majorDetailId = majorDetailId;
    }

    public String getMajorDetailName() {
        return majorDetailName;
    }

    public void setMajorDetailName(String majorDetailName) {
        this.majorDetailName = majorDetailName;
    }
}
