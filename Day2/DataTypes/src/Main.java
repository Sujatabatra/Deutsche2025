//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        Integer : byte, short, int, long
        byte : 1 byte : 8 bits : (-2^7) to (2^7)-1
        short : 2 bytes : 16 bits : (-2^15) to (2^15)-1
        int : 4 bytes
        long : 8 bytes
        by default all literals in integer family are of the type int.
         */
        int i=10; //int : keyword, i:identifier, 10: literal

        byte value=(byte)130;
        System.out.println("value : "+value);

        long x=9999999999L;
//        long x=9999999999l;

        int value1=010;
        System.out.println("value 1: "+value1);

        int value2=0X10;
        System.out.println("value 2: "+value2);

        int value3=0B10;
        System.out.println("value 3: "+value3);

        /*
        character : char
        char : 2 bytes (Unicode)
         */
        char value4='A';
        char value5=(char)97;
        System.out.println("value5 : "+value5);

        /*
        Boolean : boolean
        two literal : true, false
         */
        boolean value6=true;
        }
    }
