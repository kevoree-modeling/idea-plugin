package org.kevoree.modeling.idea.toolwindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by gnain on 11/09/15.
 */
public class Base64ToolBar extends JToolBar implements ActionListener {

    private Base64ToolWindowPanel mainPanel;

    public Base64ToolBar(Base64ToolWindowPanel mainPanel) {

        this.mainPanel = mainPanel;

        JLabel modeLabel = new JLabel("Mode:");
        add(modeLabel);

        ButtonGroup group = new ButtonGroup();

        JToggleButton longMode = new JToggleButton("Long");
        longMode.setSelected(true);
        longMode.addActionListener(this);
        longMode.setActionCommand("long");
        group.add(longMode);
        add(longMode);

        JToggleButton doubleMode = new JToggleButton("Double");
        doubleMode.addActionListener(this);
        doubleMode.setActionCommand("double");
        group.add(doubleMode);
        add(doubleMode);

        JToggleButton intMode = new JToggleButton("Int");
        group.add(intMode);
        intMode.addActionListener(this);
        intMode.setActionCommand("int");
        add(intMode);

        JToggleButton stringMode = new JToggleButton("String");
        stringMode.addActionListener(this);
        stringMode.setActionCommand("string");
        group.add(stringMode);
        add(stringMode);

        JToggleButton boolMode = new JToggleButton("BoolArray");
        boolMode.addActionListener(this);
        boolMode.setActionCommand("bool");
        group.add(boolMode);
        add(boolMode);



        setFloatable(false);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("long")) {
            mainPanel.setAlgo(mainPanel.LONG);
        } else if (e.getActionCommand().equals("int")) {
            mainPanel.setAlgo(mainPanel.INT);
        } else if (e.getActionCommand().equals("string")) {
            mainPanel.setAlgo(mainPanel.STRING);
        } else if (e.getActionCommand().equals("bool")) {
            mainPanel.setAlgo(mainPanel.BOOLARR);
        } else if (e.getActionCommand().equals("double")) {
            mainPanel.setAlgo(mainPanel.DOUBLE);
        }
    }


}
