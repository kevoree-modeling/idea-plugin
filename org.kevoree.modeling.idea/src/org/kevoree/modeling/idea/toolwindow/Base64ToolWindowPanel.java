package org.kevoree.modeling.idea.toolwindow;

import com.intellij.icons.AllIcons;
import com.intellij.openapi.ui.SimpleToolWindowPanel;
import org.kevoree.modeling.util.Base64;

import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

/**
 * Created by gnain on 11/09/15.
 */
public class Base64ToolWindowPanel extends SimpleToolWindowPanel {

    protected static final short LONG = 0;
    protected static final short INT = 1;
    protected static final short STRING = 2;
    protected static final short BOOLARR = 3;
    protected static final short DOUBLE = 4;

    private boolean suspendEvent = false;
    private short algo = LONG;

    public Base64ToolWindowPanel() {
        super(true);

        setToolbar(new Base64ToolBar(this));

        JPanel container = new JPanel(new BorderLayout());

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));

        JPanel line1 = new JPanel();
        line1.setLayout(new GridLayout(1, 2));
        line1.add(new JLabel("Base64"));
        final JTextField encodedField = new JTextField(10);
        line1.add(encodedField);

        JPanel line2 = new JPanel();
        line2.setLayout(new GridLayout(1, 2));
        line2.add(new JLabel("Translated"));
        final JTextField decodedField = new JTextField(10);
        line2.add(decodedField);

        //final boolean[] suspend = new boolean[]{false};

        encodedField.getDocument().addDocumentListener(new DocumentListener() {

            private void update() {
                if (!suspendEvent) {
                    suspendEvent = true;
                    try {
                        switch (algo) {
                            case STRING: {
                                decodedField.setText(Base64.decodeToString(encodedField.getText()));
                            }
                            break;
                            case LONG: {
                                decodedField.setText("" + Base64.decodeToLong(encodedField.getText()));
                            }
                            break;
                            case INT: {
                                decodedField.setText("" + Base64.decodeToInt(encodedField.getText()));
                            }
                            break;
                            case DOUBLE: {
                                decodedField.setText("" + Base64.decodeToDouble(encodedField.getText()));
                            }
                            break;
                            default:
                                System.err.println("Base64 tool window: Algo not supported:" + algo);
                        }
                    } catch (Exception e) {
                    }
                    suspendEvent = false;
                }
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                update();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                update();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }
        });

        decodedField.getDocument().addDocumentListener(new DocumentListener() {

            private void update() {
                if (!suspendEvent) {
                    suspendEvent = true;
                    try {
                        switch (algo) {
                            case STRING: {
                                encodedField.setText(Base64.encodeString(decodedField.getText()));
                            }
                            break;
                            case LONG: {
                                encodedField.setText(Base64.encodeLong(Long.valueOf(decodedField.getText())));
                            }
                            break;
                            case INT: {
                                encodedField.setText(Base64.encodeInt(Integer.valueOf(decodedField.getText())));
                            }
                            break;
                            case DOUBLE: {
                                encodedField.setText(Base64.encodeDouble(Double.parseDouble(decodedField.getText())));
                            }
                            break;
                            default:
                                System.err.println("Base64 tool window: Algo not supported:" + algo);
                        }
                    } catch (Exception e) {
                    }
                    suspendEvent = false;
                }
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                update();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                update();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }
        });


        mainPanel.add(line1);
        mainPanel.add(line2);

        container.add(mainPanel, BorderLayout.NORTH);
        getComponent().add(container);

    }


    protected void setAlgo(short newAlg) {
        algo = newAlg;
    }


}
