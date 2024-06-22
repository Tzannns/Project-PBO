/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package configuration;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Date;


/**
 *
 * @author yangm
 */
public class ConnectionDb {
    private String databaseName = "2210020126";
    private String username = "root";
    private String password = "";
    
    public static Connection koneksi;
    
    public ConnectionDb (){
                
         try {
            String url = "jdbc:mysql://localhost/"+this.databaseName;
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(url,this.username,this.password);
            System.out.println("database terkoneksi");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
    
    }
    
//  Table mhs  
    
    public void simpanmhs(String npm, String nama, String telp, String alamat){
        try {
            String sql = "INSERT INTO mhs (npm, nama, telp, alamat) value(?,?,?,?)";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1, npm);
            perintah.setString(2, nama);
            perintah.setString(3, telp);
            perintah.setString(4, alamat);
            perintah.executeUpdate();
            System.out.println("data berhasil disimpan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void ubahmhs(String npm, String nama, String telp, String alamat){
        try {
            String sql = "UPDATE mhs SET nama=? ,telp=?, alamat=? WHERE npm=? ";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1, nama);
            perintah.setString(2, telp);
            perintah.setString(3, alamat);
            perintah.setString(4, npm);
            perintah.executeUpdate();
            System.out.println("data berhasil diubah");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusmhs(String npm){
        try {
            String sql = "DELETE FROM mhs WHERE npm=?";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1, npm);
            perintah.executeUpdate();
            System.out.println("Data berhasil Dihapus");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void carimhs(String npm) {
        try {
            String sql ="SELECT * FROM mhs WHERE npm=? ";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1,npm);
            ResultSet data=perintah.executeQuery();
            while(data.next()) {
                System.out.println(data.getString("npm"));
                System.out.println(data.getString("nama"));
                System.out.println(data.getString("telp"));
                System.out.println(data.getString("alamat"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
            
//      Table Kategori   
            
            
    public void simpankategori(int id_kategori, String nama_kategori){
        try {
            String sql = "INSERT INTO kategori (id_kategori,nama_kategori) value(?,?)";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setInt(1, id_kategori);
            perintah.setString(2, nama_kategori);
            perintah.executeUpdate();
            System.out.println("data berhasil disimpan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahkategori(int id_kategori, String nama_kategori){
            try {
                String sql = "UPDATE kategori SET nama_kategori=? WHERE id_kategori=?";
                PreparedStatement perintah = koneksi.prepareStatement(sql);
                perintah.setString(1,nama_kategori);
                perintah.setInt(2, id_kategori);
                perintah.executeUpdate();
                System.out.println("data berhasil diubah");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
    }
    
    public void hapuskategori(int id_kategori){
        try {
            String sql="DELETE FROM kategori WHERE id_kategori=?";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setInt(1, id_kategori);
            perintah.executeUpdate();
            System.out.println("data berhasil dihapus");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void carikategori(int id_kategori){
        try {
            String sql="SELECT * FROM kategori WHERE id_kategori=?";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setInt(1, id_kategori);
            ResultSet data=perintah.executeQuery();
            while(data.next()){
                System.out.println(data.getInt("id_kategori"));
                System.out.println(data.getString("nama_kategori"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
//    Table event
    
    public void simpanevent(int id_event,String nama_event,String lokasi_event,String tgl_event_mulai, String tgl_event_berakhir,String deskripsi_event,String gambar,String tgl_pengajuan,String status, String ket){
        try {
            String sql="INSERT INTO event (id_event,nama_event,lokasi_event,tgl_event_mulai,tgl_event_berakhir,deskripsi_event,gambar,tgl_pengajuan,status,ket) VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setInt(1, id_event);
            perintah.setString(2, nama_event);
            perintah.setString(3, lokasi_event);
            perintah.setString(4, tgl_event_mulai);
            perintah.setString(5, tgl_event_berakhir);
            perintah.setString(6, deskripsi_event);
            perintah.setString(7, gambar);
            perintah.setString(8, tgl_pengajuan);
            perintah.setString(9, status);
            perintah.setString(10, ket);
            perintah.executeUpdate();
            System.out.println("Data berhasil Disimpan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void ubahevent(int id_event,String nama_event,String lokasi_event,String tgl_event_mulai, String tgl_event_berakhir,String deskripsi_event,String gambar,String tgl_pengajuan,String status, String ket){
        try {
            String sql;
            sql = "UPDATE event SET nama_event=?,lokasi_event=?,tgl_event_mulai=?,tgl_event_berakhir=?,deskripsi_event=?,gambar=?,tgl_pengajuan=?,status=?,ket=? WHERE id_event=?";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1, nama_event);
            perintah.setString(2, lokasi_event);
            perintah.setString(3, tgl_event_mulai);
            perintah.setString(4, tgl_event_berakhir);
            perintah.setString(5, deskripsi_event);
            perintah.setString(6, gambar);
            perintah.setString(7, tgl_pengajuan);
            perintah.setString(8, status);
            perintah.setString(9, ket);
            perintah.setInt(10, id_event);
            perintah.executeUpdate();
            System.out.println("Data berhasil diubah");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
}
    public void hapusevent(int id_event){
        try {
            String sql="DELETE FROM event WHERE id_event=?";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setInt(1, id_event);
            perintah.executeUpdate();
            System.out.println("Data berhasil dihapus");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    public void carievent (int id_event){
        try {
            String sql = "SELECT * FROM event WHERE id_event=?";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setInt(1, id_event);
            ResultSet data=perintah.executeQuery();
            while(data.next()){
                System.out.println(data.getInt("id_event"));
                System.out.println(data.getString("nama_event"));
                System.out.println(data.getString("lokasi_event"));
                System.out.println(data.getString("tgl_event_mulai"));
                System.out.println(data.getString("tgl_event_berakhir"));
                System.out.println(data.getString("deskripsi_event"));
                System.out.println(data.getString("gambar"));
                System.out.println(data.getString("tgl_pengajuan"));
                System.out.println(data.getString("status"));
                System.out.println(data.getString("ket"));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
//    Table Artikel
    
    public void simpanartikel (int id_artikel,String judul_artikel,String isi_artikel,String tgl_artikel,String gambar){
        try {
            String sql ="INSERT INTO artikel (id_artikel,judul_artikel,isi_artikel,tgl_artikel,gambar) VALUES(?,?,?,?,?)";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setInt(1, id_artikel);
            perintah.setString(2, judul_artikel);
            perintah.setString(3, isi_artikel);
            perintah.setString(4, tgl_artikel);
            perintah.setString(5, gambar);
            perintah.executeUpdate();
            System.out.println("Data berhasil disimpan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahartikel (int id_artikel,String judul_artikel,String isi_artikel,String tgl_artikel,String gambar){
        try {
            String sql = "UPDATE artikel SET judul_artikel=?, isi_artikel=?, tgl_artikel=?, gambar=? WHERE id_artikel=?";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1,judul_artikel);
            perintah.setString(2, isi_artikel);
            perintah.setString(3, tgl_artikel);
            perintah.setString(4, gambar);
            perintah.setInt(5, id_artikel);
            perintah.executeUpdate();
            System.out.println("Data berhasil diubah");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusartikel (int id_artikel){
        try {
            String sql = "DELETE FROM artikel WHERE id_artikel=?";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setInt(1, id_artikel);
            perintah.executeUpdate();
            System.out.println("Data berhasil dihapus");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void cariartikel(int id_artikel){
        try {
            String sql = "SELECT * FROM artikel WHERE id_artikel=?";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setInt(1, id_artikel);
            ResultSet data=perintah.executeQuery();
            while(data.next()){
                System.out.println(data.getInt("id_artikel"));
                System.out.println(data.getString("isi_artikel"));
                System.out.println(data.getString("judul_artikel"));
                System.out.println(data.getString("tgl_artikel"));
                System.out.println(data.getString("gambar"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    
//    Table Komentar
    public void simpankomentar(int id_komentar,String isi_komentar,String tgl_komentar,int id_artikel){
        try {
            String sql = "INSERT INTO komentar (id_komentar,isi_komentar,tgl_komentar,id_artikel) VALUES(?,?,?,?)";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setInt(1, id_komentar);
            perintah.setString(2, isi_komentar);
            perintah.setString(3, tgl_komentar);
            perintah.setInt(4, id_artikel);
            perintah.executeUpdate();
            System.out.println("Data berhasil disimpan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahkomentar(int id_komentar,String isi_komentar,String tgl_komentar,int id_artikel){
        try {
            String sql ="UPDATE komentar SET isi_komentar=?,tgl_komentar=?,id_artikel=? WHERE id_komentar=?";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1, isi_komentar);
            perintah.setString(2, tgl_komentar);
            perintah.setInt(3, id_artikel);
            perintah.setInt(4, id_komentar);
            perintah.executeUpdate();
            System.out.println("Data berhasil diuabah");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void hapuskomentar(int id_komentar){
        try {
            String sql = "DELETE FROM komentar WHERE id_komentar=?";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setInt(1, id_komentar);
            perintah.executeUpdate();
            System.out.println("Data berhasil dihapus");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void carikomentar (int id_komentar){
        try {
            String sql = "SELECT * FROM komentar WHERE id_komentar=?";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setInt(1, id_komentar);
            ResultSet data=perintah.executeQuery();
            while(data.next()){
                System.out.println(data.getInt("id_komentar"));
                System.out.println(data.getString("isi_komentar"));
                System.out.println(data.getString("tgl_komentar"));
                System.out.println(data.getInt("id_artikel"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    
    
    
    
    
    
    
}
        
        
    

