package com.soft.train.java.patterns.builder;


public class ConnectionWithBuilder {

    private String name;
    private String ip;
    private int    port;
    private long   timeout;
    private Long   threshold;

    private ConnectionWithBuilder() {
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

    public static ConnectionWithBuilderBuilder getBuilder() {
        return new ConnectionWithBuilderBuilder();

    }

    public static class ConnectionWithBuilderBuilder {

        private final ConnectionWithBuilder cwb = new ConnectionWithBuilder();


        private ConnectionWithBuilderBuilder() {
        }

        public ConnectionWithBuilderBuilder setName(final String nameParam) {
            this.cwb.name = nameParam;
            return this;
        }


        public ConnectionWithBuilderBuilder setIp(final String ipParam) {
            this.cwb.ip = ipParam;
            return this;
        }


        public ConnectionWithBuilderBuilder setPort(final int portParam) {
            this.cwb.port = portParam;
            return this;
        }


        public ConnectionWithBuilderBuilder setTimeout(final long timeoutParam) {
            this.cwb.timeout = timeoutParam;
            return this;
        }


        public ConnectionWithBuilderBuilder setThreshold(final Long thresholdParam) {
            this.cwb.threshold = thresholdParam;
            return this;
        }

        public ConnectionWithBuilder buildSimple() {
            // Simple Validation
            return this.cwb;
        }

        public ConnectionWithBuilder buildComplex() {
            // Complex Validation
            return this.cwb;
        }

    }

}
