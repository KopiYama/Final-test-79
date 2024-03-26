import java.util.Scanner;
import java.text.DecimalFormat;

/*
Creat By : Mochamad Rizky Andika
Creat At : 13.12 Senin, 25 Maret 2024
 */

public class GajiPNSMRizkyA {
    public static int[][] gajiPokokGol1 = {
            {1560800, 1560800, 1560800, 1560800},
            {1560800, 1560800, 1560800, 1560800},
            {1610000, 1610000, 1610000, 1610000},
            {1610000, 1704500, 1776600, 1851800},
            {1660700, 1704500, 1776600, 1851800},
            {1660700, 1758200, 1832600, 1910100},
            {1713000, 1758200, 1832600, 1910100},
            {1713000, 1813600, 1890300, 1970200},
            {1766900, 1813600, 1890300, 1970200},
            {1766900, 1870700, 1949800, 2032300},
            {1822600, 1870700, 1949800, 2032300},
            {1822600, 1929600, 2011200, 2096300},
            {1880000, 1929600, 2011200, 2096300},
            {1880000, 1990400, 2074600, 2162300},
            {1939200, 1990400, 2074600, 2162300},
            {1939200, 2053100, 2139900, 2230400},
            {2000300, 2053100, 2139900, 2230400},
            {2000300, 2117700, 2207300, 2300700},
            {2063300, 2117700, 2207300, 2300700},
            {2063300, 2184400, 2276800, 2373100},
            {2128300, 2184400, 2276800, 2373100},
            {2128300, 2253200, 2348500, 2447900},
            {2195300, 2253200, 2348500, 2447900},
            {2195300, 2324200, 2422500, 2525000},
            {2264400, 2324200, 2422500, 2525000},
            {2264400, 2397400, 2498800, 2604500},
            {2335800, 2397400, 2498800, 2604500},
            {2335800, 2472900, 2557500, 2686500}
    };

    public static int[][] gajiPokokGol2 = {
            {2022200, 2022200, 2022200, 2022200},
            {2054100, 2054100, 2054100, 2054100},
            {2054100, 2054100, 2054100, 2054100},
            {2118800, 2208400, 2301800, 2399200},
            {2118800, 2208400, 2301800, 2399200},
            {2185500, 2277900, 2374300, 2474700},
            {2185500, 2277900, 2374300, 2474700},
            {2254300, 2349700, 2449100, 2552700},
            {2254300, 2349700, 2449100, 2552700},
            {2325300, 2423700, 2526200, 2633100},
            {2325300, 2423700, 2526200, 2633100},
            {2398600, 2500000, 2605800, 2716000},
            {2398600, 2500000, 2605800, 2716000},
            {2474100, 2578800, 2687800, 2801500},
            {2474100, 2578800, 2687800, 2801500},
            {2552000, 2660000, 2772500, 2889800},
            {2552000, 2660000, 2772500, 2889800},
            {2632400, 2743800, 2859800, 2980800},
            {2632400, 2743800, 2859800, 2980800},
            {2715300, 2830200, 2949900, 3074700},
            {2715300, 2830200, 2949900, 3074700},
            {2800800, 2919300, 3042800, 3171500},
            {2800800, 2919300, 3042800, 3171500},
            {2891100, 3011200, 3138600, 3271400},
            {2891100, 3011200, 3138600, 3271400},
            {2980000, 3106100, 3237500, 3374400},
            {2980000, 3106100, 3237500, 3374400},
            {3073900, 3203900, 3349400, 3480700},
            {3073900, 3203900, 3349400, 3480700},
            {3170700, 3304800, 3454600, 3590300},
            {3170700, 3304800, 3454600, 3590300},
            {3270600, 3408900, 3553100, 3703400},
            {3270600, 3408900, 3553100, 3703400},
            {3373600, 3516300, 3665000, 3820000}
    };

