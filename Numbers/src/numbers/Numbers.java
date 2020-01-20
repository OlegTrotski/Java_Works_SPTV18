
package numbers;

import java.util.Random;


public class Numbers {
    
    public static void main(String[] args) {
int[] numbers=new int[20];
        Random rnd=new Random();
        for(int i=0;i<20;i++){
            do{
                int rndNumber=rnd.nextInt(100);
                if(rndNumber%2==0){
                    numbers[i]=rndNumber;
                    break;
                }
            }while(true);
        }
        int min=numbers[0];
        int max=numbers[0];
        int sum=0;
        for(int i=0;i<20;i++){
            System.out.printf("%-3d",numbers[i]);
            if(numbers[i]>max){
                max=numbers[i];
            }
            if(numbers[i]<=min){
                min=numbers[i];
            }
        }
        System.out.println("Самое большое четное число : " +max);
        System.out.println("Самое маленькое четное число : " +min);
    }
   
}
