package ProviderPerson;

import entity.Teacher;
import java.util.Scanner;

public class ProviderTeacher {
    public Teacher createTeacher(){
        Scanner scn=new Scanner(System.in);
        Teacher teacher = new Teacher();
            System.out.println("Имя учителя: ");
            String firstname = scn.nextLine();
            teacher.setFirstname(firstname);
            System.out.println("Фамилия учителя: ");
            String lastname = scn.nextLine();
            teacher.setLastname(lastname);
            System.out.println("Предпродаёт группу: ");
            String subject = scn.nextLine();
            teacher.setSubject(subject);
        return teacher;
    }
}
