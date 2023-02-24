package assignment3;
/**
 * 
 * @author easv
 * 
 * Do not modify. Nothing to do.
 * 
 */
public class TeamMember {
    private int id;
    private static String name;
    private static String role;

    public TeamMember(int id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }

    public static String getName() {
        return name;
    }

    public static String getRole() {
        return role;
    }

    public int getId() {
        return id;
    }

}
