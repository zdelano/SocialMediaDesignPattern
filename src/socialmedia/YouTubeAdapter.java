public class YouTubeAdapter implements SocialMediaEntry {

    private YouTubeVideo mVideo;

    public YouTubeAdapter() {
        mVideo = new YouTubeVideo();
    }

    public YouTubeAdapter(String author, String title, String description) {
        mVideo = new YouTubeVideo(author, title, description);
    }

    public String getUser() { return mVideo.getAuthor(); }
    public String getPostText() { return mVideo.getTitle() + ": " + mVideo.getDescription(); }
}