package Q_07;

import java.util.Scanner;

public class Q_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Word to replace: ");
        String oldWord = sc.next();

        System.out.print("New word: ");
        String newWord = sc.next();

        String[] words = sentence.split(" ");
        int i = 0;
        do {
            if (words[i].equals(oldWord)) {
                words[i] = newWord;
            }
            i++;
        } while (i < words.length);

        for (String word : words) {
            System.out.print(word + " ");
        }
    }




}
