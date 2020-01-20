
package ProviderPerson;

import entity.Student;
import java.util.Scanner;


public class ProviderStudent {
        public Student createStudent(){
        Scanner scn=new Scanner(System.in);
        Student student = new Student();
            System.out.println("Имя ученика: ");
            String firstname = scn.nextLine();
            student.setFirstname(firstname);
            System.out.println("Фамилия ученика: ");
            String lastname = scn.nextLine();
            student.setLastname(lastname);
            System.out.println("Возраст ученика: ");
            int age = scn.nextInt();scn.nextLine();
            student.setAge(age);
            System.out.println("Группа ученика: ");
            String group = scn.nextLine();
            student.setGroup(group);
            return student;
        }
}
