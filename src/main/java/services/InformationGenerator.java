package services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class InformationGenerator {

    public static Map<String, String> getInformation(String searchCriteria){
        String userHome = System.getProperty("user.home");
        Path path = Paths.get(userHome, searchCriteria + ".txt");
        String content;
        try {
            content = Files.readString(path);
        }catch (IOException e){
            return Map.of("NO ENCONTRE","NADA NADA NADA NADA NADA NADA NADA NADA NADA NADA NADA NADA NADA NADA NADA NADA");
        }
        return Arrays.stream(content.split("<>"))
                .map(pair -> pair.split("==="))
                .collect(Collectors.toMap(parts -> parts[0].trim(), parts -> parts[1].trim()));
    }
}
