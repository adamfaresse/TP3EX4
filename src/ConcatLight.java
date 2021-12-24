public class ConcatLight implements Expreg {
    Expreg exp1 ;
    Expreg exp2 ;
    Concat c ;

    ConcatLight(Expreg exp1,Expreg exp2){
        this.exp1 = exp1;
        this.exp2 = exp2;
        c = new Concat(this.exp1,this.exp2);
    }

    @Override
    public String toString() {
        if(this.exp1 instanceof Symbole && this.exp2 instanceof Symbole){
            return this.exp1.toString()+this.exp2.toString();
        }
        return c.toString();
    }

}
