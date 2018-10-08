package biodata;

/**
 * Praktikum 5
 * User Defined Class
 *
 */


public class User {

    private String NIM, Nama, Fakultas, Prodi, Angkatan;

    public User(String nim, String nama, String fakultas, String prodi, String angkatan) {
        NIM = nim;
        Nama = nama;
        Fakultas = fakultas;
        Prodi = prodi;
        Angkatan = angkatan;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getFakultas() {
        return Fakultas;
    }

    public void setFakultas(String Fakultas) {
        this.Fakultas = Fakultas;
    }

    public String getProdi() {
        return Prodi;
    }

    public void setProdi(String Prodi) {
        this.Prodi = Prodi;
    }

    public String getAngkatan() {
        return Angkatan;
    }

    public void setAngkatan(String Angkatan) {
        this.Angkatan = Angkatan;
    }

    public Object getObject(int index) {
        switch (index) {
            case 0:
                return NIM;
            case 1:
                return Nama;
            case 2:
                return Fakultas;
            case 3:
                return Prodi;
            case 4:
                return Angkatan;
            default:
                return null;
        }
    }

}
