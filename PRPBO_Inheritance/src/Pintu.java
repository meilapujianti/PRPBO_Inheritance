import java.util.ArrayList;

//pintu child dari item
public class Pintu extends Item {
//    private ArrayList<String> arrAksi = new ArrayList<>();
//    private GameInfo objGameInfo;

    //constrcutor
    public Pintu() {
        super.setNama("pintu");
        //init pilihan
        arrAksi.add("Deskripsikan pintu");
        arrAksi.add("Coba buka pintu");
    }

    @Override
    public void prosesAksi(int subPil) {
        //1: deskripsikan
        //2: buka pintu
        if (subPil==1) {
            System.out.println("Pintu berwarna merah dengan tulisan 'EXIT' di atas ");
        } else if (subPil==2) {
            //cek apakah mempunyai kunci
            if (objGameInfo.getObjPlayer().cariItem("Kunci")) {
                //kunci ada, pintu terbuka
                System.out.println("Player menggunakan kunci untuk membuka pintu dan pintu terbuka!");
                objGameInfo.setGameOver(true); //game over
            } else {
                //kunci tidak ada
                System.out.println("Player mencboa membuka pintu. TERKUNCI!");
            }
        }
    }

//    public void setObjGameInfo(GameInfo objGameInfo) {
//        this.objGameInfo = objGameInfo;
//    }
//
    public ArrayList<String> getAksi() {
        return arrAksi;
    }

}
