package noticracia;

import noticracia.entities.InformationSource;
import noticracia.services.information.broker.InformationSourceBroker;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class ClarinInformationSource extends InformationSource {
    public ClarinInformationSource(InformationSourceBroker informationSourceBroker) {
        super(informationSourceBroker);
    }

    @Override
    public boolean startProcess(String s) {
        CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(10000); // Pausa por 5 segundos
                this.refresh(Map.of(
                        "link",
                        "textito textito textito textito textito textito textito textito"
                ));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("El hilo fue interrumpido");
            }
        });
        return true;
    }

    @Override
    public void stopProcess() {

    }

    @Override
    public String getName() {
        return "";
    }
}
