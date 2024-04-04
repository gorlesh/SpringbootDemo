package InnerClass;
class SuperClass {
    private void display() {
        System.out.println("SuperClass display()");
    }
}

class SubClass extends SuperClass {
    public void display() {
        System.out.println("SubClass display() 123");
    }
}

public class TestingQuiz {
    public static void main(String[] args) {
        char chars[] = {'a', 'b', 'c', 'd', 'e', 'f'};

        String str = new String(chars,1,3);

        System.out.println(str);
    }
}
