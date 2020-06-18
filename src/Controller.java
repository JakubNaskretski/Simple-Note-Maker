public class Controller {

    private Model model;
    private View view;

    public Controller(Model m, View v) {
        model = m;
        view = v;
        initView();
    }

    public void initView() {
        updateView();
//        view.getOpenMenuItem().addActionListener(e -> getOutput());
//        view.getSaveMenuItem().addActionListener(e -> clear());
//        view.getSaveAsMenuItem().addActionListener(e -> clear());
//        view.exitMenuItem.addActionListener(e -> clear());
//
//        view.workAddressMenuItem.addActionListener(e -> clear());
//        view.homeAddressMenuItem.addActionListener(e -> clear());
//        view.schoolAddressMenuItem.addActionListener(e -> clear());
//
//        view.foreGroundGreenMenuItem.addActionListener(e -> clear());
//        view.foreGroundOrangeMenuItem.addActionListener(e -> clear());
//        view.foreGroundRedMenuItem.addActionListener(e -> clear());
//        view.foreGroundBlackMenuItem.addActionListener(e -> clear());
//        view.foreGroundWhiteMenuItem.addActionListener(e -> clear());
//        view.foreGroundYellowMenuItem.addActionListener(e -> clear());
//        view.foreGroundBlueMenuItem.addActionListener(e -> clear());


    }

    private void updateView() {
        view.getForegroundStatusLabel().setText(model.getForegroundColorModel());
        view.getBackgroundStatusLabel().setText(model.getBackgroundColorModel());
        view.getFontSizeStatusLabel().setText(model.getFontSizeModel());
        view.getFileStatusLabel().setText(model.getFileStatusModel());
        view.getFrame().setTitle("Note maker - "+model.getFileName());
    }

}
