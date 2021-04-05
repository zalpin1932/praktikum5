import java.util.Scanner;
public class Nilai {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in); 
        int i,jumlahMk;  
        String nama,nim,jurusan;   
        String mataKuliah[]=new String[15]; 
        String grade[]=new String[15];  
        int tugas[]=new int[15];  
        double daftarnilai[]=new double[15];  
        System.out.println("=================================="); 
        System.out.println("   Daftar Nilai Tugas Mahasiswa");      
        System.out.println("==================================");
        System.out.print("   Masukan Jumlah Mata Kuliah: ");      
        jumlahMk=input.nextInt(); 
        System.out.println("==================================");  
        System.out.print("  Nama     : "); 
        nama=input.next(); 
        System.out.print("  NIM      : "); 
        nim=input.next(); 
        System.out.print("  Jurusan  : ");
        jurusan=input.next(); 
        System.out.println("==================================");
        for(i=1; i<=jumlahMk; i++){ 
            System.out.print("\n Matkul ke-"+i+" : "); 
            mataKuliah[i]=input.next(); 
            System.out.print(" Masukkan Nilai: "); 
            tugas[i]=input.nextInt(); 
            daftarnilai[i]=((tugas[i]*1)); 
            if (daftarnilai[i]>=85) grade[i]="A";  
                else if (daftarnilai[i]>=75) grade[i]="B";  
                    else if (daftarnilai[i]>=65) grade[i]="C";  
                        else if (daftarnilai[i]>=50) grade[i]="D"; 
                            else grade[i]="E"; 
            }
        System.out.println("\n=================================="); 
        System.out.println("\n\n Nama: "+nama+"            NIM: "+nim); 
        System.out.println("========================================="); 
        System.out.println(" Matkul            Nilai      Grade"); 
        System.out.println("========================================="); 
        for(i=1;i<=jumlahMk;i++){ 
        System.out.println(" "+mataKuliah[i]+"      "   +daftarnilai[i]+"      "    +grade[i]); 
            }
       System.out.println("\n\n============================================="); 
        System.out.println(" Terima Kasih Telah Menggunakan Program Kami"); 
        System.out.println("============================================="); 
        System.exit(0); 
        }
   }