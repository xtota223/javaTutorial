package com.sheroz.chaper41;

public class StringBuilderMethods {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Today is the day !");


        System.out.println("1. " + sb.append(sb));
        System.out.println("2. " + sb.charAt(1));
        System.out.println("3. " + sb.delete(0,5));
        System.out.println("4. " + sb.deleteCharAt(2));
        //sb.ensureCapacity(1);
        //System.out.println("5. " + sb.ensureCapacity(1));
        //System.out.println("6. " + sb.capacity(1));
        System.out.println("7. " + sb.indexOf("day"));
        System.out.println("8. " + sb.indexOf("day",4));
        System.out.println("9. " + sb.insert(7,sb));
        System.out.println("10. " + sb.lastIndexOf("the"));
        System.out.println("11. " + sb.lastIndexOf("the",1));
        System.out.println("12. " + sb.length());
        System.out.println("13. " + sb.replace(2,5,"cool"));
        System.out.println("14. " + sb.reverse());
        //System.out.println("15. " + sb.setCharAt(13,"f"));
        //System.out.println("16. " + sb.setLength(10););
        System.out.println("17"+sb.substring(4));
        System.out.println("18"+sb.substring(4,6));
        System.out.println("19"+sb.toString());
        sb.trimToSize();
        System.out.println("20"+sb);






    }
}
