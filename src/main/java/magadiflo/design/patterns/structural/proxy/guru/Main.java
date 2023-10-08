package magadiflo.design.patterns.structural.proxy.guru;

import magadiflo.design.patterns.structural.proxy.guru.proxy.YouTubeCacheProxy;
import magadiflo.design.patterns.structural.proxy.guru.some_cool_media_library.ThirdPartyYouTubeService;

/**
 * En este ejemplo observamos uno de los casos en las que se puede usar el patrón Proxy como es el
 * implementar el almacenamiento en caché para mejorar el tiempo de respuesta.
 */

public class Main {
    public static void main(String[] args) {
        // Se usa de frente el servicio, sin el patrón Proxy
        YouTubeDownloader withoutDownloaderCache = new YouTubeDownloader(new ThirdPartyYouTubeService());

        // Se usa el servicio pero a través del patrón Proxy
        YouTubeDownloader withDownloaderCache = new YouTubeDownloader(new YouTubeCacheProxy());

        long naive = test(withoutDownloaderCache, "Sin Caché");
        long smart = test(withDownloaderCache, "Con Caché");

        System.out.println("Tiempo ahorrado mediante el proxy de caché: " + (naive - smart) + "ms");
    }

    private static long test(YouTubeDownloader downloader, String withCache) {
        long startTime = System.currentTimeMillis();

        // Comportamiento del usuario en la app:
        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dancevideoo");

        // Los usuarios pueden visitar la misma página con mucha frecuencia
        downloader.renderVideoPage("catzzzzz");
        downloader.renderVideoPage("dancevideoo");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("**********************************************************");
        System.out.println("******[" + withCache + "]Tiempo transcurrido: " + estimatedTime + " ms*******");
        System.out.println("**********************************************************");
        return estimatedTime;
    }
}
