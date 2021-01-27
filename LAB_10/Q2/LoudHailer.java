class LoudHailer extends Thread
{
	Brodcast p;
	private String name;
	int c;
	LoudHailer(String name, Brodcast ob)
	{
		this.name=name;
		p=ob;
	}
	public void run()
	{
		synchronized(p){
			p.disp(name);
		}	
	}
} 