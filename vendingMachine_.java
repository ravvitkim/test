import java.util.Scanner;


public class vendingMachine_ {
    //전체적으로 자주 사용하는 변수와 배열을 선언
    public static Scanner sc = new Scanner(System.in);
    //전체 제품수
    static final int COUNT = 5;
    //배열을 선언
    //제품명, 가격, 재고, 판매금액
    static String[] product = new String[COUNT];//제품명
    static int[] price = new int[COUNT];//가격
    static int[] stock = new int[COUNT];//재고
    static int[] sales = new int[COUNT]; // 판매금액
    static int lastPrice = 0;
    static  int choice = 0;

    static void dataInitialize(){
        product[0] = "coke";
        price[0] = 500;
        stock[0] = 3;

        product[1] = "cider";
        price[1] = 700;
        stock[1] = 3;

        product[2] = "coffee";
        price[2] = 1500;
        stock[2] = 3;
    }

    public static void main(String[] args) {
        //데이터 초기화 함수 호출하기
        dataInitialize();
        mainMenu();
    }

    private static void mainMenu() {
        while (true){

            //판매정보 얻어오기
            getInfo();

//            System.out.println("1:제품1(100W)-3개 2:제품2-1개 3:제품3-1개");
            System.out.println("=================");
            System.out.println("돈을 넣어주세요");
            int choice = sc.nextInt();
            //1004인 경우 관리자 메뉴로 갑니다.
            if (choice == 1004){
                admin();
            }else if (choice<500){
                System.out.println("다시입력");
            }else {
                lastPrice += choice;
                userMenu();
            }
        }
    }

    private static void getInfo() {
        System.out.println("=================");
        System.out.println("자판기입니다.(번호:상품(가격)-재고");
        System.out.println("1:콜라(500W)-3개 2:사이다(700W)-3개 3:커피(1500W)-3개");

    }

    private static void userMenu() {
        //System.out.println("사용자 페이지");
        int num = 0;

        while (true){
            System.out.println("메뉴입력:");
            num = sc.nextInt();

            switch (num) {
                case 1:
                    if (choice>=500) {
                        System.out.println("콜라이(가) 나왔다!");
                    }else {
                        System.out.println("잔액부족");
                    }
                    break;
                case 2:
                    if (choice>=700) {
                        System.out.println("사이다가 나왔다!");
                    }else {
                        System.out.println("잔액부족");
                    }
                    break;
                case 3:
                    if (choice>=1500) {
                        System.out.println("커피가 나왔다!");
                    }else {
                        System.out.println("잔액부족");
                    }
                    break;
                default:
                    System.out.println("다시입력");
                    continue;
            }
            break;

        }
        System.out.println("잔액:"+lastPrice);


        while (true) {
            System.out.println(" 1:계속구매하기 2:금액추가하기 3:잔돈반환하기");
            int addNumber = sc.nextInt();
            switch (addNumber){
                case 1:
                    if (addNumber+lastPrice>500){
                        userMenu();
                    }else {
                        System.out.println("잔액이 부족합니다.");
                    }
                    break;
                case 2:
                    int addMoney = sc.nextInt();
                    System.out.println("금액이 추가 되었습니다! 잔액:"+ (addMoney+lastPrice));
                    mainMenu();
                    break;
                case 3:
                    System.out.println("거스름 돈" +lastPrice + "원이 반환 됩니다." + "감사합니다! 다음에 또 이용해주세요!!");
                    return;
                default:
                    System.out.println("다시입력");
                    continue;
            }
        }


        //처리순서
        //유저메뉴에는 금액 입력값이 0원 이상인것을 설정
        //           (입력한금액- 선택한 메뉴의 값)을 저장
        //
        //금액을 입력했을때 getInfo로 가서 번호를 선택해야함
        // 선택후 금액>선택한메뉴값 이면 1.계속 구매하기 2.금액추가하기 3.잔돈반환하기를 선택하는 칸이나와야함
        // 금액<선택한 메뉴값이면 "잔액이 부족합니다" 출력후 잔액 나오게하기
        //그 다음 1.계속 구매하기 2.금액추가하기 3.잔돈반환하기를 선택하는 칸이나와야함
        //


    }

    private static void admin() {
        while (true){
            System.out.println("관리자 메뉴입니다.");
            System.out.println("1:메뉴변경 2:가격변경 3:재고추가 4:메뉴추가 5:수익확인");
            System.out.println("번호를 입력하세요:");
            int choice = sc.nextInt();
            //입력한 번호에 따라서 분기
            switch (choice){
                case -1: //종료
                    System.out.println("메인으로 돌아가여");
                    return;
                case 1: //메뉴변경
                    updateMenu();
                    break;
                case 2: //가격변경
                    updatePrice();
                    break;
                case 3: //재고추가
                    updateStock();
                    break;
                case 4: //메뉴추가
                    addMenu();
                    break;
                case 5: // 수익확인
                    salesConfirm();
                    break;
                default:
                    System.out.println("잘 못 입력했어요.");
                    continue;
            }
        }
    }

    private static void salesConfirm() {
        //매출확인
        System.out.println("매출확인 페이지");
    }

    private static void addMenu() {
        //메뉴추가
        System.out.println("메뉴 추가 페이지");
    }
    private static void updateStock() {
        //재고 추가
        System.out.println("재고 추가 페이지");
    }

    private static void updatePrice() {
        //가격 수정
        System.out.println("가격 수정 페이지");
    }

    private static void updateMenu() {
        //메뉴 수정
        System.out.println("메뉴 수정 페이지");
    }
}



//1. 사용자페이지 만들기
//2. 관리자 페이지 만들기