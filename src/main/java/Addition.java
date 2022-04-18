public class Addition {
    public int add(int a,int b){
        return a+b;
    }
}
class Subtraction{
    public int sub(int a,int b){
        return a-b;
    }
}
class Multiplication{
    public int mul(int a,int b){
        return a*b;
    }
}
class Division{
    public int div(int a,int b){
        if(b==0)
            throw new ArithmeticException("B value should be non-zero");
        return (a/b);
    }
}
