package evel.io.buckcouldnotinitializeclass.library;

import evel.io.buckcouldnotinitializeclass.library.somepackage.SomeEnum;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AnotherClassTest {

    private AnotherClass anotherClass;

    @Before
    public void setUp() {
        anotherClass = new AnotherClass();
    }

    @Test
    public void shouldDoThisThing() {
        int given = anotherClass.testMe(SomeEnum.A);
        assertThat(given).isEqualTo(100);
    }

    @Test
    public void shouldDoThisOtherThing() {
        int given = anotherClass.testMe(SomeEnum.B);
        assertThat(given).isEqualTo(0);
    }

    @Test(expected = NullPointerException.class)
    public void sillyTests() {
        SomeEnum unused = null;
        anotherClass.testMe(null);
    }

    @Test
    public void moreUsagesOfSomeEnum() {
        int given = anotherClass.testMe(SomeEnum.valueOf("A"));
        assertThat(given).isEqualTo(100);
    }
}