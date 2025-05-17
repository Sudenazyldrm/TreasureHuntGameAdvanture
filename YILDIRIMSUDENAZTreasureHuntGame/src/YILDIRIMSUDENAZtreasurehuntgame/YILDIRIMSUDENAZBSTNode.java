/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package YILDIRIMSUDENAZtreasurehuntgame;

/**
 *
 * @author ASUS
 */

public class YILDIRIMSUDENAZBSTNode {
    int score;
    String username;
    String level;
    YILDIRIMSUDENAZBSTNode left;
    YILDIRIMSUDENAZBSTNode right;

    public YILDIRIMSUDENAZBSTNode(String username, String level, int score) {
        this.username = username;
        this.level = level;
        this.score = score;
        this.left = null;
        this.right = null;
    }
}

