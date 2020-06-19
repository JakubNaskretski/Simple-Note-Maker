import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Controller {

    private Model model;
    private View view;
    private JFileChooser jfc;

    public Controller(Model m, View v) {
        model = m;
        view = v;
        initView();
         jfc = new JFileChooser(model.getLastVisitedCatalogueModel());
    }

    public void initView() {
        updateView();
        view.getOpenMenuItem().addActionListener(e -> loadFile());
        view.getSaveMenuItem().addActionListener(e -> {
            try {
                saveFile();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });
        view.getSaveAsMenuItem().addActionListener(e -> {
            try {
                saveAsFile();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });
        view.getExitMenuItem().addActionListener(e -> exit());
//
        view.getWorkAddressMenuItem().addActionListener(e -> writeWorkAddress());
        view.getHomeAddressMenuItem().addActionListener(e -> writeHomeAddress());
        view.getSchoolAddressMenuItem().addActionListener(e -> writeSchoolAddress());
//
        view.getForeGroundGreenMenuItem().addActionListener(e -> changeForeGroundColor(1));
        view.getForeGroundOrangeMenuItem().addActionListener(e -> changeForeGroundColor(2));
        view.getForeGroundRedMenuItem().addActionListener(e -> changeForeGroundColor(3));
        view.getForeGroundBlackMenuItem().addActionListener(e -> changeForeGroundColor(4));
        view.getForeGroundWhiteMenuItem().addActionListener(e -> changeForeGroundColor(5));
        view.getForeGroundYellowMenuItem().addActionListener(e -> changeForeGroundColor(6));
        view.getForeGroundBlueMenuItem().addActionListener(e -> changeForeGroundColor(7));

        view.getBackGroundGreenMenuItem().addActionListener(e -> changeBackGroundColor(1));
        view.getBackGroundOrangeMenuItem().addActionListener(e -> changeBackGroundColor(2));
        view.getBackGroundRedMenuItem().addActionListener(e -> changeBackGroundColor(3));
        view.getBackGroundBlackMenuItem().addActionListener(e -> changeBackGroundColor(4));
        view.getBackGroundWhiteMenuItem().addActionListener(e -> changeBackGroundColor(5));
        view.getBackGroundYellowMenuItem().addActionListener(e -> changeBackGroundColor(6));
        view.getBackGroundBlueMenuItem().addActionListener(e -> changeBackGroundColor(7));


        view.getFontEightPChooserMenuItem().addActionListener(e -> {view.getTextArea().setFont(view.getFontEightPChooserMenuItem().getFont());model.setFontSizeModel("8"); updateView();});
        view.getFontTeenPChooserMenuItem().addActionListener(e -> {view.getTextArea().setFont(view.getFontTeenPChooserMenuItem().getFont());model.setFontSizeModel("10");updateView();});
        view.getFontTwelvePChooserMenuItem().addActionListener(e -> {view.getTextArea().setFont(view.getFontTwelvePChooserMenuItem().getFont());model.setFontSizeModel("12");updateView();});
        view.getFontFourTeenPChooserMenuItem().addActionListener(e -> {view.getTextArea().setFont(view.getFontFourTeenPChooserMenuItem().getFont());model.setFontSizeModel("14");updateView();});
        view.getFontSixTeenPChooserMenuItem().addActionListener(e -> {view.getTextArea().setFont(view.getFontSixTeenPChooserMenuItem().getFont());model.setFontSizeModel("16");updateView();});
        view.getFontEightTeenPChooserMenuItem().addActionListener(e -> {view.getTextArea().setFont(view.getFontEightTeenPChooserMenuItem().getFont());model.setFontSizeModel("18");updateView();});
        view.getFontTwentyPChooserMenuItem().addActionListener(e -> {view.getTextArea().setFont(view.getFontTwentyPChooserMenuItem().getFont());model.setFontSizeModel("20");updateView();});
        view.getFontTwentyTwoPChooserMenuItem().addActionListener(e -> {view.getTextArea().setFont(view.getFontTwentyTwoPChooserMenuItem().getFont());model.setFontSizeModel("22");updateView();});
        view.getFontTwentyFourPChooserMenuItem().addActionListener(e -> {view.getTextArea().setFont(view.getFontTwentyFourPChooserMenuItem().getFont());model.setFontSizeModel("24");updateView();});
    }


    private void changeBackGroundColor(int i) {
        switch(i){
            case 1:
                view.getTextArea().setBackground(Color.GREEN);
                break;
            case 2:
                view.getTextArea().setBackground(Color.ORANGE);
                break;
            case 3:
                view.getTextArea().setBackground(Color.RED);
                break;
            case 4:
                view.getTextArea().setBackground(Color.BLACK);
                break;
            case 5:
                view.getTextArea().setBackground(Color.WHITE);
                break;
            case 6:
                view.getTextArea().setBackground(Color.YELLOW);
                break;
            case 7:
                view.getTextArea().setBackground(Color.BLUE);
                break;
        }
        updateView();
    }

    private void changeForeGroundColor(int i) {
        switch(i){
            case 1:
                view.getTextArea().setForeground(Color.GREEN);
                break;
            case 2:
                view.getTextArea().setForeground(Color.ORANGE);
                break;
            case 3:
                view.getTextArea().setForeground(Color.RED);
                break;
            case 4:
                view.getTextArea().setForeground(Color.BLACK);
                break;
            case 5:
                view.getTextArea().setForeground(Color.WHITE);
                break;
            case 6:
                view.getTextArea().setForeground(Color.YELLOW);
                break;
            case 7:
                view.getTextArea().setForeground(Color.BLUE);
                break;
        }
        updateView();
    }

    //TODO: make auto color sellection
//        while (view.getMenuForeGroundRadioButtonGroup().getElements().hasMoreElements()) {
//            AbstractButton button = (AbstractButton) view.getMenuForeGroundRadioButtonGroup().getElements().nextElement();
//            if (button.isSelected()) {
//                model.setForegroundColorModel(button.getText());
//                String choosenColor = button.getText().toUpperCase();
//                System.out.println(Color.getColor("green"));
//                view.getTextArea().setForeground(Color.GREEN);
//                break;
//            }
//        }
//    }

    private void writeSchoolAddress() {
        view.getTextArea().append(getAddressExtended("Warsaw", "School Road", "262"));
    }

    private void writeHomeAddress() {
        view.getTextArea().append(getAddressExtended("Berlin", "Home Road", "26"));
    }

    private void writeWorkAddress() {
       view.getTextArea().append(getAddressExtended("Warsaw", "Working Road", "62"));
    }

    private String getAddressExtended(String city, String road, String number){
        return model.getCity()+"city\n"+model.getRoad()+"road\n"+model.getNumber()+"number\n";
    }

    private void exit() {
        view.getFrame().dispatchEvent(new WindowEvent(view.getFrame(), WindowEvent.WINDOW_CLOSING));
    }


    private void updateView() {
        view.getForegroundStatusLabel().setText(model.getForegroundColorModel());
        view.getBackgroundStatusLabel().setText(model.getBackgroundColorModel());
        view.getFontSizeStatusLabel().setText(model.getFontSizeModel());
        view.getFileStatusLabel().setText(model.getFileStatusModel());
        view.getFrame().setTitle("Note maker - "+model.getSelectedFileNameNoExtensionModel());
    }

    private void loadFile(){
        jfc.setDialogTitle("Open file");
        int returnValue = jfc.showOpenDialog(view.getFrame());
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = jfc.getSelectedFile();

            if (selectedFile.isDirectory()) {
                model.setAbsPathRetModel(selectedFile.getAbsolutePath());
            }

            String extension = Utils.getExtension(selectedFile);
            if (extension != null) {
                if (extension.equals(Utils.txt)){
                    //saving variables n updating foreground and font
                    view.getTextArea().setBackground(Color.WHITE);
                    view.getTextArea().setForeground(Color.BLACK);
                    model.setLastVisitedCatalogueModel(selectedFile.getAbsolutePath().replaceAll(selectedFile.getName(),""));
                    model.setSelectedFileModel(selectedFile.getAbsolutePath());
                    model.setSelectedFileNameExtensionModel(jfc.getName(selectedFile));
                    model.setSelectedFileNameNoExtensionModel(model.getSelectedFileNameExtensionModel().replaceAll(".txt", ""));
                    model.setFileStatusModel("modified");
                    updateView();
                    ReadFile readFile = new ReadFile(model.getSelectedFileModel());
                    try {
                        view.getTextArea().setText("");
                        for (String line : readFile.getLines()) {
                            view.getTextArea().append(line + "\n");
                        }
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }

                }
            }

        }


    private void saveFile() throws IOException {
        if (model.getAbsPathRetModel() == "") {
            saveAsFile();
        } else {
            FileWriter fw = new FileWriter(model.getSelectedFileNameNoExtensionModel());
            fw.write(view.getTextArea().getText());
            fw.close();
            model.setFileStatusModel("saved");
            updateView();
        }
    }


    private void saveAsFile() throws IOException {
        jfc.setDialogTitle("Save file");
        jfc.setSelectedFile(new File(model.getSelectedFileNameNoExtensionModel()));
        int returnValue = jfc.showSaveDialog(view.getFrame());
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            FileWriter fw = new FileWriter(jfc.getSelectedFile()+".txt");
            model.setSelectedFileNameExtensionModel(jfc.getName(jfc.getSelectedFile()));
            model.setSelectedFileNameNoExtensionModel(model.getSelectedFileNameExtensionModel().replaceAll(".txt", ""));
            fw.write(view.getTextArea().getText());
            fw.close();
            model.setFileStatusModel("saved");
            updateView();
            }
        }



    private static class Utils {

        public final static String txt = "txt";
        public final static String jpg = "jpg";
        public final static String gif = "gif";
        public final static String tiff = "tiff";
        public final static String tif = "tif";
        public final static String png = "png";

        /*
         * Get the extension of a file.
         */
        public static String getExtension(File f) {
            String ext = null;
            String s = f.getName();
            int i = s.lastIndexOf('.');

            if (i > 0 &&  i < s.length() - 1) {
                ext = s.substring(i+1).toLowerCase();
            }
            return ext;
        }
    }

}
