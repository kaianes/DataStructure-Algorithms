package MyTree;

//  Implementes the nodes

class AVLNode
{    
    AVLNode left, right;
    int data;
    int height;

    // Constructor
    public AVLNode()
    {
        left = null;
        right = null;
        data = 0;
        height = 0;
    }

    public AVLNode(int n)
    {
        left = null;
        right = null;
        data = n;
        height = 0;
    }

}     
