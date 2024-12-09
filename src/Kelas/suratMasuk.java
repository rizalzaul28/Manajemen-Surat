package kelas;

import Kelas.Koneksi;
import java.awt.Component;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class suratMasuk {

    private static String id_surat, judul, perihal, no_surat, asal_surat, tujuan, jenis_surat, keterangan, file_data;

    private static java.sql.Date tanggal_diterima;
    private static final String destinationPath = "./Upload/surat/"; // Ensure this is declared at the class level

    private Connection konek;
    private PreparedStatement ps;
    private Statement st;
    private ResultSet rs;
    private String query;

    public suratMasuk() throws SQLException {
        Koneksi koneksi = new Koneksi();
        konek = koneksi.koneksiDB();
    }

    public static String getId_surat() {
        return id_surat;
    }

    public static void setId_surat(String id_surat) {
        suratMasuk.id_surat = id_surat;
    }

    public static String getJudul() {
        return judul;
    }

    public static void setJudul(String judul) {
        suratMasuk.judul = judul;
    }

    public static String getPerihal() {
        return perihal;
    }

    public static void setPerihal(String perihal) {
        suratMasuk.perihal = perihal;
    }

    public static String getNo_surat() {
        return no_surat;
    }

    public static void setNo_surat(String no_surat) {
        suratMasuk.no_surat = no_surat;
    }

    public static String getAsal_surat() {
        return asal_surat;
    }

    public static void setAsal_surat(String asal_surat) {
        suratMasuk.asal_surat = asal_surat;
    }

    public static String getTujuan() {
        return tujuan;
    }

    public static void setTujuan(String tujuan) {
        suratMasuk.tujuan = tujuan;
    }

    public static String getJenis_surat() {
        return jenis_surat;
    }

    public static void setJenis_surat(String jenis_surat) {
        suratMasuk.jenis_surat = jenis_surat;
    }

    public static String getKeterangan() {
        return keterangan;
    }

    public static void setKeterangan(String keterangan) {
        suratMasuk.keterangan = keterangan;
    }

    public static String getFile_data() {
        return file_data;
    }

    public static void setFile_data(String file_data) {
        suratMasuk.file_data = file_data;
    }

    public static Date getTanggal_diterima() {
        return tanggal_diterima;
    }

    public static void setTanggal_diterima(Date tanggal_diterima) {
        suratMasuk.tanggal_diterima = tanggal_diterima;
    }

   

    public Connection getKonek() {
        return konek;
    }

    public void setKonek(Connection konek) {
        this.konek = konek;
    }

    public PreparedStatement getPs() {
        return ps;
    }

    public void setPs(PreparedStatement ps) {
        this.ps = ps;
    }

    public Statement getSt() {
        return st;
    }

    public void setSt(Statement st) {
        this.st = st;
    }

    public ResultSet getRs() {
        return rs;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
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
        query = "UPDATE surat_masuk SET "
                + "judul = ?, "
                + "perihal = ?, "
                + "no_surat = ?, "
                + "asal_surat = ?, "
                + "tujuan = ?, "
                + "tanggal_diterima = ?, "
                + "jenis_surat = ?, "
                + "keterangan = ?, "
                + "file_data = ? "
                + "WHERE id_surat = ?";
        try {
            ps = konek.prepareStatement(query);
            ps.setString(1, judul);
            ps.setString(2, perihal);
            ps.setString(3, no_surat);
            ps.setString(4, asal_surat);
            ps.setString(5, tujuan);
            ps.setDate(6, tanggal_diterima);
            ps.setString(7, jenis_surat);
            ps.setString(8, keterangan);
            ps.setString(9, file_data);
            ps.setString(10, id_surat);

            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Surat berhasil diubah");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Surat gagal diubah: " + ex.getMessage());
        }
    }

    public static void getDataDetail(DefaultTableModel model, String id_surat, Connection konek) {
        model.setRowCount(0);
        String sql = "SELECT id_surat, judul, perihal, no_surat, asal_surat, tujuan, tanggal_diterima, jenis_surat, keterangan, file_data "
                + "FROM surat_masuk WHERE id_surat = ?";
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = konek.prepareStatement(sql);
            ps.setString(1, id_surat);
            rs = ps.executeQuery();

            while (rs.next()) {
                String id = rs.getString("id_surat");
                String judul = rs.getString("judul");
                String perihal = rs.getString("perihal");
                String noSurat = rs.getString("no_surat");
                String asalSurat = rs.getString("asal_surat");
                String tujuan = rs.getString("tujuan");
                String tanggalDiterima = rs.getString("tanggal_diterima");
                String jenisSurat = rs.getString("jenis_surat");
                String keterangan = rs.getString("keterangan");
                String fileData = rs.getString("file_data");

                model.addRow(new Object[]{id, judul, perihal, noSurat, asalSurat, tujuan, tanggalDiterima, jenisSurat, keterangan, fileData});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed to retrieve data");
            Logger.getLogger(suratMasuk.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error on closing the connection");
                Logger.getLogger(suratMasuk.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }

    public String otoID() {
        // Menggunakan LocalDate untuk mendapatkan tanggal saat ini dalam format yyyyMMdd
        LocalDate today = LocalDate.now();
        String todayFormatted = today.format(DateTimeFormatter.ofPattern("yyyyMMdd"));

        // Membangun query untuk mendapatkan ID surat terakhir hari ini
        String query = "SELECT id_surat FROM surat_masuk WHERE id_surat LIKE '" + todayFormatted + "%' ORDER BY id_surat DESC LIMIT 1";

        try {
            st = konek.createStatement();
            rs = st.executeQuery(query);
            if (rs.next()) {
                String lastId = rs.getString("id_surat");
                // Mengambil bagian numerik dari ID surat terakhir dan menambahkannya dengan satu
                int num = Integer.parseInt(lastId.substring(8)) + 1;
                String newId = todayFormatted + String.format("%03d", num);
                return newId; // Mengembalikan ID baru
            } else {
                // Jika tidak ada surat pada hari ini, mulai dengan 001
                return todayFormatted + "001";
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Failed to fetch next surat ID: " + ex.getMessage());
            return null; // Mengembalikan null jika ada kegagalan dalam eksekusi query
        }
    }

//    public static String uploadSurat(File selectedFile, Date date) {
//        try {
//            if (selectedFile != null) {
//                String filepath = selectedFile.getAbsolutePath().replace('\\', '/');
//                SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
//                String timestamp = sdf.format(date);
//                String justFileName = selectedFile.getName();
//                String newName = timestamp + "_" + justFileName;
//
//                File destinationDirectory = new File(destinationPath);
//                if (!destinationDirectory.exists()) {
//                    destinationDirectory.mkdirs();
//                }
//
//                File destinationFile = new File(destinationDirectory, newName);
//                Files.copy(selectedFile.toPath(), destinationFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
//
//                return destinationPath + newName; // Return the new file path
//            } else {
//                return "No file was selected";
//            }
//        } catch (IOException e) {
//            return "Failed to copy file: " + e.getMessage();
//        }
//    }
}
