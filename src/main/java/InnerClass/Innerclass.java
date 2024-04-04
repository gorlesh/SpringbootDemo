package InnerClass;


interface computer{

 void code();
}
class Laptop implements computer{
    @Override
    public void code()
    {
        System.out.println("Coding");
    }
}
class desktop implements computer{
    @Override
    public void code() {
        System.out.println("Coding");

    }
}
 class Developer{

     public void devapp(computer lap){
         lap.code();
     }
 }

public class Innerclass {

    public static void main(String[] args) {

       computer lap=new Laptop();
       computer desk=new desktop();
        Developer navin=new Developer();
        navin.devapp(lap);
        navin.devapp(desk);

    }
}
