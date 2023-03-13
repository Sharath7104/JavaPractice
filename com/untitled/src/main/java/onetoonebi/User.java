package onetoonebi;

import jakarta.persistence.*;


public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String username;

    @OneToOne(cascade = CascadeType.ALL)
    private Passport passport;

    public User(int userId, String username, Passport passport) {
        this.userId = userId;
        this.username = username;
        this.passport = passport;
    }

    public User() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }
}
