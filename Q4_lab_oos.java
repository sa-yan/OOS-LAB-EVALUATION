/*
 * Creating an interface GIN having a method display() then creating 2 interfaces extending GIN then creating a class that implements those 2 interfaces and finally invoking the method using object of that class.

 */

 interface GIN{
    void display();
 }

 interface IN1 extends GIN{

 }

 interface IN2 extends GIN{

 }

 class Sample implements IN1, IN2{
    public void display(){
        System.out.println("From Sample class");
    }
 }

class Q4_lab_oos {
    public static void main(String[] args) {
        Sample ob = new Sample();
        ob.display();
    }
}
