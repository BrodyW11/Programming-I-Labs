public class CardLock {
    
    SmartCard lastSeen; //the most recent card to be swiped
    boolean studentAccess; //checks whether students can unlock the lock
    //swipe a card on the card lock
    public void swipeCard(SmartCard swipedCard) {
        this.lastSeen = swipedCard; //sets the instance variable lastCardSeen to the value of the parameter card_swiped
    }
    
    //checks whether the card lock is unlocked
    public boolean isUnlocked() {
        boolean unlocked = false;
        
        if (studentAccess) {
            unlocked = true;
        }
        else if (studentAccess == false) {
            unlocked = this.getLastCardSeen().isStaff();
        }
          return unlocked;
   
    }    
     
    
    
    //toggle whether students can unlock the lock
    public void toggleStudentAccess() {
        studentAccess = !studentAccess; //change studentAcess' flag -> studentAccess = Opposite of studentAccess -> In other words, studentAccess changes states
    }
    
    public SmartCard getLastCardSeen() {
        return this.lastSeen; //returns the instance variable lastCard seen
    }
    
}
    
       