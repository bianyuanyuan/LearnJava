package com.test7;

import java.util.Random;

//the effect of final on fields
class Value {
    int i;

    public Value(int i) {
        this.i = i;
    }
}

public class FinalData {
    private static Random rand = new Random(47);
    private String id;

    public FinalData(String id) {
        this.id = id;
    }

    //can be compile-time constants
    private final int valueOne = 9;
    private static final int VALUE_TWO = 99;
    //typical public constant
    private static final int VALUE_THREE = 39;
    //can not be compile-time constants
    private final int i4 = rand.nextInt(20);
    static final int INT_5 = rand.nextInt(20);
    private Value value1 = new Value(11);
    private final Value value2 = new Value(22);
    private static final Value VAL_3 = new Value(33);
    //Arrays
    private final int[] a = {1, 2, 3, 4, 5, 6, 6,};

    @Override
    public String toString() {
        return id + "i4=" + i4 + ",INT_5=" + INT_5;
    }

    public static void main(String[] args) {
        FinalData finalData = new FinalData("finalData");
        //!finalData.valueOne++;//cannot do this
        finalData.value1 = new Value(89);//OK---not final
        //!finalData.value2=new Value(2);//Cannot----value2 is final
        //!finalData.VAL_3=new Value(0);//error
        //!finalData.a=new int[7];//error
        System.out.println(finalData);
        System.out.println("Create the new FinalData");
        FinalData finalData2 = new FinalData("finaldata2");
        System.out.println(finalData);
        System.out.println(finalData2);
    }
}
