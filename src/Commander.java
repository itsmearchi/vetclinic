package src;

import src.Command.AppointmentCommand;
import src.Command.Default;
import src.Command.DoctorCommand;
import src.Command.PatientCommand;

import java.util.Scanner;

public class Commander {

    private static final Default patientCommand = new PatientCommand();
    private static final Default doctorCommand = new DoctorCommand();
    private static final Default appointmentCommand = new AppointmentCommand();
    public static int startReadCommander(){
        Scanner s = new Scanner(System.in);

        while (true){
            System.out.println("""
                    выберите команду
                    0 - выход
                    1 - добавить пациента
                    2 - добавить доктора
                    3 - добавить прием к врачу
                    4 - вывести всех пациентов
                    5 - редактировать ФИО пациента
                    6 - удалить пациента
                    7 - изменить статус приема
                    8 - посмотреть все записи пациента
                    """);
            int code = Commander.readCommand();

            if(code == 0){
                break;
            }
        }
        return 0;
    }

    public static int readCommand(){
        Scanner s = new Scanner(System.in);

        switch (s.nextInt()){
            case 0 -> System.exit(0);
            case 1 -> patientCommand.create();
            case 2 -> doctorCommand.create();
            case 3 -> appointmentCommand.create();
            case 4 -> patientCommand.checkAll();
            case 5 -> patientCommand.redactor();
            case 6 -> patientCommand.delete();
            case 7 -> appointmentCommand.redactor();
            case 8 -> appointmentCommand.checkAll();
        }


        return -1;
    }
}

