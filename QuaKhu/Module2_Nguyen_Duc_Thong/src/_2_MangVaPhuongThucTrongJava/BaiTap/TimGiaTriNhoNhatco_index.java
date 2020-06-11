package _2_MangVaPhuongThucTrongJava.BaiTap;

import java.util.Scanner;

public class TimGiaTriNhoNhatco_index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = false;
        int doDai;
        double[] array;
        do {
            System.out.print("Vui long cho biet so cac phan tu : ");
            doDai = scanner.nextInt();
            if (doDai < 20 && doDai > 0) {

                check = true;
            } else {
                System.out.print("Khong hop le !!!");
            }
        } while (!check);
        array = new double[doDai];
        int i = 0;
        do {
            System.out.print("Gia tri phan tu thu " + (i + 1) + " : ");
            array[i] = scanner.nextDouble();
            i++;
        } while (i < doDai);

        timGTLN(array);
    }
    static double timGTLN(double[]array) {
        double min = array[0];
        int dem2=0;
        int dem1=0;
        int[] index;

        for (int i = 0; i <array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if(array[i]==min){
                dem1++;
            }
        }
        String thuTu="";
        index=new int[dem1];
        for (int i = 0; i <array.length; i++){
            if(array[i]==min){
               thuTu+=(i+1)+"  ";
            }
        }
        System.out.print("Co "+dem1+" phan tu co gia tri nho nhat la : "+min+" theo thu tu la phan tu thu :  "+ thuTu);
        return min;
    }
}
