package String;
import java.util.*;
public class StringRange {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(S.substring(start, end));

    }
}
// ouput - l o w o 
//         h e l l o w o r l d 
//         0 1 2 3 4 5 6 7 8 9 
                  
