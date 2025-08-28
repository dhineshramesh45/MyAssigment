package week4.day1;

import java.util.*;
public class Zak {
    public static void main(String[] args) {
         String name = "ZAAKRAPRPSS";
         String answer = "";
         answer+=name.charAt(0);
         int count =0;
         for(int i=2;i<name.length();i++)
         {
             count++;
             if(count%2==0)
             {
                 answer+=name.charAt(i);
                 i+=1;
             }
             else
             {
                  answer+=name.charAt(i);
                  
             }
         }
         System.out.print(answer);
	}
}
