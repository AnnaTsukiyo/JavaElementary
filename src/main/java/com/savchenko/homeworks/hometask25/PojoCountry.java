package com.savchenko.homeworks.hometask25;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "world.country")
public class PojoCountry {

    private String code;
    private String name;
    private String continent;
    private String region;
    private double surfaceArea;
    private int indepYear;
    private long population;
    private double lifeExpectancy;
    private double GNP;
    private double GNPOld;
    private String LocalName;
    private String GovernmentForm;
    private String HeadOfState;
    private long capital;
    private String Code2;

}