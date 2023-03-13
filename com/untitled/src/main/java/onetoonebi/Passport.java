package onetoonebi;

import jakarta.persistence.*;


public class Passport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pid;
    private String pnumber;
    @OneToOne(mappedBy = "passport")
    private User user;

    public Passport(int pid, String pnumber, User user) {
        this.pid = pid;
        this.pnumber = pnumber;
        this.user = user;
    }

    public Passport() {
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPnumber() {
        return pnumber;
    }

    public void setPnumber(String pnumber) {
        this.pnumber = pnumber;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
