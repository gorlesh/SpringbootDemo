package InnerClass;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Demo1 {

    public static void main(String args[]) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        //list.forEach(n->System.out.println(n));
        //list.forEach(n->System.out.println(n));
        
        Stream<Integer> stream = list.stream();

        Stream<Integer>S2=stream.filter(n->n%2==0);
        Stream <Integer>S3=S2.map(n->n*n);
        int result=S3.reduce(0,(n1,n2)->n1+n2);



        System.out.println(result);

        int result1=list.stream().filter(n->n%2==0).map(n->n*n).reduce(0,(n1,n2)->n1+n2);

        System.out.println(result1);

        Stream<Integer> sortedStream = list.stream().filter(n->n%2==0).sorted();

        sortedStream.forEach(n->System.out.println(n));
        //        for(int i=0;i<list.size();i++){
//            //System.out.println(list.get(i));
//
//        }
//
//        for (Integer i : list) {
//            System.out.println(i);
//        }


      }
}