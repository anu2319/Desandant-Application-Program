import java.util.ArrayList;
import java.util.HashMap;

public class ParentSon
{
    String name;
    ArrayList<ParentSon> sons = new ArrayList<>();
    static HashMap<String,ParentSon> parentSon = new HashMap<>();

    public ParentSon(String parent, String child)
    {
        if(!parentSon.containsKey(parent))
        {
           this.name = parent;
           parentSon.put(name,this);
        }
        if(child!=null)
        {
            ParentSon sonObj = new ParentSon(child,null);
            parentSon.get(parent).sons.add(sonObj);
        }
    }

    public static void findDesandants(String name, int level)
    {
        for(ParentSon son : parentSon.get(name).sons)
        {
            if(level==1)
            {
                System.out.println(son.name);
            }
            else
            {
                findDesandants(son.name,level-1);
            }
        }
    }
}
