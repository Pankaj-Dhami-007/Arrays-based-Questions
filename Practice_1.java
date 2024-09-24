import java.util.*;
public class Practice_1 {
    public static void main(String[] args)throws InterruptedException { 
        String countries[]={"india","america","australia"};
        String states[][]={
            {"UP","MP","HR","Bihar"},
            {"NYC","Texas","San Fransisco","california"},
            {"Sydney","victoria","South Wales","melbourn"}
        };
        for (int i = 0; i < states.length; i++) 
        {
            for (int j = 0; j < states[i].length; j++) 
            {
                System.out.print("\t"+states[i][j]);
                Thread.sleep(2000);  
            }
            System.out.println();
        }
    }
}
