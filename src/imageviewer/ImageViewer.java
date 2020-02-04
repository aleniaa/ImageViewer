package imageviewer;

import controller.MainFrame;
import model.Image;
import persistence.FileImageLoader;
import java.io.File;

public class ImageViewer {

    public static void main(String[] args) {

        File file = new File("immagini");
        FileImageLoader imageLoader = new FileImageLoader(file);
        Image image = imageLoader.load();
        
        MainFrame mainFrame = new MainFrame();
        
        mainFrame.getImageDisplay().show(image);
        


    }
    
}
