import java.util.Scanner;

public class BioskopWithScanner14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.print("1. input data pengguna, 2. Tampilkan daftar penonton, 3. exit: ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("3")) {
                break;
            } else if (next.equalsIgnoreCase("2")) {
                for (int i = 0; i < penonton.length; i++) {
                    System.out.print("Penonton pada baris ke-" + (i + 1) + ": ");
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.print("*** ");
                        } else {
                            System.out.print(penonton[i][j] + " ");
                        }
                    }
                    System.out.println();
                }
            } else if (next.equalsIgnoreCase("1")) {
                System.out.print("Masukkan nama: ");
                nama = sc.nextLine();
                System.out.print("Masukkan baris: ");
                baris = sc.nextInt();
                System.out.print("Masukkan kolom: ");
                kolom = sc.nextInt();
                sc.nextLine();
                if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                    System.out.println("Kursi tidak tersedia. Silakan pilih kursi yang valid.");
                } else if (penonton[baris - 1][kolom - 1] != null) {
                    System.out.println("Kursi sudah ditempati. Silakan pilih ulang.");
                } else {
                    penonton[baris - 1][kolom - 1] = nama;
                }
            }
        }
    }
}
