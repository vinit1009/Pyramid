public class pyramid {

    public static void main (String[] args) {
        int n = Integer.parseInt(args[0]);
        for(int i=1; i<=n; i++){
            for(int j = 0; j < i; j++){
                System.out.println('*');
            }
            System.out.println( );
            
        }
        for(int i=n-1; i>=0; i--){
            for(int j = 0; j<= i; j++){
                System.out.println('*');
            }
            System.out.println();

        }

    }
}