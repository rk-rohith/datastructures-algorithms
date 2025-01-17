class Solution {
    public int fib(int n) {
        if (n == 0)
            return 0; // Base case F(0)
        if (n == 1)
            return 1; // Base case F(1)

        int a = 0; // F(0)
        int b = 1; // F(1)
        int c = 0; // To store F(n)

        for (int i = 2; i <= n; i++) { // Start from F(2)
            c = a + b; // F(n) = F(n-1) + F(n-2)
            a = b; // Update F(n-2)
            b = c; // Update F(n-1)
        }

        return c; // Return F(n)
    }
}