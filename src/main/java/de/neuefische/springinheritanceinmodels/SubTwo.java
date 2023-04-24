package de.neuefische.springinheritanceinmodels;

public class SubTwo extends Main{

    private String c;


    public SubTwo() {
    }

    public SubTwo(String c) {
        this.c = c;
    }

    public SubTwo(String a, String c) {
        super(a);
        this.c = c;
    }


    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "SubTwo{" +
                "c='" + c + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SubTwo subTwo)) return false;
        if (!super.equals(o)) return false;

        return getC() != null ? getC().equals(subTwo.getC()) : subTwo.getC() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getC() != null ? getC().hashCode() : 0);
        return result;
    }
}
