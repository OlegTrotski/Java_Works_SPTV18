
package ProviderPerson;

import entity.History;
import entity.Student;
import entity.Teacher;
import entity.Rating;
import entity.Subject;
import java.util.List;
import java.util.Scanner;


public class ProviderHistory {
    public History createHistory(List<Teacher>teachers, List<Student>students, List<Subject>subjects, List<Rating>ratings) {
        Scanner scn=new Scanner(System.in);
        History history = new History();
            System.out.println("Ученик: ");
            for (int i = 0; i < students.size(); i++) {
                Student student = students.get(i);
                System.out.println(i+1+". "+student.toString());
            }
            System.out.println("Учитель: ");
            int numteacher = scn.nextInt();
            history.setTeacher(teachers.get(numteacher-1));
            System.out.println("Предмет: ");
            for (int i = 0; i < subjects.size(); i++) {
                Subject subject = subjects.get(i);
                System.out.println(i+1+". "+subject.toString());
            }
            System.out.println("Предмет: ");
            int numsubjects = scn.nextInt();
            history.setSubject(subjects.get(numsubjects-1));
            
            System.out.println("Оценка: ");
            int numrating = scn.nextInt();
            for (int i = 0; i < ratings.size(); i++) {
                Rating rating = ratings.get(i);
                System.out.println(i+1+". "+rating.toString());
            }
        return history;
    }
}
