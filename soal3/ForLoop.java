package soal3;

import java.util.Scanner;

public class ForLoop {
    public static int countWords(String text) {
        int totalkata = 1;

        for (int i = 0; i < text.length(); i++){
            if(Character.isUpperCase(text.charAt(i)) || Character.isSpaceChar(text.charAt(i))){
                totalkata++;
            }
        }

        return totalkata;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kata dengan camel case: ");
        String text = input.nextLine();

        int totalKata = countWords(text);

        System.out.println("Jumlah kata = " + totalKata);
    }
}
