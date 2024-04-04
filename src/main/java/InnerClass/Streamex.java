package InnerClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Streamex {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(10000);

        Random ran = new Random();

        for (int i = 1; i <= 10000; i++) {


            list.add(ran.nextInt(100));


        }
        //System.out.println(list);


//        int sum = list.stream().map(n -> n * 2).reduce(0, (n1, n2) -> n1 + n2);
//        System.out.println(sum);
           long startSeq= System.currentTimeMillis();
        int sum2=list.stream().map(n-> n*2).mapToInt(n->n).sum();
        System.out.println(sum2);

        long endseq=System.currentTimeMillis();
        long paraseq=System.currentTimeMillis();
        int sum3=list.parallelStream().map(n-> n*2).mapToInt(n->n).sum();
        System.out.println(sum3);
        long paraendseq=System.currentTimeMillis();
        System.out.println("Time taken for sequential"+(startSeq-endseq));
        System.out.println("Time taken for parallel"+(paraseq-paraendseq));

    }
}