import java.util.ArrayList;
import java.util.LinkedList;

import org.w3c.dom.Node;

public class level 
{
    List<List<Integer>> level(Node root)
    {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>smallans=new ArrayList<>();
        if(root==null)
            return ans;
        LinkedList<Node>queue=new LinkedList<>();
        queue.addLast(root);
        while(queue.isEmpty()==false)
        {
            int size=queue.size();
            while(size-->0)
            {
                Node fnt=queue.removeFirst();
                small.add(fnt);
                if(fnt.left!=null)
                    queue.add(fnt.left);
                if(fnt.right!=null)
                    queue.add(fnt.right);
            }
            ans.add(new ArrayList<>(smallans));
            smallans.clear();
        }
        return ans;
    }    
}
