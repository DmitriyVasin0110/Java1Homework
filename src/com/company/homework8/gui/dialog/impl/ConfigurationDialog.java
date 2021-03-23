package com.company.homework8.gui.dialog.impl;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import com.company.homework8.enums.DotType;
import com.company.homework8.gui.dialog.Configurable;

public class ConfigurationDialog extends JDialog implements  Configurable{
    public static final int MARGIN_VALUE = 10;

    public DotType playerType = DotType.X;
    public int mapSize = 3;

    public ConfigurationDialog(JFrame parentFrame) {
        super(parentFrame, "Конфигурация игры", true);

        setBounds(300, 300, 400, 200);

        JTextField mapSizeTextField = new JTextField(String.valueOf(mapSize));
        JPanel commonPanel = getConfigurationPanel(mapSizeTextField);
        JButton applyButton = createApplyButton(mapSizeTextField);
        setLayout(new BorderLayout());
        add(commonPanel, BorderLayout.CENTER);
        add(applyButton, BorderLayout.SOUTH);
        commonPanel.setBorder(BorderFactory.createEmptyBorder(MARGIN_VALUE, MARGIN_VALUE, MARGIN_VALUE, MARGIN_VALUE));
        setVisible(true);
    }

    private JPanel getConfigurationPanel(JTextField mapSizeTextField){
        int gridSize =2;
        int verticalGap =20;
        int horizontalGap = 10;

        JPanel commonPanel = new JPanel(new GridLayout(gridSize, gridSize, horizontalGap, verticalGap));
        commonPanel.add(new JLabel("Выберите за кого будете играть?"));
        commonPanel.add(createChoiceButtonPanel());
        commonPanel.add(new JLabel("Укажите размер игрового поля"));
        commonPanel.add(mapSizeTextField);
        return commonPanel;
    }
    private JButton createApplyButton(JTextField mapSizeTextField){
        JButton applyButton = new JButton("Принять");

        WindowEvent closeEvent= new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        applyButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                mapSize =Integer.parseInt(mapSizeTextField.getText());
                dispatchEvent(closeEvent);
            }
        });
        return applyButton;
    }
    private JPanel createChoiceButtonPanel(){
        JRadioButton xButtonChoice = getRadioButton("X", DotType.X, true);
        JRadioButton oButtonChoice = getRadioButton("O", DotType.O, true);
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(xButtonChoice);
        buttonPanel.add(oButtonChoice);

        ButtonGroup group = new ButtonGroup();
        group.add(xButtonChoice);
        group.add(oButtonChoice);
        return buttonPanel;
    }

    private JRadioButton getRadioButton(String text, DotType buttonDotType, boolean selected){
        JRadioButton choiceButton= new JRadioButton(text, selected);
        choiceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playerType = buttonDotType;
            }
        });
        return choiceButton;
    }
    public DotType getPlayerType(){
        return playerType;
    }
    public int getMapSize(){
        return mapSize;
    }
}
