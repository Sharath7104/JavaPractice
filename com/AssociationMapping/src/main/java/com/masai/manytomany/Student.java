package com.masai.manytomany;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "STUDENT")
public class Student {

    @Id
    @Column(name = "SID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sid;

    @Column(name = "SNAME")
    private String sname;

    @ManyToMany(mappedBy = "studentSet", cascade = CascadeType.ALL)
    private Set<Course> courseSet = new HashSet<>();

    public Student() {
    }

    public Student(int sid, String sname, Set<Course> courseSet) {
        this.sid = sid;
        this.sname = sname;
        this.courseSet = courseSet;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Set<Course> getCourseSet() {
        return courseSet;
    }

    public void setCourseSet(Set<Course> courseSet) {
        this.courseSet = courseSet;
    }
}
