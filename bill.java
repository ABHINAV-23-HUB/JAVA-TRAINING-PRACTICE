import java.util.*;
class bill{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.println("Enter units from meter");
int units=sc.nextInt();
double bill=0;
if((units>=0)&&(units<=100)){
bill=units*0;
System.out.println("Your bill for electricity : "+bill);
}
else if((units>=101)&&(units<=200)){
bill=100*0+(units-100)*7;
System.out.println("Your bill for electricity : "+bill);
}
else if((units>=201)&&(units<=300)){
bill=100*0+(units-100)*7+(units-200)*9;
System.out.println("Your bill for electricity : "+bill);
}
else if((units>=301)&&(units<=400)){
bill=100*0+(units-100)*7+(units-200)*9+(units-300)*12;
System.out.println("Your bill for electricity : "+bill);

}
else{
bill=100*0+(units-100)*7+(units-200)*9+(units-300)*12+(units-400)*15;
System.out.println("Your bill for electricity : "+bill);
}
}
}