package Solved;

public class Solution233 {
    public int countDigitOne(int n) {
        int num=n,i=1,s=0;
        while(num>0)
        {
            if(num%10==0)
                s=s+(num/10)*i;

            if(num%10==1)
                s=s+(num/10)*i+(n%i)+1;

            if(num%10>1)
                s=s+(num/10+1)*i;

            num=num/10;
            i=i*10;
        }
        return s;
    }
}
