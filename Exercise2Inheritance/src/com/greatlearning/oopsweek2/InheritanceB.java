package com.greatlearning.oopsweek2;
public class InheritanceB extends InheritanceA {
    static float length,breadth,area;
    public float rectangleArea(float l, float b){
        length=l;
        breadth=b;
        area=length*breadth;
        return(area);
    }
}
