package miw.upm.es.IWVG.SwC.Javier;



public class Fraction {
    
    private int numerator;

    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public double decimal() {
        return (double) numerator / denominator;
    }
    
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
    
    public boolean mayor(Fraction f){
    	return ((double)this.getNumerator()/(double)this.getDenominator() > (double)f.getNumerator()/(double)f.getDenominator());
    }
    
    public boolean isEquivalente(Fraction f) {
        return (this.numerator*f.getDenominator()==this.denominator*f.getNumerator());
    }
    
    public Fraction suma(Fraction f) {
        if (this.denominator != f.getDenominator()) {
            return new Fraction(this.numerator= f.getDenominator() * this.numerator + this.denominator * f.getNumerator(),
            		this.denominator= this.denominator * f.getDenominator());
             
        } else {
            return new Fraction(this.numerator = this.numerator + f.getNumerator(), this.denominator);
        }

    }
}

