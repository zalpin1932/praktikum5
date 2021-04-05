class siswa {
    private String nim;
    private String nama;
    protected String teori;
    protected String praktik;
 
    public String getNim() {
        return nim;
    }
 
    public void setNim(String nim) {
        this.nim = nim;
    }
 
    public String getNama() {
        return nama;
    }
 
    public void setNama(String nama) {
        this.nama = nama;
    }
 
    public String getTeori() {
        return teori;
    }
 
    public void setTeori(String teori) {
        this.teori = teori;
    }
 
    public String getPraktik() {
        return praktik;
    }
 
    public void setPraktik(String praktik) {
        this.praktik = praktik;
    }
 
}

    public class mahasiswa{
    public static void main(String[] buaya) {
        siswa objekKelas_1 = new siswa();
        objekKelas_1.setNim("1");
        objekKelas_1.setNama("Ghiyatsi");
        objekKelas_1.setTeori("90");
        objekKelas_1.setPraktik("95");
 
        siswa objekKelas_2 = new siswa();
        objekKelas_2.setNim("2");
        objekKelas_2.setNama("Anis");
        objekKelas_2.setTeori("90");
        objekKelas_2.setPraktik("85");

        String nim_1 = objekKelas_1.getNim();
        String nama_1 = objekKelas_1.getNama();
        String teori_1 = objekKelas_1.getTeori();
        String praktik_1 = objekKelas_1.getPraktik();
 
        String nim_2 = objekKelas_2.getNim();
        String nama_2 = objekKelas_2.getNama();
        String teori_2 = objekKelas_2.getTeori();
        String praktik_2 = objekKelas_2.getPraktik();
 
        System.out.println("NIM  : " + nim_1);
        System.out.println("Nama  : " + nama_1);
        System.out.println("Teori  : " + teori_1);
        System.out.println("Praktek  : " + praktik_1);

        System.out.println("NIM  : " + nim_2);
        System.out.println("Nama  : " + nama_2);
        System.out.println("Teori  : " + teori_2);
        System.out.println("Praktek  : " + praktik_2);
 
 
    }
}