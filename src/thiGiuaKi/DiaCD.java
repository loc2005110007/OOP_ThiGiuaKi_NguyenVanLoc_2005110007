package thiGiuaKi;

public class DiaCD {
    private int maCD;
    private String tuaCD;
    private String caSy;
    private int soBH;
    private float Gia;
    //khởi tạo constructor mặc định
    public DiaCD() {
    }
    //khởi tạo constructor có tham số
    public DiaCD(int cD, String tuaCD, String caSy, int soBH, float Gia) {
        this.maCD = maCD;
        this.tuaCD = tuaCD;
        this.caSy = caSy;
        this.soBH = soBH;
        this.Gia = Gia;
    }
    public int getMaCD() {
        return maCD;
    }
 
    public void setMaCD(int maCD) {
        this.maCD = maCD;
    }
 
    public String gettuaCD() {
        return tuaCD;
    }
 
    public void settuaCD(String tuaCD) {
        this.tuaCD = tuaCD;
    }
 
    public String getCaSy() {
        return caSy;
    }
 
    public void setCaSy(String caSy) {
        this.caSy = caSy;
    }
 
    public int getSoBH() {
        return soBH;
    }
 
    public void setSoBH(int soBH) {
        this.soBH = soBH;
    }
 
    public float getGia() {
        return Gia;
    }
 
    public void setGia(float Gia) {
        this.Gia = Gia;
    }
    //------------end getter and setter--------------
    @Override
    public String toString() {
        return "Album{" +
                "cD=" + maCD +
                ", tuaCD='" + tuaCD + ''' +
                ", caSy='" + caSy + ''' +
                ", soBH=" + soBH +
                ", Gia=" + Gia +
                '}';
    }
    //khởi tạo phương thức hiện thị theo format
    public void hienThiAlbum(){
        System.out.printf("%-10d %-20s %-20s %-10d %-25.1f \n",maCD,tuaCD,caSy,soBH,Gia);
    }}
 


