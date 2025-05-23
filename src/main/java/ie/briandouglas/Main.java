package ie.briandouglas;

import ie.briandouglas.placeholder_image.PlaceholderImageOptions;
import ie.briandouglas.placeholder_image.PlaceholderImage;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        var placeholderImage = new PlaceholderImage();

        var options = PlaceholderImageOptions.builder()
                .text("BD")
                .width(400)
                .height(400)
                .backgroundColor(Color.decode("#DCDCDC"))
                .font(new Font("Arial", Font.BOLD, 200))
                .build();
        var image = placeholderImage.generate(options);
        ImageIO.write(image, "png", new File("placeholder.png"));
        System.out.println("Generated placeholder.png");
    }
}