import java.util.Date;

public class Main{
    public static void main(String[] args) {
        System.out.println("Hello I am Java Programmer");
        System.out.println("This code is running on jdk 21");
        System.out.println("Thank You For Choosing Java as Programming Language");
        System.out.println("Current Date : " + new Date());
        System.out.println("Starting of the Jenkins World");

        Person p = new Student("Gaurav", "X", 18);
        p.personType();

        System.out.println("Person Name : " + p.getName());

        System.out.println("Person Type : " + p.getPersonType());
    }
}