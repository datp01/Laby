import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    private static long balanceNumber = 1000000;
    List<TransactionHistory> listHistory = new ArrayList<TransactionHistory>();
    Scanner scanner = new Scanner(System.in) ;
    public long getBalanceNumber() {
        return balanceNumber;
    }
    public static long transfer(long money) {
        if (money < 50000) {
            System.out.println("Số tiền tối thiểu phải là 50000");
        } else if (money > balanceNumber) {
            System.out.println("Tài khoản không đủ số dư");
        }else {
            System.out.println("Chuyển khoản thành công | Số dư còn lại là" + (balanceNumber - money));
        }
        return balanceNumber;
    }
    public void actionTransfer(){
        System.out.println("Nhập số tài khoản hưởng thụ");
        long id = scanner.nextLong();
        System.out.println("Nhập số tiền cần chuyển");
        long money = scanner.nextLong();
        transfer(money);
        listHistory.add(new TransactionHistory("","",money));
    }
    public void getHistory(){
       System.out.println(listHistory);
    }
    public static String formatMoney(long money) {
        DecimalFormat formatter = new DecimalFormat("###,###,##0.00");
        //100000->100,000.00
        return formatter.format(money);
    }

}
