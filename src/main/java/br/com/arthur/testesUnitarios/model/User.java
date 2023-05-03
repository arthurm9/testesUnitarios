package br.com.arthur.testesUnitarios.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    public String name;

    @Column
    private Integer age;

    @Column
    private String document;

    public User(String name, Integer age, String document) {
        this.name = name;
        this.age = age;
        this.document = document;
    }

    @Override
    public String toString() {
        return "User{" + "name='" + name + '\'' + ", age=" + age + ", document='" + document + '\'' + '}';
    }
}
