package com.in28minutes.springboot.jdbc.h2.example.student;

public class student {
    private long id;
    private string name;
    private string passportnumber;

    public student() {
        super();
    }

    public student(long id, string name, string passportnumber) {
        super();
        this.id = id;
        this.name = name;
        this.passportnumber = passportnumber;
    }

    public student(string name, string passportnumber) {
        super();
        this.name = name;
        this.passportnumber = passportnumber;
    }

    public long getid() {
        return id;
    }

    public void setid(long id) {
        this.id = id;
    }

    public string getname() {
        return name;
    }

    public void setname(string name) {
        this.name = name;
    }

    public string getpassportnumber() {
        return passportnumber;
    }

    public void setpassportnumber(string passportnumber) {
        this.passportnumber = passportnumber;
    }

    @override
    public string tostring() {
        return string.format("student [id=%s, name=%s, passportnumber=%s]", id, name, passportnumber);
    }

}