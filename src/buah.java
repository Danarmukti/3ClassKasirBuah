
import java.util.Scanner;

/*Nama : Danar Mukti Wibowo
*Kelas: R57
  NPM  : 202143502476 
  */
public class buah {
    String nama;
    int telp;
    
    public static void main(String[] args) {
      byte pilih;
      jeruk belijeruk = new jeruk();
      buah belibuah = new buah();
        mangga beliMangga = new mangga();
        Scanner input = new Scanner(System.in);
        System.out.println("=====SELAMAT DATANG DI TOKO BUAH HOTARU=====");
        System.out.println("-----------------------------------");
        System.out.print("Masukan Nama Pelanggan : ");
        belibuah.nama = input.nextLine();
        System.out.print("Masukan No Telpon : ");
        belibuah.telp = input.nextInt();
        System.out.println("Jenis Buah Yang ingin dibeli : ");
        System.out.println("1. Jeruk ");
        System.out.println("2. Mangga");
        System.out.print("Pilihan: ");
        pilih = input.nextByte();
        switch (pilih) {
          case 1:
          belijeruk.dataJeruk();
          belijeruk.HargaJumlah();
          break;
          case 2:
          beliMangga.dataMangga();
              beliMangga.HargaJumlah();
            break;
          }
          System.out.println("-----------------------------------");
          System.out.println("Terima Kasih telah berbelanja "+belibuah.nama);
          System.out.println("     Jangan Lupa Datang Kembali");
    }
}
