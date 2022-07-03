package src.data.dto;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.UUID;

public class Patient {

    private String name;
    private UUID id = UUID.randomUUID();
    private Instant regDate;

    public Patient(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Instant getRegDate() {
        return regDate;
    }

    public void setRegDate(Instant regDate) {
        this.regDate = regDate;
    }
}
