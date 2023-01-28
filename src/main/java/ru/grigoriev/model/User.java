package ru.grigoriev.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class User {
    private String name;
    private String password;
    private List<Authorities> authorities;
}

