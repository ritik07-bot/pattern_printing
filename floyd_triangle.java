public class floyd_triangle {
    public static void pattern(int n){
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
               System.out.print(num+" ");
               num++;
            }
            System.out.println();
        }
    }
    public static void main(String arrgs[]){
        pattern(5);
    }
}
