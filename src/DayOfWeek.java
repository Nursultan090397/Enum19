

public enum DayOfWeek {
    DUISHOMBU ("Technical lesson"),
    SHEISHEMBI ("Practic lesson"),
    SHARSHEMBI ("English lesson"),
    BEISHENBI("Talking club"),
    JUMA ("Event"),
    ISHEMBI ("Football"),
    JEKSHEMBI ("Weekend");

    private String name;

    DayOfWeek(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }
}
