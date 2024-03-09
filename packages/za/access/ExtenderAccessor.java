package OOP.packages.za.access;

import OOP.packages.co.za.AccessMe;

public class ExtenderAccessor extends AccessMe{
    public static String getProperty(){
        return AccessMe.getName("John");
    
}
}