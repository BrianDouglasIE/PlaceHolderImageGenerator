# Placeholder Image Generator (Java)

This simple utility generates customizable placeholder images in Java using AWT. It is useful for creating mock user avatars, image placeholders in UI development, or dynamically generated image content.

## Features

* Set image dimensions and text
* Choose custom font and font size
* Configure text and background colors
* Enable or disable anti-aliasing for smoother text rendering

## Classes Overview

### `PlaceHolderImageOptions`

Encapsulates configuration options for generating a placeholder image.

```java
PlaceHolderImageOptions.builder()
    .text("AB")                                // Text to display
    .width(300)                                // Width in pixels
    .height(300)                               // Height in pixels
    .textColor(Color.DARK_GRAY)                // Color of the text (optional, default: DARK_GRAY)
    .backgroundColor(Color.GRAY)               // Background color (optional, default: GRAY)
    .font(new Font("Arial", Font.PLAIN, 16))   // Font used for rendering (optional)
    .antiAliasOn(true)                         // Enable anti-aliasing (optional, default: true)
    .build();
```

### `PlaceHolderImage`

Generates a `BufferedImage` using the provided `PlaceHolderImageOptions`.

```java
BufferedImage image = new PlaceHolderImage().generate(options);
```

### `Main`

Sample usage:

```java
public class Main {
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
```

## Output

This example will generate a centered `"BD"` in bold Arial on a `400x400` image with a light gray background, saved as `placeholder.png`.

![Example placeholder image](./placeholder.png)

## Dependencies

* Java 8+
* No external libraries required; uses `java.awt` and `javax.imageio`

## License

Apache 2.0
