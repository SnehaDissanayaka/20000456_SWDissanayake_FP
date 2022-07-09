object Q1 extends App {
   var k, i, j = 2
   var m, n = 5
   var f = 12.0f
   var g = 4.0f
 //  var c = 'X'
 //  printf("%d %d %d %d %d %.1f %.1f %s",i,j,m,n,k,f,g,c)
 //  printf("%d",i)
   println ("\nQuestion 2\n");
   var x1:Int = k + 12 * m	
   var x2:Double = m / j
   var x3:Int = n % j
   var x4:Double = m / j * j
   var x5:Double = f + 10*5 +g
   i=i+1
   //++i(or any increment or decrement) not supported in scala
   var x6:Int = i * n
   printf("\n%d\n%f\n%d\n%f\n%f\n%d",x1,x2,x3,x4,x5,x6)
   /*
   int a = 2, b = 3, c = 4, d = 5;
   float k = 4.3f;
   */
   var a:Int = 2
   var b:Int = 3
   var c:Int = 4
   var d:Int =5
   //var k:Float = 4.3f
   println ("\nQuestion 3\n");

   //println( - -b * a + c *d - -);
   b=b-1;
   println(b * a + c *d);
   a = a+1;
   println( a );
   println (-2 * ( g - k ) +c);
   c = c+1;
   println (c);
   c=(c+1)*a;
   println(c);
}