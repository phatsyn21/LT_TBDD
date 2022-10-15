package trantienphat.appdocbao;

public class BaoMoi {
    private String TieuDe;
    private  String time;
    private int idAnhMinhHoa;
    //


    public BaoMoi(String tieuDe, String time, int idAnhMinhHoa) {
        this.TieuDe = TieuDe;
        this.time = time;
        this.idAnhMinhHoa = idAnhMinhHoa;
    }

    public String getTieuDe() {
        return TieuDe;
    }

    public void setTieuDe(String TieuDe) {
        this.TieuDe = TieuDe;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getIdAnhMinhHoa() {
        return idAnhMinhHoa;
    }

    public void setIdAnhMinhHoa(int idAnhMinhHoa) {
        this.idAnhMinhHoa = idAnhMinhHoa;
    }
}
