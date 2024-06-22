/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;
import entity.*;
import java.util.Date;
import java.util.Scanner;
import configuration.*;
import gui.frameUtama;
/**
 *
 * @author yangm
 */
public class PariwisataAPPs {

    /**
     * @param args the command line arguments
     */
        // TODO code application logic here
   
//    public static void main(String[] args) {
//       ConnectionDb obj = new ConnectionDb();
//       obj.simpanmhs("2210020126", "Akhmad Fauzan", "087815042129", "jalan bjm");
//        Scanner scanner = new Scanner(System.in);
//    }
    public static void main(String[] args) {
//        coding gui
        new frameUtama().setVisible(true);
        
//        coding crud
//      ConnectionDb obj = new ConnectionDb();
//      obj.simpankategori(1,"Musik");
//      obj.carimhs("2210020126");
//      obj.carikategori(1);
//      scanner = new Scanner(System.in);
    }
    
        /*
        // Input data  Kategori
        System.out.println("Masukkan data Kategori:");
        System.out.print("ID Kategori: ");
        int kategoriId = Integer.parseInt(scanner.nextLine());
        System.out.print("Nama Kategori: ");
        String kategoriNama = scanner.nextLine();

        Kategori kategori = new Kategori(kategoriId, kategoriNama);

        // Input data Event
        System.out.println("Masukkan data Event:");
        System.out.print("ID Event: ");
        int eventId = Integer.parseInt(scanner.nextLine());
        System.out.print("Nama Event: ");
        String eventNama = scanner.nextLine();
        System.out.print("Lokasi Event: ");
        String eventLokasi = scanner.nextLine();
        System.out.print("Deskripsi Event: ");
        String eventDeskripsi = scanner.nextLine();
        System.out.print("Gambar Event: ");
        String eventGambar = scanner.nextLine();
        System.out.print("Status Event: ");
        String eventStatus = scanner.nextLine();
        System.out.print("Keterangan Event: ");
        System.out.print("ID Member: ");
        int idMember = Integer.parseInt(scanner.nextLine()); 

        
        Event event = new Event(eventId, eventNama, eventLokasi, new Date(), new Date(), eventDeskripsi, eventGambar, new Date(), eventStatus, idMember, kategori.getIdKategori());

        // Output details
        System.out.println("\nDetail Kategori:");
        System.out.println("ID Kategori: " + kategori.getIdKategori());
        System.out.println("Nama Kategori: " + kategori.getNamaKategori());

        System.out.println("\nDetail Event:");
        System.out.println("ID Event: " + event.getIdEvent());
        System.out.println("Nama Event: " + event.getNamaEvent());
        System.out.println("Lokasi Event: " + event.getLokasiEvent());
        System.out.println("Deskripsi Event: " + event.getDeskripsiEvent());
        System.out.println("Gambar Event: " + event.getGambar());
        System.out.println("Status Event: " + event.getStatus());
        System.out.println("ID Member: " + event.getIdMember());
        System.out.println("ID Kategori: " + event.getIdKategori());
*/
    
}
    

