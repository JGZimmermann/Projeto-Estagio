public class Ex2 {
    private int n;
    private int num;
    public Ex2(int n){
        this.n=n;
        num = 0;
    }
    private int fibonacci(int n){
        if (n<2)
            return n;
        return fibonacci(n-1)+ fibonacci(n-2);
    }
    public boolean pertence(){
        while(num < this.n+2){
            if(fibonacci(num) == this.n)
                return true;
            else num += 1;
        }
        return false;
    }

}
