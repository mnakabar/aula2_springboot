package com.developper.aula2springboot.model;

import lombok.Data;
import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
import java.util.Objects;
@Data
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;

    public Cliente() {

    }

    public Cliente(Long id, String name) {
        this.id = id;
        this.name = name;
    }


}
