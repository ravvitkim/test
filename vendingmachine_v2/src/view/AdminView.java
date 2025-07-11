package view;

import main.MachineMain;
import service.AdminService;

import java.util.Scanner;

public class AdminView {
    private AdminService adminService = new AdminService();
    private UserView userView = new UserView();
    private Scanner sc = new Scanner(System.in);
    public void adminScreen(){
        System.out.println(" 1.메뉴 등록 2.메뉴 삭제 3.메뉴 수정 4. 재고 등록 5. 전체목록보기 6. 이전=>");
        while (true) {
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    adminService.menuInsert();
                    break;
                case 2:
                    adminService.menuDelete();
                    break;
                case 3:
                    adminService.menuUpdate();
                    break;
                case 4:
                    adminService.stockInsert();
                    break;
                case 5:
                    userView.userScreen();
                    break;
                case 6:
                    return;

            }

        }    }
}
