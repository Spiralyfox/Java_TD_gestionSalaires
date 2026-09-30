/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionsalaires;

/**
 *
 * @author maxim
 */
public class Manager extends Employe {

    public Manager(String nom, String prenom, int anciennete, String poste) {
        super(nom, prenom, anciennete, poste);
    }

    @Override
    public int getSalaire(){
        return (2200+anciennete*110);
    }

    public String getDescription(){
        return nom+" "+prenom+" est "+poste+" depuis "+anciennete+" ans et gagne "+getSalaire()+" €.";
    }
}
