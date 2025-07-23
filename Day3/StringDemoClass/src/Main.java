//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String str="Sujata";
        String str1="Sujata";
        str1="batra";

        str=str.toLowerCase();
        System.out.println(str);
        String st=str.substring(2,5);
        System.out.println(st);

        StringBuilder sb=new StringBuilder("Hello");

        sb.append("Bye");
        System.out.println(sb);
        
    }
}