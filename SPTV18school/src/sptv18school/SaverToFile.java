
package sptv18school;

import entity.History;
import entity.Rating;
import entity.Student;
import entity.Subject;
import entity.Teacher;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SaverToFile {
    
    public void saveHistory(List<History>Historys) throws IOException{
        FileOutputStream fileOutputStream=null;
        ObjectOutputStream objectOutputStream=null;
        try {
            fileOutputStream=new FileOutputStream("history.txt");
            objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(Historys);
            objectOutputStream.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName())
                .log(Level.SEVERE,"Файла history.txt не существует",ex);
        }catch(IOException ex){
            Logger.getLogger(SaverToFile.class.getName())
                    .log(Level.SEVERE,"Проблема записи в history.txt");
        }
    }
    public List<History> loadHistory(){
        FileInputStream fileInputStream=null;
        ObjectInputStream objectInputStream=null;
        try {
            fileInputStream=new FileInputStream("history.txt");
            objectInputStream=new ObjectInputStream(fileInputStream);
            return(List<History>) objectInputStream.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName())
                    .log(Level.SEVERE,"Нет файла history.txt", ex);
        }catch (IOException ex){
            Logger.getLogger(SaverToFile.class.getName())
                    .log(Level.SEVERE,"Проблема чтения history.txt", ex);
        }catch (ClassNotFoundException ex){
            Logger.getLogger(SaverToFile.class.getName())
                    .log(Level.SEVERE,"Неизвестный класс History", ex);
        }
        return new ArrayList<History>();
    }

    
    public void saveStudent(List<Student>students) throws IOException{
        FileOutputStream fileOutputStream=null;
        ObjectOutputStream objectOutputStream=null;
        try {
            fileOutputStream=new FileOutputStream("student.txt");
            objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(students);
            objectOutputStream.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName())
                .log(Level.SEVERE,"Файла student.txt не существует",ex);
        }catch(IOException ex){
            Logger.getLogger(SaverToFile.class.getName())
                    .log(Level.SEVERE,"Проблема записи в student.txt");
        }
    }
    public List<Student> loadStudent(){
        FileInputStream fileInputStream=null;
        ObjectInputStream objectInputStream=null;
        try {
            fileInputStream=new FileInputStream("student.txt");
            objectInputStream=new ObjectInputStream(fileInputStream);
            return(List<Student>) objectInputStream.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName())
                    .log(Level.SEVERE,"Нет файла student.txt", ex);
        }catch (IOException ex){
            Logger.getLogger(SaverToFile.class.getName())
                    .log(Level.SEVERE,"Проблема чтения student.txt", ex);
        }catch (ClassNotFoundException ex){
            Logger.getLogger(SaverToFile.class.getName())
                    .log(Level.SEVERE,"Неизвестный класс Student", ex);
        }
        return new ArrayList<Student>();
    }
    
    public void saveSubject(List<Subject>subject) throws IOException{
        FileOutputStream fileOutputStream=null;
        ObjectOutputStream objectOutputStream=null;
        try {
            fileOutputStream=new FileOutputStream("subject.txt");
            objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(subject);
            objectOutputStream.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName())
                .log(Level.SEVERE,"Файла subject.txt не существует",ex);
        }catch(IOException ex){
            Logger.getLogger(SaverToFile.class.getName())
                    .log(Level.SEVERE,"Проблема записи в subject.txt");
        }
    }
    public List<Subject> loadSubject(){
        FileInputStream fileInputStream=null;
        ObjectInputStream objectInputStream=null;
        try {
            fileInputStream=new FileInputStream("subject.txt");
            objectInputStream=new ObjectInputStream(fileInputStream);
            return(List<Subject>) objectInputStream.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName())
                    .log(Level.SEVERE,"Нет файла subject.txt", ex);
        }catch (IOException ex){
            Logger.getLogger(SaverToFile.class.getName())
                    .log(Level.SEVERE,"Проблема чтения subject.txt", ex);
        }catch (ClassNotFoundException ex){
            Logger.getLogger(SaverToFile.class.getName())
                    .log(Level.SEVERE,"Неизвестный класс Subject", ex);
        }
        return new ArrayList<Subject>();
    }
        public void saveTeacher(List<Teacher>teacher) throws IOException{
        FileOutputStream fileOutputStream=null;
        ObjectOutputStream objectOutputStream=null;
        try {
            fileOutputStream=new FileOutputStream("teacher.txt");
            objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(teacher);
            objectOutputStream.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName())
                .log(Level.SEVERE,"Файла teacher.txt не существует",ex);
        }catch(IOException ex){
            Logger.getLogger(SaverToFile.class.getName())
                    .log(Level.SEVERE,"Проблема записи в teacher.txt");
        }
    }
    public List<Teacher> loadTeacher(){
        FileInputStream fileInputStream=null;
        ObjectInputStream objectInputStream=null;
        try {
            fileInputStream=new FileInputStream("teacher.txt");
            objectInputStream=new ObjectInputStream(fileInputStream);
            return(List<Teacher>) objectInputStream.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName())
                    .log(Level.SEVERE,"Нет файла teacher.txt", ex);
        }catch (IOException ex){
            Logger.getLogger(SaverToFile.class.getName())
                    .log(Level.SEVERE,"Проблема чтения teacher.txt", ex);
        }catch (ClassNotFoundException ex){
            Logger.getLogger(SaverToFile.class.getName())
                    .log(Level.SEVERE,"Неизвестный класс Teacher", ex);
        }
        return new ArrayList<Teacher>();
    }
}