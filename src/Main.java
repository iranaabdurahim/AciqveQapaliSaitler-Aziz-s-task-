import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Bir array yaratmaq - saitlerden ibaret.
        //Onlarin switch-case ilə açıq və qapalı olduğunu chapa vermek.

        char[] saitler = {'a','ı','o','u','e','ə','i','ö','ü'};

        for(int i=0;i<saitler.length;i++){
            switch(saitler[i]){
                case 'a','o','e','ə' -> System.out.println("Açıq saitdir.");
                case 'ı','i','u','ü' -> System.out.println("Qapalı saitdir.");
            }
        }

    }
}