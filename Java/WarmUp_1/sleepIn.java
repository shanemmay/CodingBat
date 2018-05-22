class Main{

  public boolean sleepIn(boolean weekday, boolean vacation) {
    //because the only other option is that it is a weekday
    if(!weekday || vacation){
     return true;
     }
    return false;
  }


}
