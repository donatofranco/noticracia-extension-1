package noticracia;

import noticracia.entities.InformationSource;
import services.InformationReaderService;

import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class ClarineteInformationSource extends InformationSource {

    private boolean active = false;
    private ScheduledExecutorService executor;

    @Override
    public void start(String searchCriteria) {
        if(active) {
            this.executor.shutdown();
        }
        this.active = true;
        executor = Executors.newScheduledThreadPool(1);
        Runnable task = () -> {
            if (active) {
                this.notify(this.mapInformation(InformationReaderService.readInformation(searchCriteria)));
            } else {
                executor.shutdown();
            }
        };
        executor.scheduleAtFixedRate(task, 0, 5, TimeUnit.SECONDS);
    }

    @Override
    public void stop() {
        this.active = false;
    }

    @Override
    public String getName() {
        return "Clarinete";
    }

    @Override
    public Map<String, String> mapInformation(Object result) {
        return  Arrays.stream(((String) result).split("<>"))
                .map(pair -> pair.split("==="))
                .collect(Collectors.toMap(parts -> parts[0].trim(), parts -> parts[1].trim()));
    }
}
