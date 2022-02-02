class Sugar extends Cookie {
  String shape;
  boolean isDecorated;

  Sugar(){
    shape = " ";
    isDecorated = false;
  }

  Sugar(String aShape){
    shape = aShape;
    isDecorated = false;
  }

  String getShape(){
    return shape;
  }

  void setShape(String theShape){
    shape = theShape;
  }

  void cutOut(String aShape, int number){
    System.out.println(number + " cookies were cut into " + aShape);
    super.setNumberCookies(number);
  }

  void decorate(){
    super.getReady();
    if (isReady == true){
      System.out.println("The cookies were decorated");
      isDecorated = true;
    }
    else {
      System.out.println("Make sure to bake the cookies first.");
    }
  }
}