class Rectangle {
    int length, width;

    void setData(int x, int y) {
        length = x;
        width = y;
    }

    int rectArea() {
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setData(5, 6);
        int area = rect.rectArea();
        System.out.println("Rectangle area: " + area);
    }
}