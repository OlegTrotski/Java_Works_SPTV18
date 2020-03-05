
package entity;

import java.io.Serializable;

public class Teacher implements Serializable {
    private String firstname;
    private String lastname;
    private String subject;

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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" + "firstname=" + firstname + ", lastname=" + lastname + ", subject=" + subject + '}';
    }
    
}

