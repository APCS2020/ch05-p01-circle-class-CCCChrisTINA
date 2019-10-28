public class Circle{
    private double radius;
    private String color;

    public Circle(){
        radius = 1.0;
    }
    public Circle(String c, double r){
        color = c;
        radius = r; 
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double r){
        radius = r; 
    }

    public String getColor(){
        return color;
    }
    public void setColor(String c){
        color = c;
    }

    public double getArea(){
        return radius * radius * Math.PI; 
    }
}
