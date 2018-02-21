package com.illuxplain.utils;

import org.springframework.stereotype.Component;

@Component
public class BlogContentManagement {

    public String convertToLowerCaseAndStripeWithDash(String str) throws Exception {
        if(str == null)
        {
            throw new Exception("Str cannot be null");
        }
        String s = str.trim().toLowerCase();
        String addDash = s.replaceAll(" ", "-");
        return addDash;
    }
}
