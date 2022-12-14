import java.util.ArrayList;
import java.util.List;

public class Kamar {
  private String noKamar;
  private String lantai;
  private TipeKamar tipeKamar;
  private double hargaKamar;
  private List<Tamu> tamuList = new ArrayList<>();

  public Kamar() {}
  public Kamar(String noKamar, String lantai, TipeKamar tipeKamar, double hargaKamar) {
    this.noKamar = noKamar;
    this.lantai = lantai;
    this.tipeKamar = tipeKamar;
    this.hargaKamar = hargaKamar;
  }

  public Kamar(String noKamar, String lantai, TipeKamar tipeKamar){
    this.noKamar = noKamar;
    this.lantai = lantai;
    this.tipeKamar = tipeKamar;
    this.tamuList = new ArrayList<>();
  }

  public void tambahTamu (Tamu tamu){
    this.tamuList.add(tamu);
  }

  public void printListKamar(){
    System.out.println("Lantai "+ getLantai()
            +": "+getNoKamar());
  }
  public void printDetailKamar(){
    System.out.println('\n');
    System.out.println("Room Number: " + getNoKamar());
    System.out.println("Floor: " + getLantai());
    System.out.println("Room Type: " + getTipeKamar().getLabel());
    System.out.println("Price: " + getHargaKamar());

    System.out.println("\n");
    System.out.println("Reservation History:");

    if (getTamuList().isEmpty()) {
      System.out.println("Kamar ini belum pernah mempunyai tamu(reservasi)");
    } else {
      for (Tamu tamu : tamuList) {
        System.out.println(tamu.formatTanggal(tamu.getTanggalCheckIn())
                + " - " + tamu.formatTanggal(tamu.getTanggalCheckOut())
                + " ("+tamu.getFirstName()+" "
                + tamu.getLastName()+", "
                + tamu.getNoRegister()+")");
      }
    }
  }
  public String getNoKamar() {
    return noKamar;
  }

  public void setNoKamar(String noKamar) {
    this.noKamar = noKamar;
  }

  public String getLantai() {
    return lantai;
  }

  public void setLantai(String lantai) {
    this.lantai = lantai;
  }

  public TipeKamar getTipeKamar() {
    return tipeKamar;
  }

  public void setTipeKamar(TipeKamar tipeKamar) {
    this.tipeKamar = tipeKamar;
  }

  public List<Tamu> getTamuList() {
    return tamuList;
  }

  public void setTamuList(List<Tamu> tamuList) {
    this.tamuList = tamuList;
  }

  public double getHargaKamar() {
    return hargaKamar;
  }

  public void setHargaKamar(double hargaKamar) {
    this.hargaKamar = hargaKamar;
  }
}
