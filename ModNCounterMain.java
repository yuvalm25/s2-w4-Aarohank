public class ModNCounterMain{
    public static void main(String[] args) {
        ModNCounter m = new ModNCounter(0);
        for(int i = 0; i < 15; i++){
            m.increment();
            System.out.println(m.value());
        }
    }
}