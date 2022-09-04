package com.greatlearning.oopsweek2;
public class InheritanceC extends InheritanceB {
    static float val,s,side1,side2,side3,area;
public float triangleArea(float s1, float s2, float s3 ){
    side1=s1;
    side2=s2;
    side3=s3;
    s=(side1+side2+side3)/2;
    val=(s*(s-side1)*(s-side2)*(s-side3));
    area=(float)Math.sqrt(val);
    return(area);
}
}
