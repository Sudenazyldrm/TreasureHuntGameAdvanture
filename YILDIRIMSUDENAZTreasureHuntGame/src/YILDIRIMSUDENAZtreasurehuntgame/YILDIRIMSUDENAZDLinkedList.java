/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package YILDIRIMSUDENAZtreasurehuntgame;

/**
 *
 * @author ASUS
 */
public class YILDIRIMSUDENAZDLinkedList {

    public YILDIRIMSUDENAZDNode head;
    public YILDIRIMSUDENAZDNode player;
    public YILDIRIMSUDENAZDNode tail;
    public YILDIRIMSUDENAZDNode lastPlayerNode = null;

    public YILDIRIMSUDENAZDNode add(String type) {
        YILDIRIMSUDENAZDNode newNode = new YILDIRIMSUDENAZDNode(type);
        newNode.originalType = type;

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        return newNode;
    }

    public YILDIRIMSUDENAZDNode getNodeAt(int index) {
        YILDIRIMSUDENAZDNode temp = head;
        int i = 0;
        while (temp != null && i < index) {
            temp = temp.next;
            i++;
        }
        return temp;
    }

    public void moveForward(int diceRoll) {
        int steps = diceRoll;
        while (steps > 0 && player.next != null) {
            player = player.next;
            steps--;
        }
    }

    public void moveBackward(int diceRoll) {
        int steps = diceRoll;
        while (steps > 0 && player.prev != null) {
            player = player.prev;
            steps--;
        }
    }

    public int getPlayerIndex() {
        YILDIRIMSUDENAZDNode temp = head;
        int index = 0;
        while (temp != null && temp != player) {
            temp = temp.next;
            index++;
        }
        return temp == null ? -1 : index;
    }

    public int getPlayerIndexFromNode(YILDIRIMSUDENAZDNode node) {
        YILDIRIMSUDENAZDNode temp = head;
        int index = 0;
        while (temp != null && temp != node) {
            temp = temp.next;
            index++;
        }
        return temp == null ? -1 : index;
    }

    public boolean movePlayer(int steps) {
    if (player == null) {
        player = head;
        steps--;
    }

    while (steps > 0 && player.next != null) {
        player = player.next;
        steps--;
    }

    return steps == 0;
}


}
