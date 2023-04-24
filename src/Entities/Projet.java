package Entities;

public class Projet implements Comparable<Projet>
{
    private int idProjet;
    private String nomProjet;
    private int dureProjet;
    private double tauxHProjet;

    public Projet(int idProjet, String nomProjet, int dureProjet, double tauxHProjet)
    {
        this.idProjet = idProjet;
        this.nomProjet = nomProjet;
        this.dureProjet = dureProjet;
        this.tauxHProjet = tauxHProjet;
    }
    public String getInfos() {
        return "Numéro"+idProjet+" nom "+nomProjet+" taux horraires "+tauxHProjet+" durée "+dureProjet;
    }
    public double calculerMontant()
    {
        return dureProjet*tauxHProjet*8;
    }


    @Override
    public int compareTo(Projet o) {
        return Double.compare(o.calculerMontant(),this.calculerMontant());
    }

}
