package Practice2;

	import java.util.Date;

	public class TIME 
	{

		public static void main(String[] args) 
		{

			Date d1=new Date();
			System.out.println(d1.getTime());
			//epoch time
			Date d2=new Date(d1.getTime());
			System.out.println("Current Time->"+d2);
			String human=	d2.toString();
			String day=	human.substring(8, 10);
			System.out.println(day);
			String month=	human.substring(4,7);
			System.out.println(month);
			
			Date d3=new Date(d1.getTime()+(1000*60*60*24*5));
			System.out.println("Future Time->"+d3);
			
			
			Date d4=new Date(d1.getTime()-(1000*60*60*24*1));
			System.out.println("Past Time->"+d4);
			
		}

	}

