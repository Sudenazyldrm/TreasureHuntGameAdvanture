/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package YILDIRIMSUDENAZtreasurehuntgame;

/**
 *
 * @author ASUS
 */
public class YILDIRIMSUDENAZDNode {

    String type;
    YILDIRIMSUDENAZDNode next;
    YILDIRIMSUDENAZDNode prev;
    String originalType;
    int visitCount = 0;

    public YILDIRIMSUDENAZDNode(String type) {
        this.originalType = type;
        this.type = type;
        this.next = null;
        this.prev = null;

    }

}
