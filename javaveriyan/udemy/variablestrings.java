package udemy;

public class variablestrings
 {

 static  void  showList(int start ,String ...S)
 {
    for(int x:S)
    {
        System.out.println(start+1+"."+S[x]);
        start++;
    }
 }
  public static void main(String[] args) 
  {
        showList(5,"vinoth","sanjayrahul","neelraj","narayanan","ramkumar","ponraj","sabesh","vasu","vishnu","aravind");
  }
    
}
