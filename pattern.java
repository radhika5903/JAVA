public class pattern {
    public static void main(String[]args){
        int n;
        for(int i=1;i<2n-1;i++){
            int star = i;
            if(i>n){
                star=2n-i;
            }
            for(int j=1;j<=star; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
