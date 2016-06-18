import java.util.ArrayList;
class ArrLst
{
public static void main(String args[])
{
ArrayList l=new ArrayList();
l.add(10);
l.add(11);
l.add(12);
l.add(13);
l.add(14);
int sum=0;

/* works well here l.forEach((a)->System.out.println(a));*/

/* l.forEach((a)->sum=sum+a); Error is bad operand types for binary operator '+'
 l.forEach((a)->sum=sum+a);
First type: int
Second type: object*/

l.forEach((a)->sum=sum+l.get(a)); 

/*for(int i=0;i<l.size();i++)
{
sum=sum+Number(l.get(i));
}
*/
System.out.println(sum);
}

}