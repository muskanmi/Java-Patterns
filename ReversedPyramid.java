import java.util.Scanner;
public class ReversedPyramid{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number of rows you want to print: ");
        int r = in.nextInt();        
        for (int i= 0; i<= r-1 ; i++){
            for(int j=0; j<=i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<=r-1-i; k++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        in.close();
    }
}