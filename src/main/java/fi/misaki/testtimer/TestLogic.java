package fi.misaki.testtimer;

import org.eclipse.microprofile.metrics.Histogram;
import org.eclipse.microprofile.metrics.MetricUnits;
import org.eclipse.microprofile.metrics.Timer;
import org.eclipse.microprofile.metrics.annotation.Metric;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.concurrent.TimeUnit;

@ApplicationScoped
public class TestLogic {
    @Inject
    @Metric(name = "TestTimer", unit = MetricUnits.MILLISECONDS, description = "test")
    private Timer testTimer;

    @Inject
    @Metric(name = "TestHistogram", unit = MetricUnits.MILLISECONDS, description = "test")
    private Histogram testHistogram;

    public String getText() {
        testTimer.update(1234, TimeUnit.MILLISECONDS);
        testHistogram.update(5678);
        return "Hello, world!";
    }
}
