public class Antondanriko {
    public static void main(String[] args){
        // Object Riko
        Person Riko = new Person();
        
        Riko.setNama("RIKO");
        Riko.setJenisKelamin("Laki-laki");
        Riko.setUmur(21);
        System.out.println("Nama          : " + Riko.getNama());
        System.out.println("Jenis Kelamin : " + Riko.getJenisKelamin());
        System.out.println("Umur          : " + Riko.getUmur());
        

        // Object Anton
        Person Anton = new Person();

        Anton.setNama("Anton");
        Anton.setJenisKelamin("Laki-laki");
        Anton.setUmur(20);
        System.out.println("Nama          : " + Anton.getNama());
        System.out.println("Jenis Kelamin : " + Anton.getJenisKelamin()); 
        System.out.println("Umur          : " + Anton.getUmur());
    }
}
