
package testproject;


public class Room {
    int length;
    int width;
    int height;
    Room(int l,int w,int h){
        length=l;
        width=w;
        height=h;
    }
    void display(){
        System.out.println("Length: "+length);
        System.out.println("Width: "+width);
        System.out.println("Height: "+height);
    }
}
