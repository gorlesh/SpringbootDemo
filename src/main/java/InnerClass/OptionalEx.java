package InnerClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Student1{

    private String name;
    private int age;

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Student1(String name) {
        this.name = name;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "student{" + "age=" + age +
                "name='" + name + '\'' +
                '}';
    }
}

public class OptionalEx {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Navin", "Boe", "Cat", "Deed");

       List<Student1> students= new ArrayList<>();
//
//        for (String name:list){
//            students.add(new Student1(name, name.length()));
//        }
//
//        System.out.println(students);

       // students=list.stream().map(name->new Student1(name,name.length())).toList(); //Constructor Reference
        students=list.stream().map(Student1::new).toList();

        System.out.println(students);

//        List<String> uNames= list.stream().map(name->name.toUpperCase()).toList(); // Method Reference
//
//        List<String> uNames1= list.stream().map(String::toUpperCase).toList();
//
//        uNames1.forEach((n-> System.out.println(n)));
//        uNames.forEach(System.out::println);
//
//
//        Optional <String> name=list.stream().filter(s->s.startsWith("N")).findFirst();
//
//       String name1=list.stream().filter(s->s.startsWith("S")).findFirst().orElse("Not Found");
//
//        System.out.println(name1);
//        System.out.println(name.orElse("Not Found"));


    }
}