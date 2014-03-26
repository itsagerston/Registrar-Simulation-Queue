public class window {
	protected int idleTime;
	protected student stud;
	protected boolean isOpen;

	public window() {
		isOpen = true;
		idleTime = 0;
		stud = null;
	}
	
	public void newStudent(Student s) {
		stud = s;
		isOpen = false;
	}
}