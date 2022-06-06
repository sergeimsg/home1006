import java.util.Locale;
import java.util.Scanner;

public class Task101 {
    public static void main(String[] args) {
        System.out.println("Ввести строку в формате хххх-yyy-xxxx-yyy-xyxy, где х - число, y - буква ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println(str);  // посмотрели правильно ввели или нет
        String s = str.substring(0,4 )+str.substring(8,13);
        System.out.println("1. Вывод чисел, через блоки " + s);
        char char1 = str.charAt(5);
        String repl1 = str.replace(char1,'*');
        char char2 = str.charAt(6);
        String repl2 = repl1.replace(char2,'*');
        char char3 = str.charAt(7);
        String repl3 = repl2.replace(char3,'*');
        char char4 = str.charAt(14);
        String repl4 = repl3.replace(char4,'*');
        char char5 = str.charAt(15);
        String repl5 = repl4.replace(char5,'*');
        System.out.println(repl1);
        char char6 = str.charAt(16);
        String repl6 = repl5.replace(char6,'*');
        String repl7 = repl6.substring(0,18) + str.substring(18,22); // на случай если буквы совпадут в последнем
        // блоке
        System.out.println("2. Вывод c заменой по буквам " + repl7);

        String lowCase = str.toLowerCase();
        String lowCase1 = lowCase.substring(5,9) + lowCase.substring(14,17) + lowCase.substring(18,22);
        String lowCase2 = lowCase1.replace('-', '/');
        char lowCase3 = lowCase2.charAt(7);
        String lowCase4 = lowCase2.replace(lowCase3, '/');
        char lowCase5 = lowCase4.charAt(9);
        String lowCase6 = lowCase4.replace(lowCase5, '/');
        System.out.println("3. Вывод букв " + lowCase6);
        String upperCase = str.toUpperCase();
        StringBuilder uc = new StringBuilder(upperCase);
            uc.delete(0,5).delete(3,9).replace(3,3, "/").replace(7,9, "/").
                    replace(9,10, "/").insert(0, "Letters:");
        System.out.println("4. Вывод через String builder " + uc);

       boolean cont = str.contains("abc");
       boolean cont2 = str.contains("ABC");
       if (cont == true) {
           System.out.println("5. Contains abc");


       }
        if (cont2 == true) {
            System.out.println("5. Contains ABC");

        }
        else {
           System.out.println("5. Not contains abc or ABC");
       }

        boolean start = str.startsWith("555");
                if (start == true) {
                    System.out.println("6. Start with 555");
                } else {
                    System.out.println("6. Not start with 555");
                }

        boolean end = str.endsWith("1a2b");
        if (end == true) {
                System.out.println("6. Заканчивается на 1а2в");}
        else {
            System.out.println("6. Не заканчивается на 1а2в");
        }



    }
}
