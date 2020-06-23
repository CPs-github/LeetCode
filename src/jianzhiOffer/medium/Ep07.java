package jianzhiOffer.medium;

import jianzhiOffer.module.TreeNode;

import java.util.HashMap;

public class Ep07 {

    public static void main(String[] args) {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        buildTree(preorder,inorder);

    }
    /**
     *  因为前序遍历的数组相对中序遍历的数组更好找到根节点，
     *  而中序遍历的数组比前序遍历的数组更好的找到子树的左右边界。
     *  所以我们用前序遍历的数组来寻找子树的根节点，
     *  而子树的左右边界则在中序遍历数组中寻找。为了更快捷的找到子树左右边界的索引
     *  采用 HashMap 记录中序遍历数组中的数值(Key)，索引(Value);
     */
    private static HashMap<Integer,Integer> map = new HashMap<>();
    private static int[] preorder ;
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        preorder= preorder;
        TreeNode root = new TreeNode(preorder[0]);
        for (int i = 0 ; i< inorder.length; i++){
            map.put(inorder[i],i);
        }
        return recur(0,0,inorder.length-1);
    }

    /**
     *
     * @param pre_root_index    前序遍历数组的根节点的索引
     * @param in_left_index     中序遍历数组的子树的左边界索引
     * @param in_right_index    中序遍历数组的子树的右边界索引
     * @return                  返回子树的根节点
     */
    public static TreeNode recur(int pre_root_index , int in_left_index , int in_right_index){
        /**
         *  若该树的左边界等于有边界，则说明该树只有一个节点，且就是他本身
         *
         *  递归终止条件：如果树的右边界小于左边界，则该树不存在。
         */

        if (in_left_index > in_right_index){
            return null;
        }
        // 获得树的根节点
        TreeNode root = new TreeNode(preorder[pre_root_index]);

        // 中序遍历数组中的子树根节点的索引
        int in_root_index = map.get(preorder[pre_root_index]);
        /**
         * 左子树的根节点就是 左子树的(前序遍历）第一个，
         * 就是+1,左边边界就是left，右边边界是中间区分的idx-1
         */
         root.left = recur(pre_root_index+1,in_left_index,in_root_index-1);

        /**
         *   由根节点在中序遍历的 in_root_index 区分成2段,in_root_index 就是根节点索引
         *   in_root_index+1 就是右子树的左边界，有边界则是原来的有边界
         *
         */
        root.right = recur(pre_root_index+(in_root_index-in_left_index)+1,in_root_index+1,in_right_index);
        return root;
    }
}
