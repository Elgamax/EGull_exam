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

        //Search_page search_page = new Search_page(window);
        //search_page.show();

        Result_page result_page = new Result_page("Tom", window);
        result_page.show();
    }
}
