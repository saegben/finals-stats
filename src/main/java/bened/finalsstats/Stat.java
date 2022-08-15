package bened.finalsstats;

public class Stat {
    //POJO: Plain old Java object
    Integer id;
    String stat;
    String player;
    Integer seriesGameNumber; // i.e. game 1, 2, 3, 4

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public Integer getSeriesGameNumber() {
        return seriesGameNumber;
    }

    public void setSeriesGameNumber(Integer seriesGameNumber) {
        this.seriesGameNumber = seriesGameNumber;
    }
}
