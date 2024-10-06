package noticracia;

import noticracia.entities.InformationSource;
import services.InformationGenerator;

import java.util.Map;

public class ClarinInformationSource implements InformationSource {

    @Override
    public Map<String, String> getInformation(String searchCriteria) {
        return InformationGenerator.getInformation(searchCriteria);
    }

    @Override
    public String getName() {
        return "Clarinete";
    }
}
