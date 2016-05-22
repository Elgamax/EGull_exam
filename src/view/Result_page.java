package view;

import javax.swing.*;
import java.awt.*;

/**
 * Created by quentin on 22/05/16.
 */
public class Result_page implements MyDisplay
{
    private String user_name;
    private String result_text;
    private JFrame window;
    private JLabel result;
    private JLabel header;
    private JButton back_button;
    private JPanel hud;
    private JScrollPane scrollPane;

    public Result_page(String user_name, JFrame window)
    {
        this.user_name = user_name;


        this.window = window;
        result = new JLabel();
        header = new JLabel();
        back_button = new JButton("Back to search page");
        back_button.setPreferredSize(new Dimension(40,40));
        back_button.setName("Back_button");

        scrollPane = new JScrollPane(result);

    }

    @Override
    public void show()
    {
        this.window.getContentPane().removeAll();  // ready to get new things
        hud = new JPanel();
        hud.setLayout(new BoxLayout(hud, BoxLayout.PAGE_AXIS));
        hud.add(header);
        hud.add(scrollPane);
        hud.add(back_button);
        this.window.add(hud);

        window.setTitle("Result page");
        header.setText("User's github information : " + user_name);
        result.setText(result_text);
        window.setVisible(true);
        window.revalidate();
        window.repaint();
    }


    public JButton getBack_button()
    {
        return back_button;
    }
}
