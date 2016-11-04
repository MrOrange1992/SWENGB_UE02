package fh.java.geometry.model.curved;

public class Circle extends CurvedShape
{
    //ATTRIBUTES
    //------------------------------------------------------------------------------------------------------------------
    private double radius;
    //------------------------------------------------------------------------------------------------------------------

    //CONSTRUCTOR
    //------------------------------------------------------------------------------------------------------------------
    public Circle(int x, int y,double radius)
    {
        this.x=x;
        this.y=y;
        this.radius = radius;
    }
    //------------------------------------------------------------------------------------------------------------------


    //METHODS
    //------------------------------------------------------------------------------------------------------------------
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    //------------------------------------------------------------------------------------------------------------------


    //OVERRIDES
    //------------------------------------------------------------------------------------------------------------------
    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;     //compare inherited attributes

        Circle circle = (Circle) o;

        return Double.compare(circle.radius, radius) == 0;

    }
    @Override
    public int hashCode()
    {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(radius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    @Override
    public String toString()
    {
        final StringBuffer sb = new StringBuffer("Circle{");
        sb.append("radius=").append(radius);
        sb.append(", area=").append(calcArea());
        sb.append(", perimeter=").append(calcPerimeter());

        sb.append('}');
        return sb.toString();
    }
    @Override
    public double calcArea() { return this.radius * this.radius * Math.PI; }
    @Override
    public double calcPerimeter() { return 2 * this.radius * Math.PI; }
    //------------------------------------------------------------------------------------------------------------------
}
