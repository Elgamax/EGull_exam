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
        JFrame frame = new JFrame();

        Search_page search_page = new Search_page(frame);
        search_page.show();

       // Result_page result_page = new Result_page("Tom");
       // result_page.show();
    }
}
