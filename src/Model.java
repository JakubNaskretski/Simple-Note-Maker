public class Model {

    private String fileName, foregroundColorModel, backgroundColorModel,fontSizeModel ,fileStatusModel;

    public Model() {
        this.fileName = "bez tytułu";
        this.foregroundColorModel = "fg";
        this.backgroundColorModel = "bg";
        this.fontSizeModel = "size";
        this.fileStatusModel = "new";
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

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
