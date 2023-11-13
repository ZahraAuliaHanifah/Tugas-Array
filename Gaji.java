import java.util.Scanner;
public class Gaji {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Jam Lembur (00-24)");
        int jamLembur = input.nextInt(); {
            if (jamLembur > 4) {
                totaljam = jamLembur * 2;
                System.out.println ("totaljam");
            }
        }
        System.out.print("Upah Lembur Perjam");
        int upah_lembur_perjam = jamLembur * 50000;

        System.out.print("Gaji");
        int gaji = input.nextInt(8650000);

        int lamaLembur = jamLembur;
        int totalGaji = lamaLembur * jamLembur + gaji;

        System.out.println("Lama Lembur: " + lamaLembur + "jam");
        System.out.println("Total Gaji: Rp. + totalGaji");
    }
}
