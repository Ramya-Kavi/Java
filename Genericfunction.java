package Generic;
class Maximum
{
     <S extends Comparable<S>>
     void max(S[] elem)
     {
          S max=elem[0];
          for(int i=1;i<elem.length;i++)
          {
              if(elem[i].compareTo(max)>0)
              {
                  max=elem[i];
                  
              }
          }
          System.out.println("The maximum element is:"+max);
     }
}
public class Genericfunction 
{
    public static void main(String[] args)
    {
        
        Maximum m=new Maximum();
        Integer[] i={1,6,9,4};
        Double[] d={23.4,56.7,45.7,32.9};
        Character[] c={'p','r','a','n','a','v'};
        String[] s={"rp","van","arp"};
                m.max(i);
                m.max(d);
                m.max(c);
                m.max(s);
    }
}
