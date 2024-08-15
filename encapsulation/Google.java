package encapsulation;


class Google_Auth
{
		private String apikey="bg6t54redcvhy6t5redcv";
	
		public void setApikey(String apikey)
		{
			this.apikey=apikey;
		}
		public String getApikey()
		{
			return apikey;
		}
		private String un="contact@grotechminds.com";

		public String getUn() {
			return un;
		}
		public void setUn(String un) {
			this.un = un;
		}
		
		
       }
       public class Google 
       {
       public static void main(String[] args) 
      {
	   Google_Auth g1=new Google_Auth();
	   g1.setApikey("hgre3456trfdcvghyu6t5redcvbhuytrd");
	    System.out.println(g1.getApikey());
	
       }
       }