import java.io.*;
import java.util.*;
class R{
    int length, width;

    void setData(int x, int y) {
        length = x;
        width = y;
    }

    int rectArea() {
        return length * width;
    } 
}
class rectangle{
    public static void main(String[] args) {
        
        R rect = new R();
        rect.setData(5, 6);
        int area = rect.rectArea();
        System.out.println("Rectangle area: " + area);
    }
}