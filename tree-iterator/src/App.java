import com.example.MenuItem;
import com.example.MenuTree;
import com.example.Waitress;

public class App {
    public static void main(String[] args) throws Exception {

        MenuTree menuTree = new MenuTree();
        for (int i = 1; i < 8; i++) {
            menuTree.addItem(new MenuItem("menu" + i, "menu" + i, 0));
        }

        Waitress waitress = new Waitress(menuTree);
        waitress.printMenuItems();
        // preorder => 1 2 4 5 3 6 7
    }
}
