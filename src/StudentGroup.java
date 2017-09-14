import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		Student[] students1=new Student[students.length()+1];
		students1[0]=student;
		int i=0;
		for(i=0;i<students.length();i++)
		{
			students1[i+1]=students[i];
			students[i]=students1[i];
		}
		students[i]=students1[i];
	}
	

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		students[students.length()]=student;
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		Student[] students1=new Student[students.length()+1];
		int i;
		for(i=0;i<index;i++)
		{
			students1[i]=students[i];
		}
		students1[i]=student;
		for(i=index+1;i<students.length()+1;i++)
		{
			students1[i]=students[i];
		}
		for(i=0;i<students.length()+1;i++)
		{
			students[i]=students1[i];
		}
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		Student[] students1=new Student[students.length()-1];
		int i;
		for(i=0;i<index;i++)
		{
			students1[i]=students[i];
		}
		for(i=index+1;i<students.length();i++)
		{
			students1[i]=students[i];
		}
		for(i=0;i<students.length()-1;i++)
		{
			students[i]=students1[i];
		}
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		int i,index;
		for(int j=0;j<students.length();j++)
		{
			if(student.equals(students[j]))
			{
				index=j;
				break;
			}
		}
		Student[] students1=new Student[students.length()-1];
		for(i=0;i<index;i++)
		{
			students1[i]=students[i];
		}
		for(i=index+1;i<students.length();i++)
		{
			students1[i]=students[i];
		}
		for(i=0;i<students.length()-1;i++)
		{
			students[i]=students1[i];
		}
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		Student[] students1=new Student[students.length()-1];
		int i;
		for(i=0;i<index;i++)
		{
			students1[i]=students[i];
		}
	
		for(i=0;i<students.length();i++)
		{
			students[i]=students1[i];
		}
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		Student[] students1=new Student[students.length()-1];
		for(int i=index,j=0;i<students.length();i++,j++)
		{
			students1[j]=students[i];
		}
		for(i=0;i<students.length();i++)
		{
			students[i]=students1[i];
		}
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		int index;
		for(int j=0;j<students.length();j++)
		{
			if(student.equals(students[j]))
			{
				index=j;
				break;
			}
		}
		Student[] students1=new Student[students.length()-1];
		int i;
		for(i=0;i<index;i++)
		{
			students1[i]=students[i];
		}
	
		for(i=0;i<students.length();i++)
		{
			students[i]=students1[i];
		}
	}

	@Override
	public void bubbleSort() {
		Student k;
		for(int i=0;i<students.length();i++)
		{
			for(int j=0;j<students.length()-i-1;j++)
			{
				if(students[j].id>students[j+1].id)
				{
					k=students[j+1];
					students[j+1]=students[j];
					students[j]=k;
				}
			}
		}
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		Date text=Students[indexOfStudent].birthDate;
		Date date=new SimpleDateFormat("MM-dd-yyyy").parse(text);
		int age = (int) (System.currentTimeInMillis()-date.getTime())/(24*60*60*1000);
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		for(i=0;i<Students.length();i++)
		{
		Date text=Students[i].birthDate;
		Date date=new SimpleDateFormat("MM-dd-yyyy").parse(text);
		int age1 = (int) (System.currentTimeInMillis()-date.getTime())/(24*60*60*1000);
		if(age1==age)
		{
			return students[i];
	}
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		int max=students[0].avgMark,index;
		for(i=0;i<students.length();i++)
		{
			if(max<students[i].avgMark)
			{
				index=i;
			}
		}
		return students[index];
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		int i,index;
		for(int j=0;j<students.length();j++)
		{
			if(student.equals(students[j]))
			{
				index=j;
				break;
			}
		}
		return null;
	}
}
