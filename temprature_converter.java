package level1;
import java.util.Scanner;
interface temparature{
    void ftoc(double n);
    void ctof(double m);
    void ctok(double k);
    void ktoc(double k);
    void ftok(double p);
    void ktof(double p);
}
class Temp implements temparature{
    double f,c,cel,far,kel;
    public Temp(){
        cel=0.0;
        kel=0.0;
        far=0.0;
    }
    public void ftoc(double n){
        f=n;
        cel= (f - 32) * 5/9;
        System.out.println(f+"° Temparature in Celcious is "+cel+"°");
    }
    public void ctof(double m){
        c=m;
        far=(9 * c)/5 + 32;
        System.out.println(c+"° Temparature in Farenhite is "+far+"°");
    }
    public void ctok(double k){
        kel=k + 273.15;
        System.out.println(k+"° Temparature in Kelvin is "+kel+"°");
    }
    public void ktoc(double k){
        cel=k-273.15;
        System.out.println(k+"° Temparature in Celcious is "+cel+"°");
    }
    public void ftok(double p){
        kel= ((p - 32) * 5 / 9 )+ 273.15;
        System.out.println(p+"° Temparature in Kelvin is "+kel+"°");
    }
    public void ktof(double p){
        far=((p-273.15)*9/5)+32;
        System.out.println(p+"° Temparature in Farenhite is "+far+"°");
    }
}
class temprature_converter{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
        System.out.println("*********************** This is a Temparature Converter Application ! *********************");
        System.out.println("Press 1 for Celcious Operation's.");
        System.out.println("Press 2 for Farenhite Operation's.");
        System.out.println("Press 3 for Kelvin Operation's.");
        int choice=sc.nextInt();
        System.out.println("Enter your temparature which you want to Convert :");
        double temp=sc.nextDouble();
        Temp t=new Temp();
        switch (choice) {
            case 1:
                System.out.println("Press K for Convert Celcious->Kelvin.");
                System.out.println("Press F to Convert Celcious->Farenhite.");
                String st=sc.next();
                char c=st.charAt(0);
                if(c=='K'){
                    t.ctok(temp);
                    break;
                }
                else if(c=='F'){
                    t.ctof(temp);
                    break;
                }else{
                    System.out.println("Invalid Choice");
                }
                break;
            case 2:
                System.out.println("Press K for Convert Farenhite->Kelvin.");
                System.out.println("Press C to Convert Farenhite->Celcious.");
                String st1=sc.next();
                char s=st1.charAt(0);
                if(s=='K'){
                    t.ftok(temp);
                    break;
                }
                else if(s=='C'){
                    t.ftoc(temp);
                    break;
                }else{
                    System.out.println("Invalid Choice");
                }
                break;
            case 3:
                System.out.println("Press F for Convert Kelvin->Farenhite");
                System.out.println("Press C to Convert Kelvin->Celcious.");
                String st2=sc.next();
                char s1=st2.charAt(0);
                if(s1=='F'){
                    t.ktof(temp);
                    break;
                }
                else if(s1=='C'){
                    t.ktoc(temp);
                    break;
                }else{
                    System.out.println("Invalid Choice");
                }
                break;
            default:
                System.out.println("Your Choice is Out of Option!");
        }
    }
    catch(Exception e){
        System.out.println("Invalid Input!!");
    }
}
}