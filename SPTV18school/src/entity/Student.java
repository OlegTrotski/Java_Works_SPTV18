
package entity;

import java.io.Serializable;

public class Student implements Serializable{
   
    private String firstname;
    private String lastname;
    private int age;
    private String group;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" + "firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + ", group=" + group + '}';
    }
    
}
