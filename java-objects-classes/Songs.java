public class Songs {
    String listType;
    String songName;
    String duration;

    Songs (String listType, String songName, String duration) {
        this.listType = listType;
        this.songName = songName;
        this.duration = duration;
    }

    public String getDuration() {
        return duration;
    }
    public String getListType() {
        return listType;
    }
    public String getSongName() {
        return songName;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
    public void setListType(String listType) {
        this.listType = listType;
}
public void setSongName(String songName) {
        this.songName = songName;
}

}
