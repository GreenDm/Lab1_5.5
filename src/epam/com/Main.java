package epam.com;

/**
 * Created by Любовь on 22.02.2016.
 */
public class Main {


    public static void main(String[] args) {

        int a =5;
        int result = 1;
        int avd =1;

        for (int i = 1; i <= a;i++){
            result *= i;
        }

        avd = result/a;

        System.out.println(result);
        System.out.println(avd);
    }
}
