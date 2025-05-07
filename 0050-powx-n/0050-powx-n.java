class Solution {
    public double sol(double x, long n){
        if(n==0) return 1;
        double temp = sol(x,n/2);
        if(n%2==1){
            return temp*temp*x;
        }
        return temp*temp;
    }
    public double myPow(double x, int n) {
        boolean flag = true;
        long ln = n;
        if(ln<0){
            ln*=-1;
            flag=false;
        }
        double ans = sol(x,ln);
        if(!flag){
            ans = 1/ans;
        }
        return ans;
    }
}