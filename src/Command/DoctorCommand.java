package src.Command;

import java.util.Scanner;
import src.data.Lists;
import src.data.dto.Doctor;

public class DoctorCommand implements Default{

        @Override
        public void create() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите ФИО доктора: ");
            String name = scanner.nextLine();

            Lists.doctorList.add(new Doctor(name));
            System.out.println("Доктор " + name + " добавлен");
        }

        @Override
        public void checkAll() {

        }

        @Override
        public void redactor() {

        }

        @Override
        public void delete() {

        }
    }

