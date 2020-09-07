package com.soft.train.java.config.reflection;

@PropertyFile("myconf.properties")
public class Application {

    @Property(key = "app.name")
    private String name;
    @Property(key = "app.test.count")
    private int    testCount;
    @Property(key = "app.threshold")
    private long   threshold;

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    public int getTestCount() {
        return this.testCount;
    }

    public void setTestCount(final int testCountParam) {
        this.testCount = testCountParam;
    }

    public long getThreshold() {
        return this.threshold;
    }

    public void setThreshold(final long thresholdParam) {
        this.threshold = thresholdParam;
    }

    @Override
    public String toString() {
        return "Application [name="
               + this.name
               + ", testCount="
               + this.testCount
               + ", threshold="
               + this.threshold
               + "]";
    }


}
