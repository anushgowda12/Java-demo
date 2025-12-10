class java5{
    public int area(int s) {
        return s * s;
    }
    public int area(int l,int b){
        return l*b;
    }
    public double area(double r){
        return 3.14*r*r;
    }
}
public interface methodoverld2 {
    public static void main(String[] args) {
        java5 obj=new java5();
        System.out.println("area of the square ="+obj.area(5));

        System.out.println("area of the rectangle ="+obj.area(5,8));

        System.out.println("area of the circle ="+obj.area(2.5));

    }
}