    public static int[][] gajiPokokGol3 = {
            {2579400, 2688500, 2802300, 2920800}, //0
            {2579400, 2688500, 2802300, 2920800}, //1
            {2660700, 2773200, 2890500, 3012800}, //2
            {2660700, 2773200, 2890500, 3012800}, //3
            {2744500, 2860500, 2981500, 3107700}, //4
            {2744500, 2860500, 2981500, 3107700}, //5
            {2830900, 2950600, 3075500, 3205500}, //6
            {2830900, 2950600, 3075500, 3205500}, //7
            {2920100, 3043600 ,3172300, 3306500}, //8
            {2920100, 3043600 ,3172300, 3306500}, //9
            {3012000, 3139400, 3272200, 3410600}, //10
            {3012000, 3139400, 3272200, 3410600}, //11
            {3106900, 3238300, 3375300, 3518100}, //12
            {3106900, 3238300, 3375300, 3518100}, //13
            {3204700, 3340300, 3481600, 3628900}, //14
            {3204700, 3340300, 3481600, 3628900}, //15
            {3305700, 3445500, 3591200, 3743100}, //16
            {3305700, 3445500, 3591200, 3743100}, //17
            {3409800, 3554000, 3704300, 3861000}, //18
            {3409800, 3554000, 3704300, 3861000}, //19
            {3517200, 3665900, 3821000, 3982600}, //20
            {3517200, 3665900, 3821000, 3982600}, //21
            {3627900, 3781400, 3941400, 4108100}, //22
            {3627900, 3781400, 3941400, 4108100}, //23
            {3742200, 3900500, 4065500, 4237500}, //24
            {3742200, 3900500, 4065500, 4237500}, //25
            {3860100, 4023300, 4193500, 4370900}, //26
            {3860100, 4023300, 4193500, 4370900}, //27
            {3981600, 4150100, 4325600, 4508600}, //28
            {3981600, 4150100, 4325600, 4508600}, //29
            {4107000, 4280800, 4461800, 4650600}, //30
            {4107000, 4280800, 4461800, 4650600}, //31
            {4236400, 4415600, 4602400, 4797000} //32
    };

    public static int[][] gajiPokokGol4 = {
            {3044300, 3173100, 3307300, 3447200, 3593100}, //0
            {3044300, 3173100, 3307300, 3447200, 3593100}, //1
            {3140200, 3272100, 3411500, 3555800, 3706200}, //2
            {3140200, 3272100, 3411500, 3555800, 3706200}, //3
            {3239100, 3376100, 3518900, 3667800, 3822900}, //4
            {3239100, 3376100, 3518900, 3667800, 3822900}, //5
            {3341100, 3482500, 3629800, 3783300, 3943300}, //6
            {3341100, 3482500, 3629800, 3783300, 3943300}, //7
            {3446400, 3592100, 3744100, 3902500, 4067500}, //8
            {3446400, 3592100, 3744100, 3902500, 4067500}, //9
            {3554900, 3705300, 3862000, 4025400, 4195700}, //10
            {3554900, 3705300, 3862000, 4025400, 4195700}, //11
            {3666900, 3822000, 3983600, 4152200, 4327800}, //12
            {3666900, 3822000, 3983600, 4152200, 4327800}, //13
            {3782400, 3942400, 4109100, 4282900, 4462100}, //14
            {3782400, 3942400, 4109100, 4282900, 4462100}, //15
            {3901500, 4066500, 4238500, 4417800, 4604700}, //16
            {3901500, 4066500, 4238500, 4417800, 4604700}, //17
            {4024400, 4194600, 4372000, 4557000, 4749700}, //18
            {4024400, 4194600, 4372000, 4557000, 4749700}, //19
            {4151100, 4326700, 4509700, 4700500, 4899300}, //20
            {4151100, 4326700, 4509700, 4700500, 4899300}, //21
            {4281800, 4463000, 4651800, 4848500, 5053600}, //22
            {4281800, 4463000, 4651800, 4848500, 5053600}, //23
            {4416700, 4603500, 4798300, 5001200, 5212800}, //24
            {4416700, 4603500, 4798300, 5001200, 5212800}, //25
            {4555800, 4748500, 4949400, 5158700, 5377000}, //26
            {4555800, 4748500, 4949400, 5158700, 5377000}, //27
            {4699300, 4898100, 5105300, 5321200, 5546300}, //28
            {4699300, 4898100, 5105300, 5321200, 5546300}, //29
            {4847300, 5052300, 5266100, 5488800, 5721000}, //30
            {4847300, 5052300, 5266100, 5488800, 5721000}, //31
            {5000000, 5211500, 5431900, 5661700, 5901200} //32
    };

