class Cookie {
 int numberCookies;
 int bakeTemp;
 int bakeTime;
 boolean isReady;

 Cookie(){
    numberCookies = 0;
    bakeTemp = 0;
    bakeTime = 0;
    isReady = false;
  }

 Cookie(int aNumber, int aBakeTemp, int aBakeTime){
    numberCookies = aNumber;
    bakeTemp = aBakeTemp;
    bakeTime = aBakeTime;
    isReady = false;
  }

  boolean getReady(){
    return isReady;
  }

  void setNumberCookies(int theNumber){
    numberCookies = theNumber;
  }

  void bakeCookies(int aTemp, int aTime){
    System.out.println(numberCookies + " cookies were baked at " + aTemp + " degrees Farenheit for " + aTime + " minutes.");
    isReady = true;
  }
}