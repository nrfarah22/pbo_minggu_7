public class Kucing extends Hewan implements Total{

    @Override
    public int biayaHewan() {
        return biaya;
    }


    public  void Grooming(){
        System.out.println("free grooming");
    }
}
