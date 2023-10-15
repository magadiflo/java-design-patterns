package magadiflo.design.patterns.structural.facade.guru.some_complex_media_library;

public class VideoFile {
    private final String name;
    private final String codecType;

    public VideoFile(String name) {
        this.name = name;
        this.codecType = name.substring(name.lastIndexOf(".") + 1);
    }

    public String getName() {
        return this.name;
    }

    public String getCodecType() {
        return this.codecType;
    }

}
