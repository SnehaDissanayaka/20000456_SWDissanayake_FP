object question_6 extends App{
    
    def fib(n:Int):Int = n match{
        case 0 => 0;
        case x if x==1 => 1
        case _ => fib(n-1)+fib(n-2)
    }

    println(fib(4));
    println(fib(10));

}