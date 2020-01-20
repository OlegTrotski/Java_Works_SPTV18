
package entity;

import java.io.Serializable;



public class History implements Serializable {
    private Student student;
    private Teacher teacher;
    private Subject subject;
    private int rating;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "History{" + "student=" + student + ", teacher=" + teacher + ", subject=" + subject + ", rating=" + rating + '}';
    }
    
}