package exceptions;

public class ClassB {

    public void callMe() {

//        try {
            ClassC classC = new ClassC();
            classC.callMe(); // se va arunca eroare
//        } catch (Exception e) {
//            System.out.println("Nu am putut apela metoda callMe din ClassC, a data eroare !");
//        }

    }
}
