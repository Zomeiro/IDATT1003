import java.util.Random;


public class MinRandom {
    public static int nesteHeltall(int nedre, int ovre){
        Random rand = new Random();
        return rand.nextInt(ovre-nedre)+nedre;
    }

    public static double nesteDesimaltall(double nedre, double ovre){
        Random rand = new Random();
        return rand.nextDouble(ovre-nedre)+nedre;
    }

}
