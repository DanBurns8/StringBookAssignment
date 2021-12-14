package com.company;

public class BookAssingment {

   public static String scroll(String s) {
       return s.substring(1) + s.substring(0, 1);
   }

   public static String convertName(String n) {
       int x = n.indexOf(",");
       return n.substring(x + 1) + " " + n.substring(0, x);
   }


   public static String negative(String n) {
       String a = "";
       a = n.replace("0", "x");
       a = a.replace("1", "0");
       a = a.replace("x", "1");
       return a;
   }

   public static String dateString(String date) {
       String x = date.substring(0, date.indexOf("/"));
       date = date.substring(date.indexOf("/") + 1);
       String y = date.substring(0, date.indexOf("/"));
       String z = date = date.substring(date.indexOf("/") + 1);
       return y + "-" + x + "-" + z;
   }

   public static String dateString2(String date) {
       String x = date.substring(0, date.indexOf("/"));
       date = date.substring(date.indexOf("/") + 1);
       String y = date.substring(0, date.indexOf("/"));
       String z = date.substring(date.indexOf("/") + 1);
       return y + "-" + x + "-" + z;
   }

    public static boolean startsWith(String a, String b){
        int x = b.length();
        int y = a.length();
        if(x>y) return false;

        return a.substring(0,x).equals(b);
    }

    public static boolean endsWith(String a, String b){
        int x = b.length();
        int y = a.length();
        if(x>y) return false;

        return a.substring(y-x).equals(b);
    }

    public static String removeTag(String a, String b){
        String d = "<"+b+">";
        String c = "</"+b+">";
        int x = d.length();
        int y = a.indexOf(d);
        if(y == -1) return a;

        int z = a.indexOf(c, y+1);
        if(z == -1) return a;

        return a.substring(y+x,z);
    }

   public static void main(String[] args) {
       System.out.println(scroll("Hello World"));
       System.out.println(scroll("happy"));
       System.out.println(scroll("h"));
       System.out.println(convertName(" Reubenstein, Lori Renee "));
       System.out.println(convertName("Biden,Joe"));
       System.out.println(convertName("the Clown, Bozo"));
       System.out.println(negative("0010111001"));
       System.out.println(negative("11111111"));
       System.out.println("04/20/2014 becomes " + dateString("04/20/2014"));
       System.out.println("04/20/2014 becomes" + dateString2("04/20/2014"));
       System.out.println("4/20/2014 becomes" + dateString2("4/20/2014"));
       System.out.println("04/2/2014 becomes" + dateString2("04/2/2014"));
       System.out.println("4/2/2014 becomes" + dateString2("4/2/2014"));
       System.out.println("\nstartsWith");
       System.out.println(startsWith("architecture", "arch"));
       System.out.println(startsWith("architecture", "a"));
       System.out.println(startsWith("arch", "architecture"));
       System.out.println(startsWith("architecture", "rch"));
       System.out.println(startsWith("architecture", "architecture"));
       System.out.println("\nendsWith");
       System.out.println(endsWith("astronomy", "nomy"));
       System.out.println(endsWith("astronomy", "y"));
       System.out.println(endsWith("astronomy", "nom"));
       System.out.println(endsWith("nomy", "astronomy"));
       System.out.println(endsWith("astronomy", "astronomy"));
       System.out.println("\nremoveTag");
       System.out.println(removeTag("<b>Hello World</b>", "b"));
       System.out.println(removeTag("<b>Hello World</b>", "head"));
       System.out.println(removeTag("Hello World</b>", "b"));
       System.out.println(removeTag("<b>Hello World", "b"));
       System.out.println(removeTag("</img>Hello World<img>", "img"));
       System.out.println(removeTag("Happy Birthday <b>Hello World</b>", "b"));
       System.out.println(removeTag("<title>Hello World</title> Happy Birthday", "title"));
       System.out.println(removeTag("Happy <b>Hello World</b> Birthday", "b"));

   }

}
//"C:\Program Files\Java\jdk-16.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Educational Edition 2021.1.3\lib\idea_rt.jar=51766:C:\Program Files\JetBrains\IntelliJ IDEA Educational Edition 2021.1.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\student\IdeaProjects\String Book Assignment\out\production\String Book Assignment" com.company.BookAssingment
//ello WorldH
//appyh
//h
// Lori Renee   Reubenstein
//Joe Biden
// Bozo the Clown
//1101000110
//00000000
//04/20/2014 becomes 20-04-2014
//04/20/2014 becomes20-04-2014
//4/20/2014 becomes20-4-2014
//04/2/2014 becomes2-04-2014
//4/2/2014 becomes2-4-2014
//
//startsWith
//true
//true
//false
//false
//true
//
//endsWith
//true
//true
//false
//false
//true
//
//removeTag
//Hello World
//<b>Hello World</b>
//Hello World</b>
//<b>Hello World
//</img>Hello World<img>
//Hello World
//Hello World
//Hello World