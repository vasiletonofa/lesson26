package exemplu;

public class Person {

    int salariu;

    long sumaDinPortmoneu;

    public Person(int salariu) {
        this.salariu = salariu;
    }

    public void scoateSalariuDePeCard(int pin) {

        try {
            introducePinBancomat(pin); // se arunca eroare
            sumaDinPortmoneu = sumaDinPortmoneu + salariu;
        } catch (Exception e) {
            System.out.println("Pin cod " + pin + " este gresit, mai incearca ");
        }

    }

    private void introducePinBancomat(int pin) throws Exception {
        if(pin == 123) {
            System.out.println("Am scos suma " + salariu);
        } else {
            throw new Exception("Pin incorect !");
        }
    }

    public void achitaRata(int suma, int luni) {
        try {
            int sumaDeAchitat = suma / luni;
            sumaDinPortmoneu =  sumaDinPortmoneu - sumaDeAchitat;

        } catch (ArithmeticException e) {
            System.out.println("Nu am putut calcula rata cu formula suma/luni , suma: " + suma + " luni: " + luni);
        }
    }

    public long getSumaDinPortmoneu() {
        return sumaDinPortmoneu;
    }
}
