import java.util.Scanner;

public class One {
    static void sortWords(String[] words){
        int n = words.length;
        boolean flag = true;
        for(int i=0; i<n-1 && flag; i++){
            flag = false;
            for(int j=0; j<n-i-1; j++){
                if(words[j].compareTo(words[j+1]) > 0){
                    String temp = words[j];
                    words[j] = words[j+1];
                    words[j+1] = temp;
                    flag = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of words:");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume the newline character
        String[] words = new String[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter word " + (i+1) + ": ");
            words[i] = scanner.nextLine();
        }
        sortWords(words);
        System.out.println("Sorted words:");
        for(String word : words){
            System.out.println(word);
        }
    }
}
