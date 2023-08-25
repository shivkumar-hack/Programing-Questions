package String;
import java.util.*;

public class LexicographicalOrder {

    public static String Smallestolargest(String str,int k){
        
        String smallest = "";
        String largest = "";
        smallest=largest=str.substring(0, k);

        for (int i=1;i<str.length()-k+1;i++){
             String newString = str.substring(i, i+k);
             if(smallest.compareTo(newString)>0){
                smallest = newString;
             }
             if (largest.compareTo(newString)<0){
                largest = newString;
             }
        }
        return smallest+"\n"+largest;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int k = in.nextInt();
         String ans = Smallestolargest(str, k);
         System.out.println(ans);
    }
}
