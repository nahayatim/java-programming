package exercise.week10.ex02;

public class AverageData {
    private String gender;
    private Integer avg;

    public AverageData(String gender, Integer avg) {
        this.gender = gender;
        this.avg = avg;
    }

    public Integer getAvg() {
        return avg;
    }

    @Override
    public String toString() {
        return gender+ "\t| " + avg;
    }
}
