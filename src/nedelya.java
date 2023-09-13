public enum nedelya {
    MONDAY("I go to school on Monday"),
    TUESDAY("I go to school on Tuesday"),
    WEDNESDAY("I go to school on Wednesday"),
    THURSDAY("I go to school on Thursday"),
    FRIDAY("I go to school on Friday"),
    SATURDAY("I'm free on Saturday"),
    SUNDAY("I'm free on Sunday");

    private String day;
    nedelya(String day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return
                "DAY= " + day ;
    }
}

