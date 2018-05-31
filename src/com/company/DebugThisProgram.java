package com.company;

public class DebugThisProgram {
    public static void main(String[] args) {
      double x, y; // Line 5
        /*
        x = 3.1415;
        y = 3.64;

        Lines 7 and 8 create an error because
        decimal number are stored in variables of datatype int
        Datatypes double and int are not compatible

        To fix this program, change datatype int to double in line 5
        */

        x = 3.1415;
        y = 3.64;

        System.out.println("pi is approximately " + x);
        System.out.println("My GPA was " + y);
    }
}
