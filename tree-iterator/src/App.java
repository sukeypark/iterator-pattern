import java.util.Random;

import com.example.MenuItem;
import com.example.MenuTree;
import com.example.Waitress;

public class App {
    public static void main(String[] args) throws Exception {

        MenuTree menuTree = new MenuTree();
        Random rand = new Random();
        for (int i = 1; i < 8; i++) {
            menuTree.addItem(new MenuItem("menu" + i, "menu" + i, Math.abs(rand.nextDouble()) * 10));
        }

        Waitress waitress = new Waitress(menuTree);
        waitress.printMenuItems();
        // inorder => 가격이 낮은 순서대로
    }
}
