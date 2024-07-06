package com.arrays;

public class ArrayExample {
    public static void main(String[] args) {
        singleDimensionalArray();
//        twoDimentionalArray();
//        concatMethod();
//        equalsMethod();
//        splitMethod();
//        subStringMethod();
//        internMethod();
//        containsMethod();
//        charAtMethod();
//        trimMethod();
//        stringComparisionMethod();
//        stringCompareTOMethod();
    }

    public static void singleDimensionalArray(){
        String variableName[]={"Hello","Hi","How","Are","You"};
        for(int i=0;i<5;i++){
            System.out.println(variableName[i]+"");
        }
        System.out.println();
        System.out.println(variableName[3]);
        variableName[1]="sir";
        for(int i=0;i<5;i++){
            System.out.println(variableName[i]+"");
        }
    }
    public static void twoDimentionalArray(){
        int variableName[][] = {{1,2,3,4},{5,6,7,8}};
        System.out.println(variableName[0][1]);
        System.out.println(variableName[1][2]);
        variableName[1][2] = 10;
        System.out.println(variableName[1][2]);
        for (int i=0; i<2; i++){
            for(int j=0; j<4; j++)
                System.out.print(variableName[i][j] +" ");
            System.out.println();
        }
    }
    public static void concatMethod(){
        String message = "Happy Birth day";
        String messageto = " World";
        System.out.println(message.concat(messageto));
//        System.out.println(message.concat( " " + "World"));
//        String messageTo = message.concat( " " + "World");

//        System.out.println(messageTo);
    }
    public static void equalsMethod(){

//        String message = new String("Hello");
//        String messageOne = new String("Hello");

        String message = "Hello";
        String messageOne = "Hello";
        System.out.println("The given two strings are equal?:"+ message . equals(messageOne));
    }
    public static void splitMethod(){
        String message = "welcome @to @ Networkz system";
//        String java="I love java";
        System.out.print("Read the String is: ");
        for(String readdata : message.split("@")){
            System.out.print(readdata);
        }
        System.out.println();
//        System.out.println();
        System.out.println("Length of message string:" + message.length());
        System.out.println("Replace of message string in welcome:" + message.replace("welcome", "Hello"));
    }

        public static void subStringMethod(){
        String java = "I love java";
//                     012345678910
        String a = java.substring(7);//all index start from 0
            System.out.println(a);
            String b = java.substring(2,6);//second index display after -1(ie 6-1=5. 5th value display)
            System.out.println(b);
            System.out.println("Length of string: " +java.length());//index start from 1
            String c = java.substring(7,java.length());
            System.out.println(c);
//            String d = java.substring(7,12);//it show error becaz outofboundindexvalue
            String e = java.substring(2,2);
            System.out.println(e);
//            System.out.println(e.length());
            String f = java.substring(4,5);
            System.out.println(f);
        }

    public static void internMethod(){
//        The method intern() creats an exact copy of a String
//        Object in the heap memory and stores it in the string constant pool

//        String stringOne ="hello";
//        String stringTwo ="hello";
//        System.out.println(stringOne==stringTwo); //true (becaz its in scp)

        String stringOne = new String("network");
        String stringTwo = new String("network");
        System.out.println(stringOne==stringTwo);   //false
        stringOne = stringOne.intern();
        stringTwo = stringTwo.intern();
        System.out.println(stringOne == stringTwo); //true
    }
    public static void containsMethod(){
        String stringOne="Networkz System";
        if(stringOne.contains("Networkz")){
            System.out.println("String is found in stringone");
        } else if (stringOne.contains("networkz")) {
            System.out.println("string is not found in strigOne");
        }else {
            System.out.println("End of the program");
        }
    }
    public static void charAtMethod(){
        String stringOne = "Networkz systems";
        char indexOne = stringOne.charAt(4);
        char indexTwo = stringOne.charAt(7);
        char indexThree = stringOne.charAt(8);
        System.out.println(indexOne);
        System.out.println(indexTwo);
        System.out.println(indexThree);
        System.out.println(stringOne.charAt(9));

    }
    public static void trimMethod(){
        String stringWithWhitespace = "     Hello, World    ";

        String trimmedString = stringWithWhitespace.trim();
        System.out.println("Original string: \"" + stringWithWhitespace + "\"");
        System.out.println("Trimmed string: \"" + trimmedString + " \"");
//        System.out.println(trimmedString);
        System.out.println(stringWithWhitespace);

    }
    public static void stringComparisionMethod(){
        //  1.equals()----> true or false
        //  2.==--->  true or false
        //  3. compareTo() --->s1=s2 = 0; s1>s2 = +ve; s1<s2 = -ve
        String stringOne = "Networkz";
        String stringTwo = "networkz";
        String stringThree = "pyworks";
        String stringFour = new String(stringOne);
        // equal method
        System.out.println(stringOne.equals(stringTwo));
        System.out.println(stringTwo.equals(stringThree));
        System.out.println(stringOne.equalsIgnoreCase(stringTwo));// case sensitive
        System.out.println(stringOne.equals(stringFour));   //it checks only values
        System.out.println(stringOne==stringFour);

    }

    public static void stringCompareTOMethod(){
        String s1 = "Sachin";
        String s2 = "Sachin";
        String s3 = "Ratan";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s3.compareTo(s1));

    }
}
