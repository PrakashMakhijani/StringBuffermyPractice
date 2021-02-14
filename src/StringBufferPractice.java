import java.util.Arrays;

public class StringBufferPractice {
    public static void main(String[] args) {
        StringBuffer S = new StringBuffer("Prakash");

        // String Buffer reverse Method
        S.reverse();
        System.out.println("Output of Reverse: " + S);

        S.reverse();
        S.append(123);
        //System.out.println(S);
        // String Buffer Append Method
        S.append(" S Makhijani");
        System.out.println("Output of Append: " + S);

        // String Buffer Replace Method
        S.replace(7,9,"");
        System.out.println("Output of Replace: " + S);

        //String Buffer Delete Method
        S.delete(7,10);
        System.out.println("Output of Delete Method: " + S);

        //String Buffer Capacity
        System.out.println(S.capacity());

        //String Buffer CharAt
        System.out.println(S.charAt(6));

        int C = (int)(S.charAt(6));
        System.out.println("ASCI Value of Character at 6: "+ C);


        int [] myChar = {1,2,3,4,5};

        System.out.println(Arrays.toString(myChar));


    }



}
