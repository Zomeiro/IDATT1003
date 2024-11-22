public class Main {
    public static void main(String[] args) {
        Tekstanalyse A = new Tekstanalyse("Mmm... Hrmmmmm... Mmm...mmm... Mm! Oh-hoh! Forgive me. I was absorbed in thought. I am Siegmeyer of Catarina. Quite honestly, I have run flat up against a wall. Or, a gate, I should say. The thing just won't budge. No matter how long I wait. And, oh, have I waited! So, here I sit, in quite a pickle. Weighing my options, so to speak! Hah hah hah hah! Still closed... Still closed... Mmm...");
        
        String bokstav = "m";
        System.out.println("Antall forskjellige bokstaver: " + A.forskjelligeBokstaver() + "\nAntall bokstaver: " + A.antallBokstaver() + "\nAntall av bokstav " + bokstav + ": " + A.antallAvBokstav(bokstav) + "\nBokstav med høyest forekomst: " + A.hoyestForekomst());
    
    }
}
