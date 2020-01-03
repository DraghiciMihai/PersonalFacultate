public class MembruFacultate extends Angajat {
    private int oreDeBirou;
    private String Rang;

    public MembruFacultate(String nume, String adresa, String numarDeTelefon, String email, String birou, Double salariu, MyDate dataAngajare, int oreDeBirou, String rang) {
        super(nume, adresa, numarDeTelefon, email, birou, salariu, dataAngajare);
        this.oreDeBirou = oreDeBirou;
        Rang = rang;
    }

    @Override
    public String toString(){
        return "MembruFacultate " + super.getNume();
    }
}
