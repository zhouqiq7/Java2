package M2BeforeClass.leiXing;



public class Generic {
    public static void main(String[] args) {
        MyGenericClass <Integer, Integer>myInt = new MyGenericClass<>(1,9);
        MyGenericClass <Double, Double>myDouble = new MyGenericClass<>(3.14,0.01);
        MyGenericClass <Character,Character>myChar = new MyGenericClass<>('@','$');
        MyGenericClass <String,Character>myString = new MyGenericClass<>("Hello", '!');

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());



    }
}
