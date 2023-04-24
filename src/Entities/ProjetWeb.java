package Entities;

public class ProjetWeb extends Projet
{
    private int nbPages;
    private Boolean responsive;

    public ProjetWeb(int idProjet, String nomProjet, int dureProjet, double tauxHProjet, int nbPages, Boolean responsive) {
        super(idProjet, nomProjet, dureProjet, tauxHProjet);
        this.nbPages = nbPages;
        this.responsive = responsive;
    }
    public String getInfos() {
        return super.getInfos()+" Nb pages "+nbPages+" Responsive "+responsive;
    }
    public double calculerMontant()
    {
        return super.calculerMontant()+nbPages*100;
        /*
        if (responsive=true)
        {
            calculerMontant() = calculerMontant()+500;
        }
         */
    }
}
