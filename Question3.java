import java.util.*;
public class Main
{
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int amount = sc.nextInt();
    if(amount>=3000 && amount<=5000 ){
        int value = (int)(0.10*amount);
        int totalval = amount - value;
       System.out.println("Discount is :"+value);
        System.out.println("Final Amount is :"+totalval);
    }
    else if(amount>=5000){
        int value = (int)(0.20*amount);
        int totalval = amount - value;
        System.out.println("Discount is :"+value);
        System.out.println("Final Amount is :"+totalval);
    }
    else{
       System.out.println("There is no discount for u");
    }
    sc.close();
	}
}
