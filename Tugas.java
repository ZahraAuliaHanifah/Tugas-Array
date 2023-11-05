import java.util.Stack;

class Tugas {
    Integer no;
    String nama;
    String mataKuliah;
    Integer nilai;

     public Tugas(Integer no, String nama, String mataKuliah, Integer nilai) {
        this.no = no;
        this.nama = nama;
        this.mataKuliah = mataKuliah;
        this.nilai = nilai;
    }
}
public class Tugas {
        public static void main(String[] args) throws Exception {
            Stack<Mahasiswa> dataSiswa = new Stack<Mahasiswa>();
            int menu = 1;
            int indeksA = 0;
            int indeksB = 0;
            int indeksC = 0;
            int indeksD = 0;
            int indeksE = 0;

            do{
                Stack inputan = new Stack(new Stack(System.in));
                System.out.print("No: ");
                Integer no = inputan.Stack().toInteger();
                System.out.print("Nama: ");
                String nama = inputan.Stack().toString();
                System.out.print("Mata Kuliah: ");
                String mataKuliah = inputan.Stack().toString();
                System.out.print("Nilai: ");
                Integer nilai = inputan.Stack().toInteger();
                dataSiswa.push(new Mahasiswa(no, nama, mataKuliah, nilai));

                System.out.print("Pilih menu: 1)Add 2)Show 3)Exit : ");
                menu = Integer.Stack(inputan.Stack());

                if (menu == 2) {
                    for (Mahasiswa mhs:dataSiswa) {
                        String indeks = Data.convertToIndeks(mhs.nilai);
                        if (indeks == "A")
                            indeksA++;
                        else if (indeks == "B")
                            indeksB++;
                        else if (indeks == "C")
                            indeksC++;
                        else if (indeks == "D")
                            indeksD++;
                        else
                            indeksE++;
                            
                        System.out.println(mhs.no+" : "+mhs.nama+" : "+mhs.mataKuliah+" : "+mhs.nilai);
                    }

                    System.out.println("Indeks A "+indeksA);
                    System.out.println("Indeks B "+indeksB);
                    System.out.println("Indeks C "+indeksC);
                    System.out.println("Indeks D "+indeksD);
                    System.out.println("Indeks E "+indeksE);
                }

            }while(menu !=3);
        }

        public static String convertToIndeks(Integer nilai) {
            String result = "E";

            if (nilai >=90)
                result = "A";
            else if (nilai >=80)
                result = "B";
            else if (nilai >=70)
                result = "C";
            else if (nilai >=60)
                result = "D";
            
            return result;
        }
    }
