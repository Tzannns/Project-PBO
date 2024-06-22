/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;
import java.util.Date;

/**
 *
 * @author yangm
 */

public class Event {
    private int idEvent;
    private String namaEvent;
    private String lokasiEvent;
    private Date tglEventMulai;
    private Date tglEventBerakhir;
    private String deskripsiEvent;
    private String gambar;
    private Date tglPengajuan;
    private String status;
    private int idMember;
    private int idKategori;

    public Event(int eventId, String eventNama, String eventLokasi, Date date, Date date0, String eventDeskripsi, String eventGambar, Date date1, String eventStatus, int idMember, int idKategori) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Setters
    public void setIdEvent(int idEvent) { 
        this.idEvent = idEvent; 
    }
    public void setNamaEvent(String namaEvent) {
        this.namaEvent = namaEvent; 
    }
    
    public void setLokasiEvent(String lokasiEvent) { 
        this.lokasiEvent = lokasiEvent; 
    }
    public void setTglEventMulai(Date tglEventMulai) {
        this.tglEventMulai = tglEventMulai; 
    }
    public void setTglEventBerakhir(Date tglEventBerakhir) {
        this.tglEventBerakhir = tglEventBerakhir; 
    }
    
    public void setDeskripsiEvent(String deskripsiEvent) {
        this.deskripsiEvent = deskripsiEvent; 
    }
    public void setGambar(String gambar) {
        this.gambar = gambar;
    }
    
    public void setTglPengajuan(Date tglPengajuan) { 
        this.tglPengajuan = tglPengajuan; }
    public void setStatus(String status) { 
        this.status = status; 
    }
    
    public void setIdMember(int idMember) { 
        this.idMember = idMember;
    }
    public void setIdKategori(int idKategori) { 
        this.idKategori = idKategori; 
    }

    // Getters
    public int getIdEvent() {
        
        return idEvent; 
    }
    public String getNamaEvent() {
        return namaEvent; 
    }
    public String getLokasiEvent() { 
        return lokasiEvent; 
    }
    public Date getTglEventMulai() { 
        return tglEventMulai; 
    }
    public Date getTglEventBerakhir() {
        return tglEventBerakhir; 
    }
    public String getDeskripsiEvent() {
        return deskripsiEvent; 
    }
    public String getGambar() { 
        return gambar; 
    }
    public Date getTglPengajuan() { 
        return tglPengajuan; 
    }
    public String getStatus() { 
        return status;
    }
    public int getIdMember() { 
        return idMember; 
    }
    public int getIdKategori() { 
        return idKategori; 
    }
}






