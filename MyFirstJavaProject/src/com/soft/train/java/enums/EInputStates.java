package com.soft.train.java.enums;


public enum EInputStates {

    INPUT_STATE_RUNNING(9) {

        @Override
        public int check() {
            System.out.println("Check ozel");
            return 9;
        }

    },
    INPUT_STATE_PAUSED(11) {

    },
    INPUT_STATE_TEST(8),
    INPUT_STATE_STOPPED(0);

    private final int index;

    private EInputStates(final int index) {
        this.index = index;
    }

    public int getIndex() {
        return this.index;
    }

    public int check() {
        System.out.println("Check general");
        return this.index;
    }

    public static EInputStates getEInputStates(final int index) {
        switch (index) {
            case 9:
                return INPUT_STATE_RUNNING;
            case 11:
                return INPUT_STATE_PAUSED;
            case 8:
                return INPUT_STATE_TEST;
            case 0:
                return INPUT_STATE_STOPPED;

            default:
                return null;
        }
    }
}
