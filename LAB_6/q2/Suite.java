class Suite extends HotelRoom{
    Suite(int roomNo){
        super(roomNo);
        if(this.roomNo>299)
        this.rentRate+=this.rentRate*0.15;
        this.rentRate+=40;
    }
}
