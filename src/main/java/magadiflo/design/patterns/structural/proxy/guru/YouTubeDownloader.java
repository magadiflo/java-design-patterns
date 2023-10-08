package magadiflo.design.patterns.structural.proxy.guru;

import magadiflo.design.patterns.structural.proxy.guru.some_cool_media_library.IThirdPartyYouTubeLib;
import magadiflo.design.patterns.structural.proxy.guru.some_cool_media_library.Video;

import java.util.HashMap;

public class YouTubeDownloader {
    private final IThirdPartyYouTubeLib api;

    public YouTubeDownloader(IThirdPartyYouTubeLib api) {
        this.api = api;
    }

    public void renderVideoPage(String videoId) {
        Video video = this.api.getVideo(videoId);
        System.out.println("\n--------------------------------");
        System.out.println("Página de video (Imagina un html elegante)");
        System.out.println("ID: " + video.id);
        System.out.println("Title: " + video.title);
        System.out.println("Video: " + video.data);
        System.out.println("\n--------------------------------");
    }

    public void renderPopularVideos() {
        HashMap<String, Video> list = api.popularVideos();
        System.out.println("\n--------------------------------");
        System.out.println("Videos más populares en youtube (imagina un html elegante)");
        for (Video video : list.values()) {
            System.out.println("ID: " + video.id + ", Title: " + video.title);
        }
        System.out.println("\n--------------------------------");
    }
}
