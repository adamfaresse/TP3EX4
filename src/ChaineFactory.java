public class ChaineFactory {


    public static Expreg creeChaine(String chaine){
        if(chaine.length()==0){
            return new Epsilon();
        }
        if(chaine.length()==1){
            return new Symbole(chaine.toCharArray()[0]);
        }
        return new Concat(creeChaine(chaine.substring(0,1)),creeChaine(chaine.substring(1)));

    }
}
