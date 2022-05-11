package kuis1_jam;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import kuis1_jam.db.DBHelper;


public class jamdatamodel {
    
    private final  Connection conn;

    public jamdatamodel() throws SQLException {
        this.conn =DBHelper.getConnection();
    }
    
    public void addjam(jam jam){
    String insertjam = "INSERT INTO jam ( `tanggal_pembuatan`, `merek`, `harga`, `jenis`, `nama`)"
            + "VALUES ('"
            +jam.getTanggal_pembuatan()+"','"
            +jam.getMerek()+"','"
            +jam.getHarga()+"','"
            +jam.getJenis()+"','"
            +jam.getNama()+"')";
    try {
    
    PreparedStatement Jam = (PreparedStatement) conn.prepareStatement(insertjam);

   
    jam.execute();
    }
    catch(Exception e){
        System.out.println("eror "+e);
    }
    }
    
}