package InnerClass;

import java.util.Arrays;
import java.util.List;

class Demo1 {

    public static void main(String args[]) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.forEach(n->System.out.println(n));
        list.forEach(n->System.out.println(n));



        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));

        }

        for (Integer i : list) {
            System.out.println(i);
        }


      }
}