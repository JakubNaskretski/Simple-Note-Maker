import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import static java.awt.event.ActionEvent.SHIFT_MASK;

public class View {

    JFrame frame;
    GridLayout statusPanelLayout;
    FlowLayout settingLayout ,statusLayout;
    JTextArea textArea;
    JScrollPane scrollPane;
    JMenuBar mb;
    JMenu fileMenu, editMenu, addressSubMenuItem, optionsMenu, foregroundSubMenuItem, backgroundSubMenuItem, fontSizeSubMenuItem;
    JMenuItem openMenuItem, saveMenuItem, saveAsMenuItem, exitMenuItem,
            workAddressMenuItem, homeAddressMenuItem, schoolAddressMenuItem,
            foreGroundChooserMenuItem, backGroundChooserMenuItem, fontSizeChooserMenuItem,
            fontEightPChooserMenuItem, fontTeenPChooserMenuItem, fontTwelvePChooserMenuItem, fontFourTeenPChooserMenuItem, fontSixTeenPChooserMenuItem,
            fontEightTeenPChooserMenuItem, fontTwentyPChooserMenuItem, fontTwentyTwoPChooserMenuItem, fontTwentyFourPChooserMenuItem;

    JRadioButtonMenuItem foreGroundGreenMenuItem, foreGroundOrangeMenuItem, foreGroundRedMenuItem, foreGroundBlackMenuItem, foreGroundWhiteMenuItem, foreGroundYellowMenuItem, foreGroundBlueMenuItem,
            backGroundGreenMenuItem, backGroundOrangeMenuItem, backGroundRedMenuItem,backGroundBlackMenuItem, backGroundWhiteMenuItem, backGroundYellowMenuItem, backGroundBlueMenuItem;
    JPanel statusPanel, statusInformationSubPanel,  settingsInformationSubPanel;
    JLabel foregroundStatusLabel, backgroundStatusLabel, fontSizeStatusLabel, fileStatusLabel;
    ButtonGroup menuForeGroundRadioButtonGroup, menuBackGroundRadioButtonGroup;

    public View() {
        frame = new JFrame();
        mb = new JMenuBar();
        frame.setJMenuBar(mb);
        frame.getContentPane();
        frame.setPreferredSize(new Dimension(600, 500));
        addComponentsToPane(frame.getContentPane(), mb);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        // Display frame
        frame.pack();
        frame.setVisible(true);}

    //Creates and adds to pane UI elements
    public void addComponentsToPane(Container pane, JMenuBar mb){

        //creating file menu and setting accelerators
        fileMenu = new JMenu("File");
        openMenuItem = new  JMenuItem("Open", 'o');
        saveMenuItem = new  JMenuItem("Save", 's');
        saveAsMenuItem = new  JMenuItem("Save as", 'a');
        exitMenuItem = new  JMenuItem("Exit", 'x');

        Border redline = BorderFactory.createMatteBorder(2,0,0,0, Color.red);
        exitMenuItem.setBorder(redline);

        openMenuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_O, ActionEvent.CTRL_MASK));
        saveMenuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        saveAsMenuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_A, ActionEvent.CTRL_MASK));
        exitMenuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_X, ActionEvent.CTRL_MASK));

        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.add(saveAsMenuItem);
        fileMenu.add(exitMenuItem);

        mb.add(fileMenu);

        //creating edit menu with items and settings accelerators
        editMenu = new JMenu("Edit");
        addressSubMenuItem = new JMenu("Adresy");
        workAddressMenuItem = new  JMenuItem("Praca",'p');
        homeAddressMenuItem = new  JMenuItem("Dom",'d');
        schoolAddressMenuItem = new  JMenuItem("Szkoła", 's');

        workAddressMenuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_P, ActionEvent.CTRL_MASK+SHIFT_MASK));
        homeAddressMenuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_O, ActionEvent.CTRL_MASK+SHIFT_MASK));
        schoolAddressMenuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_S, ActionEvent.CTRL_MASK+SHIFT_MASK));

        addressSubMenuItem.add(workAddressMenuItem);
        addressSubMenuItem.add(homeAddressMenuItem);
        addressSubMenuItem.add(schoolAddressMenuItem);

        editMenu.add(addressSubMenuItem);

        mb.add(editMenu);

        //creating options menu with items
        optionsMenu = new JMenu("Options");
        foregroundSubMenuItem = new  JMenu("Foreground");
        backgroundSubMenuItem = new  JMenu("Background");
        fontSizeSubMenuItem = new  JMenu("Font size");

        optionsMenu.add(foregroundSubMenuItem);
        optionsMenu.add(backgroundSubMenuItem);
        optionsMenu.add(fontSizeSubMenuItem);

        //ForeGround menu radio buttons
        menuForeGroundRadioButtonGroup = new ButtonGroup();
        foreGroundGreenMenuItem = new JRadioButtonMenuItem("Green");
        foreGroundGreenMenuItem.setForeground(Color.GREEN);
