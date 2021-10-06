import java.util.Scanner;

public class nam_nhuan {
    public static void main(String[] args) {
        System.out.println("nhập năm bạn muốn kiểm tra");
        Scanner a = new  Scanner(System.in);
        int nam = a.nextInt();
        if(nam % 4 == 0){
            if(nam %100 == 0){
                System.out.println(nam +" không phải năm nhuận");
            }
            else {
                System.out.println(nam +" là năm nhuận");
            }
        }
        else System.out.println(nam + " không phải năm nhuận");

    }
}
