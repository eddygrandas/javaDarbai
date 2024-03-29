package com.practice.model;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Person {
    private int id;
    @NonNull
    private String name;
    @NonNull
    private int age;
    private String phoneNumber;
}
