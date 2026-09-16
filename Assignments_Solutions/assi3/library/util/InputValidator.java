package library.util;
import library.model.*;
import library.service.*;
public claaa InputValidator{
    public static void checkDays(int days){
        if(days<0){
            throw new FineDayException("the input day is invalid");
        }
    }

    public static void printSummary(LibraryResorce res){
        
    }
}