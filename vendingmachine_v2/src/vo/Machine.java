package vo;

public class Machine {
    private int price1=0;
    private String product;
    private int price;
    private int sales = 0;


    public int getPrice1(){
        return this.price1;
    }

    public String getProduct() {
        return this.product;
    }
    public int getPrice() {
        return this.price;
    }

    public int getSales() {
        return this.sales;
    }


    public void setPrice1(int price1){
        this.price1 = price1;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setPrice(int price){
        this.price = price;
    }
    public void setSales(int sales){
        this.sales = sales;
    }

    public void totalPrice(){
        this.price1 = this.price1 - this.price;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "product='" + product + '\'' +
                ", price=" + price +
                ", sales=" + sales +
                '}';
    }





}
