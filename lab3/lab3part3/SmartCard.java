public class SmartCard
{ 
    String ownersName;
    boolean isStaff = false;
    
    SmartCard(String owner)
    {
        ownersName = owner;
      
    }
    public String getOwner()
    {
        return ownersName;
    }


    public boolean isStaff(){
        return isStaff;
    } 

    public void setStaff(boolean staff){
        isStaff= staff;
    }

    
    
}



