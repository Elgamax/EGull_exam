package view;

import javax.swing.*;

/**
 * Created by quentin on 22/05/16.
 */
public class Result_page implements MyDisplay
{
    private String user_name;
    private JFrame frame;
    private JLabel result;
    private JLabel header;
    private JButton prev_button;
    private JPanel hud;

    public Result_page(String user_name)
    {
        this.user_name = user_name;

    }

    @Override
    public void show()
    {

    }

}
