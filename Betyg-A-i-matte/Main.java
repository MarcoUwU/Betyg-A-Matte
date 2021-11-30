import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*
         * Detta är kladd över hur man bestämmer X position i ekvationen och talen
         * bredvid. Kan säkert göras mer säkrare genom att använda smarta metoder osv
         * but i dont care. Not my problem kekw
         */

        System.out.println("Skriv din ekvation");
        String ekvation = scan.nextLine();

        // Tar det första x position
        int index = ekvation.indexOf("x");

        char test, test2;

        if (index > 0) {

            // tar positionen av X och kollar index bredvid
            int taletBredvidXV = index - 1;

            // tar ovanför index och kollar vilket tal det är
            test = ekvation.charAt(taletBredvidXV);

            /*
             * Konverterar char till string eftersom jag inte vet vad "charAt" är i string
             * form. Anledningen till detta är för att dubbelkoll att allt funkar
             */
            String t1 = Character.toString(test);

            int taletBredvidH = index + 2;
            test2 = ekvation.charAt(taletBredvidH);
            String t2 = Character.toString(test2);

            System.out.println(t1 + "x^" + t2);

        } else {

            int taletBredvidH = index + 2;
            test = ekvation.charAt(taletBredvidH);
            String t1 = Character.toString(test);

            System.out.println("x^" + t1);

        }

        System.out.println("Skriv din lösning");
        int lösning = scan.nextInt();

        // Resten vet jag inte AHHHH

    }

}