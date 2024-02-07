import com.example.MenuItem;
import com.example.MenuTree;

public class App {
    public static void main(String[] args) throws Exception {

        MenuTree menuTree = new MenuTree();
        /*
         * Add tree items
         */

        for (MenuItem menuItem : menuTree) {
            menuItem.print();
        }
    }
}
