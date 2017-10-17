package java_lambda_Pe3;



import java.util.*;

import java_lambda_Pe3.Sequence.ReverseSequenceSelector;


//Interface
        interface Selector {
            void reverse();
        }
        
        //Outer Class
        class Sequence{
            
            private int size;
            
            public int getSize() {
                return size;
            }

            public void setSize(int size) {
                this.size = size;
            }

            //Inner Class
            class ReverseSequenceSelector implements Selector{
                
                @Override
                public void reverse() {
                    for(int i=size-1; i>=0; i--) {
                        System.out.println(i);
                    }
                }

            }
                
            }
public class Pe3 {

    
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size from which you want to reverse: ");
        int size = sc.nextInt();
            
        Sequence obj = new Sequence();
        obj.setSize(size);
        
        ReverseSequenceSelector obj1 = obj.new ReverseSequenceSelector();
        obj1.reverse();

    
    
    
    
    
    }

}