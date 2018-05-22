//I know this is missing the public keyword but thats is how it is on Codingbat
int countXX(String str) {
  int num = 0;
  String[] letters = str.split("");
  for(int i = 0; i < letters.length - 1; i++){
    if(letters[i].equals("x") && letters[i+1].equals("x") ){
      num++;
    }
  }
  return num;
}
