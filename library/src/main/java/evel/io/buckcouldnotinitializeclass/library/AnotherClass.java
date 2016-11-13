package evel.io.buckcouldnotinitializeclass.library;

import evel.io.buckcouldnotinitializeclass.library.somepackage.SomeEnum;

public class AnotherClass {

    public int testMe(SomeEnum someEnum) {
        switch (someEnum) {
            case A:
                return 100;
            case B:
            default:
                return 0;
        }
    }
}
