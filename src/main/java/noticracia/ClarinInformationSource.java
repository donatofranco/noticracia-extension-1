package noticracia;

import noticracia.entities.InformationSource;
import noticracia.services.information.broker.InformationSourceBroker;
import services.PollingService;

public class ClarinInformationSource extends InformationSource {

    PollingService pollingService;

    public ClarinInformationSource(InformationSourceBroker informationSourceBroker) {
        super(informationSourceBroker);
        this.pollingService = new PollingService();
    }

    @Override
    public boolean startProcess(String searchCriteria) {
        return pollingService.start(this, searchCriteria);
    }

    @Override
    public void stopProcess() {
        this.pollingService.stop();
    }

    @Override
    public String getName() {
        return "Clarinete";
    }
}
