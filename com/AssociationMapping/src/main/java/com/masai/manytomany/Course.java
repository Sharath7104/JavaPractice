package com.masai.manytomany;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "COURSE")
public class Course {

    @Id
    @Column(name = "CID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cid;

    @Column(name = "CNAME")
    private String cname;

    @ManyToMany
    @JoinTable(name = "STUDENT_COURSE",
            joinColumns = {@JoinColumn(name = "CID")},
            inverseJoinColumns = {@JoinColumn(name="SID")}
    )
    private Set<Student> studentSet = new HashSet<>();

    public Course() {
    }

    public Course(int cid, String cname, Set<Student> studentSet) {
        this.cid = cid;
        this.cname = cname;
        this.studentSet = studentSet;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Set<Student> getStudentSet() {
        return studentSet;
    }

    public void setStudentSet(Set<Student> studentSet) {
        this.studentSet = studentSet;
    }
}
