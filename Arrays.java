// Learning arrays :--

import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        System.out.println("Shivash");
        // making an arraay (non-primitive data type)
        // its like areating an object, which has a refrence value in the memory
        int[] marks = new int[5];
        marks[0] = 88;
        marks[1] = 77;
        marks[2] = 99;
        marks[3] = 67;
        
        // how to print values of arrays
        System.out.println(marks[2]);
        
        // for initialization, array is set to null values rather than garbage values
        // array -> null    int->0   boolean->null otherPrimitive -> null
        
        // leangth [ here length is property of array not a function of arry so we do not have to us () ]
        System.out.println(marks.length);
        
        
        
        // Sorting
        Arrays.sort(marks);
        System.out.println(marks[0]);
        // all the classes in the java start with a capital letter
        
        // if we already know the number of values to be stared in an arraay then we dont have to use new
        int[] num = { 97,98,99 };
        System.out.println(num[2]);
        // the new key word can be used to create arraays which bechave more live vectors
        
        
        // learning two dimensional arrays
        // two students marks
        int[][] finalMarks = {{98,99,97},{94,05,98}};
        System.out.println(finalMarks[1][1]);
        
  
        
    }
}