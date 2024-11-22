import java.util.Random;

public class TilfeldigeTall {

    public void makeTable(int gjennomlop) {
        Random random = new Random();
        int[] antall = new int[10];
        

        for (int i = 0; i < gjennomlop; i++) {
            int tall = random.nextInt(10);
            antall[tall]+=1; 
        }

        for (int i = 0; i < antall.length; i++) {
            System.out.print(i + " " + antall[i] + " ");
            
            int antallstjerner = Math.round(antall[i] / 10f); //Spurte chatgpt om å fikse avrunding til næreste heltall istedenfor floor by default. Vet ikke hvordan omgjøring fra double til float skal hjelpe med dette, men det funker???
            for (int a = 0; a < antallstjerner; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}