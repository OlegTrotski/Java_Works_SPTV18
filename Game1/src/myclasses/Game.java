
package myclasses;

import java.util.Random;
import java.util.Scanner;


public class Game {
    public void run(){
            int popitki = 0;
            int userNumber = 0;
            boolean answer=true;
            Scanner scn = new Scanner(System.in);
            Random rnd = new Random();
            int number = rnd.nextInt(10);
            while(answer) {
            System.out.println("Задуманно число от 5 до 10. Угадай: " +number);
            userNumber = scn.nextInt();
            popitki++;
            if (number == userNumber) {
                System.out.println("Вы угадали! Число = " +number);

                System.out.println("Число попытки: " +popitki);
                System.exit(0);
            } 
                else if (number>userNumber) { {
                System.out.println("Вы не угадали! Хотите попробовать ещё?");
                System.out.println("Да - true | Нет - false");
                answer=scn.nextBoolean();
                if(!answer) break;
                else answer = true;
              }
           }
        }   
    }
}
