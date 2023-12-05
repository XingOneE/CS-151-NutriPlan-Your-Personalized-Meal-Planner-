
public class PersonalInfo {

	private String name;
	private int height;
	private int weight;
	private String[] allergies;

	/**
	 * Constructor for person using NutriPlan
	 **/
	PersonalInfo() {
		name = "null";
		height = 1;
		weight = 1;
		allergies = new String[5];
		allergies[0] = "none";

	}

	/**
	 * Constructor for person using Nutriplan with information given
	 * 
	 * @param n the name of person
	 * @param h the height of person
	 * @param w the weight of person
	 * 
	 **/
	PersonalInfo(String n, int h, int w) {
		name = n;
		height = h;
		weight = w;
	}

	/**
	 * Set new name for person
	 * 
	 * @param n the new desired name
	 */
	public void setName(String n) {
		name = n;
	}

	/**
	 * Set new height for person
	 * 
	 * @param h the new desired height
	 */
	public void setHeight(int h) {
		height = h;
	}

	/**
	 * Set the new weight for person
	 * 
	 * @param w the new desired weight for person
	 */
	public void setWeight(int w) {
		weight = w;
	}

	/**
	 * Get the name of person
	 * 
	 * @return name the name of person
	 */
	public String getName() {
		return name;
	}

	/**
	 * Get the height of person
	 * 
	 * @return height the height of person
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * Get the weight of person
	 * 
	 * @return weight the weight of person
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * Get the allergies of person
	 * 
	 * @return allergies the allergies of person
	 */
	public String[] getAllergies() {
		return allergies;
	}

	/**
	 * Add allergie to list
	 * 
	 * @param a the desired allergie to add to list
	 */
	public void addAllergies(String a) {
		boolean room = true;
		int i = 0;
		while (room == true) {
			if (getAllergies()[i] == "none" || getAllergies()[i] == null) {
				getAllergies()[i] = a;
				room = false;
			}
			i++;
			if (i == 4) {
				room = false;
			}
		}
	}
}
