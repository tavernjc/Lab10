class Cookie{
  private int CookieCount,CookieTime,CookieTemp;
  private boolean Baked;

  Cookie(){
    CookieCount=0;
    CookieTemp=0;
    CookieTime=0;
    baked=false;
  }
Cookie(int a, int b, int c)
{
  CookieCount=a;
  CookieTemp=b;
  CookieTime=c;
  baked=false;
}
boolean isready()
{
  return baked;

}

void setNumCookie(int a)
{
  CookieCount=a;
}

void BakeCookies(int a, int b)
{
  system.out.println(CookieCount + "Cookies were baked at" + a + "degrees F for " +b + " Minutes.");
  baked=true;
}





}