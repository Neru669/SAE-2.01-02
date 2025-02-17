package fr.umontpellier.iut.trains.plateau;

/**
 * Classe représentant une tuile de mer (tuile qui ne peut pas être occupée par
 * un rail ou une gare)
 */
public class TuileMer extends Tuile {
    public TuileMer() {
        super();
    }
    public boolean estPosable(){
        return false;
    }

    @Override
    public boolean estConstructible() {
        return false;
    }

    @Override
    public int surCout() {
        return 0;
    }

    @Override
    public String getType() {
        return "Mer";
    }
}
