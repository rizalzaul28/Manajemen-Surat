package kelas;

import Kelas.Koneksi;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class suratMasuk {

   
    String  id_surat,judul, perihal, no_surat, asal_surat, tujuan, jenis_surat, keterangan, file_data;
    java.sql.Date tanggal_diterima;

    private Connection konek;
    private PreparedStatement ps;
    private Statement st;
    private ResultSet rs;
    private String query;

    public suratMasuk() throws SQLException {
        Koneksi koneksi = new Koneksi();
        konek = koneksi.koneksiDB();
    }

    public String getId_surat() {
        return id_surat;
    }

    public void setId_surat(String id_surat) {
        this.id_surat = id_surat;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPerihal() {
        return perihal;
    }

    public void setPerihal(String perihal) {
        this.perihal = perihal;
    }

    public String getNo_surat() {
        return no_surat;
    }

    public void setNo_surat(String no_surat) {
        this.no_surat = no_surat;
    }

    public String getAsal_surat() {
        return asal_surat;
    }

    public void setAsal_surat(String asal_surat) {
        this.asal_surat = asal_surat;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public String getJenis_surat() {
        return jenis_surat;
    }

    public void setJenis_surat(String jenis_surat) {
        this.jenis_surat = jenis_surat;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getfile_data() {
        return file_data;
    }

    public void setfile_data(String nama_file) {
        this.file_data = nama_file;
    }

    public Date getTanggal_diterima() {
        return tanggal_diterima;
    }

    public void setTanggal_diterima(Date tanggal_diterima) {
        this.tanggal_diterima = tanggal_diterima;
    }


    public Connection getKonek() {
        return konek;
    }

    public void setKonek(Connection konek) {
        this.konek = konek;
    }

  

    public void tambahSurat() {
        query = "INSERT INTO surat_masuk(id_surat,"
                + "judul,"
                + "perihal,"
                + "no_surat,"
                + "asal_surat,"
                + "tujuan,tanggal_diterima,jenis_surat,keterangan,file_data) VALUES(?,?,?,?,?,?,?,?,?,?)";
        try {
            ps = konek.prepareStatement(query);
            ps.setString(1, id_surat);
            ps.setString(2, judul);
            ps.setString(3, perihal);
            ps.setString(4, no_surat);
            ps.setString(5, asal_surat);
            ps.setString(6, tujuan);
            ps.setDate(7, tanggal_diterima);
            ps.setString(8, jenis_surat);
            ps.setString(9, keterangan);
           ps.setString(10, file_data);

            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Surat berhasil ditambahkan");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public ResultSet tampilSurat() {
        query = "SELECT * FROM surat_masuk";
        try {
            st = konek.createStatement();
            rs = st.executeQuery(query);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data gagal tampil: " + ex.getMessage());
        }
        return rs;
    }

    public void hapusSurat() {
        query = "DELETE FROM surat_masuk WHERE id_surat = ?";
        try {
            ps = konek.prepareStatement(query);
            ps.setString(1, id_surat);

            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Surat berhasil dihapus");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Surat gagal dihapus: " + ex.getMessage());
        }
    }

    public void ubahSurat() {
        query = "UPDATE surat_masuk SET judul = ?, perihal = ?, no_surat = ?, asal_surat = ?, tujuan = ?, tanggal_diterima = ?, tanggal_surat = ?, jenis_surat = ?, keterangan = ?, nama_file = ? WHERE id_surat = ?";
        try {
            ps = konek.prepareStatement(query);
            ps.setString(1, judul);
            ps.setString(2, perihal);
            ps.setString(3, no_surat);
            ps.setString(4, asal_surat);
            ps.setString(5, tujuan);
            ps.setDate(6, tanggal_diterima);
           
            ps.setString(8, jenis_surat);
            ps.setString(9, keterangan);
            ps.setString(10, file_data);
            ps.setString(11, id_surat);

            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Surat berhasil diubah");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Surat gagal diubah: " + ex.getMessage());
        }
    }

}
