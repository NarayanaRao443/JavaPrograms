public class EncapsulationTest {
    public static void main(String[] args) {
        EncapsulationAc ac = new EncapsulationAc();
        ac.setName("Nani");
        ac.setAcno(123456789);
        ac.setAmount(10000.50f);

        System.out.println(ac.getName() + " " + ac.getAcno() + " " + ac.getAmount());
    }
}
