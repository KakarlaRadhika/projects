package com.abc.amazon;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Map.Entry;

class nameMatch extends Exception
{
	public String toString()
	{
		return "Not a valid name";
	}
}

public class AmazonOnline {

	public static void main(String[] args) {
		
		AmazonOnline ao=new AmazonOnline();
		ao.shopping();
	}
	public static void shopping()
	{
		boolean categorymenu=true;
		boolean electronicsmenu;
		boolean mobilemenu;
		boolean samsungmenu;
		while(categorymenu)
		{
		System.out.println("Enter your Name");
		Scanner scan=new Scanner(System.in);
		String name=scan.nextLine();
		String s="[a-zA-Z]+\\.?";
		boolean b=name.matches(s);
		if(b!=true)
		{
			try {
				throw new nameMatch();
			} catch (nameMatch e) {
				System.out.println("Not a valid name");
			}
		}
		else
		{
			try {
			System.out.println(name+" !!!! Welcome to amazon!!!!");
		while(categorymenu)	
		{
		System.out.println("Shop by Category\n1.Electronics\n2.Clothing\n3.Groceries\n4.Sports\n5.Cart\n6.Exit");
		int categoryOption=scan.nextInt();
		switch(categoryOption)
		{
		case 1:
			new Electronics().electronics();
			break;
		case 2:
			new Clothing().clothing();
			break;
		case 3:
			new Groceries().groceries();;
			break;
			
		case 4:
			new Sports().sports();
			break;
		
		case 5:
			new Cart().disp();
			break;
			
		case 6:
			System.out.println("Thank U!!! Please Visit Us Again");
			System.exit(0);
			
		default:
			System.out.println("Invalid Choice");
			break;
		}
		}
			}catch(InputMismatchException e)
			{
				System.out.println("Please provide valid input");
			}
		{
		
	}
}

}
		

	}

}
class Electronics {
	public static void electronics()
	{	
		boolean electronicmenu=true;
		while(electronicmenu)
		{
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome to Electronics\nChoose Category\n1.Mobiles\n2.TV\n3.Laptops\n4.Speakers\n5.Cart\n6.Back to Previous\n7.Exit");
		int electronicchoice=scan.nextInt();
		switch(electronicchoice)
		{
		case 1:
			new Mobiles().mobiles();
			break;
		
		case 2:
			new TV().tv();
			break;
			
		case 3:
			new Laptop().laptop();;
			break;
		
		case 4:
			new Speakers().speakers();;
			break;
			
		case 5:
			new Cart();
			break;
		
		case 6:
			electronicmenu=false;
			break;
		
		case 7:
			System.out.println("Thank U!!! Please Visit Again");
			System.exit(0);
			break;
			
		default:
			System.out.println("Invalid Choice");
			break;
		}
		}
	}

}

class Clothing {
	public static void clothing()
	{
		boolean clothingmenu=true;
		while(clothingmenu)
		{
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome to Clothing\nChoose Category\n1.Men's Wear\n2.Women's Wear\n3.Back to Previous\n4.Exit");
		int clothingchoice=scan.nextInt();
		switch(clothingchoice)
		{
		case 1:
			new MensWear().menswear();
			break;
		
		case 2:
			new WomensWear().womenswear();
			break;
		
		case 3:
			clothingmenu=false;
			break;
		
		case 4:
			System.out.println("Thank U!!! Please Visit Again");
			System.exit(0);
			break;
			
		default:
			System.out.println("Invalid Choice");
			break;
		}
		}
	}

}

class FoodGrainOils {

