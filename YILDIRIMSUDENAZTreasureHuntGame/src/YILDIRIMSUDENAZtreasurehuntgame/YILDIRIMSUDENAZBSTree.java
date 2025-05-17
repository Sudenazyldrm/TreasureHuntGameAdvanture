package YILDIRIMSUDENAZtreasurehuntgame;

import javax.swing.table.DefaultTableModel;

public class YILDIRIMSUDENAZBSTree {
    private YILDIRIMSUDENAZBSTNode root;

    public void insert(String username, String level, int score) {
        root = insertRec(root, username, level, score);
    }

    private YILDIRIMSUDENAZBSTNode insertRec(YILDIRIMSUDENAZBSTNode node, String username, String level, int score) {
        if (node == null) return new YILDIRIMSUDENAZBSTNode(username, level, score);
        if (score < node.score) {
            node.left = insertRec(node.left, username, level, score);
        } else {
            node.right = insertRec(node.right, username, level, score);
        }
        return node;
    }

    public YILDIRIMSUDENAZBSTNode findMin() {
        if (root == null) return null;
        YILDIRIMSUDENAZBSTNode current = root;
        while (current.left != null) current = current.left;
        return current;
    }

    public YILDIRIMSUDENAZBSTNode findMax() {
        if (root == null) return null;
        YILDIRIMSUDENAZBSTNode current = root;
        while (current.right != null) current = current.right;
        return current;
    }

    public YILDIRIMSUDENAZBSTNode getRoot() {
        return root;
    }

    public void fillTableInOrder(YILDIRIMSUDENAZBSTNode node, DefaultTableModel model) {
        if (node == null) return;
        fillTableInOrder(node.left, model);
        model.addRow(new Object[]{node.username, node.level, node.score});
        fillTableInOrder(node.right, model);
    }
}
