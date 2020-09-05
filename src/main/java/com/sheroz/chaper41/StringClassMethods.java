package com.sheroz.chaper41;

public class StringClassMethods {
    public static void main (String []args){
        String test = "Test";
        String test2 = "test";
        String test3 = test;
        String test4 = "end";
        System.out.println("1. "+ test.charAt(0));
        System.out.println("2. "+ test.compareTo(test2));
        System.out.println("3. "+ test.compareToIgnoreCase(test2));
        System.out.println("4. "+ test.contains("t"));
        System.out.println("5. "+ test.endsWith("t"));
        System.out.println("6. "+ test.equals(test2));
        System.out.println("7. "+ test.equalsIgnoreCase(test2));
        System.out.println("8. "+ test.indexOf("q"));
        System.out.println("9. "+ test.indexOf(test3));
        System.out.println("10. "+ test.indexOf(test2,1));
        System.out.println("11. "+ test.lastIndexOf("t"));
        System.out.println("12. "+ test.lastIndexOf(test2));
        System.out.println("13. "+ test.lastIndexOf(test2,1));
        System.out.println("14. "+ test.length());
        System.out.println("15. "+ test.replace("T","r"));
        System.out.println("16. "+ test.replaceAll(test, test4));
        System.out.println("17. "+ test.replaceFirst("T", test4));
        System.out.println("18. "+ test.split(test));
        System.out.println("19. "+ test.startsWith(test4));
        System.out.println("20. "+ test.startsWith(test4,2));
        System.out.println("21. "+ test.substring(2));
        System.out.println("22. "+ test.substring(2,3));
        System.out.println("23. "+ test.toCharArray());
        System.out.println("24. "+ test.toLowerCase());
        System.out.println("25. "+ test.toString());
        System.out.println("26. "+ test.toUpperCase());
        System.out.println("27. "+ test.trim());
        System.out.println("27. "+ test.valueOf(9));



    }
}
