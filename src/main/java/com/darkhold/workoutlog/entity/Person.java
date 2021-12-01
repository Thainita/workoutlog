package com.darkhold.workoutlog.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pk_person_id") //que caralho colocar aqui nessa porra???
    private int pkPersonId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "birth_date")
    private Date birthDate;

    @Column(name = "email")
    private String email;

    public Person() {

    }

    public Person(int pkPersonId, String firstName, String lastName, Date birthDate, String email) {
        this.pkPersonId = pkPersonId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.email = email;
    }

    public int getPkPersonId() {
        return pkPersonId;
    }

    public void setPkPersonId(int pkPersonId) {
        this.pkPersonId = pkPersonId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}