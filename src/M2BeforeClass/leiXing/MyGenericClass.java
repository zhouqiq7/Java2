package M2BeforeClass.leiXing;

public class MyGenericClass <Thing, Thing2> {
    Thing x;
    Thing2 y;

    MyGenericClass(Thing x, Thing2 y) {
        this.x = x;
        this.y = y;
    }

    public Thing2 getValue() {
        return y;

    }
}
