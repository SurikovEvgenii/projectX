package org.projectx.entity.accounts;

import jakarta.persistence.*;
import org.projectx.entity.projects.Project;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
public class Designer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 20, nullable = false)
    private String login;
    @Column(length = 30, nullable = false)
    private String name;
    @Column(length = 30, nullable = false)
    private String surname;
    @Column(length = 12, nullable = false)
    private String number;
    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL)
    private Set<Project> projectSet = new HashSet<>();
    @Column(nullable = false)
    private String email;
    private String telegram;
    private String whatsapp;
    private Long countFollowers;

    public Designer() {
    }

    public Designer(String login, String name, String surname, String number, Set<Project> projectSet, String email, String telegram, String whatsapp, Long countFollowers) {
        this.login = login;
        this.name = name;
        this.surname = surname;
        this.number = number;
        this.projectSet = projectSet;
        this.email = email;
        this.telegram = telegram;
        this.whatsapp = whatsapp;
        this.countFollowers = countFollowers;
    }

    public Long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Set<Project> getProjectSet() {
        return projectSet;
    }

    public void setProjectSet(Set<Project> projectSet) {
        this.projectSet = projectSet;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelegram() {
        return telegram;
    }

    public void setTelegram(String telegram) {
        this.telegram = telegram;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public Long getCountFollowers() {
        return countFollowers;
    }

    public void setCountFollowers(Long countFollowers) {
        this.countFollowers = countFollowers;
    }
}
