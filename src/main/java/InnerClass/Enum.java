package InnerClass;


enum Laptop1{

    Macbook(2000,2),HP(1000),Dell(1050),Lenovo(2500),Asus(3000);
private int price;
private int ram;

    Laptop1(int price,int ram) {
        this.price=price;
        this.ram=ram;
    }

    Laptop1(int price) {
        this.price=price;
        this.ram=4;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
public class Enum {

    public static void main(String args[]){

      Laptop1 lap=Laptop1.Macbook;
        System.out.println(lap);
        System.out.println(lap.getPrice());

        for (Laptop1 l:Laptop1.values())
        {
            System.out.println(l);
            System.out.println(l.getPrice());
        }

    }
}
