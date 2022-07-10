object Q4b extends App {
   def no_of_atnds(ticket:Int):Int=120+(15-ticket)/5*20;
   def rev(ticket:Int):Int = no_of_atnds(ticket)*ticket;
   def cost(ticket:Int):Int=500+no_of_atnds(ticket)*3;
   def profit(ticket:Int):Int = rev(ticket)- cost(ticket);
   print(profit(15),profit(10),profit(20));
}