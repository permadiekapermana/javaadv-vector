import java.util.Vector;

public class TaskVector {
    public static Vector<String> createVector() {
		Vector<String> vector = new Vector<String>();
        vector.add("I'm");
        vector.add("in");
        vector.add("Java");
        vector.add("Practice.");
		return vector;		
    }
    
    public static void main(String[] args) {
        for(int i=0;i<createVector().size();i++) {
            System.out.print(createVector().get(i) + " ");
        }
    }
    
}
