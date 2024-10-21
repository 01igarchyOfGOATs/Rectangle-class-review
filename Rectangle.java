public class Rectangle{
    private double xCoor;
    private double yCoor;
    private double length;
    private double width;

public Rectangle(double xCoor, double yCoor, double length, double width){
    this.length = length;
    this.width = width;
    this.xCoor = xCoor;
    this.yCoor = yCoor;
}

public Rectangle(double length, double width){
    this(0.0, 0.0, length, width);
}

public void move(double x, double y){
    this.xCoor = x;
    this.yCoor = y;
}

public double getWidth(){
    return width;
}

public String toString(){
    return "from upper left corner point " + "(" + xCoor + ", " + yCoor + "): " + "length = " + length + ", " 
                + "width = " + width + "\nperimeter = " + perimeter() + "," + "area = " + area();
}

public double perimeter(){
    return length * 2 + width * 2;
}

public double area(){
    return length * width;
}

public boolean isSquare(){
    if (length == width){
        return true;
    }
    else{
        return false;
    }
}

public boolean equals(Rectangle rhs){
    if (this.xCoor == rhs.xCoor && this.yCoor == rhs.xCoor && this.width == rhs.width && this.length == rhs.length){
        return true;
    }
    else{
        return false;
    }
}
}
