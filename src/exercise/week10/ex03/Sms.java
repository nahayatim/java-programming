package exercise.week10.ex03;

public class Sms {

    private String label;
    private String text;

    public Sms(String v1, String v2) {
        this.label = v1;
        this.text = v2;
    }

    public String getLabel() {
        return label;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Sms" +
                "label=" + label +
                " text=" + text;
    }
}
