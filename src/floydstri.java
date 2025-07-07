public class floydstri {
    public static void flotriangle(int n ){
        int counter = 1;
        for(int i =1; i<=n; i++){
            for(int j =1 ; j <= i; j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args){
        flotriangle(5);
    }
}