//        foreGroundGreenMenuItem.setIcon();
        foreGroundOrangeMenuItem = new JRadioButtonMenuItem("Orange");
        foreGroundOrangeMenuItem.setForeground(Color.ORANGE);
        foreGroundRedMenuItem = new JRadioButtonMenuItem("Red");
        foreGroundRedMenuItem.setForeground(Color.RED);
        foreGroundBlackMenuItem = new JRadioButtonMenuItem("Black");
        foreGroundBlackMenuItem.setForeground(Color.BLACK);
        foreGroundWhiteMenuItem = new JRadioButtonMenuItem("White");
        foreGroundWhiteMenuItem.setForeground(Color.WHITE);
        foreGroundYellowMenuItem = new JRadioButtonMenuItem("Yellow");
        foreGroundYellowMenuItem.setForeground(Color.YELLOW);
        foreGroundBlueMenuItem = new JRadioButtonMenuItem("Blue");
        foreGroundBlueMenuItem.setForeground(Color.BLUE);

        //Adding foreground menu item to the group
        menuForeGroundRadioButtonGroup.add(foreGroundGreenMenuItem);
        menuForeGroundRadioButtonGroup.add(foreGroundOrangeMenuItem);
        menuForeGroundRadioButtonGroup.add(foreGroundRedMenuItem);
        menuForeGroundRadioButtonGroup.add(foreGroundBlackMenuItem);
        menuForeGroundRadioButtonGroup.add(foreGroundWhiteMenuItem);
        menuForeGroundRadioButtonGroup.add(foreGroundYellowMenuItem);
        menuForeGroundRadioButtonGroup.add(foreGroundBlueMenuItem);

        //Adding foreground menu item to the submenu
        foregroundSubMenuItem.add(foreGroundGreenMenuItem);
        foregroundSubMenuItem.add(foreGroundOrangeMenuItem);
        foregroundSubMenuItem.add(foreGroundRedMenuItem);
        foregroundSubMenuItem.add(foreGroundBlackMenuItem);
        foregroundSubMenuItem.add(foreGroundWhiteMenuItem);
        foregroundSubMenuItem.add(foreGroundYellowMenuItem);
        foregroundSubMenuItem.add(foreGroundBlueMenuItem);

        //BackGround menu radio buttons
        menuBackGroundRadioButtonGroup = new ButtonGroup();
        backGroundGreenMenuItem = new JRadioButtonMenuItem("Green");
        backGroundGreenMenuItem.setForeground(Color.GREEN);
