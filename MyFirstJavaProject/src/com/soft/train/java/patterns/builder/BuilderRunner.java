package com.soft.train.java.patterns.builder;


public class BuilderRunner {

    public static void main(final String[] args) {
        Connection connectionLoc = new Connection("xyz",
                                                  "192.168.0.1",
                                                  8880,
                                                  1000L,
                                                  100L);
        ConnectionWithBuilder buildLoc = ConnectionWithBuilder.getBuilder()
                                                              .setIp("192.168.0.1")
                                                              .setName("xyz")
                                                              .setPort(8080)
                                                              .setTimeout(1000L)
                                                              .setThreshold(100L)
                                                              .buildSimple();

    }
}