	public static void foodgrainsOils()
	{
		boolean foodgrainsmenu=true;
		boolean flourmenu;
		boolean oilgheemenu;
		boolean dryfruitsmenu;
	while(foodgrainsmenu)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please choose Category \n1.Flour\n2.Oil & Ghee\n3.Dry Fruits\n4.Back to Previous Menu\n5.Exit");
		int menswearoption=scan.nextInt();
		switch(menswearoption)
		{
		case 1:
		flourmenu=true;
		while(flourmenu)
		{
			System.out.println("Please select product from below list");
			System.out.printf("%-5s %-30s %-2s %s\n","S.NO","Product",":","Price");
			System.out.printf("%-5s %-30s %-2s %s\n","1","Aashirvaad Whole Wheat 5Kg",":","384");
			System.out.printf("%-5s %-30s %-2s %s\n","2","Patanjali Chakki Atta 2kg",":","120");
			System.out.printf("%-5s %-30s %-2s %s\n","3","Pillsbury chakki fresh Atta",":","400");
			System.out.println("4 Back to previous menu");
			int flourchoice=scan.nextInt();
			switch(flourchoice)
			{
			case 1:
				String flour1="Aashirvaad Whole Wheat 5Kg";
				int flour1Price=384;
				System.out.println("Enter Quantity");
				int  flour1q=scan.nextInt();
				new Cart().cart( flour1,  flour1q);
				new Cart().price( flour1,  flour1Price);
				System.out.println("Aashirvaad Whole Wheat 5Kg added to Shopping Cart");
				System.out.println("**********************");
				break;
			
			case 2:
				String flour2="Patanjali Chakki Atta 2kg";
				int flour2Price=120;
				System.out.println("Enter Quantity");
				int  flour2q=scan.nextInt();
				new Cart().cart( flour2,  flour2q);
				new Cart().price( flour2,  flour2Price);
				System.out.println("Patanjali Chakki Atta 2kg added to Shopping Cart");
				break;
			
			case 3:
				String flour3="Pillsbury chakki fresh Atta";
				int flour3Price=400;
				System.out.println("Enter Quantity");
				int  flour3q=scan.nextInt();
				new Cart().cart( flour3,  flour3q);
				new Cart().price( flour3,  flour3Price);
				System.out.println("Pillsbury chakki fresh Atta added to Shopping Cart");
				break;
			
			case 4:
			flourmenu=false;
			break;
			
			default:
				System.out.println("Invalid choice");
				break;
			}
		}break;
		
		case 2:
			oilgheemenu=true;
			while(oilgheemenu)
			{
				System.out.println("Please select Product from below list");
				System.out.printf("%-5s %-30s %-2s %s\n","S.NO","Product",":","Price");
				System.out.printf("%-5s %-30s %-2s %s\n","1","Nandini Pure cow ghee 1L",":","450");
				System.out.printf("%-5s %-30s %-2s %s\n","2","Fortune Sunflower Oil 1L",":","99");
				System.out.printf("%-5s %-30s %-2s %s\n","3","Del Monte Olive Oil 1L",":","499");
				System.out.println("4.Back to previous menu");
				int oilgheechoice=scan.nextInt();
				switch(oilgheechoice)
				{
				case 1:
					String oilghee1="Nandini Pure cow ghee 1L";
					int oilghee1Price=450;
					System.out.println("Enter Quantity");
					int  oilghee1q=scan.nextInt();
					new Cart().cart( oilghee1,  oilghee1q);
					new Cart().price( oilghee1,  oilghee1Price);
					System.out.println("Nandini Pure cow ghee 1L added to Shopping Cart");
					System.out.println("**********************");
					break;
				
				case 2:
					String oilghee2="Fortune Sunflower Oil 1L";
					int oilghee2Price=99;
					System.out.println("Enter Quantity");
					int  oilghee2q=scan.nextInt();
					new Cart().cart( oilghee2,  oilghee2q);
					new Cart().price( oilghee2,  oilghee2Price);
					System.out.println("Fortune Sunflower Oil 1L added to Shopping Cart");
					System.out.println("**********************");
					break;
				
				case 3:
					String oilghee3="Del Monte Olive Oil 1L";
					int oilghee3Price=499;
					System.out.println("Enter Quantity");
					int  oilghee3q=scan.nextInt();
					new Cart().cart( oilghee3,  oilghee3q);
					new Cart().price( oilghee3,  oilghee3Price);
					System.out.println("Del Monte Olive Oil 1L added to Shopping Cart");
					System.out.println("**********************");
					break;
				
				case 4:
				oilgheemenu=false;
				break;
				
				default:
					System.out.println("Invalid choice");
					break;
				}
			}break;
			
		case 3:
			dryfruitsmenu=true;
			while(dryfruitsmenu)
			{
				System.out.println("Please select product from below list");
				System.out.printf("%-5s %-30s %-2s %s\n","S.NO","Product",":","Price");
				System.out.printf("%-5s %-30s %-2s %s\n","1","BB Cashews 1kg",":","1200");
				System.out.printf("%-5s %-30s %-2s %s\n","2","Califonia Walnuts 1kg",":","1900");
				System.out.printf("%-5s %-30s %-2s %s\n","3","BB Almonds 1kg",":","900");
				System.out.println("4 Back to previous menu");
				int dryfruitschoice=scan.nextInt();
				switch(dryfruitschoice)
				{
				case 1:
					String dryfruits1="BB Cashews 1kg";
					int dryfruits1Price=1200;
					System.out.println("Enter Quantity");
					int  dryfruits1q=scan.nextInt();
					new Cart().cart( dryfruits1,  dryfruits1q);
					new Cart().price( dryfruits1,  dryfruits1Price);
					System.out.println("BB Cashews 1kg added to Shopping Cart");
					System.out.println("**********************");
					break;
				
				case 2:
					String dryfruits2="Califonia Walnuts 1kg";
					int dryfruits2Price=1900;
					System.out.println("Enter Quantity");
					int  dryfruits2q=scan.nextInt();
					new Cart().cart( dryfruits2,  dryfruits2q);
					new Cart().price( dryfruits2,  dryfruits2Price);
					System.out.println("Califonia Walnuts 1kg added to Shopping Cart");
					System.out.println("**********************");
					break;
				
				case 3:
					String dryfruits3="BB Almonds 1kg";
					int dryfruits3Price=900;
					System.out.println("Enter Quantity");
					int  dryfruits3q=scan.nextInt();
					new Cart().cart( dryfruits3,  dryfruits3q);
					new Cart().price( dryfruits3,  dryfruits3Price);
					System.out.println("BB Almonds 1kg added to Shopping Cart");
					System.out.println("**********************");
					break;
				
				case 4:
				dryfruitsmenu=false;
				break;
				
				default:
					System.out.println("Invalid choice");
					break;
				}
			}break;
			
		case 4:
			foodgrainsmenu=false;
			break;
			
		case 5:
			System.exit(0);
			break;
		
			default:
			System.out.println("Invalid choice");
			break;
			

}
	}
	}

}
class CleaningHousehold {
	public static void cleaningousehold()
	{
		boolean cleaninghouseholdmenu=true;
		boolean detergentmenu;
		boolean freshenersmenu;
		boolean mopsmenu;
	while(cleaninghouseholdmenu)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please choose Category \n1.Detergents | Dishwash\n2.Repellents | Fresheners\n3.Mops | Brushes | Scrubs\n4.Back to Previous Menu\n5.Exit");
		int menswearoption=scan.nextInt();
		switch(menswearoption)
		{
		case 1:
		detergentmenu=true;
		while(detergentmenu)
		{
			System.out.println("Please select product from below list");
			System.out.printf("%-5s %-30s %-2s %s\n","S.NO","Product",":","Price");
			System.out.printf("%-5s %-30s %-2s %s\n","1","Vim Dishwash Gel 1.8L",":","316");
			System.out.printf("%-5s %-30s %-2s %s\n","2","Surf Excel Matic 2Kg",":","376");
			System.out.printf("%-5s %-30s %-2s %s\n","3","Comfort After Wash",":","200");
			System.out.println("4 Back to previous menu");
			int detergentchoice=scan.nextInt();
			switch(detergentchoice)
			{
			case 1:
				String detergent1="Vim Dishwash Gel 1.8L";
				int detergent1Price=316;
				System.out.println("Enter Quantity");
				int  detergent1q=scan.nextInt();
				new Cart().cart( detergent1,  detergent1q);
				new Cart().price( detergent1,  detergent1Price);
				System.out.println("Vim Dishwash Gel 1.8L added to Shopping Cart");
				System.out.println("**********************");
				break;
			
			case 2:
				String detergent2="Surf Excel Matic 2Kg";
				int detergent2Price=376;
				System.out.println("Enter Quantity");
				int  detergent2q=scan.nextInt();
				new Cart().cart( detergent2,  detergent2q);
				new Cart().price( detergent2,  detergent2Price);
				System.out.println("Surf Excel Matic 2Kg added to Shopping Cart");
				break;
			
			case 3:
				String detergent3="Comfort After Wash";
				int detergent3Price=200;
				System.out.println("Enter Quantity");
				int  detergent3q=scan.nextInt();
				new Cart().cart( detergent3,  detergent3q);
				new Cart().price( detergent3,  detergent3Price);
				System.out.println("Comfort After Wash added to Shopping Cart");
				break;
			
			case 4:
			detergentmenu=false;
			break;
			
			default:
				System.out.println("Invalid choice");
				break;
			}
		}break;
		
		case 2:
			freshenersmenu=true;
			while(freshenersmenu)
			{
				System.out.println("Please select Product from below list");
				System.out.printf("%-5s %-30s %-2s %s\n","S.NO","Product",":","Price");
				System.out.printf("%-5s %-30s %-2s %s\n","1","Godrej Aer Pocket Freshner",":","200");
				System.out.printf("%-5s %-30s %-2s %s\n","2","Hit Insect Killer",":","160");
				System.out.printf("%-5s %-30s %-2s %s\n","3","Good Knight power pack2",":","140");
				System.out.println("4.Back to previous menu");
				int freshenerschoice=scan.nextInt();
				switch(freshenerschoice)
				{
				case 1:
					String fresheners1="Godrej Aer Pocket Freshner";
					int fresheners1Price=200;
					System.out.println("Enter Quantity");
					int  fresheners1q=scan.nextInt();
					new Cart().cart( fresheners1,  fresheners1q);
					new Cart().price(fresheners1,  fresheners1Price);
					System.out.println("Godrej Aer Pocket Freshner added to Shopping Cart");
					System.out.println("**********************");
					break;
				
				case 2:
					String fresheners2="Hit Insect Killer";
					int fresheners2Price=160;
					System.out.println("Enter Quantity");
					int  fresheners2q=scan.nextInt();
					new Cart().cart( fresheners2,  fresheners2q);
					new Cart().price(fresheners2,  fresheners2Price);
					System.out.println("Hit Insect Killer added to Shopping Cart");
					System.out.println("**********************");
					break;
				
				case 3:
					String fresheners3="Good Knight power pack2";
					int fresheners3Price=140;
					System.out.println("Enter Quantity");
					int  fresheners3q=scan.nextInt();
					new Cart().cart( fresheners3,  fresheners3q);
					new Cart().price(fresheners3,  fresheners3Price);
					System.out.println("Good Knight power pack2 added to Shopping Cart");
					System.out.println("**********************");
					break;
				
				case 4:
				freshenersmenu=false;
				break;
				
				default:
					System.out.println("Invalid choice");
					break;
				}
			}break;
			
		case 3:
			mopsmenu=true;
			while(mopsmenu)
			{
				System.out.println("Please select product from below list");
				System.out.printf("%-5s %-30s %-2s %s\n","S.NO","Product",":","Price");
				System.out.printf("%-5s %-30s %-2s %s\n","1","Lizol Surface Cleaner",":","189");
				System.out.printf("%-5s %-30s %-2s %s\n","2","BB 360 Degree spin Mop",":","549");
				System.out.printf("%-5s %-30s %-2s %s\n","3","Colin Cleaner 500ml",":","150");
				System.out.println("4 Back to previous menu");
				int mopschoice=scan.nextInt();
				switch(mopschoice)
				{
				case 1:
					String mops1="Lizol Surface Cleaner";
					int mops1Price=189;
					System.out.println("Enter Quantity");
					int  mops1q=scan.nextInt();
					new Cart().cart( mops1,  mops1q);
					new Cart().price(mops1,  mops1Price);
					System.out.println("Lizol Surface Cleaner added to Shopping Cart");
					System.out.println("**********************");
					break;
				
				case 2:
					String mops2="BB 360 Degree spin Mop";
					int mops2Price=549;
					System.out.println("Enter Quantity");
					int  mops2q=scan.nextInt();
					new Cart().cart( mops2,  mops2q);
					new Cart().price(mops2,  mops2Price);
					System.out.println("BB 360 Degree spin Mop added to Shopping Cart");
					System.out.println("**********************");
					break;
				
				case 3:
					String mops3="Colin Cleaner 500ml";
					int mops3Price=150;
					System.out.println("Enter Quantity");
					int  mops3q=scan.nextInt();
					new Cart().cart( mops3,  mops3q);
					new Cart().price(mops3,  mops3Price);
					System.out.println("Colin Cleaner 500ml added to Shopping Cart");
					System.out.println("**********************");
					break;
				
				case 4:
				mopsmenu=false;
				break;
				
				default:
					System.out.println("Invalid choice");
					break;
				}
			}break;
			
		case 4:
			cleaninghouseholdmenu=false;
			break;
			
		case 5:
			System.exit(0);
			break;
		
			default:
			System.out.println("Invalid choice");
			break;
			

}
	}
	}

}
class Laptop {
	public static void laptop()
	{
		boolean laptopmenu=true;
		boolean hpmenu;
		boolean dellmenu;
		boolean acermenu;
	while(laptopmenu)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please choose Laptop Brand \n1.HP\n2.Dell\n3.Acer\n4.Back to Previous Menu\n5.Exit");
		int mobileoption=scan.nextInt();
		switch(mobileoption)
		{
		case 1:
		hpmenu=true;
		while(hpmenu)
		{
			System.out.println("Please select Model from below list");
			System.out.printf("%-5s %-15s %-2s %s\n","S.NO","Model",":","Price");
			System.out.printf("%-5s %-15s %-2s %s\n","1","15Q-DY7AU",":","22,990");
			System.out.printf("%-5s %-15s %-2s %s\n","2","14Q-CS23TU",":","32,490");
			System.out.printf("%-5s %-15s %-2s %s\n","3","15-BC406TX",":","54,990");
			System.out.println("4 : Back to previous menu");
			int lgmodel=scan.nextInt();
			switch(lgmodel)
			{
			case 1:
				String hp1="15Q-DY7AU";
				int hp1Price=22990;
				System.out.println("Enter Quantity");
				int hp1q=scan.nextInt();
				new Cart().cart(hp1, hp1q);
				new Cart().price(hp1, hp1Price);
				System.out.println("HP 15Q-DY7AU added to Shopping Cart");
				System.out.println("**********************");
				break;
			
			case 2:
				String hp2="43UM729";
				int hp2Price=32490;
				System.out.println("Enter Quantity");
				int hp2q=scan.nextInt();
				new Cart().cart(hp2, hp2q);
				new Cart().price(hp2, hp2Price);
				System.out.println("HP 14Q-CS23TU added to Shopping Cart");
				System.out.println("**********************");
				break;
			
			case 3:
				String hp3="15-BC406TX";
				int hp3Price=54990;
				System.out.println("Enter Quantity");
				int hp3q=scan.nextInt();
				new Cart().cart(hp3, hp3q);
				new Cart().price(hp3, hp3Price);
				System.out.println("HP 15-BC406TX added to Shopping Cart");
				System.out.println("**********************");
				break;
			
			case 4:
			hpmenu=false;
			break;
			
			default:
				System.out.println("Invalid choice");
				break;
			}
		}break;
		
		case 2:
			dellmenu=true;
			while(dellmenu)
			{
				System.out.println("Please select Model from below list");
				System.out.printf("%-5s %-14s %-2s %s\n","S.NO","Model",":","Price");
				System.out.printf("%-5s %-14s %-2s %s\n","1","Inspiron 3481",":","24,990");
				System.out.printf("%-5s %-14s %-2s %s\n","2","Vostro 3480",":","34,990");
				System.out.printf("%-5s %-14s %-2s %s\n","3","Inspiron 3576",":","48,990");
				System.out.println("4.Back to previous menu");
				int dellmodel=scan.nextInt();
				switch(dellmodel)
				{
				case 1:
					String dell1="Inspiron 3481";
					int dell1Price=24990;
					System.out.println("Enter Quantity");
					int dell1q=scan.nextInt();
					new Cart().cart(dell1, dell1q);
					new Cart().price(dell1, dell1Price);
					System.out.println("Dell Inspiron 3481 added to Shopping Cart");
					System.out.println("**********************");
					break;
				
				case 2:
					String dell2="Vostro 3480";
					int dell2Price=34990;
					System.out.println("Enter Quantity");
					int dell2q=scan.nextInt();
					new Cart().cart(dell2, dell2q);
					new Cart().price(dell2, dell2Price);
					System.out.println("Dell Vostro 3480 added to Shopping Cart");
					System.out.println("**********************");
					break;
				
				case 3:
					String dell3="";
					int dell3Price=48990;
					System.out.println("Enter Quantity");
					int dell3q=scan.nextInt();
					new Cart().cart(dell3, dell3q);
					new Cart().price(dell3, dell3Price);
					System.out.println("Dell Inspiron 3576 added to Shopping Cart");
					System.out.println("**********************");
					break;
				
				case 4:
				dellmenu=false;
				break;
				
				default:
					System.out.println("Invalid choice");
					break;
				}
			}break;
			
		case 3:
			acermenu=true;
			while(acermenu)
			{
				System.out.println("Please select Model from below list");
				System.out.printf("%-5s %-7s %-2s %s\n","S.NO","Model",":","Price");
				System.out.printf("%-5s %-7s %-2s %s\n","1","Aspire 3",":","17,990");
				System.out.printf("%-5s %-7s %-2s %s\n","2","Aspire A315",":","42,990");
				System.out.printf("%-5s %-7s %-2s %s\n","3","Nitro AN515",":","49,999");
				System.out.println("4 Back to previous menu");
				int acermodel=scan.nextInt();
				switch(acermodel)
				{
				case 1:
					String acer1="Aspire 3";
					int acer1Price=17990;
					System.out.println("Enter Quantity");
					int acer1q=scan.nextInt();
					new Cart().cart(acer1, acer1q);
					new Cart().price(acer1, acer1Price);
					System.out.println("Acer Aspire 3 added to Shopping Cart");
					System.out.println("**********************");
					break;
				
				case 2:
					String acer2="Aspire A315";
					int acer2Price=42990;
					System.out.println("Enter Quantity");
					int acer2q=scan.nextInt();
					new Cart().cart(acer2, acer2q);
					new Cart().price(acer2, acer2Price);
					System.out.println("Acer Aspire A315 added to Shopping Cart");					
					System.out.println("**********************");
					break;
				
				case 3:
					String acer3="Nitro AN515";
					int acer3Price=54999;
					System.out.println("Enter Quantity");
					int acer3q=scan.nextInt();
					new Cart().cart(acer3, acer3q);
					new Cart().price(acer3, acer3Price);
					System.out.println("Acer Nitro AN515 added to Shopping Cart");
					System.out.println("**********************");
					break;
				
				case 4:
				acermenu=false;
				break;
				
				default:
					System.out.println("Invalid choice");
					break;
				}
			}break;
			
		case 4:
			laptopmenu=false;
			break;
			
		case 5:
			System.exit(0);
			break;
		
			default:
			System.out.println("Invalid choice");
			break;
			

}
	}
	}

}
class MensWear {
	public static void menswear()
	{
			boolean menswearmenu=true;
			boolean topwearmenu;
			boolean bottomwearmenu;
			boolean sportsmenu;
		while(menswearmenu)
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("Please choose Category \n1.Topwear\n2.BottomWear\n3.SportsWear\n4.Back to Previous Menu\n5.Exit");
			int menswearoption=scan.nextInt();
			switch(menswearoption)
			{
			case 1:
			topwearmenu=true;
			while(topwearmenu)
			{
				System.out.println("Please select product from below list");
				System.out.printf("%-5s %-30s %-2s %s\n","S.NO","Product",":","Price");
				System.out.printf("%-5s %-30s %-2s %s\n","1","Superdry Round Neck T-shirt",":","999");
				System.out.printf("%-5s %-30s %-2s %s\n","2","Arrow Regular Fit Men Formal",":","1,999");
				System.out.printf("%-5s %-30s %-2s %s\n","3","Roadster Men Checked Jacket",":","2,500");
				System.out.println("4 Back to previous menu");
				int topwearchoice=scan.nextInt();
				switch(topwearchoice)
				{
				case 1:
					String superdry="Superdry Round Necc T-shirt";
					int superdryPrice=999;
					System.out.println("Enter Quantity");
					int superdryq=scan.nextInt();
					new Cart().cart(superdry, superdryq);
					new Cart().price(superdry, superdryPrice);
					System.out.println("Superdry Round Necc T-shirt added to Shopping Cart");
					System.out.println("**********************");
					break;
				
				case 2:
					String arrow="Arrow Grey Regular Fit Men Formal";
					int arrowPrice=1999;
					System.out.println("Enter Quantity");
					int  arrowq=scan.nextInt();
					new Cart().cart( arrow,  arrowq);
					new Cart().price( arrow,  arrowPrice);
					System.out.println("Arrow Regular Fit Men Formal added to Shopping Cart");
					break;
				
				case 3:
					String roadster="Roadster Men Checked Jacket";
					int roadsterPrice=9990;
					System.out.println("Enter Quantity");
					int  roadsterq=scan.nextInt();
					new Cart().cart( roadster,  roadsterq);
					new Cart().price( roadster,  roadsterPrice);
					System.out.println("Roadster Men Checked Jacket added to Shopping Cart");
					break;
				
				case 4:
				topwearmenu=false;
				break;
				
				default:
					System.out.println("Invalid choice");
					break;
				}
			}break;
			
			case 2:
				bottomwearmenu=true;
				while(bottomwearmenu)
				{
					System.out.println("Please select Product from below list");
					System.out.printf("%-5s %-30s %-2s %s\n","S.NO","Product",":","Price");
					System.out.printf("%-5s %-30s %-2s %s\n","1","Spykar Skinny Fit Jeans",":","1,499");
					System.out.printf("%-5s %-30s %-2s %s\n","2","Puma Regular Fit Short",":","899");
					System.out.printf("%-5s %-30s %-2s %s\n","3","Louis Pilippe Formal Trouser",":","2,199");
					System.out.println("4.Back to previous menu");
					int bottomwearchoice=scan.nextInt();
					switch(bottomwearchoice)
					{
					case 1:
						String spykar="Spykar Skinny Fit Jeans";
						int spykarPrice=1499;
						System.out.println("Enter Quantity");
						int  spykarq=scan.nextInt();
						new Cart().cart( spykar,  spykarq);
						new Cart().price( spykar,  spykarPrice);
						System.out.println("Spykar Skinny Fit Jeans added to Shopping Cart");
						System.out.println("**********************");
						break;
					
					case 2:
						String puma="Puma Regular Fit Short";
						int pumaPrice=899;
						System.out.println("Enter Quantity");
						int  pumaq=scan.nextInt();
						new Cart().cart( puma,  pumaq);
						new Cart().price( puma,  pumaPrice);
						System.out.println("Puma Regular Fit Short added to Shopping Cart");
						System.out.println("**********************");
						break;
					
					case 3:
						String louisphilip="Louis Pilippe Formal Trouser";
						int louisphilipPrice=2199;
						System.out.println("Enter Quantity");
						int  louisphilipq=scan.nextInt();
						new Cart().cart( louisphilip,  louisphilipq);
						new Cart().price( louisphilip,  louisphilipPrice);
						System.out.println("Louis Pilippe Formal Trouser added to Shopping Cart");
						System.out.println("**********************");
						break;
					
					case 4:
					bottomwearmenu=false;
					break;
					
					default:
						System.out.println("Invalid choice");
						break;
					}
				}break;
				
			case 3:
				sportsmenu=true;
				while(sportsmenu)
				{
					System.out.println("Please select product from below list");
					System.out.printf("%-5s %-30s %-2s %s\n","S.NO","Product",":","Price");
					System.out.printf("%-5s %-30s %-2s %s\n","1","Nike Men Blue Tracksuit",":","1,999");
					System.out.printf("%-5s %-30s %-2s %s\n","2","Adidas sports jacket",":","3,599");
					System.out.printf("%-5s %-30s %-2s %s\n","3","HRX Black Track Pant",":","799");
					System.out.println("4 Back to previous menu");
					int sportschoice=scan.nextInt();
					switch(sportschoice)
					{
					case 1:
						String nike="Nike Men Blue Tracksuit";
						int nikePrice=1999;
						System.out.println("Enter Quantity");
						int  nikeq=scan.nextInt();
						new Cart().cart( nike,  nikeq);
						new Cart().price( nike,  nikePrice);
						System.out.println("Nike Men Blue Tracksuit added to Shopping Cart");
						System.out.println("**********************");
						break;
					
					case 2:
						String adidas="Adidas sports jacket";
						int adidasPrice=3599;
						System.out.println("Enter Quantity");
						int  adidasq=scan.nextInt();
						new Cart().cart( adidas,  adidasq);
						new Cart().price( adidas,  adidasPrice);
						System.out.println("Adidas sports jacket added to Shopping Cart");
						System.out.println("**********************");
						break;
					
					case 3:
						String hrx="HRX Black Track Pant";
						int hrxPrice=799;
						System.out.println("Enter Quantity");
						int  hrxq=scan.nextInt();
						new Cart().cart( hrx,  hrxq);
						new Cart().price( hrx,  hrxPrice);
						System.out.println("HRX Black Track Pant added to Shopping Cart");
						System.out.println("**********************");
						break;
					
					case 4:
					sportsmenu=false;
					break;
					
					default:
						System.out.println("Invalid choice");
						break;
					}
				}break;
				
			case 4:
				menswearmenu=false;
				break;
				
			case 5:
				System.exit(0);
				break;
			
				default:
				System.out.println("Invalid choice");
				break;
				

	}
		}
	}

}
class Mobiles {
	public static void mobiles()
	{
		boolean mobilemenu=true;
		boolean samsungmenu;
		boolean oneplusmenu;
		boolean applemenu;
	while(mobilemenu)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please choose mobile Brand \n1.Samsung\n2.Oneplus\n3.Apple\n4.Back to Previous Menu\n5.Exit");
		int mobileoption=scan.nextInt();
		switch(mobileoption)
		{
		case 1:
		samsungmenu=true;
		while(samsungmenu)
		{
			System.out.println("Please select Model from below list");
			System.out.printf("%-5s %-7s %-2s %s\n","S.NO","Model",":","Price");
			System.out.printf("%-5s %-7s %-2s %s\n","1","Note 8",":","39990");
			System.out.printf("%-5s %-7s %-2s %s\n","2","A70",":","19990");
			System.out.printf("%-5s %-7s %-2s %s\n","3","M20",":","9990");
			System.out.println("4 Back to previous menu");
			int samsungmodel=scan.nextInt();
			switch(samsungmodel)
			{
			case 1:
				String note8="Note 8";
				int note8Price=39990;
				System.out.println("Enter Quantity");
				int note8q=scan.nextInt();
				new Cart().cart(note8, note8q);
				new Cart().price(note8, note8Price);
				System.out.println("Samsung Note 8 added to Shopping Cart");
				System.out.println("**********************");
				break;
			
			case 2:
				String A70="Note 8";
				int A70Price=19990;
				System.out.println("Enter Quantity");
				int A70q=scan.nextInt();
				new Cart().cart(A70, A70q);
				new Cart().price(A70,A70Price);
				System.out.println("Samsung A70 added to Shopping Cart");
				break;
			
			case 3:
				String M20="Note 8";
				int M20Price=9990;
				System.out.println("Enter Quantity");
				int M20q=scan.nextInt();
				new Cart().cart(M20, M20q);
				new Cart().price(M20, M20Price);
				System.out.println("Samsung A70 added to Shopping Cart");
				break;
			
			case 4:
			samsungmenu=false;
			break;
			
			default:
				System.out.println("Invalid choice");
				break;
			}
		}break;
		
		case 2:
			oneplusmenu=true;
			while(oneplusmenu)
			{
				System.out.println("Please select Model from below list");
				System.out.printf("%-5s %-14s %-2s %s\n","S.NO","Model",":","Price");
				System.out.printf("%-5s %-14s %-2s %s\n","1","OnePlus 7T",":","39990");
				System.out.printf("%-5s %-14s %-2s %s\n","2","OnePlus 7",":","29990");
				System.out.printf("%-5s %-14s %-2s %s\n","3","OnePlus 7 Pro",":","48990");
				System.out.println("4.Back to previous menu");
				int oneplusmodel=scan.nextInt();
				switch(oneplusmodel)
				{
				case 1:
					String op7t="OnePlus 7T";
					int op7tPrice=39990;
					System.out.println("Enter Quantity");
					int op7tq=scan.nextInt();
					new Cart().cart(op7t, op7tq);
					new Cart().price(op7t, op7tPrice);
					System.out.println("Oneplus 7T added to Shopping Cart");
					System.out.println("**********************");
					break;
				
				case 2:
					String op7="OnePlus 7";
					int op7Price=29990;
					System.out.println("Enter Quantity");
					int op7q=scan.nextInt();
					new Cart().cart(op7, op7q);
					new Cart().price(op7, op7Price);
					System.out.println("Oneplus 7 added to Shopping Cart");
					System.out.println("**********************");
					break;
				
				case 3:
					String op7pro="OnePlus 7 Pro";
					int op7proPrice=48990;
					System.out.println("Enter Quantity");
					int op7proq=scan.nextInt();
					new Cart().cart(op7pro, op7proq);
					new Cart().price(op7pro, op7proPrice);
					System.out.println("OnePlus 7Pro added to Shopping Cart");
					System.out.println("**********************");
					break;
				
				case 4:
				oneplusmenu=false;
				break;
				
				default:
					System.out.println("Invalid choice");
					break;
				}
			}break;
			
		case 3:
			applemenu=true;
			while(applemenu)
			{
				System.out.println("Please select Model from below list");
				System.out.printf("%-5s %-12s %-2s %s\n","S.NO","Model",":","Price");
				System.out.printf("%-5s %-12s %-2s %s\n","1","Iphone XR",":","45900");
				System.out.printf("%-5s %-12s %-2s %s\n","2","Iphone 11",":","69900");
				System.out.printf("%-5s %-12s %-2s %s\n","3","Iphone 11 Pro",":","99900");
				System.out.println("4 Back to previous menu");
				int applemodel=scan.nextInt();
				switch(applemodel)
				{
				case 1:
					String iphonexr="Iphone XR";
					int iphonexrPrice=45900;
					System.out.println("Enter Quantity");
					int iphonexrq=scan.nextInt();
					new Cart().cart(iphonexr, iphonexrq);
					new Cart().price(iphonexr, iphonexrPrice);
					System.out.println("Iphone XR added to Shopping Cart");
					System.out.println("**********************");
					break;
				
				case 2:
					String iphone11="Iphone 11";
					int iphone11Price=69900;
					System.out.println("Enter Quantity");
					int iphone11q=scan.nextInt();
					new Cart().cart( iphone11,  iphone11q);
					new Cart().price( iphone11,  iphone11Price);
					System.out.println("Iphone 11 added to Shopping Cart");
					System.out.println("**********************");
					break;
				
				case 3:
					String iphone11pro="Iphone 11 Pro";
					int iphone11proPrice=99900;
					System.out.println("Enter Quantity");
					int iphone11proq=scan.nextInt();
					new Cart().cart( iphone11pro,  iphone11proq);
					new Cart().price( iphone11pro,  iphone11proPrice);
					System.out.println("Iphone 11 Pro added to Shopping Cart");
					System.out.println("**********************");
					break;
				
				case 4:
				applemenu=false;
				break;
				
				default:
					System.out.println("Invalid choice");
					break;
				}
			}break;
			
		case 4:
			mobilemenu=false;
			break;
			
		case 5:
			System.exit(0);
			break;
		
			default:
			System.out.println("Invalid choice");
			break;
			

}
	}
}

}
class Speakers {
	public static void speakers()
	{

		boolean speakersmenu=true;
		boolean bosemenu;
		boolean sonymenu;
		boolean fdmenu;
	while(speakersmenu)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please choose Speakers Brand \n1.Bose\n2.Sony\n3.F&D\n4.Back to Previous Menu\n5.Exit");
		int mobileoption=scan.nextInt();
		switch(mobileoption)
		{
		case 1:
		bosemenu=true;
		while(bosemenu)
		{
			System.out.println("Please select Model from below list");
			System.out.printf("%-5s %-15s %-2s %s\n","S.NO","Model",":","Price");
			System.out.printf("%-5s %-15s %-2s %s\n","1","SoundLink Mini",":","12,960");
			System.out.printf("%-5s %-15s %-2s %s\n","2","SoundLink Micro",":","8,990");
			System.out.printf("%-5s %-15s %-2s %s\n","3","SoundTouch20",":","33,600");
			System.out.println("4 : Back to previous menu");
			int bosemodel=scan.nextInt();
			switch(bosemodel)
			{
			case 1:
				String soundmini="Bose SoundLink Mini";
				int soundminiPrice=12960;
				System.out.println("Enter Quantity");
				int soundminiq=scan.nextInt();
				new Cart().cart(soundmini, soundminiq);
				new Cart().price(soundmini, soundminiPrice);
				System.out.println("Bose SoundLink Mini added to Shopping Cart");
				System.out.println("**********************");
				break;
			
			case 2:
				String soundmicro="Bose SoundLink Micro";
				int soundmicroPrice=8990;
				System.out.println("Enter Quantity");
				int soundmicroq=scan.nextInt();
				new Cart().cart(soundmicro, soundmicroq);
				new Cart().price(soundmicro, soundmicroPrice);
				System.out.println("Bose SoundLink Mini added to Shopping Cart");
				System.out.println("**********************");
				break;
			
			case 3:
				String soundtouch="Bose SoundTouch20";
				int soundtouchPrice=33600;
				System.out.println("Enter Quantity");
				int soundtouchq=scan.nextInt();
				new Cart().cart(soundtouch, soundtouchq);
				new Cart().price(soundtouch, soundtouchPrice);
				System.out.println("Bose SoundLink Touch 20 added to Shopping Cart");
				System.out.println("**********************");
				break;
			
			case 4:
			bosemenu=false;
			break;
			
			default:
				System.out.println("Invalid choice");
				break;
			}
		}break;
		
		case 2:
			sonymenu=true;
			while(sonymenu)
			{
				System.out.println("Please select Model from below list");
				System.out.printf("%-5s %-14s %-2s %s\n","S.NO","Model",":","Price");
				System.out.printf("%-5s %-14s %-2s %s\n","1","SA-D40",":","8,190");
				System.out.printf("%-5s %-14s %-2s %s\n","2","HT-RT40",":","21,990");
				System.out.printf("%-5s %-14s %-2s %s\n","3","HT-RT3",":","17,990");
				System.out.println("4.Back to previous menu");
				int sonymodel=scan.nextInt();
				switch(sonymodel)
				{
				case 1:
					String sony1="Sony SA-D40";
					int sony1Price=8190;
					System.out.println("Enter Quantity");
					int sony1q=scan.nextInt();
					new Cart().cart(sony1, sony1q);
					new Cart().price(sony1, sony1Price);
					System.out.println("Sony SA-D40 added to Shopping Cart");
					System.out.println("**********************");
					break;
				
				case 2:
					String sony2="HT-RT40";
					int sony2Price=21990;
					System.out.println("Enter Quantity");
					int sony2q=scan.nextInt();
					new Cart().cart(sony2, sony2q);
					new Cart().price(sony2, sony2Price);
					System.out.println("Sony HT-RT40 added to Shopping Cart");
					System.out.println("**********************");
					break;
				
				case 3:
					String sony3="";
					int sony3Price=17990;
					System.out.println("Enter Quantity");
					int sony3q=scan.nextInt();
					new Cart().cart(sony3, sony3q);
					new Cart().price(sony3, sony3Price);
					System.out.println("Sony HT-RT3 added to Shopping Cart");
					System.out.println("**********************");
					break;
				
				case 4:
				sonymenu=false;
				break;
				
				default:
					System.out.println("Invalid choice");
					break;
				}
			}break;
			
		case 3:
			fdmenu=true;
			while(fdmenu)
			{
				System.out.println("Please select Model from below list");
				System.out.printf("%-5s %-7s %-2s %s\n","S.NO","Model",":","Price");
				System.out.printf("%-5s %-7s %-2s %s\n","1","A180X",":","2,899");
				System.out.printf("%-5s %-7s %-2s %s\n","2","F3800X",":","5,499");
				System.out.printf("%-5s %-7s %-2s %s\n","3","F5060X",":","9,999");
				System.out.println("4 Back to previous menu");
				int fdmodel=scan.nextInt();
				switch(fdmodel)
				{
				case 1:
					String fd1="A180X";
					int fd1Price=2899;
					System.out.println("Enter Quantity");
					int fd1q=scan.nextInt();
					new Cart().cart(fd1, fd1q);
					new Cart().price(fd1, fd1Price);
					System.out.println("F&D A180X added to Shopping Cart");
					System.out.println("**********************");
					break;
				
				case 2:
					String fd2="F3800X";
					int fd2Price=5499;
					System.out.println("Enter Quantity");
					int fd2q=scan.nextInt();
					new Cart().cart(fd2, fd2q);
					new Cart().price(fd2, fd2Price);
					System.out.println("F&D F3800X added to Shopping Cart");
					System.out.println("**********************");
					break;
				
				case 3:
					String fd3="F5060X";
					int fd3Price=9999;
					System.out.println("Enter Quantity");
					int fd3q=scan.nextInt();
					new Cart().cart(fd3, fd3q);
					new Cart().price(fd3, fd3Price);
					System.out.println("F&D F5060X added to Shopping Cart");
					System.out.println("**********************");
					break;
				
				case 4:
				fdmenu=false;
				break;
				
				default:
					System.out.println("Invalid choice");
					break;
				}
			}break;
			
		case 4:
			speakersmenu=false;
			break;
			
		case 5:
			System.exit(0);
			break;
		
			default:
			System.out.println("Invalid choice");
			break;
			

}
	}
	}

}
class Groceries {
	
