public class Solution {  
    public String addStrings(String num1, String num2) {  
        // Create a StringBuilder to hold the result of the addition.  
        StringBuilder str = new StringBuilder();  
        
        // Initialize pointers for the end of each input number.  
        int i = num1.length() - 1;  
        int j = num2.length() - 1;  
        
        // Initialize a carry variable to manage sums greater than 10.  
        int carry = 0;  
        
        // Loop while there are still digits to process or a carry exists.  
        while (i >= 0 || j >= 0 || carry > 0) {  
            // Get the current digit from num1 (0 if out of bounds).  
            int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;  
            // Get the current digit from num2 (0 if out of bounds).  
            int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0;  
            
            // Calculate the sum of the digits and the carry.  
            int sum = digit1 + digit2 + carry;  
            
            // Append the last digit of the sum to the StringBuilder.  
            str.append(sum % 10);  
            // Update the carry for the next iteration.  
            carry = sum / 10;  
            
            // Move to the next digits (to the left).  
            i--;  
            j--;  
        }  
        
        // Reverse the StringBuilder since digits were appended in reverse order.  
        str.reverse();  
        
        // Convert the StringBuilder to a string and return the result.  
        return str.toString();  
    }  
}