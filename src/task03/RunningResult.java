package task03;

public class RunningResult implements Comparable<RunningResult> {
    private String type;
    private String subType;
    private double time;
    private String sex;

    public RunningResult(String subType, double time, String sex) {
        this.type = "біг на довгі дистанції";
        this.subType = subType;
        this.time = time;
        this.sex = sex;
    }

    public String getType() {
        return type;
    }

    public String getSubType() {
        return subType;
    }

    public double getTime() {
        return time;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RunningResult that = (RunningResult) o;

        if (Double.compare(that.time, time) != 0) return false;
        if (!type.equals(that.type)) return false;
        if (!subType.equals(that.subType)) return false;
        return sex.equals(that.sex);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = type.hashCode();
        result = 31 * result + subType.hashCode();
        temp = Double.doubleToLongBits(time);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + sex.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Результат{" +
                String.format("%.2f", time) +
                "с, " + type +
                ", " + subType +
                ", " + sex +
                "}";
    }

    @Override
    public int compareTo(RunningResult o) {
        return Double.compare(time, o.time);
    }
}
