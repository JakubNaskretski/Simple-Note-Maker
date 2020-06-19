import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

    private String path;

    public ReadFile(String file_path){
        path = file_path;
    }

    public void readText() throws IOException {

        FileReader read = new FileReader(path);
        BufferedReader  bufRead = new BufferedReader(read);
        String currentLine;
        while ((currentLine = bufRead.readLine()) != null){
            System.out.println(currentLine);
        }
        bufRead.close();
    }

    public String getLine() throws IOException {

        FileReader read = new FileReader(path);
        BufferedReader  bufRead = new BufferedReader(read);
        String currentLine;
        if ((currentLine = bufRead.readLine()) != null){
            return (currentLine);
        }
        bufRead.close();
        return null;
    }

    public List<String> getLines() throws IOException {
        List<String> lines = new ArrayList<>();
        FileReader read = new FileReader(path);
        BufferedReader  bufRead = new BufferedReader(read);
        String currentLine;
        while ((currentLine = bufRead.readLine()) != null){
            lines.add(currentLine);
        }
        bufRead.close();
        return (lines);
    }

}
