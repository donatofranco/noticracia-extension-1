package services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class InformationReaderService {
    public static String readInformation(String searchCriteria) {
        String userHome = System.getProperty("user.home");
        Path path = Paths.get(userHome, searchCriteria + ".txt");
        String content;
        try {
            content = Files.readString(path);
        }catch (IOException e){
            return "";
        }
        return content;
    }
}
