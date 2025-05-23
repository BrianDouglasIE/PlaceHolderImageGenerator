package ie.briandouglas.placeholder_image;

import lombok.Builder;
import lombok.Data;

import java.awt.*;

/**
 * Builder class that encapsulates all configuration options for generating placeholder images.
 */
@Data
@Builder
public class PlaceHolderImageOptions {

    /**
     * The text to be displayed in the placeholder image.
     */
    private String text;

    /**
     * Width of the image in pixels.
     */
    private int width;

    /**
     * Height of the image in pixels.
     */
    private int height;

    /**
     * Text color used in the image. Defaults to {@link Color#DARK_GRAY}.
     */
    @Builder.Default
    private Color textColor = Color.DARK_GRAY;

    /**
     * Background color of the image. Defaults to {@link Color#GRAY}.
     */
    @Builder.Default
    private Color backgroundColor = Color.GRAY;

    /**
     * Font used for rendering the text. Defaults to Arial, plain, size 16.
     */
    @Builder.Default
    private Font font = new Font("Arial", Font.PLAIN, 16);

    /**
     * Flag to enable or disable anti-aliasing. Defaults to true.
     */
    @Builder.Default
    private boolean antiAliasOn = true;
}
