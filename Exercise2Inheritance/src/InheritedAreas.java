public class InheritedAreas {
    static float areaA,areaB,areaC;
    public static void main(String[] args){
        //InheritanceA objA=new InheritanceA();
        //InheritanceB objB=new InheritanceB();
        InheritanceC objC=new InheritanceC();  
      //  System.out.println("Area of Geometerical Shapes...");
    areaA=objC.circleArea(6400);
    System.out.println("Area of Circle is:"+areaA);
    areaB=objC.rectangleArea(80,80);
    System.out.println("Area of Rectangle is:"+areaB);
    areaC=objC.triangleArea(16,20,20);
    System.out.println("Area of Triangle of sides s1="+objC.side1+", s2="+objC.side2+", s3="+objC.side3+" is:"+areaC);
}
}