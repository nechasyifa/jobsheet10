import java.util.Scanner;

public class BioskopWithScanner20 {
    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);

        int baris, kolom;
        String nama, next;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Masukkan nama: ");
            nama = input20.nextLine();
            System.out.println("Masukkan baris: ");
            baris = input20.nextInt();
            System.out.println("Masukkan kolom: ");  
            kolom = input20.nextInt();
            input20.nextLine();

            penonton[baris-1][kolom-1] = nama;
            
            System.out.println("Input penonton lainnya? (y/n): ");
            next = input20.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}