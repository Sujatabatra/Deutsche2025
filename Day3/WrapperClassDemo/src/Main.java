//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Integer iValue=10;

        iValue=Integer.parseInt("10"); //Converting String to wrapper
        iValue=Integer.valueOf(10); //Converting primitive to Wrapper

        System.out.println(iValue);

        Boolean bValue=Boolean.valueOf("true");
        System.out.println(bValue);

        Integer iValue1=Integer.parseInt("Sujata10");
        System.out.println(iValue1);

    }
}