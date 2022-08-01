object tutorial4 extends App {
    //Question 1
    def interest(dep:Int):Double = dep match { 
        case x if x<0 =>0 
        case x if x>20000 => x*.02
        case x if x>200000 => x*.04
        case x if x>2000000 => x*.035
        case x if x>20000000 => x*.06
    }
    print("The deposited amount : ");
    var deposit = scala.io.StdIn.readInt();
    printf("The amount of interest that the money earns in a year %.2f",interest(deposit));

    //Question 2
    def patternMatch(num:Int):String = num match { 
        case x if x<0 => "Negative/Zero is input"
        case x if x%2==0 => "Even Number"
        case x if x%2==1 => "Odd Number"
    }
    print("\nEnter a number : ");
    var number = scala.io.StdIn.readInt();
    printf("%s\n",patternMatch(number));

    //Question 3
    def toUpper(str:String):String = {
         str.toUpperCase()
    }
    def toLower(str:String):String = {
        str.toLowerCase()
    }
    def formatNames(name: String)(func: String => String): String = {
    func(name)
    }
    printf("%s\n",formatNames("Benny")(toUpper(_)))
    printf("%s%s\n",formatNames("Niroshan".substring(0,2).toString)(toUpper(_)),formatNames("Niroshan".substring(2))(toLower(_)))
    printf("%s\n",formatNames("Saman")(toLower(_)))
    printf("%s%s%s",formatNames("Kumara"(0).toString)(toUpper(_)),formatNames("Kumara".substring(1,5))(toLower(_)),formatNames("Kumara"(5).toString)(toUpper(_)))
}


