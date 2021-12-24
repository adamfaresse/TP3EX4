public class Main {
    public static void main(String[] args) {
        Epsilon e = new Epsilon();
        Symbole a = new Symbole('a');
        System.out.println(e.toString()); // affiche: E
        System.out.println(a.toString()); // affiche: a
        Symbole a1 = new Symbole('a');
        Etoile star = new Etoile(a1);
        Etoile star2 = new Etoile(star);
        System.out.println(star.toString()); // affiche: (a)*
        System.out.println(star2.toString()); // affiche: ((a)*)*
        Concat c = new Concat(new Symbole('a'), new Symbole('b'));
        Etoile star1 = new Etoile(new Somme(new Epsilon(), c));
        System.out.println(star1.toString()); // affiche: ((&+(a.b)))*
        Epsilon e1 = (Epsilon) ChaineFactory.creeChaine("");
        Symbole s = (Symbole) ChaineFactory.creeChaine("s");
        Concat abcd = (Concat) ChaineFactory.creeChaine("abcd");
        System.out.println(abcd.toString()); // affiche: (a.(b.(c.d)))
        Symbole a2 = new Symbole('a');
        ConcatLight c1 = new ConcatLight(a, new Somme(a2, new ConcatLight(a2, a2)));
        System.out.println(c1.toString()); // affiche: (a.(a+aa))

    }
}
