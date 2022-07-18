object tutorial3 extends App{
//Quesion 1
  def area(r: Double):Double=Math.PI*Math.pow(r,2);
  printf("Area : %.2f\n",area(5));

//Quesion 2
  def convert(x:Double)=x*1.8+32;
  printf("Farenheit : %.2f\n",convert(35));

//Quesion 3
  def vol(r: Double):Double=4.0/3.0*Math.PI*r*r*r;
  printf("Volume : %.2f\n",vol(5));

//Quesion 4
  def discount(full_price:Double):Double=full_price*40/100;
  def shipping(copies:Int):Double=copies*3+(copies-50)*0.75;
  def books(price:Double,copies:Int):Double=price*copies;
  def cost(price:Double,copies:Int):Double=books(price,copies)-discount(books(price,copies))+shipping(copies);
  printf("Total wholesale cost : %.2f\n",cost(24.95,60));

//Quesion 5
  def easy_pace(distance:Double):Double=8*distance;
  def tempo(distance:Double):Double=7*distance;
  printf("Total running time : %.2f",easy_pace(2)+tempo(3)+easy_pace(2));

}
