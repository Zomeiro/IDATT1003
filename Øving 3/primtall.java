import java.util.Scanner;

public class primtall {
    static boolean sjekkPrimtall(int p){
        for (int i = 2; i<p; i++){ //Gjøre så 1 ikke er primtall og sette opp negative tall som udefinert.
            if (p%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        boolean running = true;
        Scanner sc = new Scanner(System.in);
        
        while (running == true) {
            System.out.println("Skriv inn et tall, så ser vi om det er et primtall eller ikke. \n (Skriv 'EXIT' isteden for å avslutte programmet)");
            String inputString = sc.nextLine();

            if (inputString.contains("EXIT")) { //aaaaa
                    System.out.println("Avslutter program");
                    running = false;
                    break;
                }
            
            try{
                int x = Integer.parseInt(inputString);

                if (sjekkPrimtall(x)==true) {
                    System.out.println(x + " er et primtall.");
                }
                else {
                    System.out.println(x + " er ikke et primtall.");
                    
                }
                
            }
            catch (NumberFormatException e) {
                System.out.println("Strengen er ikke en kommando, og kan heller ikke omgjøres til int");
            }
        }  
        sc.close();
        System.exit(0);
    }
}
