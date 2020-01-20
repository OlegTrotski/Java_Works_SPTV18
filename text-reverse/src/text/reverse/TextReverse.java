
package text.reverse;

import java.util.Scanner;


public class TextReverse {

public static void main(String[] args) {
Scanner scn = new Scanner(System.in);
System.out.println("Введите текст:");
String[] text = scn.nextLine().split(" ");
String reverse = "";
for (int i = text.length - 1; i >= 0; i--)
{
     for (int j = text[i].length() - 1; j >= 0; j--)
     {
           reverse += text[i].substring(j, j+1); 
     }
     reverse += " ";
}
 
System.out.println("Reverse: " + reverse);
}
}