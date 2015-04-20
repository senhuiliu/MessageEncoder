/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Huige1
 */
public class CipherDemo {
    // driver program
    public static void main(String[] args) {
        int choise, choise2;
        //get input from the console
        java.util.Scanner input = new java.util.Scanner(System.in);

        while (true) {

            System.out.println("\n\n1.To Encode A Message");
            
            System.out.println("2.Exit");

            do {
                System.out.print("Enter your choice: ");
                choise = input.nextInt();
                input.nextLine();

                if (choise == 2)
                    System.exit(0);

            } while (choise > 3 || choise < 1);

            System.out.println("\n\n1.Substitution Cipher");
            System.out.println("2.Shuffle Cipher");
            System.out.println("3.Exit");

            do {
                System.out.print("Enter your choice: ");
                choise2 = input.nextInt();
                input.nextLine();

                if (choise2 == 3)
                    System.exit(0);

            } while (choise2 > 3 || choise2 < 1);

            String text;
            int n;
           
         
            switch (choise) {

            case 1: // Encoding a message

                System.out.print("Enter text to be encode: ");
                text = input.nextLine();
                String encodedMsg = "";

                switch (choise2) { 
                case 1: // using substitution cipher
                    System.out.print("Enter shift value: ");
                    n = input.nextInt();
                    input.nextLine();
                    SubstitutionCipher sub = new SubstitutionCipher(n);
                    encodedMsg = sub.encode(text);
                    System.out.println("Encode Message: " + encodedMsg);
                    break;
                case 2: // using shuffle cipher
                    System.out.print("Enter number of shuffles: ");
                    n = input.nextInt();
                    input.nextLine();
                    ShuffleCipher shu = new ShuffleCipher(n);
                    encodedMsg = shu.encode(text);
                    System.out.println("Encode Message: " + encodedMsg);
                    break;
                }
                break;
            }
        }
    }
}
           

