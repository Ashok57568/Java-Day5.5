

   class TV{
    public void switchON(){
        System.out.println("Tv is Switched ON");
    }
    public void changeChannel(){
        System.out.println("Tv channel is changed");
    }
   }

   class SmartTV extends TV
   {
       @Override
       public void switchON(){
           System.out.println("Smart TV is Switched ON");
       }
       @Override
       public void changeChannel(){
           System.out.println("Smart Tv Browsing");
       }
   }

   public class Main {
       public static void main(String[] args) {
          TV t =new SmartTV();

           t.switchON();
           t.changeChannel();
       }
}