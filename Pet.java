public class Pet  {

     // 1. Declare INSTANCE VARIABLES
    
    private String name;  
    private int age;
    private double weight;
    private String type;
    private boolean sterile;


     // 2. Define CONSTRUCTOR

     public Pet () {
            this.type = "Dog"; 
            this.name = "Dre";
            this.age = 6;
            this.weight = 35;
            this.sterile = true;
         }
    
     // 3. Define METHODS (getters, toString, setters)

     public Pet(String t, String n, int a, double w, boolean s) {
            this.type = t; 
            this.name = n;
            this.age = a;
            this.weight = w;
            this.sterile = s; 
 }





  public String getType() {
            return type;
         } 

         public String getName() {
            return name;
         }

         public int getAge() {
            return age;
         }

         public double getWeight() {
            return weight;
         }

         public String getSterile() {
            return sterile;
         }


         public String toString() {
            String state = "Pet [" type + "," + name + "," + age + "," + weight + "," + sterile + "]";
            
         }




} //end class
