public class Area {
    static float areaA,areaB,areaC;
    public static void main(String[] args){
        InheritanceA objA=new InheritanceA();
        InheritanceB objB=new InheritanceB();
        InheritanceC objC=new InheritanceC();  
      //  System.out.println("Area of Geometerical Shapes...");
    areaA=objA.circleArea(6400);
    System.out.println("Area of Circle is:"+areaA);
    areaB=objB.rectangleArea(80,80);
    System.out.println("Area of Rectangle is:"+areaB);
    areaC=objC.triangleArea(16,20,20);
    System.out.println("Area of Triangle of sides "+objC.side1+", "+objC.side2+", "+objC.side3+" is:"+areaC);
}
}