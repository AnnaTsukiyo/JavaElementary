package com.savchenko.lectures.lesson10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConfigurationManagerTest {

    @Test
    void getDbPort() {
        assertEquals("localhost", ConfigurationManager.getINSTANCE().getDbPort());
    }

    @Test
    void getDUrl() {
    }

    @Test
    void getINSTANCE() {
    }
}