    public static int kalkulasiGajiPokok(int golongan, int masaKerja, char ruangKerja) {
        int[][] gajiPokok = null;
        int ruangIndex = 0;

        switch (golongan) {
            case 1:
                gajiPokok = gajiPokokGol1;
                break;
            case 2:
                gajiPokok = gajiPokokGol2;
                break;
            case 3:
                gajiPokok = gajiPokokGol3;
                break;
            case 4:
                gajiPokok = gajiPokokGol4;
                break;
        }

        if (golongan >= 1 && golongan <= 3) {
            if (ruangKerja >= 'A' && ruangKerja <= 'D') {
                ruangIndex = ruangKerja - 'A';
            } else {
                System.out.println("Invalid ruang kerja for Golongan " + golongan + ": " + ruangKerja);
                return 0;
            }
        } else if (golongan == 4) {
            if (ruangKerja >= 'A' && ruangKerja <= 'E') {
                ruangIndex = ruangKerja - 'A';
            } else {
                System.out.println("Invalid ruang kerja for Golongan " + golongan + ": " + ruangKerja);
                return 0;
            }
        } else {
            System.out.println("Invalid golongan: " + golongan);
            return 0;
        }

        int masaKerjaIndex = Math.min(masaKerja, gajiPokok.length - 1);
        return gajiPokok[masaKerjaIndex][ruangIndex];
    }

    public static int kalkulasiTunjanganKeluarga(int gajiPokok, String statusPernikahan) {
        if (statusPernikahan.equalsIgnoreCase("Kawin")) {
            return (int) (gajiPokok * 0.1);
        } else {
            return 0;
        }
}

    public static int kalkulasiTunjanganAnak(int gajiPokok, int jumlahAnak) {
        return (jumlahAnak > 0) ? (int) (gajiPokok * 0.02 * Math.min(jumlahAnak, 2)) : 0;
    }

    public static int kalkulasiTunjanganBeras(String statusPernikahan, int jumlahAnak) {
        final int HARGA_BERAS_PER_KG = 15000;
        final int BERAS_PER_ANGGOTA = 10;
        final int MAX_ANAK = 2;

        int jumlahAnggotaKeluarga = 1;
        if (statusPernikahan.equals("Kawin")) {
            jumlahAnggotaKeluarga += 1;
        }
        jumlahAnggotaKeluarga += Math.min(jumlahAnak, MAX_ANAK);

        return jumlahAnggotaKeluarga * BERAS_PER_ANGGOTA * HARGA_BERAS_PER_KG;
    }

    public static int kalkulasiTunjanganUmumJabatan(int golongan) {
        switch (golongan) {
            case 1:
                return 175000;
            case 2:
                return 180000;
            case 3:
                return 185000;
            case 4:
                return 190000;
            default:
                System.out.println("Golongan tidak valid: " + golongan);
                return 0;
        }
    }

    public static int kalkulasiGajiKotor(int gajiPokok, int tunjanganKeluarga, int tunjanganAnak,
                                         int tunjanganBeras, int tunjanganUmumJabatan) {
        return gajiPokok + tunjanganKeluarga + tunjanganAnak + tunjanganBeras + tunjanganUmumJabatan;
    }

    public static double kalkulasiPotonganPPH(int gajiPokok, String statusPernikahan,
                                              int gajiKotor, int jumlahAnak, int tunjanganKeluarga, int tunjanganAnak) {
        final double PTKP_SENDIRI = 36000000;
        final double PTKP_PASANGAN = 3000000;
        final double PTKP_ANAK = 3000000;
        final double MAX_PTKP_ANAK = 3;
        final double BIAYA_JABATAN_PCT = 0.05;
        final double IURAN_PENSIUN_PCT = 0.0475;
        final double PENGHASILAN_MINIMUM = 4500000;
        final double PPH_TARIF = 0.05;

        if (gajiKotor <= PENGHASILAN_MINIMUM) {
            return 0;
        }

        double ptkp = PTKP_SENDIRI;
        if (statusPernikahan.equals("Kawin")) { // Kawin
            ptkp += PTKP_PASANGAN;
        }
        ptkp += Math.min(jumlahAnak, MAX_PTKP_ANAK) * PTKP_ANAK;

        double biayaJabatan = Math.min(BIAYA_JABATAN_PCT * gajiKotor, 6000000);
        double iuranPensiun = IURAN_PENSIUN_PCT * (gajiPokok + tunjanganKeluarga + tunjanganAnak);

        double penghasilanNetoSetahun = (gajiKotor - biayaJabatan - iuranPensiun) * 12;
        double pkp = penghasilanNetoSetahun - ptkp;
        if (pkp < 0) {
            pkp = 0;
        }

        double pphSetahun = PPH_TARIF * pkp;
        return (int) Math.floor(pphSetahun) / 12;
    }

