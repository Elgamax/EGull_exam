package controller;

import view.Result_page;
import view.Search_page;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by quentin on 22/05/16.
 */
public class Controller implements ActionListener
{
    private Search_page search_page;
    private Result_page result_page;

    public Controller(Search_page search_page, Result_page result_page)
    {
        this.search_page = search_page;
        this.result_page = result_page;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object source = e.getSource();
        if (source instanceof JButton)
        {
            JButton source_btn = (JButton) source;
            if (source_btn.getName().equals("Search_button"))
            {
                // FIXME do the github request to get datas and then can a update method in the view
                result_page.show();
            }
            if (source_btn.getName().equals("Back_button"))
            {
                // FIXME do the github request to get datas and then can a update method in the view
                search_page.show();
            }
        }
    }
}
