package src.Command;

import src.data.AppointmentStatus;
import src.data.Lists;
import src.data.dto.Appointment;

import java.util.Date;
import java.util.Scanner;
import java.util.UUID;

public class AppointmentCommand implements Default{


    @Override
    public void create() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ФИО пациента: ");
        String patientName = scanner.nextLine();
        System.out.println("Введите ФИО доктора: ");
        String doctorName = scanner.nextLine();
        System.out.println("Введите дату приема: ");
        String date = scanner.nextLine();
        System.out.println("Введите время приема: ");
        String time = scanner.nextLine();

        String name = scanner.nextLine();

        Lists.appointmentList.add(new Appointment(patientName,doctorName,date,time, AppointmentStatus.NEW));
        System.out.println(patientName + "записан к " + doctorName);
    }

    @Override
    public void checkAll() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ФИО пациента: ");
        String patientName = scanner.nextLine();

        if (Lists.appointmentList.stream().noneMatch(a -> a.getPatientName().equals(patientName))) {
            System.out.println("У этого пациента нет записей на прием");
            return;
        }

        System.out.println("Записи приема пациента " + patientName);
        Lists.appointmentList.forEach(a -> {
            if (a.getPatientName().equals(patientName)){
                System.out.println("ID приема" + a.getId());
                System.out.println(a.getAppointmentDate() + " " + a.getAppointmentTime() + " " + a.getStatus().toString());
            }});

    }

    @Override
    public void redactor() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ID приема: ");
        UUID appointmentId = UUID.fromString(scanner.nextLine());

        System.out.print("""
                Введите статус приема:
                0 - Новый
                1 - В процессе
                2 - Отменен
                3 - Ожидает оплаты
                4 - Завершен
                """);

        int statusCode = scanner.nextInt();
        AppointmentStatus newStatus = null;

        switch (statusCode) {
            case 0 -> newStatus = AppointmentStatus.NEW;
            case 1 -> newStatus = AppointmentStatus.IN_PROCESS;
            case 2 -> newStatus = AppointmentStatus.CANCELLED;
            case 3 -> newStatus = AppointmentStatus.AWAITING_PAYMENT;
            case 4 -> newStatus = AppointmentStatus.COMPLETED;
        }

        Lists.appointmentList.stream().filter(a -> a.getId().equals(appointmentId)).findFirst().get().setStatus(newStatus);

    }

    @Override
    public void delete() {

    }
}
