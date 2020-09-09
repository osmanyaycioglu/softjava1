package com.soft.train.java.enums;


public enum TimeConvert {

    MILISECOND {

        @Override
        public long toMilis(final long input) {
            return input;
        }
    },
    SECOND {

        @Override
        public long toMilis(final long input) {
            return 1000 * input;
        }
    },
    MINUTE {

        @Override
        public long toMilis(final long input) {
            return 60 * SECOND.toMilis(input);
        }
    },
    HOUR {

        @Override
        public long toMilis(final long input) {
            return 60 * MINUTE.toMilis(input);
        }
    },
    DAY {

        @Override
        public long toMilis(final long input) {
            return 24 * HOUR.toMilis(input);
        }
    };

    public long toMilis(final long input) {
        throw new AbstractMethodError();
    }
}
