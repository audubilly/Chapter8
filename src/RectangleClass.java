public class RectangleClass {
    private double length;
    private double width;


    public RectangleClass() {
        this.length = 1.0;
        this.width = 1.0;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0.0 && length < 20.0) {
            this.length = length;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0.0 && width < 20.0) {
            this.width = width;
        }
    }


    public double calculateArea(double length, double width) {
         return length * width;

    }

    public double calculatePerimeter(double length, double width) {
        return 2 *(length + width);
    }
}