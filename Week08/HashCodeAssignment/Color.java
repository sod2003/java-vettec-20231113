package Week08.HashCodeAssignment;

public class Color {
    private String name;
    private byte r;
    private byte g;
    private byte b;

    public Color() {
        this.name = "white";
        this.r = (byte) 255;
        this.g = (byte) 255;
        this.b = (byte) 255;
    }

    public Color(String name, byte r, byte g, byte b) {
        this.name = name;
        this.r = r;
        this.g = g;
        this.b = b;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + r;
        result = prime * result + g;
        result = prime * result + b;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Color other = (Color) obj;
        if (r != other.r)
            return false;
        if (g != other.g)
            return false;
        if (b != other.b)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Color [name=" + name + ", r=" + (r & 0xFF) + ", g=" + (g & 0xFF) + ", b=" + (b & 0xFF) + "]";
    }

    public static void main(String[] args) {
        Color color = new Color();
        System.out.println(color);
        Color black = new Color("black", (byte) 0, (byte) 0, (byte) 0);
        System.out.println(black);
    }
}
