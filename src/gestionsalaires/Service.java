package gestionsalaires;

import java.util.ArrayList;

public class Service {
    private String titre;
    private ArrayList<Employe> listEmployes = new ArrayList<Employe>();

    public Service(String titre) {
        this.titre = titre;
    }

    public void addEmploye(Employe a){
        listEmployes.add(a);
    }

    public double salaireTotal(){
        double salaireTotal = 0;

        for (Employe a : listEmployes) {

            salaireTotal += a.getSalaire();
        }

        return salaireTotal;
    }

    public void getDesc(){
        for (Employe a : listEmployes){

            System.out.println(a.getDescription());

        }
    }

}
