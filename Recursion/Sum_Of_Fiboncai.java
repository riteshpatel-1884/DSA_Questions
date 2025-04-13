class Solution _
    public int fib(int n) {
        if( n<=1 )
         return n;   // return 0 is wrong since fib(0) + fib(-1) means there is only one number to calculate,
                    // but we need 2 nos to calculate the fibonacci sum and there is no -1th term.
         int i = fib(n-1);
         int j = fib(n-2);
         return i+j;
         //OR 
         return fib(n-1)+ fib(n-2);
    }
}
