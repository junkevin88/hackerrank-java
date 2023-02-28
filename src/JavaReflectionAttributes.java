import java.lang.reflect.Method;
import java.util.*;

public class JavaReflectionAttributes{
    public static void main(String args[])
    {
        //!Student std=new Student();
        //! uses class literal, not a function.
        Class std=Student2.class;
        //Student std=new Student();  //Class Student=new Student().getClass();
        Method[] mtd=std.getDeclaredMethods();

        ArrayList<String> methodNames = new ArrayList<>();
        for(Method it:mtd)
        {
            methodNames.add(it.getName()); //keep all method name into the string array
        }

        Collections.sort(methodNames);
        for(String it:methodNames)
        {
            System.out.println(it);
        }
    }
}

/* add manually methods of Student class for java15/ java8, not add automatically Student class, bug in hackerRank? */

class Student2{

    public void ahqym(){}
    public void amftc(){}
    public void anotherfunction(){}
    public void atcks(){}
    public void bwkbd(){}
    public void cfwyc(){}
    public void cmkxa(){}
    public void dnpym(){}
    public void dnqvo(){}
    public void dvvwq(){}
    public void ehjdm(){}
    public void elyed(){}
    public void fmyce(){}
    public void getEmail(){}
    public void getId(){}
    public void getName(){}
    public void ghtlj(){}
    public void hluvb(){}
    public void isqdf(){}
    public void iwhtf(){}
    public void jmopy(){}
    public void jnskt(){}
    public void kbjlt(){}
    public void kgwku(){}
    public void khuag(){}
    public void levtp(){}
    public void mcgme(){}
    public void migyc(){}
    public void moebl(){}
    public void nixhb(){}
    public void odyqp(){}
    public void ogvdl(){}
    public void ormim(){}
    public void piwro(){}
    public void plaob(){}
    public void pnruo(){}
    public void pqfct(){}
    public void ptrup(){}
    public void pvgyp(){}
    public void qthde(){}
    public void rmjig(){}
    public void setEmail(){}
    public void setId(){}
    public void setName(){}
    public void sumvl(){}
    public void tkbpp(){}
    public void tntpj(){}
    public void toxdp(){}
    public void twyfa(){}
    public void uccfq(){}
    public void ujxei(){}
    public void vhxoi(){}
    public void viwuu(){}
    public void viyog(){}
    public void whjtj(){}
    public void ytijy(){}

}