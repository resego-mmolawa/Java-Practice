package org.yourcompany.yourproject;

public class SqueakyClean {

    public static String clean(String input) {
        int inputLength = input.length();

        for (int i = 0; i < inputLength; i++){
            if (input.contains("-")){
                return input.indexOf("-")
            }
            }
        }
        
        return input.replaceAll("4", "a").
                    replaceAll("3", "e").
                    replaceAll("0", "o").
                    replaceAll("1", "l").
                    replaceAll("7", "t").
                    replaceAll(" ", "_").
                    replaceAll("-", "");
    }

    public static void main(String[] args) {
        System.out.println(clean("H3110_w0r1d"));
    }
}
