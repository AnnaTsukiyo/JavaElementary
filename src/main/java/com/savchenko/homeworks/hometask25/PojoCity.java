package com.savchenko.homeworks.hometask25;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "world.city")

public class PojoCity {

    private long ID;
    private String name;
    private String countryCode;
    private String district;
    private long population;

}
