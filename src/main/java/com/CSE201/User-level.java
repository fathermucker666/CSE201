/**
 * This class can identify the level of the user 
 * @author dingy
 *
 */
public class User_Level {
	
	private int Level;
	
	/**
	 * The default (empty) constructor.
	 */
	public User_Level() {
		this(0);
	}
	
	/**
	 * A workhorse constructor that receives values for all instance properties and initializes the object.
	 */
	public User_Level(int Level) {
		this.Level = Level;
	}
	
	/**
	 * {@inheritDoc}
	 */
	public boolean equals(Object o) {
		if(!(o instanceof User_Level)) {
			return false;
		}
		
		User_Level u = (User_Level) o;
		return u.Level == Level;
	}
	
	/**
	 * {@inheritDoc}
	 */
	public String toString() {
		return String.format("This user's level is : ", Level);
		
	}

	/**
	 * returns a Integer Level.
	 * @return
	 */
	public int getLevel() {
		return Level;
	}

	/**
	 * Sets the int level instance property.
	 * @param level
	 */
	public void setLevel(int level) {
		Level = level;
	}
	
	/**
	 * This method can identify the level of the user
	 * @param level
	 * @return
	 */
	public String levelpermission(int level) {
		String permission = "";
		
		switch(level) {
		case 0: 
			permission = "guest";
			break;
		case 1: 
			permission = "base user";
			break;
		case 2:
			permission = "developer";
			break;
		case 3:
			permission = "administrator";
			break;
		default:
			permission = "error";
			break;
			
		}
		
		return permission;
	}
}
