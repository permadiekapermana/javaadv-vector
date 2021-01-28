import java.util.Vector;

public class ExampleVector {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>();
        vector.add("Hello");
        vector.add("World");
        for(int i=0;i<vector.size();i++) {
            System.out.print(vector.get(i) + " ");
        }
    }
}