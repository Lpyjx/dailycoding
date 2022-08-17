package org.zh;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Person {
    private String name;
    private String email;

    public Integer id;
    public Boolean gender;

    public Person() {
    }
    public Person(String name, String email, Integer id, Boolean gender) {
        this.name = name;
        this.email = email;
        this.id = id;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", id=" + id +
                ", gender=" + gender +
                '}';
    }
}
