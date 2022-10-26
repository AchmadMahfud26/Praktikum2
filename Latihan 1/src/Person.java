public class Person {
    private String nama;
    private String jenisKelamin;
    private int umur;
    // setter
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setJenisKelamin(String jenisKelamin){
        this.jenisKelamin = jenisKelamin;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }
    // getter
    public String getNama() {
        return this.nama;
    }
    public String getJenisKelamin() {
        return this.jenisKelamin;
    }
    public int getUmur() {
        return this.umur;
    }

}
