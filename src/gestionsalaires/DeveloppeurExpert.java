package gestionsalaires;

public class DeveloppeurExpert extends Developpeur {

    public DeveloppeurExpert(String nom, String prenom, int anciennete, String poste, String langage) {
        super(nom, prenom, anciennete, poste, langage);
    }

    @Override
    public int getSalaire() {
        int salaireDeBase = super.getSalaire();
        return salaireDeBase + (salaireDeBase * 10 / 100);
    }
}
