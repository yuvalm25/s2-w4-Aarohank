public class RefillableMain{
    public static void main(String[] args) {
        Refillable r = new Refillable(100);
        r.useUp(10);
        System.out.println(r.currentAmount());

        CokeCooler c = new CokeCooler(400);
        c.useUp(100);
    }
}