public class Tendik extends Karyawan {
    public int waktu;

    public Tendik(int nip, String newName, String newAlamat, String newLahir, String newJensiKelamin,
            int newTahunMasuk) {
        this.nomorPegawai = nip;
        this.nama = newName;
        this.alamat = newAlamat;
        this.lahir = newLahir;
        this.jenisKelamin = newJensiKelamin;
        this.tahunMasuk = newTahunMasuk;
    }

    void display() {
        System.out.println("Nomor Pegawai\t: " + this.nomorPegawai);
        System.out.println("Nama\t\t\t: " + this.nama);
        System.out.println("Alamat\t\t\t: " + this.alamat);
        System.out.println("Lahir\t\t\t: " + this.lahir);
        System.out.println("Jenis Kelamint\t: " + this.jenisKelamin);
        System.out.println("Tahun Masuk\t\t: " + this.tahunMasuk);
        System.out.println("Gaji Pokok\t\t: Rp." + this.gaji);
    }

    void displaygaji() {
        System.out.println("Waktu Lembur    : " + this.tampilinWaktuLembur() + " Jam");
        System.out.println("Gaji Setelah Bonus Lembur : " + this.getLembur());
    }
}
