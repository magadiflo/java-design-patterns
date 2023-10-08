package magadiflo.design.patterns.structural.proxy.guru.some_cool_media_library;

import java.util.HashMap;

public interface IThirdPartyYouTubeLib {
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}