	public static void groceries()
	{
		boolean groceriesmenu=true;
		while(groceriesmenu)
		{
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome to Groceries Store\nChoose Category\n1.Foodgrains & oils\n2.Cleaning household\n3.Back to Previous\n4.Exit");
		int grocerieschoice=scan.nextInt();
		switch(grocerieschoice)
		{
		case 1:
			new FoodGrainOils().foodgrainsOils();
			break;
		
		case 2:
			new CleaningHousehold();
			break;
		
		case 3:
			groceriesmenu=false;
			break;
		
		case 4:
			System.out.println("Thank U!!! Please Visit Again");
			System.exit(0);
			break;
			
		default:
			System.out.println("Invalid Choice");
			break;
		}
		}
	}
}

class Sports {
	public static void sports()
	{
		boolean sportsmenu=true;
		boolean cricketmenu;
		boolean badmintonmenu;
		boolean cyclingmenu;
	while(sportsmenu)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome to Sports Store");
		System.out.println("Please choose Category \n1.Cricket\n2.Badminton\n3.Cycling\n4.Back to Previous Menu\n5.Exit");
		int cricketoption=scan.nextInt();
		switch(cricketoption)
		{
		case 1:
		cricketmenu=true;
		while(cricketmenu)
		{
			System.out.println("Please select product from below list");
			System.out.printf("%-5s %-30s %-2s %s\n","S.NO","Product",":","Price");
			System.out.printf("%-5s %-30s %-2s %s\n","1","SS Magnum Cricket Bat",":","1,399");
			System.out.printf("%-5s %-30s %-2s %s\n","2","Sunley Pink Leather Ball",":","499");
			System.out.printf("%-5s %-30s %-2s %s\n","3","MRF Cricket Kit Bag",":","1,200");
			System.out.println("4 Back to previous menu");
			int cricketchoice=scan.nextInt();
			switch(cricketchoice)
			{
			case 1:
				String cricket1="SS Magnum Cricket Bat";
				int cricket1Price=1399;
				System.out.println("Enter Quantity");
				int  cricket1q=scan.nextInt();
				new Cart().cart( cricket1,  cricket1q);
				new Cart().price(cricket1,  cricket1Price);
				System.out.println("SS Magnum Cricket Bat added to Shopping Cart");
				System.out.println("**********************");
				break;
			
			case 2:
				String cricket2="Sunley Pink Leather Ball";
				int cricket2Price=499;
				System.out.println("Enter Quantity");
				int  cricket2q=scan.nextInt();
				new Cart().cart( cricket2,  cricket2q);
				new Cart().price(cricket2,  cricket2Price);
				System.out.println("Sunley Pink Leather Ball added to Shopping Cart");
				break;
			
			case 3:
				String cricket3="MRF Cricket Kit Bag";
				int cricket3Price=1200;
				System.out.println("Enter Quantity");
				int  cricket3q=scan.nextInt();
				new Cart().cart( cricket3,  cricket3q);
				new Cart().price(cricket3,  cricket3Price);
				System.out.println("MRF Cricket Kit Bag added to Shopping Cart");
				break;
			
			case 4:
			cricketmenu=false;
			break;
			
			default:
				System.out.println("Invalid choice");
				break;
			}
		}break;
		
		case 2:
			badmintonmenu=true;
			while(badmintonmenu)
			{
				System.out.println("Please select Product from below list");
				System.out.printf("%-5s %-30s %-2s %s\n","S.NO","Product",":","Price");
				System.out.printf("%-5s %-30s %-2s %s\n","1","Yonex Lite Racquet",":","1,540");
				System.out.printf("%-5s %-30s %-2s %s\n","2","Yonex Muscle power Racquet",":","1,990");
				System.out.printf("%-5s %-30s %-2s %s\n","3","Yonex Badminton Kit Bag",":","1,899");
				System.out.println("4.Back to previous menu");
				int badmintonchoice=scan.nextInt();
				switch(badmintonchoice)
				{
				case 1:
					String badminton1="Yonex Lite Racquet";
					int badminton1Price=1540;
					System.out.println("Enter Quantity");
					int  badminton1q=scan.nextInt();
					new Cart().cart( badminton1,  badminton1q);
					new Cart().price(badminton1,  badminton1Price);
					System.out.println("Yonex Lite Racquet added to Shopping Cart");
					System.out.println("**********************");
					break;
				
				case 2:
					String badminton2="Yonex Muscle power Racquet";
					int badminton2Price=1990;
					System.out.println("Enter Quantity");
					int  badminton2q=scan.nextInt();
					new Cart().cart( badminton2,  badminton2q);
					new Cart().price(badminton2,  badminton2Price);
					System.out.println("Yonex Muscle power Racquet added to Shopping Cart");
					System.out.println("**********************");
					break;
				
				case 3:
					String badminton3="Yonex Badminton Kit Bag";
					int badminton3Price=1899;
					System.out.println("Enter Quantity");
					int  badminton3q=scan.nextInt();
					new Cart().cart( badminton3,  badminton3q);
					new Cart().price(badminton3,  badminton3Price);
					System.out.println("Yonex Badminton Kit Bag added to Shopping Cart");
					System.out.println("**********************");
					break;
				
				case 4:
				badmintonmenu=false;
				break;
				default:
					System.out.println("Invalid choice");
					break;
				}
			}break;
			
		case 3:
			cyclingmenu=true;
			while(cyclingmenu)
			{
				System.out.println("Please select product from below list");
				System.out.printf("%-5s %-30s %-2s %s\n","S.NO","Product",":","Price");
				System.out.printf("%-5s %-30s %-2s %s\n","1","Hercules Roadeo A50 cycle",":","12,799");
				System.out.printf("%-5s %-30s %-2s %s\n","2","Cosmic Flash 26T cycle",":","16,499");
				System.out.printf("%-5s %-30s %-2s %s\n","3","Cosmic Trium 21 speed cycle",":","16,999");
				System.out.println("4 Back to previous menu");
				int cyclingchoice=scan.nextInt();
				switch(cyclingchoice)
				{
				case 1:
					String cycling1="Hercules Roadeo A50 cycle";
					int cycling1Price=12799;
					System.out.println("Enter Quantity");
					int  cycling1q=scan.nextInt();
					new Cart().cart( cycling1,  cycling1q);
					new Cart().price(cycling1,  cycling1Price);
					System.out.println("Hercules Roadeo A50 cycle added to Shopping Cart");
					System.out.println("**********************");
					break;
				
				case 2:
					String cycling2="Cosmic Flash 26T cycle";
					int cycling2Price=16499;
					System.out.println("Enter Quantity");
					int  cycling2q=scan.nextInt();
					new Cart().cart( cycling2,  cycling2q);
					new Cart().price(cycling2,  cycling2Price);
					System.out.println("Cosmic Flash 26T cycle added to Shopping Cart");
					System.out.println("**********************");
					break;
				
				case 3:
					String cycling3="Cosmic Trium 21 speed cycle";
					int cycling3Price=16999;
					System.out.println("Enter Quantity");
					int  cycling3q=scan.nextInt();
					new Cart().cart( cycling3,  cycling3q);
					new Cart().price(cycling3,  cycling3Price);
					System.out.println("Cosmic Trium 21 speed cycle added to Shopping Cart");
					System.out.println("**********************");
					break;
				
				case 4:
				cyclingmenu=false;
				break;
				
				default:
					System.out.println("Invalid choice");
					break;
				}
			}break;
			
		case 4:
			sportsmenu=false;
			break;
			
		case 5:
			System.exit(0);
			break;
		
			default:
			System.out.println("Invalid choice");
			break;
			

}
	}
	}

}
class TV {
	public static void tv()
	{
		boolean tvmenu=true;
		boolean lgmenu;
		boolean vumenu;
		boolean mimenu;
	while(tvmenu)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please choose TV Brand \n1.LG\n2.MI\n3.VU\n4.Back to Previous Menu\n5.Exit");
		int mobileoption=scan.nextInt();
		switch(mobileoption)
		{
		case 1:
		lgmenu=true;
		while(lgmenu)
		{
			System.out.println("Please select Model from below list");
			System.out.printf("%-5s %-15s %-2s %s\n","S.NO","Model",":","Price");
			System.out.printf("%-5s %-15s %-2s %s\n","1","32LM560",":","15,499");
			System.out.printf("%-5s %-15s %-2s %s\n","2","43UM729",":","35,999");
			System.out.printf("%-5s %-15s %-2s %s\n","3","55UM729",":","54,999");
			System.out.println("4 : Back to previous menu");
			int lgmodel=scan.nextInt();
			switch(lgmodel)
			{
			case 1:
				String lgtv1="32LM560";
				int lgtv1Price=15499;
				System.out.println("Enter Quantity");
				int lgtv1q=scan.nextInt();
				new Cart().cart(lgtv1, lgtv1q);
				new Cart().price(lgtv1, lgtv1Price);
				System.out.println("LG 43UM729 added to Shopping Cart");
				System.out.println("**********************");
				break;
			
			case 2:
				String lgtv2="43UM729";
				int lgtv2Price=35999;
				System.out.println("Enter Quantity");
				int lgtv2q=scan.nextInt();
				new Cart().cart(lgtv2, lgtv2q);
				new Cart().price(lgtv2, lgtv2Price);
				System.out.println("LG 43UM729 added to Shopping Cart");
				System.out.println("**********************");
				break;
			
			case 3:
				String lgtv3="55UM729";
				int lgtv3Price=54999;
				System.out.println("Enter Quantity");
				int lgtv3q=scan.nextInt();
				new Cart().cart(lgtv3, lgtv3q);
				new Cart().price(lgtv3, lgtv3Price);
				System.out.println("LG 55UM729 added to Shopping Cart");
				System.out.println("**********************");
				break;
			
			case 4:
			lgmenu=false;
			break;
			
			default:
				System.out.println("Invalid choice");
				break;
			}
		}break;
		
		case 2:
			mimenu=true;
			while(mimenu)
			{
				System.out.println("Please select Model from below list");
				System.out.printf("%-5s %-14s %-2s %s\n","S.NO","Model",":","Price");
				System.out.printf("%-5s %-14s %-2s %s\n","1","4A PRO",":","21,999");
				System.out.printf("%-5s %-14s %-2s %s\n","2","4X 50",":","29,999");
				System.out.printf("%-5s %-14s %-2s %s\n","3","4X PRO",":","49,999");
				System.out.println("4.Back to previous menu");
				int sonymodel=scan.nextInt();
				switch(sonymodel)
				{
				case 1:
					String mitv1="4A-PRO";
					int mitv1Price=21999;
					System.out.println("Enter Quantity");
					int mitv1q=scan.nextInt();
					new Cart().cart(mitv1, mitv1q);
					new Cart().price(mitv1, mitv1Price);
					System.out.println("MI 4A PRO added to Shopping Cart");
					System.out.println("**********************");
					break;
				
				case 2:
					String mitv2="4X 50";
					int mitv2Price=29990;
					System.out.println("Enter Quantity");
					int mitv2q=scan.nextInt();
					new Cart().cart(mitv2, mitv2q);
					new Cart().price(mitv2, mitv2Price);
					System.out.println("MI 4X 50 added to Shopping Cart");
					System.out.println("**********************");
					break;
				
				case 3:
					String mitv3="";
					int mitv3Price=49999;
					System.out.println("Enter Quantity");
					int mitv3q=scan.nextInt();
					new Cart().cart(mitv3, mitv3q);
					new Cart().price(mitv3, mitv3Price);
					System.out.println("MI 4X PRO added to Shopping Cart");
					System.out.println("**********************");
					break;
				
				case 4:
				mimenu=false;
				break;
				
				default:
					System.out.println("Invalid choice");
					break;
				}
			}break;
			
		case 3:
			vumenu=true;
			while(vumenu)
			{
				System.out.println("Please select Model from below list");
				System.out.printf("%-5s %-7s %-2s %s\n","S.NO","Model",":","Price");
				System.out.printf("%-5s %-7s %-2s %s\n","1","40SM",":","16,999");
				System.out.printf("%-5s %-7s %-2s %s\n","2","50A",":","35,900");
				System.out.printf("%-5s %-7s %-2s %s\n","3","65BPX",":","54,999");
				System.out.println("4 Back to previous menu");
				int vumodel=scan.nextInt();
				switch(vumodel)
				{
				case 1:
					String vutv1="40SM";
					int vutv1Price=16999;
					System.out.println("Enter Quantity");
					int vutv1q=scan.nextInt();
					new Cart().cart(vutv1, vutv1q);
					new Cart().price(vutv1, vutv1Price);
					System.out.println("VU 40SM added to Shopping Cart");
					System.out.println("**********************");
					break;
				
				case 2:
					String vutv2="50A";
					int vutv2Price=35900;
					System.out.println("Enter Quantity");
					int vutv2q=scan.nextInt();
					new Cart().cart(vutv2, vutv2q);
					new Cart().price(vutv2, vutv2Price);
					System.out.println("VU 50A added to Shopping Cart");					
					System.out.println("**********************");
					break;
				
				case 3:
					String vutv3="65BPX";
					int vutv3Price=54999;
					System.out.println("Enter Quantity");
					int vutv3q=scan.nextInt();
					new Cart().cart(vutv3, vutv3q);
					new Cart().price(vutv3, vutv3Price);
					System.out.println("VU 65BPX added to Shopping Cart");
					System.out.println("**********************");
					break;
				
				case 4:
				vumenu=false;
				break;
				
				default:
					System.out.println("Invalid choice");
					break;
				}
			}break;
			
		case 4:
			tvmenu=false;
			break;
			
		case 5:
			System.exit(0);
			break;
		
			default:
			System.out.println("Invalid choice");
			break;
			

}
	}
	}

}
class WomensWear {
	public static void womenswear()
	{
		boolean womenswearmenu=true;
		boolean kurtasmenu;
		boolean sareesmenu;
		boolean leggingssmenu;
	while(womenswearmenu)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please choose Category \n1.Kurta's\n2.Sarees\n3.Leggings\n4.Back to Previous Menu\n5.Exit");
		int womenswearoption=scan.nextInt();
		switch(womenswearoption)
		{
		case 1:
		kurtasmenu=true;
		while(kurtasmenu)
		{
			System.out.println("Please select product from below list");
			System.out.printf("%-5s %-30s %-2s %s\n","S.NO","Product",":","Price");
			System.out.printf("%-5s %-30s %-2s %s\n","1","Fabindia solid line Kurta",":","1,899");
			System.out.printf("%-5s %-30s %-2s %s\n","2","Libas striped Kurta",":","799");
			System.out.printf("%-5s %-30s %-2s %s\n","3","Soch printed Kurta",":","1,200");
			System.out.println("4 Back to previous menu");
			int kurtaschoice=scan.nextInt();
			switch(kurtaschoice)
			{
			case 1:
				String kurta1="Fabindia solid line Kurta";
				int kurta1Price=1899;
				System.out.println("Enter Quantity");
				int  kurta1q=scan.nextInt();
				new Cart().cart( kurta1,  kurta1q);
				new Cart().price( kurta1,  kurta1Price);
				System.out.println("Fabindia solid line Kurta added to Shopping Cart");
				System.out.println("**********************");
				break;
			
			case 2:
				String kurta2="Libas striped Kurta";
				int kurta2Price=899;
				System.out.println("Enter Quantity");
				int  kurta2q=scan.nextInt();
				new Cart().cart( kurta2,  kurta2q);
				new Cart().price( kurta2,  kurta2Price);
				System.out.println("Libas striped Kurta Formal added to Shopping Cart");
				break;
			
			case 3:
				String kurta3="Soch printed Kurta";
				int kurta3Price=9990;
				System.out.println("Enter Quantity");
				int  kurta3q=scan.nextInt();
				new Cart().cart( kurta3,  kurta3q);
				new Cart().price( kurta3,  kurta3Price);
				System.out.println("Soch printed Kurta added to Shopping Cart");
				break;
			
			case 4:
			kurtasmenu=false;
			break;
			
			default:
				System.out.println("Invalid choice");
				break;
			}
		}break;
		
		case 2:
			sareesmenu=true;
			while(sareesmenu)
			{
				System.out.println("Please select Product from below list");
				System.out.printf("%-5s %-30s %-2s %s\n","S.NO","Product",":","Price");
				System.out.printf("%-5s %-30s %-2s %s\n","1","Soch Printed Saree",":","1,299");
				System.out.printf("%-5s %-30s %-2s %s\n","2","Biba Cotton saree",":","799");
				System.out.printf("%-5s %-30s %-2s %s\n","3","Mitera Silk Saree",":","1,499");
				System.out.println("4.Back to previous menu");
				int bottomwearchoice=scan.nextInt();
				switch(bottomwearchoice)
				{
				case 1:
					String saree1="Soch Printed Saree";
					int saree1Price=1499;
					System.out.println("Enter Quantity");
					int  saree1q=scan.nextInt();
					new Cart().cart( saree1,  saree1q);
					new Cart().price( saree1,  saree1Price);
					System.out.println("Soch Printed Saree added to Shopping Cart");
					System.out.println("**********************");
					break;
				
				case 2:
					String saree2="Biba Cotton saree";
					int saree2Price=899;
					System.out.println("Enter Quantity");
					int  saree2q=scan.nextInt();
					new Cart().cart( saree2,  saree2q);
					new Cart().price( saree2,  saree2Price);
					System.out.println("Biba Cotton saree added to Shopping Cart");
					System.out.println("**********************");
					break;
				
				case 3:
					String saree3="Mitera Silk Saree";
					int saree3Price=1499;
					System.out.println("Enter Quantity");
					int  saree3q=scan.nextInt();
					new Cart().cart( saree3,  saree3q);
					new Cart().price( saree3,  saree3Price);
					System.out.println("Mitera Silk Saree added to Shopping Cart");
					System.out.println("**********************");
					break;
				
				case 4:
				sareesmenu=false;
				break;
				
				default:
					System.out.println("Invalid choice");
					break;
				}
			}break;
			
		case 3:
			leggingssmenu=true;
			while(leggingssmenu)
			{
				System.out.println("Please select product from below list");
				System.out.printf("%-5s %-30s %-2s %s\n","S.NO","Product",":","Price");
				System.out.printf("%-5s %-30s %-2s %s\n","1","Lyra black Leggings",":","999");
				System.out.printf("%-5s %-30s %-2s %s\n","2","TAG 7 Leggings",":","1,299");
				System.out.printf("%-5s %-30s %-2s %s\n","3","H&M Leggings",":","1,599");
				System.out.println("4 Back to previous menu");
				int leggingschoice=scan.nextInt();
				switch(leggingschoice)
				{
				case 1:
					String leggings1="Lyra black Leggings";
					int leggings1Price=999;
					System.out.println("Enter Quantity");
					int  leggings1q=scan.nextInt();
					new Cart().cart( leggings1,  leggings1q);
					new Cart().price( leggings1,  leggings1Price);
					System.out.println("Lyra black Leggings added to Shopping Cart");
					System.out.println("**********************");
					break;
				
				case 2:
					String leggings2="TAG 7 Leggings";
					int leggings2Price=1299;
					System.out.println("Enter Quantity");
					int  leggings2q=scan.nextInt();
					new Cart().cart( leggings2,  leggings2q);
					new Cart().price( leggings2,  leggings2Price);
					System.out.println("TAG 7 Leggings added to Shopping Cart");
					System.out.println("**********************");
					break;
				
				case 3:
					String leggings3="H&M Leggings";
					int leggings3Price=1599;
					System.out.println("Enter Quantity");
					int  leggings3q=scan.nextInt();
					new Cart().cart( leggings3,  leggings3q);
					new Cart().price( leggings3,  leggings3Price);
					System.out.println("H&M Leggings added to Shopping Cart");
					System.out.println("**********************");
					break;
				
				case 4:
					leggingssmenu=false;
				break;
				
				default:
					System.out.println("Invalid choice");
					break;
				}
			}break;
			
		case 4:
			womenswearmenu=false;
			break;
			
		case 5:
			System.exit(0);
			break;
		
			default:
			System.out.println("Invalid choice");
			break;
			

}
	}
}

}
class Cart {
	static HashMap<String,Integer> hm=new HashMap<String, Integer>();
	static HashMap<String,Integer> hp=new HashMap<String, Integer>();
	private static int total;

