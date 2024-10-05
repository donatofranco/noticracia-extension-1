package services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class InformationGenerator {
    private static final String LETTERS = "AE";

    private static String generarPalabraAleatoria(int longitud) {
        Random random = new Random();
        StringBuilder palabra = new StringBuilder(longitud);

        for (int i = 0; i < longitud; i++) {
            int indiceAleatorio = random.nextInt(LETTERS.length());
            palabra.append(LETTERS.charAt(indiceAleatorio));
        }

        return palabra.toString();
    }

    public static Map<String, String> generateRandomInformation() {
        Map<String, String> mapaPalabras = new HashMap<>();
        Random random = new Random();
        int cantLinks = random.nextInt(5) + 1;
        int cantWords = random.nextInt(51) + 10;

        int lengthWord = random.nextInt(5) + 1;
        for (int i = 0; i < cantLinks; i++) {
            String clave = generarPalabraAleatoria(lengthWord);
            StringBuilder conjuntoPalabras = new StringBuilder();

            for (int j = 0; j < cantWords; j++) {
                conjuntoPalabras.append(generarPalabraAleatoria(lengthWord));
                if (j < cantWords - 1) {
                    conjuntoPalabras.append(" ");
                }
            }

            mapaPalabras.put(clave, conjuntoPalabras.toString());
        }

        return mapaPalabras;
    }

    public static Map<String, String> getInformation(String searchCriteria){
        Path path = Paths.get("C:\\"+searchCriteria+" info0.txt");
        String content;
        try {
            content = Files.readString(path);
        }catch (IOException e){
            return Map.of();
        }
        return Arrays.stream(content.split("<>"))
                .map(pair -> pair.split("==="))
                .collect(Collectors.toMap(parts -> parts[0].trim(), parts -> parts[1].trim()));
    }
}
