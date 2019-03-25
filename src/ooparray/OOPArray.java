package ooparray;

public class OOPArray {
    public static void main(String[] args) {
        //int array dibatasi 10
        int[] intArray = new int[10];
        intArray = new int[]{23, 16, 85, 45, 40, 8, 23, 84, 48, 10};
        
        //cara menampilkan array
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Posisi " + i +" = "+ intArray[i]);
        }     
        
        //cara kedua
        int[] newIntArray = new int[5];
        newIntArray[0] = 84;
        newIntArray[1] = 23;
        newIntArray[2] = 10;
        newIntArray[3] = 5;
        newIntArray[4] = 8;
        
        for (int i = 0; i < newIntArray.length; i++) {
            System.out.println("Posisi " + i + " = " + newIntArray[i]);
        }     
        
        //array tipe String
        String[] nama = new String[5];
        
        nama[0] = "dinda";
        nama[1] = "budi";
        nama[2] = "michael";
        nama[3] = "jonathan";
        nama[4] = "roby";
        
        for (int i = 0; i < nama.length; i++) {
            System.out.println("Posisi " + i + " = " + nama[i]);
        }    
        
        //array tipe object
        Siswa[] arrSiswa = new Siswa[5];
        
        arrSiswa[0] = new Siswa("001", "Andi", "AP");
        arrSiswa[1] = new Siswa("002", "Budi", "KA");
        arrSiswa[2] = new Siswa("003", "Diana", "TI");
        arrSiswa[3] = new Siswa("004", "Rahmat", "AP");
        arrSiswa[4] = new Siswa("005", "Triadi", "IK");
        
        for (int i = 0; i < nama.length; i++) {
            System.out.println("Posisi: " + i 
                                + " id = " + arrSiswa[i].getId()
                                + " nama = " + arrSiswa[i].getNama()
                                + " kelas = " + arrSiswa[i].getKelas());            
        }   
        
        //array multidimensi
        //2D Array
        int[][] a= {{2, 3, 5, 7},{10, 23, 5, 11},{7, 0, 12, 8}};
               
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {        
                System.out.print(a[i][j] + " ");
            }
            
            System.out.println();
        }
//        
//        System.out.println(a[0][0]);
//        System.out.println(a[0][1]);
//        System.out.println(a[0][2]);
//        System.out.println(a[1][0]);
//        System.out.println(a[1][1]);
//        System.out.println(a[1][2]);
//        System.out.println(a[1][3]);
//        System.out.println(a[2][0]);
//        System.out.println(a[2][1]);
    }    
}
