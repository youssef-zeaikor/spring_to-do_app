package com.zeaikor.peopledbweb.biz.model;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class Person {
    private Long id;
    private  String firstName;
    private  String lastName;
    private LocalDate dop;
    private BigDecimal salary;
}
