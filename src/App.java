import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        
        for(int i = 0; i <a; i++){
            int num = Integer.parseInt(br.readLine());

            if(num == 0){
                System.out.println("NULL");
            }else if(num%2 == 0){
                if(num > 0){
                    System.out.println("EVEN POSITIVE");
                }else{
                    System.out.println("EVEN NEGATIVE");
                }
            }else if(num%2 != 0){
                if(num > 0){
                    System.out.println("ODD POSITIVE");
                }else{
                    System.out.println("ODD NEGATIVE");
                }
            }
        }

        br.close();
    }
}
