class TVDriver
{
	public static void main(String[]args)
	{
		TV t1=new TV();
		t1.Brand="Sony";
		t1.Size=52;
		t1.Holder="Wall and Stand";
		t1.Type="LED TV";
		t1.ModelNo="IS 16333(PART 3)";


		System.out.println("Reference :"+t1);
		System.out.println("BRAND :"+t1.Brand);
		System.out.println("SIZE :"+t1.Size+" Inch");
		System.out.println("HOLDER :"+t1.Holder);
		System.out.println("TYPE :"+t1.Type);
		System.out.println("MODEL NO :"+t1.ModelNo);
		
		
	}
}