/*Write a program to print the area of two rectangles having sides (4,5) and (5,8)
respectively by creating a class named 'Rectangle' with two instance variables, length and breadth
and a  method named 'Area' which returns the area.
Initialise the object attributes by taking the input from the user in the constructor
 */
public class Ractangle {
    //instance Variable
    int length;
    int breadth;
//    Method
    void insert(int l,int b){
        length=l;breadth=b;
    }
//    2nd method to calculate Area
    void Area(){
        System.out.println(length*breadth);
    }

    public static void main(String[] args) {
        Ractangle r1=new Ractangle();
        Ractangle r2=new Ractangle();
        r1.insert(4,5);
        r2.insert(5,8);
        r1.Area();
        r2.Area();
    }
}
