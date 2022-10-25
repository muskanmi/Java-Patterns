public class LeftAngledTrianglePattern{
    public static void main(String args[]){
        int i, j, r=8;
        for(i=0; i<r; i++){
            for(j=2*(r-i); j>=0; j--){
                System.out.print(" ");
            }
            for (j=0; j<=i; j++ ){
                System.out.print("* ");
            }  
            System.out.println();
        }   
    }   
}
