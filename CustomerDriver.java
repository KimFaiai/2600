import java.util.Random;//import random class
/**
 *Program simulates customers waiting in line at a grocery store.
 *  Using a Queue to represent the customer objects waiting in line.
 * 
 * @author Kimberly Faiai 
 * @version 9/30/2014
 */
public class CustomerDriver
{
    
    public static void main(String [] args)
    {
        PriorityQueue p = new PriorityQueue();
        Random r = new Random();
        int n;
        int x = 0;//counter       
        int o = 0;//counter
        
     //  PriorityCustomer c = new PriorityCustomer();  
        
   //This for loop will iterate 60 times     
   for(int i = 0; i < 60; i++){
       
       //random number generator from 1 to 4 will add customer 25% of the time
       n = r.nextInt(4);
       //creates Customer object c

       PriorityCustomer c = new PriorityCustomer();
      //if the random number generator generates 1(which has a 25% chance of being generated)
        // a new Customer object will be added to the list and the size of the list will be updated and displayed */
        if(n == 1){           
           //add object to list
          p.add(c.getPriority());
         o++; 
          System.out.println("New Customer Added! Queue length is now " + p.getSize());          
        }
       
       /*if the first item in the list is not empty and the items service time is equal greater than 1
          it will be decreased and removed from the list and the list size will be changed and displayed*/
       for(int a=0;a < c.getServiceTime(); a++){
       if(c.getServiceTime() > 1){
           c.decServiceTime();              
         }else if(c.getServiceTime()==1){ //if customer service time is equal to 1 remove the customer
         //remove customer
          p.remove();
          System.out.println("Customer serviced and removed from the queue. Queue length is now "+ p.getSize());
          x++;
       }else{ System.out.println("check again");
      
      }
       }
       //print  " - " to represents minutes visually 
       System.out.print("-");
       
    }
    
   System.out.println(" ");
    System.out.println("Total number of customers serviced: " + x);
    System.out.println("Max line length: " + o);

 }
}
