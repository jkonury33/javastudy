package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author JiHong Jang
 * @since 2014.03.02
 */
public class ExceptionTest {
    public static void main(String[] args) throws IOException {
        Calculator calculator = new Calculator();
        try {
            calculator.div(10, 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            println();
            System.out.println(e);
            println();
            e.printStackTrace();
        }

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int x;
        while (true) {
            try {
                System.out.print("x = ");
                x = Integer.parseInt(in.readLine());
            } catch (NumberFormatException e) {
                System.out.println("숫자를 입력하시기 바랍니다.");
                continue;
            }
            break;
        }

        System.out.println("x = " + x);
    }

    private static void println() {
        System.out.println("");
    }

    /*
    * modify java study sample
    */
}
