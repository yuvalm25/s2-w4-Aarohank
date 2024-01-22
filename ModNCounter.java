
 public class ModNCounter extends Counter {
   //Put instance variables here
   
   public ModNCounter(){
      super();
   }

   public void increment(int lim){
      super.increment();
      if(super.value() >= lim){
         super.reset();
      }
   }
   
   
   //Add additional methods to provide functionality to make the counter count in terms of "mod N"




}