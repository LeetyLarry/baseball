package com.ty.baseball.service;

import com.ty.baseball.model.Player;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CVSServiceImpl implements CVSService {


    @Override
    public void parseCVSFile(File file) {
        List<List<String>> lines = new ArrayList<>();

        try (
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            ) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] values = line.split(",");
                lines.add(Arrays.asList(values));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (int lineNumber = 0; lineNumber < lines.size(); lineNumber++) {
            Player player = new Player();
        }
    }
}
