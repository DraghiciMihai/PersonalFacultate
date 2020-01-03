public class Student extends Persoana {
    StatutDeClasa statut;

    public Student(String nume, String adresa, String numarDeTelefon, String email, StatutDeClasa statut) {
        super(nume, adresa, numarDeTelefon, email);
        this.statut = statut;
    }

    @Override
    public String toString(){
        return "Student " + super.getNume();
    }
}
