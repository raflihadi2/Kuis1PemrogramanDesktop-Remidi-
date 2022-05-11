package kuis1_jam;

public class jam {
  private int harga;
  private String merek, nama, tanggal_pembuatan, jenis;
  
  public jam (int id, int harga, String merek, String nama, String tanggal_pembuatan, String jenis){

  }

    public jam(int harga, String merek, String nama, String tanggal_pembuatan, String jenis) {
        this.harga = harga;
        this.merek = merek;
        this.nama = nama;
        this.tanggal_pembuatan = tanggal_pembuatan;
        this.jenis = jenis;
    }
    public jam() {
    //        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTanggal_pembuatan() {
        return tanggal_pembuatan;
    }

    public void setTanggal_pembuatan(String tanggal_pembuatan) {
        this.tanggal_pembuatan = tanggal_pembuatan;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    void execute() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void addjam(jam Jam) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
}
  