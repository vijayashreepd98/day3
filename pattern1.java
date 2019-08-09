
public class pattern1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
char set1='A',set2='c';
int row=4,space=1,letters=0;
while(row>=1)
	{
	space=1;
	while(space<row)
		{
		System.out.print(" ");space++;
		if(row<3)
			{
			set2+=row;
			}
		else
		{
			set1+=row;
		}
		letters=4;
		while(letters>=row&&letters>=0)
		{
			if(row<3){
				System.out.print(set2);
				set2+=row;
			}
			else
				
			{
				System.out.print(set1);
				set1+=row;
				
			}
			letters--;
		}
		System.out.println();
		row--;
			}
		}
	}

}
