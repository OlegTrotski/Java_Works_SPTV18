
package ProviderPerson;

import entity.Subject;
import java.util.Scanner;

public class ProviderSubject {
 public Subject createSubject(){
        Scanner scn=new Scanner(System.in);
        Subject subject = new Subject();
            System.out.println("Название предмета: ");
            String title = scn.nextLine();
            subject.setTitle(title);
            System.out.println("Оставшиеся часы: ");
            int hours = scn.nextInt();
            scn.nextLine();
            subject.setHours(hours);
        return subject;
    }
}
