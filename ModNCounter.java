
 public class ModNCounter extends Counter {
   //Put instance variables here
   private int lim;

   public ModNCounter(int n){
      this.lim = n;
   }

   public void increment(){
      if(super.value() == lim){
         super.reset();
      }
      super.increment();

   }
   
   
   //Add additional methods to provide functionality to make the counter count in terms of "mod N"




}