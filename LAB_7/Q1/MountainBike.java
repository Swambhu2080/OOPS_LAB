public class MountainBike extends Bicycle{
    public int seatHeight;
    public MountainBike(int gear, int speed, int seatHeight){
        super(gear, speed);
        this.seatHeight = seatHeight;
    }
    @Override
    public String toString() {
        String x = "Bike having " + gear + " gears and speed is " + speed + " and seat height is " + this.seatHeight; 
        return x;
    }      
        
}