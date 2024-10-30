// public class EncapsulationTest {
//     public static void main(String[] args) {
        
//         EncapsulationAccount ac = new EncapsulationAccount();
//         ac.setAcno(101010);
//         ac.setName("Nani");
//         ac.setEmail("nani@gmail.com");
//         ac.setAmount(1000.0f);

//         System.out.println(ac.getAcno() +": "+ ac.getName()+": " + ac.getEmail()+" : "+ac.getAmount());
//     }
// }


/**
 * EncapsulationTest
 */
public class EncapsulationTest {

    public static void main(String[] args) {
        
        EncapsulationAccount ac = new EncapsulationAccount();
        ac.setAcno(10000);
        ac.setName("Nani");
        ac.setAmount(50005.50f);

        System.out.println(ac.getAcno() +": "+ ac.getName() +": "+ ac.getAmount());
    }
}