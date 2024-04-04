package InnerClass;

@FunctionalInterface
interface A{
    int add(int i,int j);
}

//class B implements A{
//    public void show(){
//        System.out.println("in B");
//    }
//}
public class SAM {

    public static void main(String[] args) {

     A obj= new A() {
            @Override
            public int add(int i, int j) {

            return (i-j);
            }
        };

     A obj1=(i,j)-> i+j;



          int result=obj.add(5,4);
    System.out.println(result);
    }
}
