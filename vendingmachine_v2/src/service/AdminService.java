package service;

import main.MachineMain;
import view.UserView;
import vo.Machine;

import java.util.Scanner;

public class AdminService {
    private UserView userView = new UserView();
    private Scanner sc = new Scanner(System.in);

    public void menuInsert() {
        System.out.println("자판기 메뉴 등록");
        userView.viewMenu();

        //새로운 메뉴 입력받기
        System.out.println("제품 이름을 입력하세요");
        String newProduct = sc.next();
        System.out.println("제품의 가격?(숫자만 입력)");
        int newPrice = sc.nextInt();
        System.out.println("재고 등록(채울 개수)");
        int insertstock = sc.nextInt();

        Machine machine = new Machine();
        machine.setProduct(newProduct);
        machine.setPrice(newPrice);
        machine.setSales(insertstock);

        MachineMain.menuList.add(machine);
        System.out.println("---------");
        userView.viewMenu();


    }

    // //해당 인덱스의 객체 얻어오기
    //
    //        Coffee coffee = CoffeeMain.coffeeList.get(updateNum);
    //        coffee.setPrice(updatePrice);
    //        CoffeeMain.coffeeList.set(updateNum,coffee);
    //        userView.viewMenu();


    public void menuDelete() {

        System.out.println("삭제할 제품명 입력 : ");
        String deleteName = sc.next();
        Machine machine = MachineMain.menuList.get(Integer.parseInt(deleteName));


    }

    public void menuUpdate() {
        userView.viewMenu();
        System.out.println("수정 할 제품명 입력");
        String newProduct = sc.next();
        System.out.println("(수정) 메뉴 이름?");
        String updateMenu = sc.next();
        System.out.println("(수정) 메뉴 가격 ?(숫자만 입력)");
        int updatePrice = sc.nextInt();
        System.out.println("(수정) 재고 수량?(숫자만 입력)");
        int updateStock = sc.nextInt();

        Machine machine = MachineMain.menuList.get(Integer.parseInt(newProduct));
        machine.setProduct(updateMenu);
        machine.setPrice(updatePrice);
        machine.setSales(updateStock);
        MachineMain.menuList.set(Integer.parseInt(newProduct),machine);

    }

    public void stockInsert() {
        userView.viewMenu();
        System.out.println("재고를 수정 할 제품명 입력");
        String correctProduct = sc.next();
        System.out.println("(수정) 재고 수량?(숫자만 입력)");
        int correctStock = sc.nextInt();

        Machine machine = MachineMain.menuList.get(Integer.parseInt(correctProduct));
        machine.setProduct(correctProduct);
        machine.setSales(correctStock);
        MachineMain.menuList.set(Integer.parseInt(correctProduct),machine);
    }
}
