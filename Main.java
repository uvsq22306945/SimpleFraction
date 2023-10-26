public class Main {
    public static void main(String[] args){
    public static Faction Zero = new Fraction();
    
    public static Fraction Un= new Fraction(1);

        Fraction f1 = new Fraction(1,2);
        // on teste que cette faction est égale à 1/2
        assert f1.equals("1/2");
        assert f1.resultat() == (double) 1/2;
        Fraction f2 = new Fraction(3);
        // on teste que cette faction est égale à 3
        assert f2.equals("3/1");
        assert f2.resultat() == 3; 
        Fraction f3 = new Fraction();
        // on teste que cette faction par defaut
        assert f3.equals("0/1");
        assert f3.resultat() == 0;
        
        Fraction f5= new Fraction(5,3);
        Fraction f4 = new Fraction(5,3);
        assert f5.equals(f4);

    }
}
