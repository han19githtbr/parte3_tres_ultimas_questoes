public class questao3 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.print("(" + i + ", ");
            
            int j = 1;
            while(j <= 10) {
                System.out.print(j + " ");
                j = j + 1;
            }
        
            System.out.println(")");
            i = i + 2;
        }
    }
}
