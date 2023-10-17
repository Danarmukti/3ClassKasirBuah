import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.*;

public class jeruk {
    byte PilihanAnda;
    int data=0;
    String[] namaBuah;
    int[] dataBeli,harga,byk;
    int isi,totalHarga,Harga;
    void dataJeruk() {
        Scanner input = new Scanner(System.in);
        System.out.println("\tJenis Buah Mangga");
        System.out.println("-------------------------------------------");
        System.out.println("1. Jeruk Nipis\t\tRp. 5.000");
        System.out.println("2. Jeruk Manis\t\tRp. 10.000");
        System.out.println("3. Jeruk Bali\t\tRp. 50.000");
        System.out.println("9. Check Out");
        namaBuah = new String[100];
        byk = new int[100];
        harga = new int[100];
        while (PilihanAnda!=9) {
            System.out.print("Pilihan Anda : ");
            PilihanAnda = input.nextByte();
            switch (PilihanAnda) {
                case 1:
                System.out.print("Banyaknya buah yang dibeli : ");
                isi = input.nextInt();
                byk[data] = isi;
                namaBuah[data]="Jeruk Nipis";
                harga[data]=5000;  
                data++;
                System.out.println("Berhasil ditambahkan!");
                break;
                case 2:
                System.out.print("Banyaknya buah yang dibeli : ");
                isi = input.nextInt();
                byk[data] = isi;
                namaBuah[data]="Jeruk Manis";
                harga[data]=10000;
                data++;
                System.out.println("Berhasil ditambahkan!");
                break;
                case 3:
                System.out.print("Banyaknya buah yang dibeli : ");
                isi = input.nextInt();
                byk[data] = isi;
                namaBuah[data]="Jeruk Bali";
                harga[data]=50000;
                data++;
                System.out.println("Berhasil ditambahkan!");
                break;
                default:
                break;
            }
            
        }
        dataBeli = new int[data];
    }

    void HargaJumlah() {
        System.out.println("-------------------------------------------");
        System.out.println("--------------Struk Pembelian--------------");
        System.out.println("\t\tYang Dibeli");
        System.out.println("\tBuah\t\tBanyak buah");
        for (int i = 0; i < data; i++) {
            System.out.println(i+1+". "+namaBuah[i]+"\t\t"+byk[i]+" Kg");
            
        }
        for (int i = 0; i < data; i++) {
            Harga = harga[i]*byk[i];
            totalHarga+=Harga;
        }
        System.out.println("\n");
        System.out.println("Total yang harus dibayar: "+totalHarga);
    }
}