public abstract class ExpregBinaire implements Expreg{
    Expreg exp1 ;
    Expreg exp2;
    String operateur;
    ExpregBinaire(Expreg exp1,Expreg exp2,String operateur){
        this.exp1 = exp1;
        this.exp2 = exp2;
        this.operateur = operateur;
    }
    @Override
    public String toString() {
        return "("+exp1+operateur+exp2+")";
    }
}
