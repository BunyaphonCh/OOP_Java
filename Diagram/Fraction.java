
public class Fraction {
    public int topN;
    public int btmN;
    
    public String toFraction() {
        return topN + "/" + btmN;
    }
    
    public String toFloat() {
        double result = (double) topN / btmN;
        return String.valueOf(result);
    }
    
    public void addFraction(Fraction f) {
        if (this.btmN == f.btmN) {
            this.topN = this.topN + f.topN;
        }
        else {
            this.topN = this.topN * f.btmN + f.topN * this.btmN;
            this.btmN = this.btmN * f.btmN;
        }
    }
}
