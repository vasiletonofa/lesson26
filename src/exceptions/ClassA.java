package exceptions;

public class ClassA {

    public void callMe() {
        ClassB classB = new ClassB();
        classB.callMe(); // Nu a ajuns eroarea aici

    }

}
