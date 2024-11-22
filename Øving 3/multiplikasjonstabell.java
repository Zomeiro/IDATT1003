import java.util.Scanner;

public class multiplikasjonstabell {

    public static void main(String[] args) {   
        try{
            System.out.println("Skriv inn delen av tabellen som skal printes ut. \n Format: x-y (der x og y er int)");
            String inputString;
            try (Scanner sc = new Scanner(System.in)) {
                inputString = sc.nextLine();
            }
            String[] inputStringSplit = inputString.split("-");
            int x = Integer.parseInt(inputStringSplit[0]), y = Integer.parseInt(inputStringSplit[1]);

            if (x > y) {
                System.out.println("x  være mindre enn y");
            }
            else {
                for (int i = x; i <= y; i++) {
                    System.out.println(i + "-gangen: ");
                    for (int j = 1; j <= 10; j++) {
                        System.out.println(i + " x " + j + " = " + j*i);
                    }
                }
            }
            
        }
        catch (NumberFormatException e) {
            System.out.println("Strengen kan ikke omgjøres til int");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Streng på feil format");
        }
    System.exit(0);
    }
}