 
class triangleassign{
    public static void main(String[] args) {
    Triangle triangle = new Triangle(3, 4, 5);

    System.out.println("Is it a right triangle? " + triangle.isRight());
    System.out.println("Is it scalene? " + triangle.isScalene());
    System.out.println("Is it isosceles? " + triangle.isIsosceles());
    System.out.println("Is it equilateral? " + triangle.isEquilateral());
}
}
class Triangle {
    private double A;
    private double B;
    private double C;
    public Triangle(double a, double b, double c) {
        A = a;
        B = b;
        C = c;
    }
    public boolean isRight() {
        // Check if Pythagorean theorem holds
        return (A * A + B * B == C * C) ||
               (B * B + C * C == A * A) ||
               (C * C + A * A == B * B);
    } 

   public boolean isScalene() {
        return A != B && B != C && C != A;
    }
    public boolean isIsosceles() {
        return (A == B && B != C) ||
               (B == C && C != A) ||
               (C == A && A != B);
    }
    public boolean isEquilateral() {
        return A == B && B == C;
    }
}
