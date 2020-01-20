
package sptv18school;

import ProviderPerson.ProviderHistory;
import ProviderPerson.ProviderStudent;
import ProviderPerson.ProviderSubject;
import ProviderPerson.ProviderTeacher;
import entity.History;
import entity.Rating;
import entity.Student;
import entity.Subject;
import entity.Teacher;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class App {
    List<History> historys = new ArrayList<>();
    List<Rating> ratings = new ArrayList<>();
    List<Student> students = new ArrayList<>();
    List<Subject> subjects = new ArrayList<>();
    List<Teacher> teachers = new ArrayList<>();
    SaverToFile saverToFile;
    public App() {
        saverToFile=new SaverToFile();
        historys.addAll(saverToFile.loadHistory());
        students.addAll(saverToFile.loadStudent());
        subjects.addAll(saverToFile.loadSubject());
        teachers.addAll(saverToFile.loadTeacher());
        
    }
    public void run() throws IOException{
        System.out.println("--- Школьное образование SPTV18 ---");
        boolean repeat = true;
        do{
            System.out.println("0. Выход с программы");
            System.out.println("1. Добавить ученика");
            System.out.println("2. Добавить учителя");
            System.out.println("3. Добавить предмет");
            System.out.println("4. Вывести список учеников");
            System.out.println("5. Вывести список учителей");
            System.out.println("6. Вывести список предметов");
            System.out.println("7. Выставить оценку ученику по определенному предмету.");
            System.out.println("8. Список всей информации");


            System.out.println("Выбери номер задачи: ");
            Scanner scanner = new Scanner(System.in);
            int task = scanner.nextInt();scanner.nextLine();
            switch (task) {
                case 0:
                    System.out.println("Программа закрывается");
                    repeat=false;
                    break;
                case 1:
                    ProviderStudent providerStudent=new ProviderStudent();
                    Student student=providerStudent.createStudent();
                    students.add(student);
                    saverToFile.saveStudent(students);
                    System.out.println("Ученик инициирован: "+student.toString());
                    break;
                case 2:
                    ProviderTeacher providerTeacher=new ProviderTeacher();
                    Teacher teacher=providerTeacher.createTeacher();
                    teachers.add(teacher);
                    saverToFile.saveTeacher(teachers);
                    System.out.println("Учитель инициирован: "+teacher.toString());
                    break;
                case 3:
                    ProviderSubject providerSubject=new ProviderSubject();
                    Subject subject=providerSubject.createSubject();
                    subjects.add(subject);
                    saverToFile.saveSubject(subjects);
                    System.out.println("Предмет инициирован: "+subject.toString());
                    break;
                case 4:
                    saverToFile.saveStudent(students);
                     System.out.println("Список учеников:");
                    for (int i = 0; i < students.size(); i++) {
                        student = students.get(i);
                        System.out.println(i+1+". "+student.toString());
                    }
                case 5:
                    System.out.println("Список учителей:");
                    for(int i=0;i<teachers.size();i++){
                        teacher = teachers.get(i);
                        System.out.println(i+1+". "+teacher.toString());
                    }
                    break;
                case 6:
                    System.out.println("Список предметов:");
                    for(int i=0;i<subjects.size();i++){
                        subject = subjects.get(i);
                        System.out.println(i+1+". "+subject.toString());
                    }
                    break;
                 case 7:
                     ProviderHistory providerHistory = new ProviderHistory();
                     History history = providerHistory.createHistory(teachers,students,subjects,ratings);
                     historys.add(history);
                     saverToFile.saveHistory(historys);
                     System.out.println("Оценка выполнена");
                     System.out.println(history.toString());
                    break;
                     case 8:
                         System.out.println("Список всего: ");
                         for(int i = 0; i < historys.size(); i++) {
                         history = historys.get(i);
                         System.out.println(i + 1 + ". " +history.toString());
                     }
                    break;
            }   
        }while(repeat);
    }
}