    public static double kalkulasiPotonganIWP(int gajiPokok, int tunjanganKeluarga, int tunjanganAnak) {
        final double IWP_RATE = 0.1; // IWP 10%
        return (gajiPokok + tunjanganKeluarga + tunjanganAnak) * IWP_RATE;
    }

    public static int kalkulasiPotonganTaperum(int golongan) {
        switch (golongan) {
            case 1:
                return 3000;
            case 2:
                return 5000;
            case 3:
                return 7000;
            case 4:
                return 10000;
            default:
                System.out.println("Golongan tidak valid: " + golongan);
                return 0;
        }
    }

    public static double kalkulasiGajiBersih(int gajiKotor, double potonganPPH, double potonganIWP, int potonganTaperum) {
        return gajiKotor - (potonganPPH + potonganIWP + potonganTaperum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#,##0.00");

        String nama = validationString(scanner, "Masukan Nama Pegawai                           : ");
        int golongan = validationGolongan(scanner, "Masukkan Golongan Pangkat (1-4)                : ");
        char ruangKerja = validationRuangKerja(scanner, golongan,"Masukkan Ruang Kerja");
        int masaKerja = validationMasaKerja(scanner, golongan, "Masukkan Masa Kerja");
        String statusPernikahan = validationStatusPernikahan(scanner, "Status Pernikahan");
        int jumlahAnak = validationJumlahAnak(scanner, "Masukkan Jumlah Anak");


        int jumlahAnggotaKeluarga = 1; // Pegawai PNS nya
        if (statusPernikahan.equals("Kawin")) {
            jumlahAnggotaKeluarga += 1; // Tambah 1 jumlah keluarga jika status nya kawain
        }

        jumlahAnggotaKeluarga += jumlahAnak;

        // Hitung komponen gaji
        int gajiPokok = kalkulasiGajiPokok(golongan, masaKerja, ruangKerja);
        int tunjanganKeluarga = kalkulasiTunjanganKeluarga(gajiPokok, statusPernikahan);
        int tunjanganAnak = kalkulasiTunjanganAnak(gajiPokok, jumlahAnak);
        int tunjanganBeras = kalkulasiTunjanganBeras(statusPernikahan, jumlahAnak);
        int tunjanganUmum = kalkulasiTunjanganUmumJabatan(golongan);
        int gajiKotor = kalkulasiGajiKotor(gajiPokok, tunjanganKeluarga, tunjanganAnak, tunjanganBeras, tunjanganUmum);
        double potonganPPH = kalkulasiPotonganPPH(gajiPokok, statusPernikahan, gajiKotor, jumlahAnak,
                tunjanganKeluarga, tunjanganAnak);
        double potonganIWP = kalkulasiPotonganIWP(gajiPokok, tunjanganKeluarga, tunjanganAnak);
        int potonganTaperum = kalkulasiPotonganTaperum(golongan);
        double gajiBersih = kalkulasiGajiBersih(gajiKotor, potonganPPH, potonganIWP, potonganTaperum);

        // Output
        displayOutput(nama, gajiPokok, tunjanganKeluarga, tunjanganAnak, tunjanganBeras, tunjanganUmum,
                gajiKotor, potonganPPH, potonganIWP, potonganTaperum, gajiBersih, formatter);
    }

    public static String validationString(Scanner scanner, String message) {
        String result = "";
        String regexHuruf = "^[a-zA-Z ]+$";
        boolean isValid = false;

        do {
            System.out.print(message);
            String input = scanner.nextLine();

            if (input.matches(regexHuruf)) {
                isValid = true;
                result = input;
            } else {
                System.out.println("Input tidak valid. Mohon masukkan hanya huruf (a-z, A-Z) dan spasi.");
            }
        } while (!isValid);

        return result;
    }

    public static int validationGolongan(Scanner scanner, String message) {
        int result = 0;
        boolean isValid = false;

        do {
            System.out.print(message);
            String input = scanner.nextLine();

            try {
                result = Integer.parseInt(input);
                if (result >= 1 && result <= 4) {
                    isValid = true;
                } else {
                    System.out.println("Input tidak valid. Mohon masukkan angka 1 sampai 4.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Mohon masukkan angka 1 sampai 4.");
            }
        } while (!isValid);

        return result;
    }

    public static char validationRuangKerja(Scanner scanner, int golongan, String message) {
        char result = ' ';
        boolean isValid = false;
        char ruangAwal = 'A';
        char ruangAkhir = 'D';

        if (golongan == 4) {
            ruangAkhir = 'E';
        }

        do {
            System.out.print(message + " (" + ruangAwal + "-" + ruangAkhir + ")                     : ");
            String input = scanner.nextLine().toUpperCase(); // Convert input menjadi huruf kapital

            if (input.length() == 1) {
                char ruang = input.charAt(0);
                if (ruang >= ruangAwal && ruang <= ruangAkhir) {
                    result = ruang;
                    isValid = true;
                } else {
                    System.out.println("Input tidak valid. Mohon masukkan huruf " + ruangAwal + " sampai " + ruangAkhir + ".");
                }
            } else {
                System.out.println("Input tidak valid. Mohon masukkan satu karakter saja.");
            }
        } while (!isValid);

        return result;
    }

    public static int validationMasaKerja(Scanner scanner, int golongan, String message) {
        int result = 0;
        boolean isValid = false;
        int maksMasaKerja = 0;

        if (golongan == 1) {
            maksMasaKerja = 27;
        } else if (golongan == 2) {
            maksMasaKerja = 33;
        } else if (golongan == 3 || golongan == 4) {
            maksMasaKerja = 32;
        }

        do {
            System.out.print(message + " (0-" + maksMasaKerja + ")                     : ");
            String input = scanner.nextLine();

            try {
                int masaKerja = Integer.parseInt(input);
                if (masaKerja >= 0 && masaKerja <= maksMasaKerja) {
                    result = masaKerja;
                    isValid = true;
                } else {
                    System.out.println("Input tidak valid. Mohon masukkan angka antara 0 dan " + maksMasaKerja + ".");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Mohon masukkan angka.");
            }
        } while (!isValid);

        return result;
    }

    public static String validationStatusPernikahan(Scanner scanner, String message) {
        String result = "";
        boolean isValid = false;
        String[] statusValid = {"Kawin", "Belum Kawin", "Cerai"};

        do {
            System.out.print(message + " (Kawin/Belum Kawin/Cerai)    : ");
            String input = scanner.nextLine();

            for (String status : statusValid) {
                if (input.equalsIgnoreCase(status)) {
                    result = input;
                    isValid = true;
                    break;
                }
            }

            if (!isValid) {
                System.out.println("Input tidak valid. Mohon masukkan status pernikahan yang benar (Kawin/Belum Kawin/Cerai).");
            }
        } while (!isValid);

        return result;
    }

    public static int validationJumlahAnak(Scanner scanner, String message) {
        int result = 0;
        boolean isValid = false;

        do {
            System.out.print(message + "                           : ");
            String input = scanner.nextLine();

            try {
                result = Integer.parseInt(input);
                if (result >= 0) {
                    isValid = true;
                } else {
                    System.out.println("Input tidak valid. Mohon masukkan angka yang lebih besar dari atau sama dengan 0.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Mohon masukkan angka yang lebih besar dari atau sama dengan 0.");
            }
        } while (!isValid);

        return result;
    }


    public static void displayOutput(String nama, int gajiPokok, int tunjanganKeluarga, int tunjanganAnak,
                                     int tunjanganBeras, int tunjanganUmum, int gajiKotor, double potonganPPH,
                                     double potonganIWP, int potonganTaperum, double gajiBersih, DecimalFormat formatter) {

        System.out.println("\nSlip Gaji PNS");
        System.out.println("Nama Pegawai            : " + nama);
        System.out.println("Gaji Pokok              : " + formatter.format(gajiPokok));
        System.out.println("Tunjangan Keluarga      : " + formatter.format(tunjanganKeluarga));
        System.out.println("Tunjangan Anak          : " + formatter.format(tunjanganAnak));
        System.out.println("Tunjangan Beras         : " + formatter.format(tunjanganBeras));
        System.out.println("Tunjangan Umum Jabatan  : " + formatter.format(tunjanganUmum));
        System.out.println("Gaji Bruto              : " + formatter.format(gajiKotor));
        System.out.println("PPH                     : " + formatter.format(potonganPPH));
        System.out.println("Potongan IWP            : " + formatter.format(potonganIWP));
        System.out.println("Potongan Taperum        : " + formatter.format(potonganTaperum));
        System.out.println("Gaji Take Home Pay      : " + formatter.format(gajiBersih));
    }

}
