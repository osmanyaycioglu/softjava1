package com.soft.train.java.enums;


public class MyLogic {


    public void logicNormal(final int input) {
        if (input == InputStates.INPUT_STATE_RUNNING) {
            System.out.println("1");
        } else if (input == InputStates.INPUT_STATE_PAUSED) {
            System.out.println("2");
        } else if (input == InputStates.INPUT_STATE_STOPPED) {
            System.out.println("3");
        }
    }

    public void logicNormalSwitch(final int input) {
        switch (input) {
            case InputStates.INPUT_STATE_RUNNING: {
                System.out.println("1");
                break;
            }
            case InputStates.INPUT_STATE_PAUSED: {
                System.out.println("2");
                break;
            }
            case InputStates.INPUT_STATE_STOPPED: {
                System.out.println("3");
                break;
            }
            default:
                break;
        }
    }

    public void logicEnumSwitch(final EInputStates input) {
        switch (input) {
            case INPUT_STATE_PAUSED:
                break;
            case INPUT_STATE_RUNNING:
                break;
            case INPUT_STATE_STOPPED:
                break;
            default:
                break;
        }
    }

    public void logicEnumSwitch2(final int input) {
        EInputStates eInputStatesLoc = EInputStates.getEInputStates(input);
        switch (eInputStatesLoc) {
            case INPUT_STATE_PAUSED:
                break;
            case INPUT_STATE_RUNNING:
                break;
            case INPUT_STATE_STOPPED:
                break;
            default:
                break;
        }
    }

    public void logicEnum(final EInputStates input) {
        if (input == EInputStates.INPUT_STATE_RUNNING) {
            System.out.println("1");
        } else if (input == EInputStates.INPUT_STATE_PAUSED) {
            System.out.println("2");
        } else if (input == EInputStates.INPUT_STATE_STOPPED) {
            System.out.println("3");
        }

    }

}
