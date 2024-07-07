package module6;


import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class ImageIOExample {

    private String inputPath;

    private String outputPath;


    public ImageIOExample(String inputPath, String outputPath) {

        this.inputPath = inputPath;

        this.outputPath = outputPath;

    }


    public void readImage() {

        try {

            BufferedImage image = ImageIO.read(new File(inputPath));

            System.out.println("Image read successfully");

        } catch (IOException e) {

            e.printStackTrace();

        }

    }


    public void writeImage() {

        try {

            BufferedImage image = ImageIO.read(new File(inputPath));

            ImageIO.write(image, "png", new File(outputPath));

            System.out.println("Image written successfully");

        } catch (IOException e) {

            e.printStackTrace();

        }

    }


    public static void main(String[] args) {

        ImageIOExample example = new ImageIOExample("src/main/resources/input.jpg", "src/main/resources/output.png");

        example.readImage();

        example.writeImage();   

    }
    
    public void readFileJava7(String filePath) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        try {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } finally {
            br.close();
        }
    }

}