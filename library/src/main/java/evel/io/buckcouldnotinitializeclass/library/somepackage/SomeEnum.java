package evel.io.buckcouldnotinitializeclass.library.somepackage;

public enum SomeEnum {
    A(new SomeClass("SomeA")),
    B(new SomeClass("WhateverB"));

    private final SomeClass someProperty;

    SomeEnum(SomeClass someProperty) {
        this.someProperty = someProperty;
    }

    public SomeClass getSomeProperty() {
        return someProperty;
    }
}
