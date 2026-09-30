/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionsalaires;

/**
 *
 * @author maxim
 */
public class Developpeur extends Employe {

    private String langage;

    public Developpeur(String nom, String prenom, int anciennete, String poste, String langage) {
        super(nom, prenom, anciennete, poste);
        this.langage = langage;
    }

    @Override
    public int getSalaire(){
        int salaire = 1900 + anciennete * 100;

        if (langage.equals("Java")) {
            salaire = salaire + 50;
        } else if (langage.equals("Python")) {
            salaire = salaire + 70;
        } else if (langage.equals("php")) {
            salaire = salaire + 45;
        }
        
        return salaire;
    }
    
    @Override
    public String getDescription(){
        return nom+" "+prenom+" est "+poste+" spécialisé en "+langage+" depuis "+anciennete+" ans et gagne "+getSalaire()+" €.";
    }
}
