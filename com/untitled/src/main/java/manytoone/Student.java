package manytoone;

import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sid;
    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "aid")
    private Address address;

    public int getSid() {
        return sid;
    }

    public void setSid(int id) {
        this.sid = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
