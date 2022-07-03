package src;

import java.util.Scanner;

public class Authentication {
    public static final String LOGIN = "Artur";
    public static final String PASSWORD = "123";

    public static int authenticate(){
        Scanner s = new Scanner(System.in);

        int attempts = 3;
        boolean islogin = false;

        while (attempts >0 && !islogin) {
            System.out.printf("Попыток осталось: %s \n",attempts);

            System.out.print("Логин: ");
            var login = s.nextLine();

            System.out.print("Пароль: ");
            var password = s.nextLine();

            if (login.equals(LOGIN) && password.equals(PASSWORD)) {
                islogin = true;
            }
            attempts--;
        }

        return islogin ? 0 : -1;
    }
}
