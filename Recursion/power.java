class Solution {
    public boolean isPowerOfFour(int n) {
        return  power(n, 0);
    }

    public boolean power(int n, int pow)
    {
        if(Math.pow(4,pow)== n)
        return true; //If found, it will return true;

        if(Math.pow(4, pow)>n)
        return false;  // if power > number. Ex: n = 123. First 4,0 will be calculated then 4,1 then 4,2 then 4,3 = 64 till there power is not found 
        //but when 4,4 is calcualted then it is = 256 > 123 therefore it will return false.

        return power(n,pow+1); 
    }
}
