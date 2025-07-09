package vo;
//no usages 선언만하고 한번도 안썼다는뜻
public class Coffee {
    private String name;
    private int price;

    //생성자 만들기
    public Coffee(String name, int price) {
        this.name = name;
        this.price = price;
    }

    //기본 생성자 만들기
    public Coffee() {

    }


    @Override
    public String toString() {
        return "Coffee{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    //getter만들기
    public String getName() {
        return this.name;
    }
    public int getPrice() {
        return this.price;
    }

    //setter만들기
    public void setName (String name){
        this.name = name;
    }

    public void setPrice(int price){
        this.price = price;
    }
}
