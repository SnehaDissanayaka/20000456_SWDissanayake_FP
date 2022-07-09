object Q4a extends App{
   def net_normal_salary(normal_hrs1: Int):Int = 
      normal_hrs1*250;
   def net_OT_salary(ot_hrs1: Int):Int =
      ot_hrs1*85;
   def net_total_salary(normal_hrs2: Int, ot_hrs2: Int) = 
      net_normal_salary(normal_hrs2)+net_OT_salary(ot_hrs2);
   def tax(net_total_salary: Int):Double =
      net_total_salary*12/100;
   def take_home_salary(normal_hrs3: Int, ot_hrs3: Int):Double =
      net_total_salary(normal_hrs3,ot_hrs3)-tax(net_total_salary(normal_hrs3,ot_hrs3)); 
   printf("Take Home Salary : Rs %.2f",take_home_salary(40,30));

}