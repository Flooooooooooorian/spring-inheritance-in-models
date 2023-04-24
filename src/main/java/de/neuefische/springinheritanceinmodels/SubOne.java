package de.neuefische.springinheritanceinmodels;

public class SubOne extends Main{

    private String b;


    public SubOne() {
    }

    public SubOne(String a, String b) {
        super(a);
        this.b = b;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "SubOne{" +
                "b='" + b + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SubOne subOne)) return false;
        if (!super.equals(o)) return false;

        return getB() != null ? getB().equals(subOne.getB()) : subOne.getB() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getB() != null ? getB().hashCode() : 0);
        return result;
    }
}
