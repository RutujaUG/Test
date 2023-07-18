public class SecondLargestInArrayExample{  

public static void main(String args[]){  
int a[]={100,14,46,47,94,52,86,36,94,89};   

for (int i = 0; i < a.length; i++)   
{  
	int temp; 
    for (int j = i + 1; j < a.length; j++)   
    {  
        if (a[i] > a[j])   
        {  
            temp = a[i];  
            a[i] = a[j];  
            a[j] = temp;  
        }  
    }  
}  

int total=a.length-1;
System.out.println("the second Largest Number is "+a[total-1]);
} 
} 