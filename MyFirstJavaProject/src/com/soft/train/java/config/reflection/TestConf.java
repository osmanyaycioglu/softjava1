package com.soft.train.java.config.reflection;

@PropertyFile("test.properties")
public class TestConf {

    @Property(key = "test.name")
    private String name;
    @Property(key = "test.count")
    private int    count;
    @Property(key = "test.loop")
    private long   loop;

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    public int getCount() {
        return this.count;
    }

    public void setCount(final int countParam) {
        this.count = countParam;
    }

    public long getLoop() {
        return this.loop;
    }

    public void setLoop(final long loopParam) {
        this.loop = loopParam;
    }

    @Override
    public String toString() {
        return "TestConf [name=" + this.name + ", count=" + this.count + ", loop=" + this.loop + "]";
    }


}