//        foreGroundGreenMenuItem.setIcon();
        backGroundOrangeMenuItem = new JRadioButtonMenuItem("Orange");
        backGroundOrangeMenuItem.setForeground(Color.ORANGE);
        backGroundRedMenuItem = new JRadioButtonMenuItem("Red");
        backGroundRedMenuItem.setForeground(Color.RED);
        backGroundBlackMenuItem = new JRadioButtonMenuItem("Black");
        backGroundBlackMenuItem.setForeground(Color.BLACK);
        backGroundWhiteMenuItem = new JRadioButtonMenuItem("White");
        backGroundWhiteMenuItem.setForeground(Color.WHITE);
        backGroundYellowMenuItem = new JRadioButtonMenuItem("Yellow");
        backGroundYellowMenuItem.setForeground(Color.YELLOW);
        backGroundBlueMenuItem = new JRadioButtonMenuItem("Blue");
        backGroundBlueMenuItem.setForeground(Color.BLUE);

        //Adding bg color chooser menu item to the group
        menuBackGroundRadioButtonGroup.add(backGroundGreenMenuItem);
        menuBackGroundRadioButtonGroup.add(backGroundOrangeMenuItem);
        menuBackGroundRadioButtonGroup.add(backGroundRedMenuItem);
        menuBackGroundRadioButtonGroup.add(backGroundBlackMenuItem);
        menuBackGroundRadioButtonGroup.add(backGroundWhiteMenuItem);
        menuBackGroundRadioButtonGroup.add(backGroundYellowMenuItem);
        menuBackGroundRadioButtonGroup.add(backGroundBlackMenuItem);

        //Adding background color chooser menu item to the submenu
        backgroundSubMenuItem.add(backGroundGreenMenuItem);
        backgroundSubMenuItem.add(backGroundOrangeMenuItem);
        backgroundSubMenuItem.add(backGroundRedMenuItem);
        backgroundSubMenuItem.add(backGroundBlackMenuItem);
        backgroundSubMenuItem.add(backGroundWhiteMenuItem);
        backgroundSubMenuItem.add(backGroundYellowMenuItem);
        backgroundSubMenuItem.add(backGroundBlueMenuItem);


        //Font radio buttons
        fontEightPChooserMenuItem = new JMenuItem("8 pts");
        fontEightPChooserMenuItem.setFont(new Font("SansSerif", Font.PLAIN, 8));
        fontTeenPChooserMenuItem = new JMenuItem("10 pts");
        fontTeenPChooserMenuItem.setFont(new Font("SansSerif", Font.PLAIN, 10));
        fontTwelvePChooserMenuItem = new JMenuItem("12 pts");
        fontTwelvePChooserMenuItem.setFont(new Font("SansSerif", Font.PLAIN, 12));
        fontFourTeenPChooserMenuItem = new JMenuItem("14 pts");
        fontFourTeenPChooserMenuItem.setFont(new Font("SansSerif", Font.PLAIN, 14));
        fontSixTeenPChooserMenuItem = new JMenuItem("16 pts");
        fontSixTeenPChooserMenuItem.setFont(new Font("SansSerif", Font.PLAIN, 16));
        fontEightTeenPChooserMenuItem = new JMenuItem("18 pts");
        fontEightTeenPChooserMenuItem.setFont(new Font("SansSerif", Font.PLAIN, 18));
        fontTwentyPChooserMenuItem = new JMenuItem("20 pts");
        fontTwentyPChooserMenuItem.setFont(new Font("SansSerif", Font.PLAIN, 20));
        fontTwentyTwoPChooserMenuItem = new JMenuItem("22 pts");
        fontTwentyTwoPChooserMenuItem.setFont(new Font("SansSerif", Font.PLAIN, 22));
        fontTwentyFourPChooserMenuItem = new JMenuItem("24 pts");
        fontTwentyFourPChooserMenuItem.setFont(new Font("SansSerif", Font.PLAIN, 24));

