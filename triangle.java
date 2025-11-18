class Triangle {
    double base;
    double height;

    Triangle(double b, double h) {
        base = b;
        height = h;
    }
    double calculateArea() {
        return (base * height) / 2;
    }

    public static void main(String[] args) {
       
        Triangle myTriangle = new Triangle(15, 40);

        double area = myTriangle.calculateArea();

        System.out.println("Triangle area: " + area);
    }
}