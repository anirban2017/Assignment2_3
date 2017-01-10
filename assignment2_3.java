package Assignment2_3;

public class Assignment2_3 {
	public static void main(String[] args) 
	{
	int i, j, k;
	for(i=1;i<=3;i++)
	{
	for(j=i;j<3;j++)
	{
	System.out.print(" ");
	}
	if(i==2)
	for(k=1;k<(i*2);k++)
	{if(k==2)
	{
	System.out.print("b");
	}
	else
	{
	System.out.print("a");
	}
	}
	else{
	for(k=1;k<(i*2);k++)
	{if(k==2)
	{
	System.out.print("b");
	}
	else if(k==3)
	{
	System.out.print("c");
	}
	else if(k==4)
	{
	System.out.print("b");
	}
	else
	{
	System.out.print("a");
	}
	}
	}
	System.out.println();
	}
	for(i=2;i>=1;i--)
	{
	for(j=3;j>i;j--)
	{
	System.out.print(" ");
	}
	for(k=1;k<(i*2);k++)
	{if(k==2)
	{
	System.out.print("b");
	}
	else
	{
	System.out.print("a");
	}
	}
	System.out.println();
	}

	}
}