//        //Adding bg color chooser menu item to the group
//        menuBackGroundRadioButtonGroup.add(backGroundGreenMenuItem);
//        menuBackGroundRadioButtonGroup.add(backGroundOrangeMenuItem);
//        menuBackGroundRadioButtonGroup.add(backGroundRedMenuItem);
//        menuBackGroundRadioButtonGroup.add(backGroundBlackMenuItem);
//        menuBackGroundRadioButtonGroup.add(backGroundWhiteMenuItem);
//        menuBackGroundRadioButtonGroup.add(backGroundYellowMenuItem);
//        menuBackGroundRadioButtonGroup.add(backGroundBlackMenuItem);

        //Adding font chooser item to the submenu
        fontSizeSubMenuItem.add(fontEightPChooserMenuItem);
        fontSizeSubMenuItem.add(fontTeenPChooserMenuItem);
        fontSizeSubMenuItem.add(fontTwelvePChooserMenuItem);
        fontSizeSubMenuItem.add(fontFourTeenPChooserMenuItem);
        fontSizeSubMenuItem.add(fontSixTeenPChooserMenuItem);
        fontSizeSubMenuItem.add(fontEightTeenPChooserMenuItem);
        fontSizeSubMenuItem.add(fontTwentyPChooserMenuItem);
        fontSizeSubMenuItem.add(fontTwentyTwoPChooserMenuItem);
        fontSizeSubMenuItem.add(fontTwentyFourPChooserMenuItem);


        fontSizeChooserMenuItem = new  JMenuItem("Font size chooser");

        //TODO: make groups for buttons
//        do {
//            menuRadioButtonGroup.set
//            foregroundSubMenuItem.add(menuRadioButtonGroup.getElements().nextElement());
//            menuRadioButtonGroup.
//        } while (menuRadioButtonGroup.getElements().hasMoreElements());



//        fontSizeSubMenuItem.add(fontSizeChooserMenuItem);

        mb.add(optionsMenu);

        //creating main notepad area
        textArea = new JTextArea(15,25);
        scrollPane = new JScrollPane(textArea);
        pane.add(scrollPane, BorderLayout.CENTER);


        //creating status panel with labels

        fileStatusLabel = new JLabel();
        foregroundStatusLabel = new JLabel();
        backgroundStatusLabel = new JLabel();
        fontSizeStatusLabel = new JLabel();


        statusPanelLayout = new GridLayout(1, 2);
        statusPanel = new JPanel();
        statusPanel.setLayout(statusPanelLayout);
        pane.add(statusPanel, BorderLayout.SOUTH);

//        settingLayout = new FlowLayout();

        settingsInformationSubPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
//        settingsInformationSubPanel.setLayout(settingLayout);
        statusPanel.add(settingsInformationSubPanel);
//        statusPanel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

        settingsInformationSubPanel.add(foregroundStatusLabel);
        settingsInformationSubPanel.add(backgroundStatusLabel);
        settingsInformationSubPanel.add(fontSizeStatusLabel);

//        statusLayout = new FlowLayout();

        statusInformationSubPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
//        statusInformationSubPanel.setLayout(statusLayout);
        statusPanel.add(statusInformationSubPanel);
