import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        calculator rec=new calculator();
        rec.getData();
        rec.computeField();
        rec.fieldDisplay();
    }
}
 class calculator {
     double length,width,area;
     public void getData(){

         System.out.println("Enter the side length");
         Scanner r=new Scanner(System.in);
         length=r.nextDouble();
         System.out.println("Enter the side width");
         width=r.nextDouble();

     }
     public void computeField(){
         area=length*width;
     }
     public void fieldDisplay()
     {
         System.out.println("Area of the rectangle"+area);
     }

}


