public class Parallelepiped {
    private double length;
    private double width;
    private double height;

    public Parallelepiped(double length,double width, double height) throws Exception {
        checkParametrs(length, width, height);
    }

    private void checkParametrs(double length, double width, double height) throws Exception {
        if ((length < 0 || width < 0 || height < 0) || (length > 20 || width > 20 || height > 20)) {
            throw new MyException();
        } else {
            this.length = length;
            this.width = width;
            this.height = height;
        }
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return 2 * ((height * length) + (length * width) + (height * width));
    }

    public double getVolume() {
        return length * width * height;
    }

    @Override
    public String toString() {
        return "Parallelepiped => { " +
                " length = " + length +
                " || width = " + width +
                " || height = " + height +" } ";
    }

}
