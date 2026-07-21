
class BusinessMan{
    int a;
    int b ;
    int c;
    {
        System.out.println("instance block");
    }
    static{
        System.out.println("static block");
    }
    BusinessMan(){
        this(10, 12);
        System.out.println("default constuctor");
    }
    BusinessMan(int a , int b ){
         this(a,b,10);
        this.a=a;
        this.b=b;
        System.out.println("sum of two number"+(a+b));

    }
      BusinessMan(int a , int b ,int c){
        this.a=a;
        this.b=b;
        this.c=c;
        
        System.out.println("sum of two number "+(a+b+c));

    }

}
 class demo1 {
    {
        System.out.println("java");
    }
    static{
        System.out.println("python");
    }
    public static void main(String[] args) {
        
    System.out.println("welcome");
    BusinessMan bc = new BusinessMan();

}
}
