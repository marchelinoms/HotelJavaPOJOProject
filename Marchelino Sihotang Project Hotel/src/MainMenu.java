import java.util.*;

public class MainMenu {

    Scanner scanner = new Scanner(System.in);
    private HashMap<String, Tamu> tamu = new HashMap<>();
    private HashMap<String, Kamar> kamar = new HashMap<>();
    private Data data = new Data();

    public void Utama() {
        data.allData(tamu,kamar);
//        boolean iterasi = true;
//        while (iterasi){
        System.out.println("Selamat Datang!");
        System.out.println("Silahkan pilih nomor menu dibawah ini : ");

        System.out.println("1. All Guest Data");
        System.out.println("2. All Room Data");
        System.out.println("3. About This Hotel");
        System.out.println("4. Exit Application");

        System.out.println("Pilihan Anda : ");

        String input = scanner.nextLine().trim();
        int inputan = Integer.parseInt(input);

            switch (inputan) {
                case 1 -> guestData();
                case 2 -> statusRoom();
                case 3 -> {
                    aboutThisHotel();
                    Utama();
                }
                case 4 -> {
                    System.out.println("Adios!");
                    System.exit(0);
//                    iterasi = false;
                }
                default -> {
                    System.out.println("Menu tidak tersedia");
                    Utama();
                }
            }
        }
    public void guestData() {
        List<Tamu> noRegister = new ArrayList<>(tamu.values());
        noRegister.sort(Comparator.comparing(Tamu::getNoRegister));
        for (Tamu tamu1 : noRegister) {
            tamu1.printListTamu();
        }
        System.out.println("Pilih nomor menu untuk masuk ke menunya : ");
        System.out.println("1. Guest Information");
        System.out.println("2. Back to Main Menu");
        System.out.println("3. Exit Application");

        System.out.println("Pilihan anda : ");
        String input = scanner.nextLine().trim();
        int inputan = Integer.parseInt(input);

            switch (inputan) {
            case 1:
                guestInformation();
            case 2:
                Utama();
            case 3:
                System.out.println("Adios!");
                System.exit(0);
        }
    }

    public void statusRoom() {
        List<Kamar> lantai = new ArrayList<>(kamar.values());
        lantai.sort(Comparator.comparing(Kamar::getLantai));
        for (Kamar kamar1 : lantai) {
            kamar1.printListKamar();
        }
        System.out.println("\n");
        System.out.println("Pilih nomor menu untuk masuk ke menunya:");
        System.out.println("""
                1. Room Information
                2. Back to Main Menu
                3. Exit Application
                """);
        System.out.println("Pilihan anda : ");
        String input = scanner.nextLine().trim();
        int inputan = Integer.parseInt(input);
            switch (inputan) {
                case 1:
                    roomInformation();
                case 2:
                    Utama();
                case 3:
                    System.out.println("Adios!");
                    System.exit(0);
            }
        }
    public void aboutThisHotel() {
        System.out.println("Hotel ini bernama Silver Coast Hotel. Sudah didirikan sejak  12 December 1978 di Australia, Queensland, di kota Gold Coast.");
    }

    public void guestInformation() {
        System.out.println("Masukan nomor Register yang anda ingin lihat informasinya : ");
        String input = scanner.nextLine().trim().toUpperCase();
        if (tamu.containsKey(input.trim())) {
            tamu.get(input).printTamuTambahan();
            tamu.get(input).printDetailTamu();
        } else {
            System.out.println("Nomor Register tidak ada");
        }
        System.out.println("\n");
        System.out.println("Pilih nomor menu untuk masuk ke menunya:");
        System.out.println("""
                1. Back to All Guest Data
                2. Back to Main Menu
                3. Exit Application
                """);
        System.out.println("Pilihan Anda : ");
        input = scanner.nextLine().trim();
        switch (input) {
            case "1":
                guestData();
            case "2":
                Utama();
            case "3":
                System.exit(0);
            default:
                System.out.println("Opsi tidak ada");
                break;
        }


    }
    public void roomInformation() {
        System.out.println("Masukan nomor kamar yang anda ingin lihat informasinya : ");
        String input = scanner.nextLine().trim();

        if (kamar.containsKey(input.trim())) {
            kamar.get(input).printDetailKamar();
        } else {
            System.out.println("Nomor kamar tidak ada");
        }

        System.out.println("\n");
        System.out.println("Pilih nomor menu untuk masuk ke menunya:");
        System.out.println("""
                                            1. Back to All Room Data
                                            2. Back to Main Menu
                                            3. Exit Application
                                            """);
        input = scanner.nextLine();
        switch (input){
            case "1":
                statusRoom();
            case "2":
                Utama();
            case "3":
                System.exit(0);
        }
    }
}
