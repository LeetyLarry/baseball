package com.ty.baseball.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class CVSServiceImplTest {
    private CVSService cvsService;

    @BeforeEach
    void setup() {
        cvsService = new CVSServiceImpl();
    }

    @Test
    void parseCVSFileTest() {
        File file = new File("/home/ty/baseball/src/main/resources/players_07162022_85.csv");
        cvsService.parseCVSFile(file);
    }
}