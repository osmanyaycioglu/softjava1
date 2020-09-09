package com.soft.train.java.collections;


public class MyCollectionObj {

    private String strValue;
    private int    intValue;


    public MyCollectionObj() {
    }

    public MyCollectionObj(final String strValueParam,
                           final int intValueParam) {
        super();
        this.strValue = strValueParam;
        this.intValue = intValueParam;
    }

    public String getStrValue() {
        return this.strValue;
    }

    public void setStrValue(final String strValueParam) {
        this.strValue = strValueParam;
    }

    public int getIntValue() {
        return this.intValue;
    }

    public void setIntValue(final int intValueParam) {
        this.intValue = intValueParam;
    }


    @Override
    public String toString() {
        return "MyCollectionObj [strValue=" + this.strValue + ", intValue=" + this.intValue + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) + this.intValue;
        result = (prime * result) + ((this.strValue == null) ? 0 : this.strValue.hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        MyCollectionObj other = (MyCollectionObj) obj;
        if (this.intValue != other.intValue) {
            return false;
        }
        if (this.strValue == null) {
            if (other.strValue != null) {
                return false;
            }
        } else if (!this.strValue.equals(other.strValue)) {
            return false;
        }
        return true;
    }


}
