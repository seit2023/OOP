package Ass5;

import java.util.Scanner;
interface vehicle{
void gearup();
void speedup();
void status();
}

class Car implements vehicle{
int gear,speed,speed2;
void initial() {
int a,b;
while(1>0) {
System.out.println("Enter The Gear At Which Your Car Is Running : ");
Scanner obj=new Scanner(System.in);
a=obj.nextInt();
if(a>5)
System.out.println("Invalid Input(should be less than 6)");
else
break;
}
gear=a;

while(1>0) {
System.out.println("Enter The Speed(Km/h) At Which Your Car Is Running : ");
Scanner obj1=new Scanner(System.in);
b=obj1.nextInt();
if(b>435)
     System.out.println("Invalid Input.(MAX SPEED RECORDED TILL DATE : 435 km/h - )");
else
     break;
}
speed=b;
}

@Override
public void gearup() {
int c;
while(1>0) {
System.out.println("Enter How Many Gears You Want To Increase : ");
Scanner obj=new Scanner(System.in);
c=obj.nextInt();
if((gear+c) > 5)
System.out.println("Invalid Input(must be less than 6)");
else
break;
}
gear=(gear+c);
}
@Override
public void speedup() {
int d;
while(1>0) {
System.out.println("Enter The Speed(Km/h) To Be Incremented(in MPH): ");
Scanner obj=new Scanner(System.in);
d=obj.nextInt(); 
if((speed+d)>436)
System.out.println("Invalid Input.(MAX SPEED RECORDED TILL DATE : 435 km/h )");
else
break;
}
speed=(speed+d);
}
public void brakes() {
int e;
while(1>0) {
System.out.println("Enter The Speed(Km/h) To Be Decremented After Applying Brakes: ");
Scanner obj=new Scanner(System.in);
e=obj.nextInt();
if(e>speed)
System.out.println("The Speed To Be Decremented Cant Be Greater Than Original Speed ");
else
break;
}
speed2=(speed-e);
}
@Override
public void status() {
System.out.println("Current gear of car : "+gear);
System.out.println("Current speed of car : "+speed+" Km/h");
System.out.println("speed after applying brakes : "+speed2+" Km/h");
}
}


class Bike implements vehicle{
int gear,speed,speed2;
void initial() {
int a,b;

while(1>0) {
System.out.println("Enter The Gear At Which Your Bike Is Running : ");
Scanner obj=new Scanner(System.in);
a=obj.nextInt();
if(a>4)
System.out.println("Invalid Input(should be less than equal to 4)");
else
break;
}
gear=a;
while(1>0) {
System.out.println("Enter The Speed(Km/h) At Which Your Bike Is Running : ");
Scanner obj1=new Scanner(System.in);
b=obj1.nextInt();
if(b>310)
System.out.println("Invalid Input.(MAX SPEED RECORDED TILL DATE : 310 km/h - MV AGUSTA F4)");
else
break;
}
speed=b;
}
@Override
public void gearup() { 
int c;
while(1>0) {
System.out.println("Enter How Many Gears You Want To Increase : ");
Scanner obj=new Scanner(System.in);
c=obj.nextInt();
if((gear+c) > 5)
System.out.println("Invalid Input(must be less than equal to 4)");
else
break;
}
gear=(gear+c);
}
@Override
public void speedup() {
int d;
while(1>0) {
System.out.println("Enter The Speed(Km/h) To Be Incremented(in MPH): ");
Scanner obj=new Scanner(System.in);
d=obj.nextInt();
if((speed+d)>310)
System.out.println("Invalid Input.(MAX SPEED RECORDED TILL DATE : 310 km/h - MV AGUSTA F4)");
else
break;
}
speed=(speed+d);
}
public void brakes() {
int e;
while(1>0) {
System.out.println("Enter The Speed To Be Decremented After Applying Brakes: ");
Scanner obj=new Scanner(System.in);
e=obj.nextInt();
if(e>speed)
System.out.println("The Speed To Be Decremented Cant Be Greater Than Original Speed");
else
break;
}
speed2=(speed-e);
}
@Override
public void status() {
System.out.println("Current gear of bike : "+gear);
System.out.println("Current speed of bike : "+speed+" Km/h");
System.out.println("speed after applying brake : "+speed2+" Km/h");
}
}



class Bicycle implements vehicle{
int gear,speed,speed2;
void initial() {
int a,b;

while(1>0) {
System.out.println("Enter The Gear At Which Your Bicycle Is Running : ");
Scanner obj=new Scanner(System.in);
a=obj.nextInt(); 
if(a>10)
System.out.println("Invalid Input(should be less than equal to 10)");
else
break;
}
gear=a;
while(1>0) {
System.out.println("Enter The Speed(Km/h) At Which Your Bicycle Is Running : ");
Scanner obj1=new Scanner(System.in);
b=obj1.nextInt();
if(b>100)
System.out.println("Invalid Input.(MAX SPEED RECORDED TILL DATE : 100 km/h - Moulton AM7)");
else
break;
}
speed=b;
}
@Override
public void gearup() {
int c;
while(1>0) {
System.out.println("Enter How Many Gears You Want To Increase : ");
Scanner obj=new Scanner(System.in);
c=obj.nextInt();
if((gear+c) > 5)
System.out.println("Invalid Input(must be less than equal to 10)");
else
break;
}
gear=(gear+c);
}
@Override
public void speedup() {
int d;
while(1>0) {
System.out.println("Enter The Speed(Km/h) To Be Incremented(in MPH): ");
Scanner obj=new Scanner(System.in);
d=obj.nextInt();
if((speed+d)>100)
System.out.println("Invalid Input.(MAX SPEED RECORDED TILL DATE : 100 Km/h - Moulton AM7)");
else
break;
}
speed=(speed+d);
}
public void brakes() {
int e;
while(1>0) {
System.out.println("Enter The Speed(Km/h) To Be Decremented After Applying Brakes: ");
Scanner obj=new Scanner(System.in);
e=obj.nextInt();
if(e>speed)
System.out.println("The Speed To Be Decremented Cant Be Greater Than Original Speed ");
else
break;
} 
speed2=(speed-e);
}
@Override
public void status() {
System.out.println("Current gear of bicycle : "+gear);
System.out.println("Current speed of bicycle : "+speed);
System.out.println("speed after applying brake : "+speed2);
}
}
public class InterfaceDemo {
public static void main(String args[]) {
int c;
System.out.println("PRESS THE RESPECTIVE NUMBERS TO CHOOSE YOUR OPTION");
System.out.println("1 : CAR \n2 : BIKE \n3 : BICYCLE\n4 : EXIT\n");
do {
Scanner obj=new Scanner(System.in);
c=obj.nextInt();
switch(c) {
case 1 :
Car obj1 = new Car();
obj1.initial ();
obj1.gearup();
obj1.speedup();
obj1.brakes();
obj1.status();
break;

case 2 :
Bike obj2 = new Bike();
obj2.initial ();
obj2.gearup();
obj2.speedup();
obj2.brakes();
obj2.status();
break;

case 3 :
Bicycle obj3 = new Bicycle();
obj3.initial ();
obj3.gearup();
obj3.speedup();
obj3.brakes();
obj3.status();
break;

}
//System.out.println("DO YOU WANT TO CONTINUE (y/n) ?");
//Scanner obj4=new Scanner(System.in);
//char f=obj4.next().charAt(0);
//if(f=='n')
//c=4;
//else
System.out.println("1 : CAR \n2 : BIKE \n3 : BICYCLE\n4 : EXIT\n");
}while(c!=4);
}
 
}
