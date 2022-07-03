package src.data.dto;

import src.data.AppointmentStatus;

import java.sql.Time;
import java.util.Date;
import java.util.UUID;

public class Appointment {
    private UUID id = UUID.randomUUID();
    private String patientName;
    private String doctorName;
    private String appointmentDate;
    private String appointmentTime;
    private AppointmentStatus status;

    public Appointment(String patientName, String doctorName, String appointmentDate, String appointmentTime, AppointmentStatus status){
        this.appointmentDate=appointmentDate;
        this.appointmentTime=appointmentTime;
        this.status=status;
        this.doctorName=doctorName;
        this.patientName=patientName;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public AppointmentStatus getStatus() {
        return status;
    }

    public void setStatus(AppointmentStatus status) {
        this.status = status;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}

