package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PalindromeChecker{
    public boolean isPalindrome(String input){
        if (input== null){
            throw new IllegalArgumentException("La cadena no puede ser null");
        }

        String cleaned = input.replaceAll("[^A-Za-z0-9]","")
                .toLowerCase();

        int left = 0, right = cleaned.length() -1;

        while (left < right){
            if(cleaned.charAt(left) != cleaned.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

}
