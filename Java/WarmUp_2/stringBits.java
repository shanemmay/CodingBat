public String stringBits(String str) {
  //TURNING STRING INTO LETTERS
  String[] letters = str.split("");
  //LOOPING THROUGH STRING OF LETTERS AND ADDING THEM TO A STRING
  String result = "";
  for(int x = 0; x < letters.length; x = x + 2){
    result += letters[x];
  }
  return result;
}

