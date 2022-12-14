import java.time.LocalDate;
import java.util.HashMap;


public class Data {

    public void allData(HashMap <String,Tamu> dataTamu, HashMap<String,Kamar> kamar) {

    /* Data Kamar */

        Kamar kamar301 =  new Kamar("301", "3", TipeKamar.REGULARSINGLEBED, 800000);
        Kamar kamar302 =  new Kamar("302", "3", TipeKamar.REGULARDOUBLEBED, 1000000);
        Kamar kamar303 =  new Kamar("303", "3", TipeKamar.REGULARTWINBED, 1200000);
        Kamar kamar401 =  new Kamar("401", "4", TipeKamar.VIPSINGLEBED, 1000000);
        Kamar kamar402 =  new Kamar("402", "4", TipeKamar.VIPDOUBLEBED, 1200000);
        Kamar kamar403 =  new Kamar("403", "4", TipeKamar.VIPTWINBED, 1400000);

        //HashMap Kamar
        kamar.put("301",kamar301);
        kamar.put("302",kamar302);
        kamar.put("303",kamar303);
        kamar.put("401",kamar401);
        kamar.put("402",kamar402);
        kamar.put("403",kamar403);

    /*Data Tamu*/

//        Calendar tglLahir1 = new GregorianCalendar(1990, Calendar.NOVEMBER, 23);
        Tamu a021 = new Tamu("312008923111990002",
                "Danny", "Tan",LocalDate.of(1990,11,23),
                "Beijing", JenisKelamin.L, "A021",
                LocalDate.of(2018, 4, 12),
                LocalDate.of(2018, 4, 14),kamar301);

//        Calendar tglLahir2 = new GregorianCalendar(1990, Calendar.NOVEMBER, 11);
        Tamu a022 = new Tamu("312008661111990004",
                "Dessy", "Wang", LocalDate.of(1990,11,11),
                "Beijing", JenisKelamin.P, "A022",
                LocalDate.of(2018, 4, 12),
                LocalDate.of(2018, 4, 14),kamar301);

//        Calendar tglLahir3 = new GregorianCalendar(1985, Calendar.APRIL, 18);
        Tamu a023 = new Tamu("312007023111990003",
                "Sunarti", "Wijaya", LocalDate.of(1985,4,18),
                "Bandung", JenisKelamin.P, "A023",
                LocalDate.of(2018, 5, 15),
                LocalDate.of(2018, 5, 17),kamar302);


//        Calendar tglLahir4 = new GregorianCalendar(1985, Calendar.AUGUST, 1);
        Tamu a024 = new Tamu("312008901081990017",
                "Ardi", "Sanjaya", LocalDate.of(1985,7,1),
                "Jakarta", JenisKelamin.L, "A024",
                LocalDate.of(2018, 5, 15),
                LocalDate.of(2018, 5, 17),kamar302);


//        Calendar tglLahir5 = new GregorianCalendar(2000, Calendar.OCTOBER, 10);
        Tamu a025 = new Tamu("3120085660102000889",
                "Muliawan", "Sanjaya", LocalDate.of(2000,10,10),
                "Jakarta", JenisKelamin.L, "A025",
                LocalDate.of(2018, 5, 15),
                LocalDate.of(2018, 5, 17),kamar302);


//        Calendar tglLahir6 = new GregorianCalendar(1988, Calendar.OCTOBER, 14);
        Tamu a026 = new Tamu("31200344014101988334",
                "Tirta", "Sanjaya", LocalDate.of(1988,10,14),
                "Jakarta", JenisKelamin.L, "A026",
                LocalDate.of(2018, 5, 15),
                LocalDate.of(2018, 5, 18),kamar401);

        //HashMap Tamu
        dataTamu.put("A021",a021);
        dataTamu.put("A022",a022);
        dataTamu.put("A023",a023);
        dataTamu.put("A024",a024);
        dataTamu.put("A025",a025);
        dataTamu.put("A026",a026);

    /* Data Tamu Tiap Kamar*/

        kamar301.tambahTamu(a021);
        kamar301.tambahTamu(a022);
        kamar302.tambahTamu(a023);
        kamar302.tambahTamu(a024);
        kamar302.tambahTamu(a025);
        kamar401.tambahTamu(a026);

    /* Data Tamu (+ Keluarga) */

        a021.tambahOrang(a022);
        a022.tambahOrang(a021);
        a023.tambahOrang(a024);
        a023.tambahOrang(a025);
        a024.tambahOrang(a023);
        a024.tambahOrang(a025);
        a025.tambahOrang(a023);
        a025.tambahOrang(a024);
    }
}