//        statusPanel.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

        statusInformationSubPanel.add(fileStatusLabel);



    }

    public JTextArea getTextArea() {
        return textArea;
    }

    public void setTextArea(JTextArea textArea) {
        this.textArea = textArea;
    }

    public JMenu getAddressSubMenuItem() {
        return addressSubMenuItem;
    }

    public void setAddressSubMenuItem(JMenu addressSubMenuItem) {
        this.addressSubMenuItem = addressSubMenuItem;
    }

    public JMenu getForegroundSubMenuItem() {
        return foregroundSubMenuItem;
    }

    public void setForegroundSubMenuItem(JMenu foregroundSubMenuItem) {
        this.foregroundSubMenuItem = foregroundSubMenuItem;
    }

    public JMenu getBackgroundSubMenuItem() {
        return backgroundSubMenuItem;
    }

    public void setBackgroundSubMenuItem(JMenu backgroundSubMenuItem) {
        this.backgroundSubMenuItem = backgroundSubMenuItem;
    }

    public JMenu getFontSizeSubMenuItem() {
        return fontSizeSubMenuItem;
    }

    public void setFontSizeSubMenuItem(JMenu fontSizeSubMenuItem) {
        this.fontSizeSubMenuItem = fontSizeSubMenuItem;
    }

    public JMenuItem getOpenMenuItem() {
        return openMenuItem;
    }

    public void setOpenMenuItem(JMenuItem openMenuItem) {
        this.openMenuItem = openMenuItem;
    }

    public JMenuItem getSaveMenuItem() {
        return saveMenuItem;
    }

    public void setSaveMenuItem(JMenuItem saveMenuItem) {
        this.saveMenuItem = saveMenuItem;
    }

    public JMenuItem getSaveAsMenuItem() {
        return saveAsMenuItem;
    }

    public void setSaveAsMenuItem(JMenuItem saveAsMenuItem) {
        this.saveAsMenuItem = saveAsMenuItem;
    }

    public JMenuItem getExitMenuItem() {
        return exitMenuItem;
    }

    public void setExitMenuItem(JMenuItem exitMenuItem) {
        this.exitMenuItem = exitMenuItem;
    }

    public JMenuItem getWorkAddressMenuItem() {
        return workAddressMenuItem;
    }

    public void setWorkAddressMenuItem(JMenuItem workAddressMenuItem) {
        this.workAddressMenuItem = workAddressMenuItem;
    }

    public JMenuItem getHomeAddressMenuItem() {
        return homeAddressMenuItem;
    }

    public void setHomeAddressMenuItem(JMenuItem homeAddressMenuItem) {
        this.homeAddressMenuItem = homeAddressMenuItem;
    }

    public JMenuItem getSchoolAddressMenuItem() {
        return schoolAddressMenuItem;
    }

    public void setSchoolAddressMenuItem(JMenuItem schoolAddressMenuItem) {
        this.schoolAddressMenuItem = schoolAddressMenuItem;
    }

    public JMenuItem getForeGroundChooserMenuItem() {
        return foreGroundChooserMenuItem;
    }

    public void setForeGroundChooserMenuItem(JMenuItem foreGroundChooserMenuItem) {
        this.foreGroundChooserMenuItem = foreGroundChooserMenuItem;
    }

    public JMenuItem getBackGroundChooserMenuItem() {
        return backGroundChooserMenuItem;
    }

    public void setBackGroundChooserMenuItem(JMenuItem backGroundChooserMenuItem) {
        this.backGroundChooserMenuItem = backGroundChooserMenuItem;
    }

    public JMenuItem getFontSizeChooserMenuItem() {
        return fontSizeChooserMenuItem;
    }

    public void setFontSizeChooserMenuItem(JMenuItem fontSizeChooserMenuItem) {
        this.fontSizeChooserMenuItem = fontSizeChooserMenuItem;
    }

    public JLabel getForegroundStatusLabel() {
        return foregroundStatusLabel;
    }

    public void setForegroundStatusLabel(JLabel foregroundStatusLabel) {
        this.foregroundStatusLabel = foregroundStatusLabel;
    }

    public JLabel getBackgroundStatusLabel() {
        return backgroundStatusLabel;
    }

    public void setBackgroundStatusLabel(JLabel backgroundStatusLabel) {
        this.backgroundStatusLabel = backgroundStatusLabel;
    }

    public JLabel getFontSizeStatusLabel() {
        return fontSizeStatusLabel;
    }

    public void setFontSizeStatusLabel(JLabel fontSizeStatusLabel) {
        this.fontSizeStatusLabel = fontSizeStatusLabel;
    }

    public JLabel getFileStatusLabel() {
        return fileStatusLabel;
    }

    public void setFileStatusLabel(JLabel fileStatusLabel) {
        this.fileStatusLabel = fileStatusLabel;
    }

    public JFrame getFrame() {
        return frame;
    }
}
