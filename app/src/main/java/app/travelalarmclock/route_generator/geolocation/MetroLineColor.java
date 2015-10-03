package app.travelalarmclock.route_generator.geolocation;

/**
 * Created by Юрий on 27.09.2015.
 */
public enum MetroLineColor {
    RED{
        @Override
        public int getCode() {
            return 0;
        }
    },
    BLUE{
        @Override
        public int getCode() {
            return 1;
        }
    },
    GREEN{
        @Override
        public int getCode() {
            return 2;
        }
    },
    ORANGE{
        @Override
        public int getCode() {
            return 3;
        }
    },
    PURPLE{
        @Override
        public int getCode() {
            return 4;
        }
    },
    NOCOLOR{
        @Override
        public int getCode() {
            return 5;
        }
    };
    public abstract int getCode();
}
