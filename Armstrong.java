public class  {
 import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args){
        
        for(int i=1;i<=1000;i++){
            int rem=0;
            int temp=i;
            int ans=0;
            rem = temp%10;
			ans = ans+rem*rem*rem;
			temp = i*(temp/10);

            if(ans==i){
                System.out.println(i);
            }
        }   
    }
}
[9:52 pm, 18/06/2024] Maitri 🤝: i
}
