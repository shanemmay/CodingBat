public int max1020(int a, int b) {
    if( ( b < 10 || b > 20 ) && ( a >= 10 && a <= 20 ) ){
      return a;
    }
    if( ( b >= 10 && b <= 20 ) && ( a < 10 || a > 20 ) ){
     return b;
    }
    
    if( a > b ){
      if( a >= 10 && a <= 20 ){
        return a;
      }
    }else {
      if( b >= 10 && b <= 20 ){
        return b;
      }
    }
    return 0;
}
