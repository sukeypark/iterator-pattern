import com.example.MenuTree;
import com.example.Waitress;

public class App {
    public static void main(String[] args) throws Exception {

        MenuTree menuTree = new MenuTree();
        /*
         * Add tree items
         */

        Waitress waitress = new Waitress(menuTree);
        waitress.printMenuItems();
    }
}
