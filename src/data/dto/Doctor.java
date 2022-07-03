package src.data.dto;

import java.util.UUID;

public class Doctor {


    private String name;
    private UUID id = UUID.randomUUID();

    public Doctor(String name){
        this.name = name;
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
}
