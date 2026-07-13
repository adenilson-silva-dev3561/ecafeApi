package eCafe.API.monitoring;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.stereotype.Component;

@Component
public class ProductMetrics {

    private final Counter createdCounter;
    private final Counter updateCounter;
    private final Counter deleteCounter;

    public ProductMetrics(MeterRegistry meterRegistry){
        this.createdCounter = Counter.builder("ecafe.products.created").description("Quantidade de produtos criados")
                .register(meterRegistry);

        this.updateCounter = Counter.builder("ecafe.products.updated").description("Quantidade de produtos atualizados")
                .register(meterRegistry);

        this.deleteCounter = Counter.builder("ecafe.products.deleted").description("Quantidade de produtos deletados")
                .register(meterRegistry);
    }

    public void incrementCreated(){
        createdCounter.increment();
    }

    public void incrementUpdated(){
        updateCounter.increment();
    }

    public void incrementDeleted(){
        deleteCounter.increment();
    }
}
