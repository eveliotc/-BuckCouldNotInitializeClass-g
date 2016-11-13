package evel.io.buckcouldnotinitializeclass.library.somepackage;

import android.os.Parcelable;
import android.util.SparseArray;

public class SomeClass {

    private final String stringProperty;
    private SparseArray<Parcelable> someState;

    public SomeClass(String stringProperty) {
        this.stringProperty = stringProperty;
        someState = new SparseArray<Parcelable>();
    }

    public String getStringProperty() {
        return stringProperty;
    }
}