	public static void cart(String name,int quantity) {

		if(hm.containsKey(name)) {
			hm.put(name, hm.get(name)+quantity);
		}
		else {
			hm.put(name, quantity);
		}
	}



	static void price(String name,int price) {
		System.out.println("     ----MY  CART-----   ");
		if(hp.containsKey(name)) {

		}
		else {
			hp.put(name, price);
		}


		
	}



	private static void edit() {
		
		
		for(Entry<String, Integer> v: hm.entrySet()) {
			System.out.format("%-46s  %s\n",v.getKey(),v.getValue());
			
			
		}
		System.out.println("enter item  name to edit");
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		System.out.println("enter new Quantity");
		int up = sc.nextInt();
		if(up!=0) {
		hm.put(line, up);
		disp();
		}
		else {
			hm.remove(line);
			hp.remove(line);
			disp();
		}
		
		

	}



	public static void disp() {
		int i=1;
		System.out.format("%-5s %-15s %-15s %-10s %s\n","s.no","product","Quantity"," price","total"); 

		for(Entry<String, Integer> v: hm.entrySet()) {
			Integer defaultValue = null;
			System.out.format("%-5s %-15s %-15s %-10s %s\n",i,v.getKey(),v.getValue(), hp.getOrDefault(v.getKey(), defaultValue),( v.getValue()*(hp.getOrDefault(v.getKey(), defaultValue)))); 
			//System.out.println(+"   " ++"   "++"  "++"  "+);
			i++;
			total+=v.getValue()*(hp.getOrDefault(v.getKey(), defaultValue));
		}

		System.out.println("===========================================================");
		System.out.format("%-46s  %s\n","cart value",total); 
		System.out.format("%-46s  %s\n","CGST 8%",total*0.08); 
		System.out.format("%-46s  %s\n","SGST 7%",total*0.07); 
		System.out.format("%-46s  %s\n","Net amount",total*0.07+total*0.08+total); 
		System.out.println("===========================================================");
		System.out.println();
		total=0;
		
		System.out.println("Do you want to edit your cart");
		System.out.println("1.  yes");
		System.out.println("2. no");
		Scanner scn = new Scanner(System.in);
		int s1 = scn.nextInt();
		if(s1==1) {
			edit();
		}
		else {

			System.out.println("==********==");
			System.out.println("Do you want to continue shopping");
			System.out.println("1.  yes");
			System.out.println("2. no");

			int s = scn.nextInt();
			if(s==1) {
				new AmazonOnline().shopping();
			}
			else {
				System.out.println("-----Thank you-------");
				System.exit(0);
			}
		}
		
	}
	public static void exitdisp() {
		int i=1;
		System.out.format("%-5s %-15s %-15s %-10s %s\n","s.no","product","Quantity"," price","total"); 

		for(Entry<String, Integer> v: hm.entrySet()) {
			Integer defaultValue = null;
			System.out.format("%-5s %-15s %-13s %-10s %s\n",i,v.getKey(),v.getValue(), hp.getOrDefault(v.getKey(), defaultValue),( v.getValue()*(hp.getOrDefault(v.getKey(), defaultValue)))); 
			//System.out.println(+"   " ++"   "++"  "++"  "+);
			i++;
			total+=v.getValue()*(hp.getOrDefault(v.getKey(), defaultValue));
		}

		System.out.println("===========================================================");
		System.out.format("%-46s  %s\n","cart value",total); 
		System.out.format("%-46s  %s\n","CGST 8%",total*0.08); 
		System.out.format("%-46s  %s\n","SGST 7%",total*0.07); 
		System.out.format("%-46s  %s\n","Net amount",total*0.07+total*0.08+total); 
		System.out.println("===========================================================");
		System.out.println();
		total=0;
		
	}

}
