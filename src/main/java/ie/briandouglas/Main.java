package ie.briandouglas;

import ie.briandouglas.placeholder_image.PlaceHolderImageOptions;
import ie.briandouglas.placeholder_image.PlaceHolderImage;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        var placeHolderImage = new PlaceHolderImage();

        var options = PlaceHolderImageOptions.builder()
                .text("BD")
                .width(400)
                .height(400)
                .backgroundColor(Color.decode("#DCDCDC"))
                .font(new Font("Arial", Font.BOLD, 200))
                .build();
        var image = placeHolderImage.generate(options);
        ImageIO.write(image, "png", new File("placeholder.png"));
        System.out.println("Generated placeholder.png");
    }
}