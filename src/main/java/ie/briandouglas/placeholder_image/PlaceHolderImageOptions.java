package ie.briandouglas.placeholder_image;

import lombok.Builder;
import lombok.Data;

import java.awt.*;

@Data
@Builder
public class PlaceHolderImageOptions {
    private String text;

    private int width;
    private int height;

    @Builder.Default
    private Color textColor = Color.DARK_GRAY;
    @Builder.Default
    private Color backgroundColor = Color.GRAY;

    @Builder.Default
    private Font font = new Font("Arial", Font.PLAIN, 16);

    @Builder.Default
    private boolean antiAliasOn = true;
}
