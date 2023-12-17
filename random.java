package level1;
import java.util.*;
class password{
    String low= "abcdefghijklmnopqrstuvwxyz";
    String up="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String number="0123456789";
    String spe="~!@#$%^&*";
    String gt="";
    int num,n;
    password(int num){
        this.num=num;
        this.n=0;
    }
    public String generateRandompassword() {
       try{
            if(num<6 || num>26)
                throw new Exception("Given length Out of limit");
            else
                n=num;
            Random ran=new Random();
            if(num%2!=0){
                n+=1;
            }
            for(int i=0;i<n/2;i++){
               gt=gt+up.charAt(ran.nextInt(n))+low.charAt(ran.nextInt(n));//+number.charAt(num);
            }
            if(n!=0){
                if(num%2!=0){
                    gt = gt.substring(0, gt.length() - 2);
                }
                else{
                gt = gt.substring(0, gt.length() - 1);
                }
                gt+=spe.charAt(ran.nextInt(spe.length()));
               String gt1=gt.replace(gt.charAt(ran.nextInt(gt.length()-1)), number.charAt(ran.nextInt(number.length())));
                gt=gt1;
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
            }
        return gt;
    }
}
public class random {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        try{
            System.out.println("Enter the length of your password:");
            int n=sc.nextInt();
            password p=new password(n);
            String randomString = p. generateRandompassword();
            if(randomString!="")
                System.out.println("Generated Random password is: " + randomString);
        }catch(InputMismatchException e){
            System.out.println("Invalid Input");
        }
    }
    
}
