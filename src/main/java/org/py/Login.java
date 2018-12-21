package org.py;

import javax.swing.*;

public class Login {
    private JPanel mainPanel;
    private JTextField usernameTextField;
    private JPasswordField pwdField;
    private JButton loginbtn;
    private JLabel usernameJlabel;
    private JLabel pwdJLabel;
    private JPanel btnPanel;
    private JPanel cPanel;

    public Login() {}

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public void setMainPanel(JPanel mainPanel) {
        this.mainPanel = mainPanel;
    }

    public JTextField getUsernameTextField() {
        return usernameTextField;
    }

    public void setUsernameTextField(JTextField usernameTextField) {
        this.usernameTextField = usernameTextField;
    }

    public JPasswordField getPwdField() {
        return pwdField;
    }

    public void setPwdField(JPasswordField pwdField) {
        this.pwdField = pwdField;
    }

    public JButton getLoginbtn() {
        return loginbtn;
    }

    public void setLoginbtn(JButton loginbtn) {
        this.loginbtn = loginbtn;
    }

    public JLabel getUsernameJlabel() {
        return usernameJlabel;
    }

    public void setUsernameJlabel(JLabel usernameJlabel) {
        this.usernameJlabel = usernameJlabel;
    }

    public JLabel getPwdJLabel() {
        return pwdJLabel;
    }

    public void setPwdJLabel(JLabel pwdJLabel) {
        this.pwdJLabel = pwdJLabel;
    }

    public JPanel getBtnPanel() {
        return btnPanel;
    }

    public void setBtnPanel(JPanel btnPanel) {
        this.btnPanel = btnPanel;
    }

    public JPanel getcPanel() {
        return cPanel;
    }

    public void setcPanel(JPanel cPanel) {
        this.cPanel = cPanel;
    }
}
