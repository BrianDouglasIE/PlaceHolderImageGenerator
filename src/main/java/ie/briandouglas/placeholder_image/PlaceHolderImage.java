package ie.briandouglas.placeholder_image;

import java.awt.*;
import java.awt.image.BufferedImage;

public class PlaceHolderImage {
    public BufferedImage generate(PlaceHolderImageOptions options) {
        BufferedImage image = new BufferedImage(options.getWidth(), options.getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = image.createGraphics();

        if (options.isAntiAliasOn()) {
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        }

        g2d.setColor(options.getBackgroundColor());
        g2d.fillRect(0, 0, options.getWidth(), options.getHeight());

        g2d.setColor(options.getTextColor());
        g2d.setFont(options.getFont());

        FontMetrics fm = g2d.getFontMetrics();
        int x = (options.getWidth() - fm.stringWidth(options.getText())) / 2;
        int y = (options.getHeight() - fm.getHeight()) / 2 + fm.getAscent();

        g2d.drawString(options.getText(), x, y);
        g2d.dispose();

        return image;
    }
}
