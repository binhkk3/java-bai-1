import java.util.Scanner;

public class nga_trong_thang {
    public static void main(String[] args) {
        //int a=0;
        System.out.println("nhập vào tháng muốn tìm : ");
        Scanner thang = new Scanner(System.in);
        int a = thang.nextInt();
        String thang_;
        switch (a) {
            case  1:
            case  3:
            case  5:
            case  7:
            case  8:
            case  10:
            case  12:
                thang_ = "31";
                //System.out.println("tháng " + a + " có 31 ngày ");
                break;
            case 2:
                thang_ ="28";
                //System.out.println("tháng " + a + " có 28 ngày ");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                thang_ ="30";
                //System.out.println("tháng " + a + " có 30 ngày ");
                break;
            default:
                thang_ ="";
                //System.out.println("tháng " + a + " không tồn tại ");


        }
        if( !thang_.equals("")) System.out.println("tháng"+ a+"có"+thang_);
        else System.out.println("không tồn tại");
    }
}
