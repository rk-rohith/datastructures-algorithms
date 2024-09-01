class Solution {  
    public boolean isValid(String s) {  
        // Convert the input string to a character array  
        char[] charArray = s.toCharArray();  
        // Initialize a stack to keep track of opening brackets  
        Stack<Character> stack = new Stack<>();  
        
        // Iterate through each character in the array  
        for (int i = 0; i < charArray.length; i++) {  
            // If the character is an opening bracket, push it onto the stack  
            if ((charArray[i] == '(') || (charArray[i] == '{') || (charArray[i] == '[')) {  
                stack.push(charArray[i]);  
            } else {  
                // If the stack is empty, it means there's no matching opening bracket  
                if (stack.isEmpty()) {  
                    return false;  
                }  
                // Check for matching closing brackets  
                // Pop from the stack and compare with the current character  
                if ((charArray[i] == ')' && stack.pop() != '(') ||   
                    (charArray[i] == '}' && stack.pop() != '{') ||  
                    (charArray[i] == ']' && stack.pop() != '[')) {  
                    return false; // Return false if there's a mismatch  
                }  
            }  
        }  
        // If the stack is empty at the end, all brackets were matched correctly  
        return stack.isEmpty();  
    }  
}