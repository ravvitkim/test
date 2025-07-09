package memberManagement;

import java.util.Scanner;

public class IveMember {
    static String name[] = new String[6];
    static int age[] = new int[6];
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        //데이터 초기화 하는애호출
        dateInit();
        //멤버를 출력하는 함수 호출
        showMember();
        //메뉴를 보여주는 함수
        showMenu();


        //break for문 빠져나가기
        //return 함수끝냄
        //continue 특정조건만 건너뜀
        //멤버를 관리하는 함수 호출

    }

    private static void showMenu() {

        while (true) {
            System.out.println("1.멤버보기2.멤버추가3.이름수정4.나이수정0.종료");
            int choice = sc.nextInt();
            switch (choice){
                case 0:
                    System.out.println("종료");
                    return;
                case 1:
                    System.out.println("멤버보기");
                    showMember();
                    break; //switch문 빠져나감
                case 2:
                    System.out.println("추가");
                    //추가할 자리있는지 확인
                    int flag = 0;
                    for (int i =0; i< name.length; i++){
                        if (name[i] == null){
                            flag = 1;
                            break;
                        }
                    }
                    if (flag==1){
                        insertMember();
                    }else {
                        System.out.println("자리없음");
                    }
                    break;
                case 3:
                    System.out.println("이름수정");
                    updateName();
                    break;
                case 4:
                    System.out.println("나이수정");
                    break;
                default:
            }
        }
    }

    private static void insertMember() {
        //1.자리잇는지 확인
        //2. 빈자리추가
        System.out.println("새로운 멤버를 추가하는 화면입니다");
        System.out.println("이름입력");
        String newName =sc.next();
        System.out.println(newName+ "의 나이는?");
        int newAge = sc.nextInt();


        //빈자리 추가하기
        for (int i=0; i<name.length; i++){
            if (name[i]==null){
                name[i]= newName;
                age [i]= newAge;
                break; //for문빠져나감
            }
        }
        showMember();
    }


    private static void updateName() {
        showMember();
        System.out.println("멤버 이름을 수정하는 화면입니다.");
        System.out.println("수정할 멤버 번호를 입력하세요");
        int choice = sc.nextInt();
        System.out.println("변경할 이름을 입력하세요");
        String change = sc.next();
        name[choice] = change; //이름수정함
        showMember();//결과값보여주기
    }

    private static void showMember() {
        //멤버보여주기
        for (int i = 0; i< name.length; i++){
            //null이 아닐때만 찍음
            //null이면 for문으로 돌아감
            if (name[i] != null) {
                String memberInfo = i + name[i] + "/" + age[i];
                System.out.println(memberInfo);
            }
        }
    }

    static void dateInit() {
        //데이터 초기화
        name[0] = "안유진";
        name[1] = "장원영";
        age[0] = 21;
        age[1] = 20;
    }
}


//void 쓰는이유?
//new 쓰는이유?
//ctrl shift enter  코드정리
//모든함수는 클래스 안에있어야한다