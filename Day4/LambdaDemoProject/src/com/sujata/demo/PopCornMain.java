package com.sujata.demo;

/*
1. A lambda expression can have zero, one or more parameters.
2. The type of the parameters can be explicitly declared or it can be inferred from the context.
3. Multiple parameters are enclosed in mandatory parentheses and separated by commas.
4. Empty parentheses are used to represent an empty set of parameters.
5. When there is a single parameter, if its type is inferred, it is not mandatory to use parentheses. e.g. a -> return a*a.
6. The body of the lambda expressions can contain zero, one or more statements.
If body of lambda expression has single statement curly brackets are not mandatory
and the return type of the anonymous function is the same as that of the body expression.
7. When there is more than one statement in body than these must be enclosed in curly brackets.

 */
@FunctionalInterface
interface Operation{
    int operate(int number1,int number2);
}

@FunctionalInterface
interface Greet{
    void wish(String name);
}

public class PopCornMain {
    public static void main(String[] args) {
//        PopCorn p1=new PopCorn();
//        p1.pop();

        int i=10;
        String str="Sujata";

        //Anonymous Inner Class
        PopCorn butterPopCorn=new PopCorn(){
          @Override
          public void pop(){
              System.out.println("Buttery PopCornPopping");
          }

            @Override
            public int price() {
                return 100;
            }
        };

        butterPopCorn.pop();



//        Operation addition=new Operation() {
//            @Override
//            public int operate(int number1, int number2) {
//                return number1+number2;
//            }
//        };

        //JDK 1.8
//        Operation addition=(int number1, int number2)-> {
//                return number1+number2;
//            };

//        Operation addition=(number1, number2)-> {
//            return number1+number2;
//        };

        Operation addition=(number1, number2)-> number1+number2;

        System.out.println(addition.operate(10,20));

//        Greet morning=new Greet() {
//            @Override
//            public void wish(String name) {
//                System.out.println("Good Morning "+name);
//            }
//        };

        Greet morning=name-> System.out.println("Good Morning "+name);

        morning.wish("Aarushi");


    }
}
