package magadiflo.design.patterns.structural.proxy.guru.some_cool_media_library;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class ThirdPartyYouTubeService implements IThirdPartyYouTubeLib {
    @Override
    public HashMap<String, Video> popularVideos() {
        this.connectToServer("http://www.youtube.com");
        return this.getRandomVideos();
    }

    @Override
    public Video getVideo(String videoId) {
        this.connectToServer("http://www.youtube.com/" + videoId);
        return this.getSomeVideo(videoId);
    }

    /**
     * Métodos falsos para simular la actividad de la red.
     * Son tan lentos como en la vida real.
     */
    private int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    private void experienceNetworkLatency() {
        int randomLatency = random(5, 10);
        for (int i = 0; i < randomLatency; i++) {
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException("Ocurrió un error: " + e.getMessage());
            }
        }
    }

    private void connectToServer(String server) {
        System.out.println("Conectando al " + server + "...");
        this.experienceNetworkLatency();
        System.out.println("¡Conectado!");
    }

    private HashMap<String, Video> getRandomVideos() {
        System.out.println("Descargando populares...");
        this.experienceNetworkLatency();
        HashMap<String, Video> videos = new HashMap<>();
        videos.put("catzzzzz", new Video("asdfasdf", "Catzzz.avi"));
        videos.put("mkfasdfaa", new Video("masdfak", "Dog play with ball.mp4"));
        videos.put("dancevideoo", new Video("danceasdee", "Dancing video.mpq"));
        videos.put("dlsdk5jfslaf", new Video("dlskd5jfslaf", "Barcelona vs Real Madrid.mov"));
        videos.put("3sdfgsda1333", new Video("3sdfsdf1fff", "Programing lessin#1.avi"));

        System.out.println("Hecho");
        return videos;
    }

    private Video getSomeVideo(String videoId) {
        System.out.println("Descargando video...");
        this.experienceNetworkLatency();
        Video video = new Video(videoId, "Some video title");

        System.out.println("Hecho");
        return video;
    }
}
