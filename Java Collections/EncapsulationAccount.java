   /*  class EncapsulationAccount
{
    private long acno;
    private String name, email;
    private float amount;

   public long getAcno()
   {
        return acno;
   }
   public void setAcno(long acno)
   {
        this.acno = acno;
   }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public float getAmount() {
        return amount;
    }
    public void setAmount(float amount) {
        this.amount = amount;
    }

}
*/
/**
 * EncapsulationAccount
 */
public class EncapsulationAccount {

    private long acno;
    private String name;
    private float amount;

    public long getAcno(){
        return acno;
    }
    public void setAcno(long acno)
    {
        this.acno = acno;
    }

    public String getName( )
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public float getAmount()
    {
        return amount;
    }
    public float setAmount(float amount)
     {
        return this.amount = amount;
     }
}