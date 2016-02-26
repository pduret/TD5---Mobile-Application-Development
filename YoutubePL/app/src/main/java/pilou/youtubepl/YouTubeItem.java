package pilou.youtubepl;

import java.util.List;

/**
 * Created by Xkebre on 26/02/2016.
 */

public class YouTubeItem {

    private String title;
    public String getTitle()
    {
        return title;
    }

    private String description;
    public String getDescription() {return description; }

    private String date;
    public String getDate()
    {
        return date;
    }

    private List<String> publi;
    public List<String> getPubli()
    {
        return publi;
    }


    public YouTubeItem(String title, String description, String date, List<String> publi)
    {
        this.title = title;
        this.description = description;
        this.date = date;
        this.publi = publi;
    }

    public YouTubeItem()
    {}
}
