package magadiflo.design.patterns.structural.proxy.guru.proxy;

import magadiflo.design.patterns.structural.proxy.guru.some_cool_media_library.IThirdPartyYouTubeLib;
import magadiflo.design.patterns.structural.proxy.guru.some_cool_media_library.ThirdPartyYouTubeService;
import magadiflo.design.patterns.structural.proxy.guru.some_cool_media_library.Video;

import java.util.HashMap;

public class YouTubeCacheProxy implements IThirdPartyYouTubeLib {
    private IThirdPartyYouTubeLib youtubeService;
    private HashMap<String, Video> cachePopular = new HashMap<>();
    private HashMap<String, Video> cacheAll = new HashMap<>();

    public YouTubeCacheProxy() {
        this.youtubeService = new ThirdPartyYouTubeService();
    }

    @Override
    public HashMap<String, Video> popularVideos() {
        if (this.cachePopular.isEmpty()) {
            this.cachePopular = this.youtubeService.popularVideos();
        } else {
            System.out.println("Lista recuperada del caché");
        }
        return this.cachePopular;
    }

    @Override
    public Video getVideo(String videoId) {
        Video video = this.cacheAll.get(videoId);
        if (video == null) {
            video = this.youtubeService.getVideo(videoId);
            this.cacheAll.put(videoId, video);
        } else {
            System.out.println("Video " + videoId + " recuperado del caché");
        }
        return video;
    }

    private void reset() {
        this.cachePopular.clear();
        this.cacheAll.clear();
    }
}
