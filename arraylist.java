import java.util.ArrayList;
import java.util.Scanner;

// I am using intellij ide for code

public class arraylist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many Integer to store in list");
        int n=sc.nextInt();
        System.out.println("Enter the Integer in list");
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            int ele=sc.nextInt();
            list.add(ele);
        }
        System.out.println("The list is : " + list);
    }
}
