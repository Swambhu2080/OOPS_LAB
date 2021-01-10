public class NegativeNumberException extends Exception{
    double num;
    public NegativeNumberException(double num){
        this.num = num;
    }
    public String toString() {
        return "NegativeNumberException[ Negative number = " + this.num + " ]" ;
    }
}