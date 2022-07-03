package src;

import src.Commander;

public class Main {
    public static void main(String[] args) {
        int code = Authentication.authenticate();
        if (code == 0) {
            System.out.println("Аутентификация прошла успешно.");
        } else {
            System.out.printf(("Попытки кончились"));
        }

        Commander.startReadCommander();
    }

}
