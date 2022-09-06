object tutorial_6 extends App{

    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    val Encrypt=(c:Char,key:Int,a:String)=>
    a((a.indexOf(c.toUpper)+key)%a.size);

    val Decrypt=(c:Char,key:Int,a:String)=>
    a((a.indexOf(c.toUpper)-key)%a.size);

    val cipher=(algo:(Char,Int,String)=>
    Char,s:String,key:Int,a:String)=>
    s.map(algo(_,key,a));

    val ct=cipher(Encrypt,text,5,alphabet);

    val pt=cipher(Decrypt,ct,5,alphabet);

    val text= "thff";

    println(ct.map(_.toLower));
}