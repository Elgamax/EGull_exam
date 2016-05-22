package view;

import javax.swing.*;
import java.awt.*;

/**
 * Created by quentin on 22/05/16.
 */
public class Search_page implements MyDisplay
{
    private JFrame window;
    private JTextField text_search;
    private JButton search;
    private JPanel hud;

    public Search_page(JFrame window)
    {
        this.window = window;
        text_search = new JTextField();
        search = new JButton("Search");
        search.setPreferredSize(new Dimension(40,40));
        search.setName("Search_button");
    }

    @Override
    public void show()
    {
        this.window.getContentPane().removeAll(); // ready to get news things
        hud = new JPanel();
        hud.setLayout(new BoxLayout(hud, BoxLayout.PAGE_AXIS));
        JLabel text_info = new JLabel("user name :");
        hud.add(Box.createVerticalGlue()); // just to center the important display
        hud.add(text_info);
        hud.add(text_search);
        hud.add(search);
        hud.add(Box.createVerticalGlue()); // just to center the important display
        this.window.add(hud);

        window.setTitle("Search page");
        window.setVisible(true);
        window.revalidate();
        window.repaint();
    }

    public void update()
    {

    }


    public JButton getSearch_button()
    {
        return search;
    }
}
