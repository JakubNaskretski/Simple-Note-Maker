public class Model {

    private String lastVisitedCatalogueModel, absPathRetModel, selectedFileModel,selectedFileNameExtensionModel,
            selectedFileNameNoExtensionModel, foregroundColorModel, backgroundColorModel,fontSizeModel ,fileStatusModel,
            lastForegroundColorModel, lastBackgroundColorModel, lastFontSizeModel ,lastFileStatusModel,
            city = "City: ", road = "Road: ", number = "Number: ";

    private boolean wereChangedSettings = false;

    public Model() {
        this.selectedFileNameNoExtensionModel = "bez tytułu";
        this.selectedFileNameExtensionModel = "bez tytułu.txt";
        this.foregroundColorModel = "fg";
        this.lastForegroundColorModel = "fg";
        this.backgroundColorModel = "bg";
        this.lastBackgroundColorModel = "bg";
        this.fontSizeModel = "size";
        this.lastFontSizeModel = "size";
        this.fileStatusModel = "new";
        this.lastVisitedCatalogueModel = System.getProperty("user.dir");
    }

    public boolean isWereChangedSettings() {
        return wereChangedSettings;
    }

    public void setWereChangedSettings(boolean wereChangedSettings) {
        this.wereChangedSettings = wereChangedSettings;
    }

    public String getCity() {
        return city;
    }

    public String getRoad() {
        return road;
    }

    public String getNumber() {
        return number;
    }

    public String getSelectedFileNameExtensionModel() {
        return selectedFileNameExtensionModel;
    }

    public void setSelectedFileNameExtensionModel(String selectedFileNameExtensionModel) {
        this.selectedFileNameExtensionModel = selectedFileNameExtensionModel;
    }

    public String getSelectedFileNameNoExtensionModel() {
        return selectedFileNameNoExtensionModel;
    }

    public void setSelectedFileNameNoExtensionModel(String selectedFileNameNoExtensionModel) {
        this.selectedFileNameNoExtensionModel = selectedFileNameNoExtensionModel;
    }

    public String getAbsPathRetModel() {
        return absPathRetModel;
    }

    public void setAbsPathRetModel(String absPathRetModel) {
        this.absPathRetModel = absPathRetModel;
    }

    public String getForegroundColorModel() {
        return foregroundColorModel;
    }

    public void setForegroundColorModel(String foregroundColorModel) {
        this.foregroundColorModel = foregroundColorModel;
    }

    public String getBackgroundColorModel() {
        return backgroundColorModel;
    }

    public void setBackgroundColorModel(String backgroundColorModel) {
        this.backgroundColorModel = backgroundColorModel;
    }

    public String getFontSizeModel() {
        return fontSizeModel;
    }

    public void setFontSizeModel(String fontSizeModel) {
        this.fontSizeModel = fontSizeModel;
    }

    public String getFileStatusModel() {
        return fileStatusModel;
    }

    public void setFileStatusModel(String fileStatusModel) {
        this.fileStatusModel = fileStatusModel;
    }

    public String getSelectedFileModel() {
        return selectedFileModel;
    }

    public void setSelectedFileModel(String selectedFileModel) {
        this.selectedFileModel = selectedFileModel;
    }

    public String getLastVisitedCatalogueModel() {
        return lastVisitedCatalogueModel;
    }

    public void setLastVisitedCatalogueModel(String lastVisitedCatalogueModel) {
        this.lastVisitedCatalogueModel = lastVisitedCatalogueModel;
    }

    public String getLastForegroundColorModel() {
        return lastForegroundColorModel;
    }

    public void setLastForegroundColorModel(String lastForegroundColorModel) {
        this.lastForegroundColorModel = lastForegroundColorModel;
    }

    public String getLastBackgroundColorModel() {
        return lastBackgroundColorModel;
    }

    public void setLastBackgroundColorModel(String lastBackgroundColorModel) {
        this.lastBackgroundColorModel = lastBackgroundColorModel;
    }

    public String getLastFontSizeModel() {
        return lastFontSizeModel;
    }

    public void setLastFontSizeModel(String lastFontSizeModel) {
        this.lastFontSizeModel = lastFontSizeModel;
    }

    public String getLastFileStatusModel() {
        return lastFileStatusModel;
    }

    public void setLastFileStatusModel(String lastFileStatusModel) {
        this.lastFileStatusModel = lastFileStatusModel;
    }
}
