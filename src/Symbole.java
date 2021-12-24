public class Symbole implements ExpregBase{
    char lettre ;
    Symbole(char lettre){
        this.lettre = lettre;
    }

    @Override
    public String toString() {
        return ""+lettre;
    }
}
