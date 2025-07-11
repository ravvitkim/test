package view;

import service.UserService;
import main.MachineMain;
import java.util.Scanner;

public class UserView {

    private UserService userService = new UserService();
    private Scanner sc = new Scanner(System.in);

    public void userScreen() {
        System.out.println("고객 화면");
        viewMenu();
        System.out.println("주문할 메뉴입력");
        String orderMenu = sc.next();
        userService.orderSuccess(orderMenu);
    }


    public void viewMenu(){
        System.out.println("=======메뉴==========");
        for (int i = 0; i< MachineMain.menuList.size(); i++){
            System.out.printf("index = " + i + "/");
            System.out.println(MachineMain.menuList.get(i));
        }
        System.out.println("===================");
    }
}
