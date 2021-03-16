/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managingpeople;

/**
 *
 * @author HP
 */
class person {
    String name;
    int ages;
    
    //Using Set and Get Method
    public void set(String name, int ages) {
        this.name = name;
        this.ages = ages;
    }
    
    public String getname() {
        return this.name;
        
    }
    
   public int getages() {
       return this.ages;
   }
}

//Main Method//
    class managingpeople {
        
        public static void main(String[] args) {
    //Objects from Class//
            person p1 = new person();
            person p2 = new person();
            p1.set("Haechan", 20);
            p2.set("Doyoung", 23);
    //Show the Program //
            if(p1.getages() == p2.getages()) {
                System.out.println(p1.getname()+ " Is the same age as " + p2.getname());
            }else {
                System.out.println(p1.getname()+" Is NOT the same age as "+p2.getname());     
        }
   }
    }

