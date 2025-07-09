package main;


import vo.OurDog;

public class DogMain {
    public static void main(String[] args) {
        OurDog moltese = new OurDog();
        moltese.setKind("마르티즈");
        moltese.setName("코코");
        moltese.setColor("흰색");
        moltese.setAge(2);


        OurDog chiwawa = new OurDog();
        chiwawa.setKind("치와와");
        chiwawa.setName("치치");
        chiwawa.setColor("검정");
        chiwawa.setAge(1);

        OurDog retriever = new OurDog();
        retriever.setKind("리트리버");
        retriever.setName("덩치");
        retriever.setColor("골드");
        retriever.setAge(3);

        // 품종 수정불가???? setter 없애 getter만 있어야돼


        OurDog[] dogs = new OurDog[3];
        dogs[0]= moltese;
        dogs[1]= chiwawa;
        dogs[2]= retriever;

        for (int i = 0; i< dogs.length; i++){
            System.out.println(dogs[i].toString());
        }
        System.out.println("================================");

        dogs[0].setAge(5);
        dogs[2].setName("망치");

        for (int j = 0; j< dogs.length; j++){
            System.out.println(dogs[0]);
            System.out.println(dogs[2].toString());
        }



    }
}
