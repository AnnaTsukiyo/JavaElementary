package com.savchenko.homeworks.hometask27;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.savchenko.homeworks.hometask25.PojoCountry;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.IOException;

/**
 * create an endpoint / countries which returns the JSON of the countries fron the previous hometask
 * create an endpoint / countries / UA that returns the JSON of the country for which the given country code (it should be possible to replace UA with USA or something else and get the result)
 * <p>
 * And everything must be divided into 3 layers
 * <p>
 * Controller (in your case servlets) (knows nothing about dao)
 * Service - there will be a conversion to the required format (knows nothing about the controller)
 * Dao (knows neither about the Dao nor about the controller)
 */
@Slf4j
public class CountryJsonWriter {

    public void writeCountryToJson(PojoCountry country) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            String jsonInString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(country);
            log.info("Country JSON is\n" + jsonInString);
            objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
            objectMapper.writeValue(new File(country.getCode2() + "_country.json"), country);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
