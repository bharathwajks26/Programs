import java.util.*;

public class names{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<String> names= new ArrayList<>();
        System.out.print("enter size ");
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            String name=s.nextLine();
            names.add(name);
        }
        System.out.print("enter a or d ");
        String ch=s.nextLine();
        if(ch.equalsIgnoreCase("a")) {
            Collections.sort(names);
        } else {
            Collections.sort(names,Collections.reverseOrder());
        }
        for(String name:names){
            System.out.print(name+" ");
        }
        s.close();
    }
}