public int sum(Node root)
{
    if(root==null)
        return 0;
    int lsum=sum(root.left);
    int rsum=sum(root.right);
    return lsum+rsum+root.val;
}




public int size(Node root)
{
    if(root==null)
        return 0;
    int lsize=size(root.left);
    int rsize=size(root.right);
    return lsize+rsize+1;
}


public int maximum(Node root)
{
    if(root==null)
        return Integer.MIN_VALUE;
    int lmax=size(root.left);
    int rmax=size(root.right);
    return Math.max(root.val,Math.max(lmax, rmax));
}


public int minium(Node root)
{
    if(root==null)
        return Integer.MAX_VALUE;
    int lmin=size(root.left);
    int rmin=size(root.right);
    return Math.min(root.val,Math.min(lmin, rmin));
}



public boolean find(Node root,int target)
{
    if(root==null)
        return false;
    boolean lpresent=size(root.left,target);
    boolean rpresent=size(root.right,target);
    boolean self=false;
    if(root.val==target)
        self=true;
    return self||lpresent||rpresent;

}