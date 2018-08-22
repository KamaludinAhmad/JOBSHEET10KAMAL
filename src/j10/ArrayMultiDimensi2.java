package j10;

public class ArrayMultiDimensi2 {
    
    public static void main(String[] args) {
        
        int nis [] [] = {{210651},{210651},{210652}};
        String nama [] [] ={{"Kamaludin"},{"Ahmad"},{"Salsabila"}};
        ArrayMultiDimensi2 siswa = new ArrayMultiDimensi2();
        siswa.tampil(null);
        ArrayMultiDimensi2.namanis(0);
        
    }
    public void tampil(String n) {
        
        System.out.println("Identitas Siswa Angkatan 27");
    }
    public static void namanis (int n) {
        
        for (int i=0; i<1; i++){
        for (int j=0; j<1; j++){
             int nis [] [] = {{210651},{210651},{210652}};
            String nama [] [] ={{"Kamaludin"},{"Ahmad"},{"Salsabila"}};
        System.out.println(nama[0][j]+" : "+nis[0][j]);
        System.out.println(nama[1][j]+" : "+nis[1][j]);
        System.out.println(nama[2][j]+" : "+nis[2][j]);
        }
        }
    }
    
}
