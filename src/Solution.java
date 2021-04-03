import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
    char choice,ignore;
        do {
            System.out.println("Справка");
            System.out.println("1 - if");
            System.out.println("2 - switch");
            System.out.println("3 - for");
            System.out.println("4 - while");
            System.out.println("5 - do-while");
            System.out.println("0 - Выход");
            System.out.println("Введите:");

            choice = (char) System.in.read();

            do{
                ignore = (char) System.in.read();
            }while (ignore != '\n');
        }while (choice < '1' | choice > '5');

            switch (choice) {
               case '1':
                   System.out.println("Оператор if:\n" +
                           "if (условие) оператор;\n" +
                           "else оператор;");
                   break;
               case '2':
                   System.out.println("Оператор switch:\n" +
                           "switch (выражение) {\n" +
                           "  case (константа) :\n" +
                           "  оператор\n" +
                           "  break;\n" +
                           "  // ...\n" +
                           "}");
                   break;
               case '3':
                   System.out.println("Оператор for:\n" +
                           "for (инициализация; условие; итерация) оператор;");
                   break;
               case '4':
                   System.out.println("Оператор while:\n" +
                           "while(условие) оператор;");
                   break;
               case '5':
                   System.out.println("Оператор do-while:\n" +
                           "do {" +
                           "опреатор" +
                           "} while (условие);");
                   break;
           }
    }
}
