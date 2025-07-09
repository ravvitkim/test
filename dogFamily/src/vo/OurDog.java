package vo;

public class OurDog {
  private String kind;
  private String name;
  private String color;
  private int age;

  public OurDog (String kind,String name,String color,int age){
      this.kind = kind;
      this.name = name;
      this.color = color;
      this.age = age;
  }
  public OurDog(){

  }

    public String getKind() {
        return kind;
    }

    public String getName() {
        return this.name;
    }
    public String getColor() {
        return this.color;
    }
    public int getAge() {
        return this.age;
    }


    public String toString(){
      return "Dog{" + "품종=" + kind +"/"+ "개이름=" + name +"/"
              + "색상=" +color+ "/" + "나이=" + age +"}";
    }


    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }
}



//kind 품종 --수정불가
//name 개이름
//color 색상
//age  나이
//생성자:기본생성자.품종을 기본으로 갖는 생성자

//강아지를생성
//마르티즈 코코 흰색 2
//치와와 치치 검정 1
//리트리버 덩치 골드 3
//생성후에 for를 이용해서 출력하기

