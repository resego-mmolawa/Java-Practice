/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;
import java.util.Scanner;

/**
 *
 * @author reseg
 */
public class VowelCount {

    public static int countVowels(String word) {
        word = word.toLowerCase();  // Convert the word to lowercase
        int wordLength = word.length();
        int count = 0;  // Initialize count outside the loop
    
        String vowels = "aeiou";  // Define vowels
    
        for (int ch = 0; ch < wordLength; ch++) {  // Loop over each character in the word
            char currentChar = word.charAt(ch);  // Get the current character
    
            // Check if the current character is a vowel using indexOf
            if (vowels.indexOf(currentChar) != -1) { //If the character is not found, indexOf returns -1. So if it is not -1, that adds to the vowel count
                count++;  // Increment count if the current character is a vowel
            }
        }
    
        return count;  // Return the total count of vowels
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a word: ");
        String word = input.next();

        System.out.println("Vowel count = " + VowelCount.countVowels(word));
    }
}
