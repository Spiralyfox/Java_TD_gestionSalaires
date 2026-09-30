package gestionsalaires;

public class AgentAdministratif extends Employe {

    public AgentAdministratif(String nom, String prenom, int anciennete, String poste) {
        super(nom, prenom, anciennete, poste);
    }

    @Override
    public int getSalaire(){
        return (1900);
    }

    public String getDescription(){
        return nom+" "+prenom+" est "+poste+" depuis "+anciennete+" ans et gagne "+getSalaire()+" €.";
    }
}
