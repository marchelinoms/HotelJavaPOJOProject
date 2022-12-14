import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Biodata {

    private String noKtp;
    private String firstName;
    private String lastName;
    private LocalDate tglLahir;
    private String kotaLahir;
    private JenisKelamin jenisKelamin;

    private Locale locale = new Locale("id","ID");
    public Biodata() {}
    public Biodata(String noKtp, String firstName, String lastName, LocalDate tglLahir, String kotaLahir, JenisKelamin jenisKelamin) {
        this.noKtp = noKtp;
        this.firstName = firstName;
        this.lastName = lastName;
        this.tglLahir = tglLahir;
        this.kotaLahir = kotaLahir;
        this.jenisKelamin = jenisKelamin;
    }
    public int hitungUmur(){
        GregorianCalendar hariIni = new GregorianCalendar();

        int tahunIni = hariIni.get(Calendar.YEAR);
        int tahunUlangTahun = this.getTglLahir().getYear();

        return tahunIni - tahunUlangTahun;
    }

    public String formatTanggal (LocalDate localDate){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", locale);
        String formatTanggal = localDate.format(formatter);
        return formatTanggal;
    }

    public String getNoKtp() {
        return noKtp;
    }

    public void setNoKtp(String noKtp) {
        this.noKtp = noKtp;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(LocalDate tglLahir) {
        this.tglLahir = tglLahir;
    }

    public String getKotaLahir() {
        return kotaLahir;
    }

    public void setKotaLahir(String kotaLahir) {
        this.kotaLahir = kotaLahir;
    }

    public JenisKelamin getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(JenisKelamin jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
}
