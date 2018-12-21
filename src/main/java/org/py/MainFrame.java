package org.py;

import javax.swing.*;

public class MainFrame {
    private JPanel mPanel;
    private JPanel topPanel;
    private JPanel leftPanel;
    private JPanel cPanel;
    private JButton mainbtn;
    private JButton msgbtn;
    private JButton dbbtn;
    private JButton personalbtn;
    private JButton explorerbtn;

    public static void main(String[] args) {
        JFrame frame = new JFrame("MainFrame");
        frame.setContentPane(new MainFrame().mPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public MainFrame() { }

    public JPanel getmPanel() {
        return mPanel;
    }

    public void setmPanel(JPanel mPanel) {
        this.mPanel = mPanel;
    }

    public JPanel getTopPanel() {
        return topPanel;
    }

    public void setTopPanel(JPanel topPanel) {
        this.topPanel = topPanel;
    }

    public JPanel getLeftPanel() {
        return leftPanel;
    }

    public void setLeftPanel(JPanel leftPanel) {
        this.leftPanel = leftPanel;
    }

    public JPanel getcPanel() {
        return cPanel;
    }

    public void setcPanel(JPanel cPanel) {
        this.cPanel = cPanel;
    }

    public JButton getMainbtn() {
        return mainbtn;
    }

    public void setMainbtn(JButton mainbtn) {
        this.mainbtn = mainbtn;
    }

    public JButton getMsgbtn() {
        return msgbtn;
    }

    public void setMsgbtn(JButton msgbtn) {
        this.msgbtn = msgbtn;
    }

    public JButton getDbbtn() {
        return dbbtn;
    }

    public void setDbbtn(JButton dbbtn) {
        this.dbbtn = dbbtn;
    }

    public JButton getPersonalbtn() {
        return personalbtn;
    }

    public void setPersonalbtn(JButton personalbtn) {
        this.personalbtn = personalbtn;
    }

    public JButton getExplorerbtn() {
        return explorerbtn;
    }

    public void setExplorerbtn(JButton explorerbtn) {
        this.explorerbtn = explorerbtn;
    }
}
