import java.util.Scanner;
class clinic
{
   int med1=20;
    int med2=40;
    int med3=60;
    int med4=80;
   
}
class patient extends clinic
{
String name;
double id;
patient(){}
   
    void docd()
    {
    int id;
    Scanner sc = new Scanner(System.in);
    System.out.println("ARE YOU A NEW PATIENT IF YES PRESS 1 ELSE PRESS 0");

int a = sc.nextInt();
if(a==1)
{id=3;
    id=id+1;
System.out.println("Enter your Name");
  Scanner in = new Scanner(System.in);
String s;
s=in. nextLine();
System.out.println("your id is "+id);
System.out.println("your name is "+s);
System.out.println("If you want to check doctors availability press 1 else if you want to check medicine availablity press 2");
int c=sc.nextInt();
switch (c)
{
case 1:System.out.println("monday:doc1 \n tuesday:doc1 doc2 \n wednesday:doc3 doc1 \n thursday:doc1 doc4 \n friday:doc2 doc5 \n saturday:doc4");
break;
case 2: {
System.out.println("med 1:"+med1);
System.out.println("med 2:"+med2);
System.out.println("med 3:"+med3);}
break;
  } 
}
if(a==0)
{
    System.out.println("ENTER YOUR ID");
int b=sc.nextInt();
switch(b)
{
case 1: System.out.println("name:raj \n id:01\n YOU ARE UNDER MEDICATION OF DOCTOR 1");break;
case 2: System.out.println("name:ram \n id:02\n YOU ARE UNDER MEDICATION OF DOCTOR 2");break;
case 3: System.out.println("name:rakesh \n id:03\n YOU ARE UNDER MEDICATION OF DOCTOR 3");break;
default:System.out.println("thiis is default") ;
}
System.out.println("If you want to check doctors availability press 1 else if you want to check medicine availablity press 2 or if you want to order some medicine press 3");
int c=sc.nextInt();
switch (c)
{
case 1:System.out.println("monday:doc1 \n tuesday:doc1 doc2 \n wednesday:doc3 doc1 \n thursday:doc1 doc4 \n friday:doc2 doc5 \n saturday:doc4");
break;
case 2: {
System.out.println("med 1:"+med1);
System.out.println("med 2:"+med2);
System.out.println("med 3:"+med3);}break;
case 3:{
   System.out.println("If you want to order medicine 1 press 1 similarly press 2 and 3 for med 2 and 3");
  int p=sc.nextInt();
   switch(p)
   {
   case 1:{System.out.println("You have ordered med 1");
       System.out.println("Enter quantity");
      int z1=sc.nextInt();
       System.out.println("remaining medicines are "+(med1-z1));
   }break;
   case 2:{System.out.println("You have ordered med 2");
       System.out.println("Enter quantity");
      int z2=sc.nextInt();
       System.out.println("remaining medicines are "+(med2-z2));
   }break;
   case 3:{System.out.println("You have ordered med 3");
       System.out.println("Enter quantity");
    int z3=sc.nextInt();
       System.out.println("remaining medicines are "+(med3-z3));
   }break;
   }
}
  } 
}
}}
class doctor extends clinic
{
String name;
double id;
doctor(){}
   
    void docd()
    {
    int id;
    Scanner sc = new Scanner(System.in);
    System.out.println("ARE YOU A NEW DOCTOR IN CLINIC IF YES PRESS 1 ELSE PRESS 0");
    int f = sc.nextInt();
    if(f==1)
{id=5;
    id=id+1;
System.out.println("Enter your Name");
 Scanner in = new Scanner(System.in);
String s;
s=in. nextLine();
System.out.println("your id is"+id);
System.out.println("your name is "+s);
System.out.println("If you want to check patients details press 1 else if you want to check medicine availablity press 2");
int g=sc.nextInt();
switch (g)
{
case 1:{
System.out.println("Please enter patients id");
int h=sc.nextInt();
switch (h)
{
case 1: System.out.println("name:raj \n id:01\n UNDER MEDICATION OF DOCTOR 1");break;
case 2: System.out.println("name:ram \n id:02\n UNDER MEDICATION OF DOCTOR 2");break;
case 3: System.out.println("name:rakesh \n id:03\n UNDER MEDICATION OF DOCTOR 3");break;
default:System.out.println("thiis is default") ;
}
}
break;
case 2: {
System.out.println("med 1:"+med1);
System.out.println("med 2:"+med2);
System.out.println("med 3:"+med3);}break;
  } 
}
if(f==0)
{
    System.out.println("ENTER YOUR ID");
int j=sc.nextInt();
switch(j)
{
case 1: System.out.println("name:DOC 1 \n id:01\n YOU SCHEDULED YOUR AVAILABILITY ON MONDAY TUESDAY WEDNESDAY AND THURSDAY");break;
case 2: System.out.println("name:DOC 2 \n id:02\n YOU SCHEDULED YOUR AVAILABILITY ON TUESDAY AND THURSDAY");break;
case 3: System.out.println("name:DOC 3 \n id:03\n YOU SCHEDULED YOUR AVAILABILITY ON WEDNESDAY");break;
case 4: System.out.println("name:DOC 4 \n id:04\n YOU SCHEDULED YOUR AVAILABILITY ON THURSDAY AND SATURDAY");break;
case 5: System.out.println("name:DOC 5 \n id:05\n YOU SCHEDULED YOUR AVAILABILITY ON FRIDAY");break;
default:System.out.println("thiis is default") ;
}
System.out.println("If you want to check patients details press 1 else if you want to check medicine availablity press 2");
int k=sc.nextInt();
switch (k)
{
case 1:{
System.out.println("Please enter patients id");
int m=sc.nextInt();
switch (m)
{
case 1: System.out.println("name:raj \n id:01\n UNDER MEDICATION OF DOCTOR 1");break;
case 2: System.out.println("name:ram \n id:02\n UNDER MEDICATION OF DOCTOR 2");break;
case 3: System.out.println("name:rakesh \n id:03\n UNDER MEDICATION OF DOCTOR 3");break;
default:System.out.println("thiis is default") ;
}
}
break;
case 2: {
System.out.println("med 1:"+med1);
System.out.println("med 2:"+med2);
System.out.println("med 3:"+med3);}break;
  } 
}}}
class Main
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
   System.out.println("IF YOU ARE A DOCTOR PRESS 2 IF YOU ARE A PATIENT PRESS 1");
   int e=sc.nextInt();
   switch (e)
   {
   case 1:{
     patient p2=new patient();
   
   p2.docd();
   } break;
   case 2:{
     doctor d2=new doctor();
     d2.docd();
   }break;
   default: System.out.println("this is default");
   }
}
}
