import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Tamu extends Biodata {
    private String noRegister;
    private LocalDate tanggalCheckIn;
    private LocalDate tanggalCheckOut;
    private Kamar kamar;

    private final  Locale locale = new Locale("id", "ID");

    private List<Tamu> tamuList;

    public Tamu() {}


    public Tamu(String noKtp, String firstName, String lastName, LocalDate tglLahir, String kotaLahir,
                JenisKelamin jenisKelamin, String noRegister, LocalDate tanggalCheckIn, LocalDate tanggalCheckOut,Kamar kamar) {

        super(noKtp, firstName, lastName,
                tglLahir, kotaLahir, jenisKelamin);
        this.noRegister = noRegister;
        this.tanggalCheckIn = tanggalCheckIn;
        this.tanggalCheckOut = tanggalCheckOut;
        this.kamar = kamar;
        this.tamuList = new ArrayList<>();
    }

    public String  hitungBill(){

        long daysPeriod = ChronoUnit.DAYS.between(tanggalCheckIn, tanggalCheckOut);
        double cost = daysPeriod * kamar.getHargaKamar();

        return NumberFormat.getCurrencyInstance(locale).format(cost);
    }

    public void tambahOrang (Tamu tamu){
        this.tamuList.add(tamu);
    }
    public void printListTamu(){
        System.out.println(getFirstName()+" "+getLastName()
                +" dengan Nomor Register: "+getNoRegister());
    }
    public void printDetailTamu(){
        System.out.println("\n");
        System.out.println("First Name: "+getFirstName());
        System.out.println("Last Name: "+getLastName());
        System.out.println("Gender: "+getJenisKelamin().getLabel());
        System.out.println("Birth information: " + getKotaLahir() + ", "
                + formatTanggal(getTglLahir()) + " ("
                + hitungUmur() + " tahun )");
        System.out.println("ID Card: "+getNoKtp());
        System.out.println("Menginap selama: "+ ChronoUnit.DAYS.between(tanggalCheckIn,tanggalCheckOut) +" hari");
        System.out.println("Biaya menginap: "+ hitungBill());
        System.out.println("\n");
        System.out.println("Menginap di:");
        System.out.println("Room number: "+getKamar().getNoKamar());
        System.out.println("Floor: "+getKamar().getLantai());
        System.out.println("Room Type: "+getKamar().getTipeKamar().getLabel());
    }

    public void printTamuTambahan(){
        System.out.println("\n");
        System.out.println("Anggota keluarga: ");
        if (getTamuList().isEmpty()) {
            System.out.println("Tamu menginap sendiri");
        } else {
            for (Tamu item : tamuList) {
                System.out.println(item.getFirstName() + " "
                        + item.getLastName()
                        + " dengan Nomor Register: "
                        + item.getNoRegister());
            }
        }
    }

    public String getNoRegister() {
        return noRegister;
    }

    public Kamar getKamar() {
        return kamar;
    }

    public void setKamar(Kamar kamar) {
        this.kamar = kamar;
    }

    public void setNoRegister(String noRegister) {
        this.noRegister = noRegister;
    }

    public LocalDate getTanggalCheckIn() {
        return tanggalCheckIn;
    }

    public void setTanggalCheckIn(LocalDate tanggalCheckIn) {
        this.tanggalCheckIn = tanggalCheckIn;
    }

    public LocalDate getTanggalCheckOut() {
        return tanggalCheckOut;
    }

    public void setTanggalCheckOut(LocalDate tanggalCheckOut) {
        this.tanggalCheckOut = tanggalCheckOut;
    }

    public List<Tamu> getTamuList() {
        return tamuList;
    }

    public void setTamuList(List<Tamu> tamuList) {
        this.tamuList = tamuList;
    }
}
