import java.util.Scanner;

public class Nilai {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in); // kita masukan fungsi abstract Scanner kedalam sebuah object  yang bernama input
        int i,jumlahMk;  //mendeklarasikan i dan jumlahmk bertipe data integer
        String nama,nim,jurusan;   //mendeklarasikan nama,nim,jurusan bertipe data string
        String mataKuliah[]=new String[15]; //mendeklarasikan mataKuliah bertipe data string arrray memiliki maksimal 15 data
        String grade[]=new String[15];  //mendeklarasikan grade bertipe data string arrray memiliki maksimal 15 data
        int tugas[]=new int[15];  //mendeklarasikan tugas bertipe data integer array memiliki maksimal 15 data
        double daftarnilai[]=new double[15];  //mendeklarasikan nilai bertipe data double array memiliki maksimal 15 data
        System.out.println("=================================="); //*perintah mencetak string
        System.out.println("   Daftar Nilai Tugas Mahasiswa");      //*
        System.out.println("=================================="); //*
        System.out.print("   Masukan Jumlah Mata Kuliah: ");      //* dan bila tanpa ln maka kursor berada di sebelahnya
        jumlahMk=input.nextInt(); // untuk meminta inputan berupa integer ke variabel jumlahMk
        System.out.println("==================================");  //*
        System.out.print("  Nama     : "); //*
        nama=input.next(); //untuk meminta inputan berupa string ke variabel nama
        System.out.print("  NIM      : "); //*
        nim=input.next(); //untuk meminta inputan berupa string ke variabel nim
        System.out.print("  Jurusan  : "); //*
        jurusan=input.next(); //untuk meminta inputan berupa string ke variabel jurusan
        System.out.println("=================================="); //*
        for(i=1; i<=jumlahMk; i++){ //perintah perulangan dari i=1 sampai jumlahMk dengan step i=1
            System.out.print("\n Mata kuliah ke-"+i+" : "); //* dengan tambahan manipulasi string
            mataKuliah[i]=input.next(); //untuk meminta inputan berupa string ke variabel mataKuliah arrray pada saat i
            System.out.print(" Masukkan Nilai: "); //*
            tugas[i]=input.nextInt(); //untuk meminta inputan berupa integer ke variabel tugas array pada saat i
            daftarnilai[i]=((tugas[i]*1)); //perhitungan di input ke nilai pada saat i
            if (daftarnilai[i]>=85) grade[i]="A";  //jika nilai ke-i 85 keatas maka grade ke-i isinya A
                else if (daftarnilai[i]>=75) grade[i]="B";  //jika nilai ke-i 75 keatas maka grade ke-i isinya B
                    else if (daftarnilai[i]>=65) grade[i]="C";  //jika nilai ke-i 65 keatas maka grade ke-i isinya C
                        else if (daftarnilai[i]>=50) grade[i]="D"; //jika nilai ke-i 50 keatas maka grade ke-i isinya D
                            else grade[i]="E"; //jika nilai ke-i dibawah 50 maka grade ke-i isinya E
            }
        System.out.println("\n=================================="); //*
        System.out.println("\n\n Nama: "+nama+"            NIM: "+nim); //* dengan tambahan manipulasi string
        System.out.println("========================================="); //*
        System.out.println(" Mata Kuliah             Nilai      Grade"); //*
        System.out.println("========================================="); //*
        for(i=1;i<=jumlahMk;i++){ //perintah perulangan dari i=1 sampai jumlahMk dengan step i=1
        System.out.println(" "+mataKuliah[i]+"      "+daftarnilai[i]+"      "+grade[i]); //* dengan tambahan manipulasi string
            }
       System.out.println("\n\n============================================="); //*
        System.out.println(" Terima Kasih Telah Menggunakan Program Kami"); //*
        System.out.println("============================================="); //*
        System.exit(0); //keluar dari program dengan interasi 0 artinya program tidak ada eror
        }
   }