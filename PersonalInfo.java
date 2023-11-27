package package_a;

public class PersonalInfo {

	private String name = "";
	private int height = 1;
	private int weight = 1;
	private String[] allergies = new String[5];
	
	
	PersonalInfo()
	{
		name = "null";
		height = 1;
		weight = 1;
		allergies = new String[5];
		
		for(int i = 0; i < allergies.length; i++)
		{
			allergies[i] = "none";
		}
		
		
	}
	
	PersonalInfo(String n, int h, int w)
	{
		name = n;
		height = h;
		weight = w;
	}
	
	
	//setters
	public void setName(String n)
	{
		name = n;
	}
	
	public void setHeight(int h)
	{
		height = h;
	}
	
	public void setWeight(int w)
	{
		weight = w;
	}
	
	//getters
	public String getName()
	{
		return name;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public int getWeight()
	{
		return weight;
	}
	
	public String[] getAllergies()
	{
		return allergies;
	}
	
	
	public void addAllergies(String a)
	{
		
		boolean room = true;
		int i = 0;
		
		while(room == true)
		{
			
			if(getAllergies()[i] == "none" || getAllergies()[i] == null)
			{
				getAllergies()[i] = a;
				room = false;
			}
			
			i++;
			
			if(i == 4)
			{
				room = false;
			}
			
		}
		
		
		
	}
	
	public void removeAllergies(int a)
	{
		if(a < 0 || a > 4)
		{
			System.out.println("Allergy " + getAllergies()[a] + " removed.");
			
			String empty = "none";
			getAllergies()[a] = empty;
		}
		else
		{
			System.out.println("Invalid index.");
		}
		
		
	}
	
	public void ReadAllergies()
	{
		for(int i = 0; i < allergies.length; i++)
		{
			System.out.println((i + 1) + ". " + allergies[i]);
		}
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
