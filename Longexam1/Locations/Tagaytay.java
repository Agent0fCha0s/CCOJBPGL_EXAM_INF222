public class Tagaytay implements Locations {

    int transport = 100;
    public int transport(){
        return transport;

    }
    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}
