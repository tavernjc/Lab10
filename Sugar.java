Class Sugar extends Cookie
{
  String shape;
  boolean isDecorated;
  Sugar()
  {
    shape="";
    isDecorated=false;
  }
  Sugar(String a)
  {
    shape=a;
    isDecorated=false;
  }
String getShape(){
  return shape;
}
void changeShape(String a)
{
  shape=a;
}
void cutShapes(String a, int b)
{
  system.out.println(b+" cookies were cut into " +a);
  super.setNumCookie(b);
}

Void decorate(){
  if (super.isReady()==true)
  {
    isDecorated=true;
    system.out.println("The cookies were decorated");
  }
  else{
    system.out.println("Make Sure to bake the cookies firs");
    
  }
}





}