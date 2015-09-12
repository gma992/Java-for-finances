import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by gma992 on 11/09/15.
 */
public class CompoundInterest {

    public static void main(String[] args)throws Exception{

        double amount, rate, years, total;

        /*
        Reads text from a character-input stream:
        BufferedReader in = new BufferedReader(new FileReader("foo.in"));
        An InputStreamReader is a bridge from byte streams to character streams.
        */

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        /*
        parseDouble() converts a string (user input) to a Double, so we can do math with it
        */
        System.out.println("Enter amount: ");
        amount = Double.parseDouble(reader.readLine());
        System.out.println("Enter rate: ");
        rate = Double.parseDouble(reader.readLine());
        System.out.println("Enter years: ");
        years = Double.parseDouble(reader.readLine());

        total = amount * Math.pow(1+rate, years);
        System.out.println(total);

    }

}
