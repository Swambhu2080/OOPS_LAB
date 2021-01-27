class Main
{
	public static void main(String[] args) {
		Brodcast sb = new Brodcast();
        LoudHailer t1 = new LoudHailer("Good",sb);
        LoudHailer t2 = new LoudHailer("Morning",sb);
        LoudHailer t3 = new LoudHailer("Kolkata",sb);
        
        t1.start();
        t2.start();
        t3.start();
    }	
}