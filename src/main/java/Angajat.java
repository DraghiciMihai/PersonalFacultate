public class Angajat extends Persoana {
    String birou;
    Double salariu;
    MyDate dataAngajare;

    public Angajat(String nume, String adresa, String numarDeTelefon, String email, String birou, Double salariu, MyDate dataAngajare) {
        super(nume, adresa, numarDeTelefon, email);
        this.birou = birou;
        this.salariu = salariu;
        this.dataAngajare = dataAngajare;
    }
}