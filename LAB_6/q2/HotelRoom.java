class HotelRoom{
     int roomNo;
     double rentRate;
    HotelRoom(int roomNo){
        this.roomNo=roomNo;
        if(this.roomNo<299)
            this.rentRate=69.95;
        else
            this.rentRate=89.95;
    }  
    void getValues(){
        System.out.println("Room number "+this.roomNo+" & rental rate is $"+this.rentRate);
    }
}