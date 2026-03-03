import java.util.ArrayList;

public class JujutsuMission {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Itadori");
        students.add("Fushiguro");
        students.add("Kugisaki");
        System.out.println("First Years Assembled: " + students);

        students.add(0, "Okkotsu");

        System.out.println("After Yuta joins: " + students);
        System.out.println("Student at index 2 is: " + students.get(2));

        students.set(1, "Ryomen Sukuna");

        System.out.println("Oh no, Itadori switched!: " + students);

        students.remove(3);
        System.out.println("After the Shibuya Incident: " + students);
        System.out.println("Remaining students: " + students.size());

        if (!students.isEmpty()) {
            System.out.println("The fight continues!");
        }
        
        students.clear();
        System.out.println("Post-Culling Game Status: " + students);
    }
}