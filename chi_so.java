import java.util.Scanner;

public class chi_so {
    public static void main(String[] args) {
        System.out.println("nhập vào chỉ số CHIỀU CAO của bạn là theo đơn vị mét :");
        Scanner scanner = new Scanner(System.in);
       float chieu_cao = scanner.nextInt();
        System.out.println("nhập vào chỉ số CAN NẶNG :");
        //Scanner scanner1 = new Scanner(System.in);
        float can_nag = scanner.nextInt();

        float chi_so = can_nag/(chieu_cao*chieu_cao);
        if(chi_so>30){
            System.out.println("bạn quá béo");
            return;
        }
        if (chi_so>25){
            System.out.println("bạn hơi mập ");
            return;
        }
        if(chi_so>18){
            System.out.println("BẠN CÂN ĐỐI");
            return;
        }
        if (chi_so<18){
            System.out.println("BẠN QUÁ GẦY");
            return;
        }

    }
}
