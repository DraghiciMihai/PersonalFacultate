public class PersonalFacultate extends Angajat {
    private String titlu;

    public PersonalFacultate(String nume, String adresa, String numarDeTelefon, String email, String birou, Double salariu, MyDate dataAngajare, String titlu) {
        super(nume, adresa, numarDeTelefon, email, birou, salariu, dataAngajare);
        this.titlu = titlu;
    }

    @Override
    public String toString(){
        return "PersonalFacultate " + super.getNume();
    }
}
