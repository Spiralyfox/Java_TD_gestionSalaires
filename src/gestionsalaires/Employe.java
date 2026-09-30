package gestionsalaires;

/**
 *
 * @author maxim
 */
public abstract class Employe {
    protected String nom;
    protected String prenom;
    protected int anciennete;
    protected String poste;

    public Employe(String nom, String prenom, int anciennete, String poste) {
        this.nom = nom;
        this.prenom = prenom;
        this.anciennete = anciennete;
        this.poste = poste;
    }

    public abstract int getSalaire();

    public String getDescription(){
        return nom+" "+prenom+" est "+poste+" depuis "+anciennete+" ans et gagne "+getSalaire()+" €.";
    }


}
