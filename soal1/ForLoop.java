package soal1;

public class ForLoop {
    public static void main(String[] args) {
        int hasil = 0;
        int[] arr = {1,4,2,6,3,2};
        for(int i = 0; i < arr.length; i++){
            hasil += arr[i];
        }
        System.out.println("Hasil jumlah elemen array = " + hasil);
    }
}
