import java.util.Scanner;

public class skuddaar {
    static int sjekkaar(String aarString){
        int skuddaarInt;
        //Ville kanskje heller ha satt try catch i linje 31-
        //og endre metoden så den returnerer booleans isteden (hvis jeg skulle gjort noe annerledes)
        try {
            int aar = Integer.parseInt(aarString); 
            if (aar%100 == 0) {
                if (aar % 400 == 0) {
                    skuddaarInt = 1;
                }
                else {
                    skuddaarInt = 0;
                }
            }
            else if (aar%4==0) {
                skuddaarInt = 1;
            }
            else {
                skuddaarInt = 0;
            }
        } catch (NumberFormatException e) {
            skuddaarInt = 2;
        }
        return skuddaarInt;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String aarString = sc.nextLine();
        sc.close();
        int svar = sjekkaar(aarString);
        //Fant ut om switch gjennom quick fix i VSCode. Var originalt if setninger. 
        switch (svar) {
            case 1 -> System.out.println(aarString + " er et skuddår!");
            case 0 -> System.out.println(aarString + " er ikke et skuddår!");
            case 2 -> System.out.println("Denne strengen kan ikke omgjøres til int");
            default -> {
            }
        }
        }
  }
