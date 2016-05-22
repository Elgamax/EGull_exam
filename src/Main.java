import controller.Controller;
import view.Result_page;
import view.Search_page;

import javax.swing.*;

/**
 * Created by quentin on 22/05/16.
 */
public class Main
{
    public static void main(String args[])
    {
        JFrame window = new JFrame();
        window.setSize(800, 600);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Search_page search_page = new Search_page(window);
        Result_page result_page = new Result_page("", window);

        // add listeners on buttons
        Controller controller = new Controller(search_page, result_page);
        JButton search_button = search_page.getSearch_button();
        JButton back_button = result_page.getBack_button();
        search_button.addActionListener(controller);
        back_button.addActionListener(controller);
        search_page.show();
    }
}
