package level1;
import java.util.Scanner;
class grade{
    static double ar[],avg=0;
    grade(double num){
        ar= new double[(int) num];
    }
    void getvalue(){
        Scanner sc=new Scanner(System.in);
        double n;
        for(int i=0;i<ar.length;i++){
            System.out.println("Enter "+(i+1)+" no. Grade out of 100 :");
            n=sc.nextDouble();
            try{
                if(n>100.0 || n<0)
                    throw new NullPointerException(" Out of Bound Input.");
                else
                    ar[i]=n;
            }catch(NullPointerException e){
                System.out.println(e.getMessage());
                break;
            }
        }
    }
    double Avgcalculate(){
        for (int i = 0; i < ar.length; i++) {
                avg += ar[i];
            }
            avg/=ar.length;
        return avg;
    }
}
public class student_grade_calculator {
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Grades:");
        double num=sc.nextDouble();
        grade g=new grade(num);
        g.getvalue();
        double p=g.Avgcalculate();
        if(p!=0)
            System.out.printf(" Your Avarage Grade is %.3f",p);
        else
            System.out.println("Unable to Calculate.");
    }
}
