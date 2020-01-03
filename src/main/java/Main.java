public class Main {
    public static void main(String[] args) {
        Facultate facultate = new Facultate();
        Student student1 = new Student("Mircea Enaru", "Strada Castanilor, nr. 9", "0765714269", "mirceaenaru@gmail.com", StatutDeClasa.junior);
        PersonalFacultate personalFacultate1 = new PersonalFacultate("Bogdan Staicu", "Strada Caracal, nr. 7",
                "0769842256", "bogdanstaicu@gmail.com", "M192", 4500.0, new MyDate(1994, 9, 23), "Doctor");
        MembruFacultate membruFacultate1 = new MembruFacultate("Radu Combei", "Strada Vasile Alecsandri, nr. 27",
                "0765987456", "raducombei@yahoo.com", "E234", 3252.0, new MyDate(1998,10,2),40, "I");
        facultate.add(student1);
        facultate.add(personalFacultate1);
        facultate.add(membruFacultate1);
        facultate.afisare();
    }

}
