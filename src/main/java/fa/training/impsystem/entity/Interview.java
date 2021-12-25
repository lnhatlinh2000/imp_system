package fa.training.impsystem.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Interview")
public class Interview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int interviewId;

    @Column(name = "Date_Time", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date datatime;

    @Column(name = "Address", nullable = false)
    private String address;

    @Column(name = "Round", nullable = false)
    private int round;

    @Column(name = "Contact", nullable = false)
    private String contact;

    public int getInterviewId() {
        return interviewId;
    }

    public void setInterviewId(int interviewId) {
        this.interviewId = interviewId;
    }

    public Date getDatatime() {
        return datatime;
    }

    public void setDatatime(Date datatime) {
        this.datatime = datatime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
