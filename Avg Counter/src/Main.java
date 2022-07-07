
public class Main {

	public static void main(String[] args) {
		
		String[] students = {"abcd plko 4 5 6 3,vbcxza ghhgf - 4;4;4;3"};
		double sum = 0;
		double counter = 0;
		double avg = 0;
		int number = 0;
		int spacecounter = 0;
		String numberstr = "";
		String imieNaz = "";
		for(int i = 0; i < students.length; i++)
		{
			for(int j = 0; j < students[i].length(); j++)
			{
				if(Character.isLetter(students[i].charAt(j)) == true || (students[i].charAt(j) == ' ' && spacecounter == 0))
				{
					if(students[i].charAt(j) == ' ')
					{
						spacecounter++;
					}
					imieNaz = imieNaz + students[i].charAt(j);
				}
				else if(Character.isDigit(students[i].charAt(j)) == true)
				{
					if(j+1 < students[i].length() && Character.isDigit(students[i].charAt(j+1)) == true)
					{
						numberstr = numberstr + students[i].charAt(j);
					}
					else
					{
						if(numberstr == null)
						{
							numberstr = numberstr + students[i].charAt(j);
						}
						else
						{
							numberstr = numberstr + students[i].charAt(j);
						}
						number = Integer.parseInt(numberstr);
						sum = sum + number;
						number = 0;
						numberstr = "";
					}
					counter++;
				}
				if(students[i].charAt(j) == ',' || j+1 > students[i].length()-1)
				{
					avg = sum/counter;
					System.out.println(imieNaz + " - " + Math.round(avg));
					sum = 0;
					counter = 0;
					avg = 0;
					imieNaz = "";
					spacecounter = 0;
				}
			}
		}

	}

}
