package src.Command;

import src.data.Lists;
import src.data.dto.Patient;


import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class PatientCommand implements Default {

    @Override
    public void create() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ФИО пациента: ");
        String name = scanner.nextLine();


        Lists.patientLists.add(new Patient(name));
        System.out.println("Пациент " + name + " добавлен");
    }

    @Override
    public void checkAll() {
        if (Lists.patientLists.isEmpty()) {
            System.out.println("Нет пациента");
            return;
        }

        Lists.patientLists.forEach(p -> {
            System.out.printf("ID: %s\nФИО: %s\nДата регистрации: %s", p.getId(), p.getName(), p.getRegDate());
            System.out.println("\n");
        });
    }

    @Override
    public void redactor() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ID пациента: ");
        UUID patientId = UUID.fromString(scanner.nextLine());
        Patient patient = Lists.patientLists.stream().filter(p -> p.getId().equals(patientId)).findFirst().get();


        System.out.print("Введите новое ФИО: ");
        String name = scanner.nextLine();

        patient.setName(name);
        System.out.print("ФИО пациента измененно. ");
    }

    @Override
    public void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ID пациента: ");
        UUID patientId = UUID.fromString(scanner.nextLine());
        Lists.patientLists.removeIf(p -> p.getId().equals(patientId));

        System.out.println("Пациент удален");
    }
}

