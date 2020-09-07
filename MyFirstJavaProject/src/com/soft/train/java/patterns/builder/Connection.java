package com.soft.train.java.patterns.builder;


public class Connection {

    private final String name;
    private final String ip;
    private final int    port;
    private final long   timeout;
    private Long         threshold;


    public Connection(final String nameParam,
                      final String ipParam,
                      final int portParam,
                      final long timeoutParam) {
        super();
        this.name = nameParam;
        this.ip = ipParam;
        this.port = portParam;
        this.timeout = timeoutParam;
    }


    public Connection(final String nameParam,
                      final String ipParam,
                      final int portParam,
                      final long timeoutParam,
                      final Long thresholdParam) {
        super();
        this.name = nameParam;
        this.ip = ipParam;
        this.port = portParam;
        this.timeout = timeoutParam;
        this.threshold = thresholdParam;
    }


    public String getName() {
        return this.name;
    }

    public String getIp() {
        return this.ip;
    }

    public int getPort() {
        return this.port;
    }

    public long getTimeout() {
        return this.timeout;
    }


}
