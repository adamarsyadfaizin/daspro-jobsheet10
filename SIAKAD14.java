import java.util.Scanner;

public class SIAKAD14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlMhs, matkul;
        System.out.print("Masukkan jumlah mahasiswa: ");
        jmlMhs = sc.nextInt();
        System.out.print("Masukkan jumlah matkul: ");
        matkul = sc.nextInt();
        int[][] nilai = new int[jmlMhs][matkul];
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("input nilai mahasiswa ke-" + (i + 1));
            double totalPerSiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j+1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai [i][j];
            }

            System.out.println("Nilai rata-rata: " + totalPerSiswa/matkul);
        }
        System.out.println("\n====================================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah:");

        for (int j = 0; j < jmlMhs; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < matkul; i++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Mata Kuliah " + (j + 1) + ": " + totalPerMatkul / matkul);
        }
    }
}