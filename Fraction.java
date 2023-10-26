public class Fraction extends {
    // Définition des attributs
    private int numerateur;
    private int denominateur;
    
    // Définition des constructeur
    public Fraction(int numerateur, int denominateur){
        this.numerateur = numerateur;
        this.denominateur = denominateur;
    }

    public Fraction(int numerateur){
        this.numerateur = numerateur;
        this.denominateur = 1;
    }

    public Fraction(){
        this.numerateur = 0;
        this.denominateur = 1;
    }
    // Définition des getters
    public int getNumerateur(){
        return this.numerateur;
    }

    public int getDenominateur(){
        return this.denominateur;
    }

    // Convertir le resultat
    public double resultat()
    {
        return (double) this.numerateur/this.denominateur;
    }
    // Méthode addition de deux fraction
    public double add(Fraction f){
        return this.resultat() + f.resultat();
    }

    // Méthode toString
    public String toString(){
        return this.numerateur+"/"+this.denominateur;
    }
    
}
