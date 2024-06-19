	import java.util.ArrayList;
	import java.util.ListIterator;

    public class Balls
    {
        public static void main(String[] args)
        {
            ArrayList<String>al=new ArrayList<String>();
            al.add("RED");
            al.add("RED");
            al.add("RED");
            al.add("RED");
            al.add("BLUE");
            al.add("BLUE");
            al.add("BLUE");
            al.add("BLUE");
            al.add("GREEN");
            al.add("GREEN");
            al.add("GREEN");
            al.add("GREEN");

            int countred=0;
            int countgreen=0;
            int countblue=0;

            ArrayList<String> ans=new ArrayList<>();
            for(int i=0;i<5;i++)
            {
                ListIterator<String>it= al.listIterator();
                while(it.hasNext())
                {
                    if(it.next().equals("BLUE"))
                    {
                        countblue++;
                        if(countblue<=2)
                        {
                            ans.add("BLUE");
                        }
                    }
                    else if(it.next().equals("GREEN"))
                    {
                        countgreen++;
                              if(countgreen<=1)
                        {
                            ans.add("GREEN");
                        }
                    }
                    else if(it.next().equals("RED"))
                    {
                        countred++;
                        if(countred<=2)
                        {
                            ans.add("RED");
                        }
                    }
                }
            }
            for (String colour:ans)
            {
                System.out.print(colour+"-->");
            }
            System.out.print("\t");
        }
    }

