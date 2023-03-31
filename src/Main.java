import exceptions.ClassA;
import exemplu.Person;

public class Main {
    public static void main(String[] args) {

        Person person = new Person(4000);

        person.scoateSalariuDePeCard(123);

        person.achitaRata(20000, 0);

        System.out.println("Avem in portmoneu: " +  person.getSumaDinPortmoneu());

    }
}