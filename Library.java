import java.util.ArrayList;

public class Library {
    String no;
    String Judul;
    String Author;
    String Penerbit;
    String Kategori; 
    String Tahun;

    Library(String no, String Judul, String Author, String Penerbit, String Kategori, String Tahun) {
        this.no = no;
        this.Judul = Judul;
        this.Author = Author;
        this.Penerbit = Penerbit;
        this.Kategori = Kategori;
        this.Tahun = Tahun;
    }
    public static void main(String[] args) throws Exception {
        ArrayList<Library> daftarBuku = new ArrayList<Library>();
        daftarBuku.add(new Library(" 1. ", " PBO dengan Java ",  " Abdul Kadir ", " Elangga ", " Teknik ", " 2008 "));
        daftarBuku.add(new Library(" 2. ", " Dasar Pemrograman ", " Indrijani ", " Erlangga ", " Teknik ", " 2020 "));
        daftarBuku.add(new Library(" 3. ", " Si Doel ", " Indrijani ", " Balai Pustaka ", " Fiksi ", " 1932 "));
        
        ArrayList<ArrayList<Library>> Library = new ArrayList<>();

        ArrayList<Library> kategoriTeknik = new ArrayList<Library>();
        kategoriTeknik.add(new Library("1. ", " PBO dengan Java ", " Abdul Kadir "," Elangga ", " Teknik ", " 2008 "));
        kategoriTeknik.add(new Library("2. ", " Dasar Pemrograman ", " Indrijani ", " Erlangga ", " Teknik ", " 2020 "));

        ArrayList<Library> kategoriManajemen = new ArrayList<Library>();
        

        ArrayList<Library> kategoriFiksi = new ArrayList<Library>();
        kategoriFiksi.add(new Library("3. ", " Si Doel ", " Indrijani ", " Balai Pustaka ", " Fiksi ", " 1932 "));

        ArrayList<Library> kategoriLainnya = new ArrayList<Library>();
        

        System.out.println("===========================================================================");
        System.out.println("Book List - Zahra's Library");
        System.out.println("===========================================================================");
        System.out.println("No Judul   Author   Penerbit   Kategori   Tahun");
        System.out.println("===========================================================================");

        for(Library item : kategoriTeknik) {
            System.out.println(item.no + item.Judul + item.Author + item.Penerbit + item.Kategori + item.Tahun);
        }

        for(Library item : kategoriManajemen) {
            System.out.println(item.no + item.Judul + item.Author + item.Penerbit + item.Kategori + item.Tahun);
        }

        for(Library item : kategoriFiksi) {
            System.out.println(item.no + item.Judul + item.Author + item.Penerbit + item.Kategori + item.Tahun);
        }

        for(Library item : kategoriLainnya) {
            System.out.println(item.no + item.Judul + item.Author + item.Penerbit + item.Kategori + item.Tahun);
        }
        System.out.println("===========================================================================");
        System.out.println("Jumlah buku yang tersedia : " + daftarBuku.size());
        System.out.println("Jumlah Buku Teknik : " + kategoriTeknik.size());
        System.out.println("Jumlah Buku Manajemen : " + kategoriManajemen.size());
        System.out.println("Jumlah Buku Fiksi : " + kategoriFiksi.size());
        System.out.println("Jumlah Buku Lainnya : " + kategoriLainnya.size());
        System.out.println("Jumlah Buku Lawas : " + kategoriFiksi.size());
        System.out.println("Jumlah Buku Baru : " + kategoriTeknik.size());
    }
}
