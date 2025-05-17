/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package YILDIRIMSUDENAZtreasurehuntgame;

/**
 *
 * @author ASUS
 */
public class YILDIRIMSUDENAZLinkedList {

    public YILDIRIMSUDENAZNode head;
    public YILDIRIMSUDENAZNode player;

    public void add(String type) {
        YILDIRIMSUDENAZNode newNode = new YILDIRIMSUDENAZNode(type);
        if (head == null) {
            head = newNode;
        } else {
            YILDIRIMSUDENAZNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public YILDIRIMSUDENAZNode getNodeAt(int index) {
        YILDIRIMSUDENAZNode temp = head;
        int i = 0;
        while (temp != null && i < index) {
            temp = temp.next;
            i++;
        }
        return temp;
    }

    public boolean movePlayer(int steps) {
        if (player == null) {
            player = head;
            steps--;
        }
        while (steps > 0 && player != null && player.next != null) {
            player = player.next;
            steps--;
        }
        return steps == 0;
    }

    public int getPlayerIndex() {
        YILDIRIMSUDENAZNode current = head;
        int index = 0;
        while (current != null) {
            if (current == player) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public int getPlayerIndexFromNode(YILDIRIMSUDENAZNode node) {
        YILDIRIMSUDENAZNode current = head;
        int index = 0;
        while (current != null) {
            if (current == node) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

}
