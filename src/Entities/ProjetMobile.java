package Entities;

public class ProjetMobile extends Projet
{
    private int nbEcran;

    public ProjetMobile(int idProjet, String nomProjet, int dureProjet, double tauxHProjet, int nbEcran) {
        super(idProjet, nomProjet, dureProjet, tauxHProjet);
        this.nbEcran = nbEcran;
    }
    public String getInfos() {
        return super.getInfos()+" Nb d'écrans "+nbEcran;
    }
    public double calculerMontant()
    {
        return super.calculerMontant()+nbEcran*200;
    }
}
