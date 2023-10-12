import java.util.*;
import java.lang.Character;

class splcharco {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter");
        String input = s.nextLine();
        int c=0;
        for(int i=0; i<input.length() ;i++){
            c+= (Character.isDigit(input.charAt(i)) || Character.isLetter(input.charAt(i)))? 0 : 1;
        }
        System.out.printf(" value %d",c);
        s.close();

    }}