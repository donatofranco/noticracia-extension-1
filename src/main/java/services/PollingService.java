package services;

import noticracia.entities.InformationSource;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class PollingService {

    private boolean active = false;

    public boolean start(InformationSource informationSource, String searchCriteria) {
        this.active = true;
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        AtomicInteger count = new AtomicInteger();
        Runnable task = () -> {
            if (active) {
                informationSource.refresh(InformationGenerator.getInformation(searchCriteria, count.getAndIncrement()));
            } else {
                executor.shutdown();
            }
        };
        executor.scheduleAtFixedRate(task, 0, 5, TimeUnit.SECONDS);
        return true;
    }

    public void stop(){
        this.active = false;
    }
}
