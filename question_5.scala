object question_5 extends App{
    
    def isEven(n:Int):Boolean= n match{
    case 0 => true
    case _ => isOdd(n-1)
    }
    def isOdd(n:Int):Boolean = !(isEven(n))
    
    def even_sum(n:Int):Int = n match{
        case x if x<2 => 0;
        case x if isEven(n) => n+even_sum(n-1);
        case x => even_sum(n-1)
    }
    println(even_sum(7));
}