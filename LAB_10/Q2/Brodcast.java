class Brodcast
{
	public void disp(String S)
	{
		try{
			for(int i=0;i<3;i++)
			{	
				System.out.println(" "+S+"  "+Thread.currentThread().getName()+"  "+Thread.currentThread().getId());
				Thread.sleep(1000);
			}
		}
		catch(Exception e){	
		}
	}
}