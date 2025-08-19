package design_pattern.structure_design_pattern.proxy_pattern.refactoring_guru.proxy;

import design_pattern.structure_design_pattern.proxy_pattern.refactoring_guru.some_cool_media_library.ThirdPartyYouTubeClass;
import design_pattern.structure_design_pattern.proxy_pattern.refactoring_guru.some_cool_media_library.ThirdPartyYouTubeLib;
import design_pattern.structure_design_pattern.proxy_pattern.refactoring_guru.some_cool_media_library.Video;

import java.util.HashMap;

public class YouTubeCacheProxy implements ThirdPartyYouTubeLib {
    private final ThirdPartyYouTubeLib youtubeService = new ThirdPartyYouTubeClass();;
    private final HashMap<String, Video> cacheAll = new HashMap<String, Video>();
    private HashMap<String, Video> cachePopular = new HashMap<String, Video>();

    @Override
    public HashMap<String, Video> popularVideos() {
        if (cachePopular.isEmpty()) {
            cachePopular = youtubeService.popularVideos();
        } else {
            System.out.println("Retrieved list from cache.");
        }
        return cachePopular;
    }

    @Override
    public Video getVideo(String videoId) {
        Video video = cacheAll.get(videoId);
        if (video == null) {
            video = youtubeService.getVideo(videoId);
            cacheAll.put(videoId, video);
        } else {
            System.out.println("Retrieved video '" + videoId + "' from cache.");
        }
        return video;
    }

    public void reset() {
        cachePopular.clear();
        cacheAll.clear();
    }
}
