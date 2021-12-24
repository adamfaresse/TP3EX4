public class Etoile implements Expreg{
    Expreg exp ;
    Etoile(Expreg exp){
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "("+exp+")*";
    }
}
