public String frontTimes(String str, int n) {
  String result = "";

  while(n > 0){
    if(str.length() > 3){
      result += str.substring(0,3);
    }else{
      result += str;
    }
    n--;
  }
  
  return result;
}
