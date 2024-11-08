package noticracia;

import noticracia.entities.InformationSource;
import services.InformationGenerator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ClarinInformationSource implements InformationSource {

    @Override
    public Set<String> getInformation(String searchCriteria) {
        String userHome = System.getProperty("user.home");
        Path path = Paths.get(userHome, searchCriteria + ".txt");
        String content;
        try {
            content = Files.readString(path);
        } catch (IOException e) {
            return Set.of("NADA NADA NADA NADA NADA NADA NADA NADA NADA NADA NADA NADA NADA NADA NADA NADA");
        }
        return Arrays.stream(content.split("<>"))
                .map(String::trim)
                .collect(Collectors.toSet());
    }

    @Override
    public String getName() {
        return "Clarinete";
    }

}
