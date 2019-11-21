import java.util.HashSet;
        import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> hashSet = new HashSet<>();
        while(scanner.hasNext()){
            hashSet.add(scanner.next());
        }
        int number = hashSet.size();
        System.out.println(number);
    }
}
