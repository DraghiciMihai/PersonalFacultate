import java.util.ArrayList;
import java.util.List;

public class Facultate {
    List <Persoana> personalFacultate = new ArrayList<>();

    public void add(Persoana persoana){
        personalFacultate.add(persoana);
    }
    public void afisare(){
        for(Persoana persoana : personalFacultate)
            System.out.println(persoana);
    }
}
