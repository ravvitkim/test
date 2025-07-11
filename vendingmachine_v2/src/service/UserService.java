package service;

public class UserService {
    public void orderSuccess(){
        System.out.println(" cola출력 완료, 남은 돈 : 4300 , 재고 : 2");

    }

}
//public void orderSuccess(int orderNumber) {
//        System.out.println("주문이 완료 되었습니다");
//        Coffee orderCoffee = CoffeeMain.coffeeList.get(orderNumber);
//        String orderMenu = orderCoffee.getProduct();
//        System.out.println(orderMenu + "를 받아가세요");
//        //판매금액 누적하기
//        orderCoffee.sumPrice();
//        System.out.println(orderCoffee);
//    }