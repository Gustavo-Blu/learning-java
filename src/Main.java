import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        // data types
        int num1 = 5;
        int num2 = 10;
        char letter = 'B';
        String name = "Gustavo Allen";
        boolean isMe = true;
        double  num3 = 100.001;
        float pos = 10.20F;


        //reference data types
        Date date = new Date();
        String name2 = new String("Gus");
        LocalDate now = LocalDate.now();

        System.out.println(name2.toUpperCase());
        System.out.println(now.getMonth());

        int addition = num1 + num2;
        System.out.println(addition);

        //Math
        System.out.println();
        System.out.println(Math.abs(-10));
        System.out.println(Math.max(3.6, 10.11));
        System.out.println(Math.min(3.6, 10.11));
        System.out.println(Math.pow(5.0, 2));
        System.out.println((int)Math.pow(5.0, 2));
        System.out.println((int)Math.sqrt(25));
        System.out.println((int)Math.sqrt(25));
        System.out.println(Math.PI);
        System.out.println();

        int joshAge = 20;
        int mariaAge = 25;

        System.out.println(joshAge > mariaAge);
        System.out.println(joshAge < mariaAge);
        System.out.println(joshAge == mariaAge);
        System.out.println();

        //arrays
        int [] numbers = new int[3];
        //int numbers[];
        //int[] numbers; is used more.
        //int numbers[] = {0, 50, 100}
        boolean booleans[] = new boolean[3];
        String[] strings = {"josh", "maria", "april", "adam", "gavin", "david"};

        numbers[1] = 50;
        numbers[2] = 100;

        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(booleans));
        System.out.println(Arrays.toString(strings));
        System.out.println();


        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 0; i < strings.length; i++) {

            System.out.println(strings[i]);
        }

        System.out.println();

        for(String string : strings) {
            System.out.println(string);
        }

        //advanced way of making a loop
            //Arrays.stream(numbers).forEach(System.out::println);
    }
}