package fh.java.geometry.model.trilateral;

public class  RightTriangle extends TriangularShape
{

    private double sideA;
    private double sideB;


    public RightTriangle(int x, int y,double sideA, double sideB)
    {
        this.x=x;
        this.y=y;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    // TODO: Implement equals() and hashCode()

    @Override
    public String toString()
    {
        final StringBuffer sb = new StringBuffer("RightTriangle{");
        sb.append("sideA=").append(sideA);
        sb.append(", sideB=").append(sideB);
        sb.append(", area=").append(calcArea());
        sb.append(", perimeter=").append(calcPerimeter());
        sb.append('}');
        return sb.toString();
    }


    public double calcSideC() {
        return Math.sqrt(sideA*sideA+sideB*sideB);
    }

    @Override
    public double calcArea() { return this.sideB * this.sideA / 2; }

    @Override
    public double calcPerimeter() { return this.sideA + this.sideB + calcSideC(); }
}
