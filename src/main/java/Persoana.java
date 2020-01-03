public class Persoana {
    private String nume;
    private String adresa;
    private  String numarDeTelefon;
    private String email;

    public Persoana(String nume, String adresa, String numarDeTelefon, String email) {
        this.nume = nume;
        this.adresa = adresa;
        this.numarDeTelefon = numarDeTelefon;
        this.email = email;
    }

    public String getNume() {
        return nume;
    }
}
