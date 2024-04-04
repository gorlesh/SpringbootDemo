package InnerClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.*;
import java.util.Scanner;

class NewException extends RuntimeException{
    public NewException(String s){
        super(s);
    }
}
class Ac {
    public void show() throws ClassNotFoundException{

            Class.forName("calc");

    }
}
public class Trial {
    public static void main(String[] args) {
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            int num = Integer.parseInt(br.readLine());
            System.out.println(num);

            br.close();


            Scanner sc = new Scanner(System.in);

            int num1 = sc.nextInt();
            System.out.println(num1);

        }
        catch(Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Finally");
        }
    }
}
