package main;
//5000 1000 500 100
import service.AdminService;
import service.UserService;
import view.AdminView;
import view.UserView;
import vo.Machine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MachineMain {
    public static Scanner sc = new Scanner(System.in);
    public static List<Machine> menuList = new ArrayList<>();
    public static int coin = 0;

    public static void main(String[] args) {
        UserView userView = new UserView();
        AdminView adminView = new AdminView();
        AdminService adminService = new AdminService();
        UserService userService = new UserService();

        while (true){
            System.out.println("1.동전 투입 2. 잔돈 반환 3. 메뉴 선택 4. 관리자 메뉴 5. 종료=>");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    moneyInit();
                    break;
                case 2:
                    refundCoin();
                    coin = 0;
                    break;
                case 3:
                    userView.userScreen();
//                    if(userView.userScreen() == null){
//                        System.out.println("현재 자판기에 상품이 없습니다.");
//                    }else {
//                        userView.userScreen();
//                    }
                    break;
                case 4:
                    adminView.adminScreen();
                    break;
                case 5:
                    return;
        }
    }
}



    private static void refundCoin() {
        System.out.println( coin +"원 반환완료");
        System.out.println("사용 가능 금액: ");
    }

    private static void moneyInit() {
        System.out.println("돈을 넣어주세요");
        System.out.println("1: 5,000원, 2: 1,000원, 3: 500원, 4:100원");
        int num = sc.nextInt();
        switch (num){
            case 1:
                coin = coin + 5000;
                System.out.println("투입금액 : 5000원");
                System.out.println("사용가능금액 : " + coin + "원" );
                break;
            case 2:
                coin = coin + 1000;
                System.out.println("투입금액 : 1000원");
                System.out.println("사용가능금액 : " + coin + "원" );
                break;
            case 3:
                coin = coin + 100;
                System.out.println("투입금액 : 100원");
                System.out.println("사용가능금액 : " + coin + "원" );
        }
    }
    }




