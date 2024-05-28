package org.projectx.entity.accounts;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class User {

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
    @Column(nullable = false)
    private String email;
    @OneToMany(mappedBy = "designer", cascade = CascadeType.ALL)
    private Set<Designer> designerSet = new HashSet<>();

    public User() {
    }

    public User(String login, String name, String surname, String number, String email, Set<Designer> designerSet) {
        this.login = login;
        this.name = name;
        this.surname = surname;
        this.number = number;
        this.email = email;
        this.designerSet = designerSet;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Designer> getDesignerSet() {
        return designerSet;
    }

    public void setDesignerSet(Set<Designer> designerSet) {
        this.designerSet = designerSet;
    }
}
