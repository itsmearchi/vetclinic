package src.data;

public enum AppointmentStatus {
    NEW("Новый"),
    IN_PROCESS("В-процессе"),
    CANCELLED("Отменен"),
    AWAITING_PAYMENT("Ожидает-оплаты"),
    COMPLETED("Завершен");

    private final String text;

    AppointmentStatus(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}

