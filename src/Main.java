public class Main {
    public static void main(String[] args){
        // Create a program to count vowels
        // Then add them up into a sum

        String myWord = "Tacos";
        int vowelCounter = 0;

        for(int i = 0; i < myWord.length(); i++){
            if(Character.toLowerCase(myWord.charAt(i)) == 'a' || Character.toLowerCase(myWord.charAt(i)) == 'e' ||
                Character.toLowerCase(myWord.charAt(i)) == 'i' || Character.toLowerCase(myWord.charAt(i)) == 'o' ||
                Character.toLowerCase(myWord.charAt(i)) == 'u'){
                vowelCounter += 1;
            }
        }
        System.out.print("You have " + vowelCounter + " vowels");
    }
}
