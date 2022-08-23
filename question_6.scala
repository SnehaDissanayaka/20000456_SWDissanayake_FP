object question_6 extends App{
    
    def fib(n:Int):Int = n match{
        case 0 => 0;
        case x if x==1 => 1
        case _ => fib(n-1)+fib(n-2)
    }

    def fibSeq(n:Int):Unit= {
        if (n > 0) fibSeq(n-1)
        println(fib(n));
    }

    fibSeq(4);
    fibSeq(10);

}