class Cuboid {
    
    private int length, width, height;
    public void getDimensions(int l, int w, int h)
    {
        length = l;
        width = w;
        height = h;
    }
    public int Area() {
        return 2 * (length * width + width * height + height * length);  
    }
    public int Volume() {
        return length * width * height;  
    }
}

public class MainCuboid {
    public static void main(String[] args) 
    {
        Cuboid c1 = new Cuboid();  
        c1.getDimensions(5, 4, 3);
        System.out.println("Area = " + c1.Area());
        System.out.println("Volume = " + c1.Volume());
    }
}