import java.util.Scanner;

public class BioskopWithScanner20 {
    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);

        int baris, kolom;
        String nama, next;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.println("Pilih menu: ");
            int menu = input20.nextInt();
            input20.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("Masukkan nama: ");
                    nama = input20.nextLine();
                    System.out.println("Masukkan baris: ");
                    baris = input20.nextInt();
                    System.out.println("Masukkan kolom: ");
                    kolom = input20.nextInt();
                    input20.nextLine();

                    if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                        if (penonton[baris-1][kolom-1] == null) {
                            penonton[baris-1][kolom-1] = nama;
                            System.out.println("Data penonton berhasil dimasukkan");
                        } else {
                            System.out.println("Mohon maaf kursi sudah terisi. Silahkan pilih kursi lain");
                            }
                        } else {
                            System.out.println("Kursi tidak tersedia!");
                        }
                        break;
                case 2:
                    System.out.println("Daftar Penonton:");
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 2; j++) {
                            if (penonton[i][j] != null) {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);
                            } else {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": ***");
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Menu tidak valid. Silakan pilih menu yang sesuai.");
            }
        }
    }
}