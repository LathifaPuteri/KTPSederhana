/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktpsederhana;
import java.util.Scanner;
/**
 *
 * @author MOKLET-2
 */
public class KTPSederhana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String provinsi, kota, ttl, jeniskelamin, alamat, keldes, kecamatan, agama, statusperkawinan,
                pekerjaan, kewarganegaraan, berlakuhingga, nik, rt, rw;
        String nama;
        System.out.println("KARTU TANDA PENDUDUK");
        //scanner 1
        Scanner input = new Scanner(System.in);
        System.out.println("Provinsi = ");
        provinsi = input.nextLine();
        System.out.println("Kota = ");
        kota = input.nextLine();
        System.out.println("---------------------------");
        //scanner 2
        System.out.println("NIK = ");
        nik = input.nextLine();
        //scanner 3
        System.out.println("Nama = ");
        nama = input.nextLine();
        System.out.println("Tempat/Tgl Lahir = ");
        ttl = input.nextLine();
        System.out.println("Alamat = ");
        alamat = input.nextLine();
        System.out.println("RT = ");
        rt = input.nextLine();
        System.out.println("RW = ");
        rw = input.nextLine();
        System.out.println("Kel/Desa = ");
        keldes = input.nextLine();
        System.out.println("Kecamatan = ");
        kecamatan = input.nextLine();
        System.out.println("Agama = ");
        agama = input.nextLine();
        System.out.println("Status Perkawinan = ");
        statusperkawinan = input.nextLine();
        System.out.println("Pekerjaan = ");
        pekerjaan = input.nextLine();
        System.out.println("Kewarganegaraan = ");
        kewarganegaraan = input.nextLine();
        System.out.println("Berlaku Hingga = Seumur Hidup ");
        
        System.out.println("----------------------------------");
    }
    
}
