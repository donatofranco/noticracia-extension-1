package noticracia;

import noticracia.entities.InformationSource;
import noticracia.services.information.broker.InformationSourceBroker;
import services.InformationGenerator;

import java.util.Map;

public class ClarinInformationSource extends InformationSource {

    private boolean active = false;

    public ClarinInformationSource(InformationSourceBroker informationSourceBroker) {
        super(informationSourceBroker);
    }

    @Override
    public boolean startProcess(String searchCriteria) {
        active = true;
        new Thread(() -> {
            while (active) {
                this.refresh(InformationGenerator.getInformation(searchCriteria));
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        }).start();
        return true;
    }

    @Override
    public void stopProcess() {
        this.active = false;
    }

    @Override
    public String getName() {
        return "Clarinete";
    }
}
