import java.util.Scanner;

public class dien_tich_chu_nhat {

    public static void main(String[] args) {
float dai;
float rong;
        Scanner b = new Scanner(System.in);
        System.out.println("nhập vào  chiều dài ");
        dai = b.nextFloat();
        System.out.println("chiều rộng ");
        rong = b.nextFloat();
        float Dien_tich = dai*rong;
        System.out.println("diện tích là " + Dien_tich);
    }
}
