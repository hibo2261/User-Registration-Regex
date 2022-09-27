package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {


    public static void toCheckForPhoneNumberValidation(String mobileNumber){


        boolean isMobileNumber;
        String mobileNumberRegex = "^[9][1] [0-9]{10}$";;
        Pattern obj = Pattern.compile(mobileNumberRegex);
        if (mobileNumber == null) {
            isMobileNumber = false;
        }
        Matcher matcherObj = obj.matcher(mobileNumber);
        isMobileNumber =  matcherObj.matches();

        if(isMobileNumber ) {
            System.out.println(mobileNumber + " is a Valid  Number.");
        }
        else
            System.out.println(mobileNumber+" is a Invalid  Number.");

    }
}