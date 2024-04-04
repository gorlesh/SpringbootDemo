package InnerClass;

import java.util.*;

class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }


    public String toString() {
        return "student{" + "age=" + age +
                "name='" + name + '\'' +
                '}';
    }




}
public class Sometrail {

    public static void main(String[] args) {
        System.out.println("Hello World");

//        Map<String,Integer>students=new HashMap<>();
//
//        students.put("Rahul", 45);
//        students.put("Rohit", 55);
//        students.put("Raj", 65);
//        students.put("Ravi", 75);
//
//       students.remove("Rahul");
//       students.replace("Rohit", 65);
//
//
//        for (String key:students.keySet())
//        {
//            System.out.println(key);
//            System.out.println(students.get(key));
//        }


        List<Student> studs = new ArrayList<>();
        //Set<Integer> nums=new TreeSet<Integer>();
        studs.add(new Student(23, "Rahul"));
        studs.add(new Student(28, "Rohit"));
        studs.add(new Student(29, "Raj"));
        studs.add(new Student(26, "Ravi"));



        Comparator<Student> com = (str,str1) -> str.age > str1.age ?1:-1;

        Comparator<Student> com1 = new Comparator<Student>() {

            public int compare(Student o1, Student o2) {
                if (o1.age > o2.age)
                    return 1;
                else
                    return -1;

            }

        };
// Iterator<Integer>values= nums.iterator();
//    while(values.hasNext()) {
//        System.out.println(values.next());
//    }

        Collections.sort(studs,com);


        System.out.println(studs);
   }
}
