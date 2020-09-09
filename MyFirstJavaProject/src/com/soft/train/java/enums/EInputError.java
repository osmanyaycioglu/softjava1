package com.soft.train.java.enums;


public enum EInputError implements IEnumTest {

    VALIDATION(5, 10001, "Validasyon patladı"),
    STATUS(11, 13005, "Status yanlış");


    private final int    index;
    private final int    errorCause;
    private final String desc;

    private EInputError(final int index,
                        final int errorCause,
                        final String desc) {
        this.index = index;
        this.errorCause = errorCause;
        this.desc = desc;
    }

    public String check() {
        return "OK";
    }

    public int getIndex() {
        return this.index;
    }


    public int getErrorCause() {
        return this.errorCause;
    }


    public String getDesc() {
        return this.desc;
    }

    @Override
    public String abc() {
        return null;
    }


}
