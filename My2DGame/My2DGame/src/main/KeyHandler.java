package main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

//  GamePanel gp;

    public boolean upPressed, downPressed, leftPressed, rightPressed;
    // DEBUG
    boolean checkDrawTime = false;

    @Override
    public void keyTyped(KeyEvent e) {
        // DO NOT USE
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();

        if(code == KeyEvent.VK_W){
            upPressed = true;
        }

        if(code == KeyEvent.VK_A){
            leftPressed = true;
        }

        if(code == KeyEvent.VK_S){
            downPressed = true;
        }

        if(code == KeyEvent.VK_D){
            rightPressed = true;
        }
/*
        if(code == KeyEvent.VK_SPACE) {
            gp.player.dashOn = true;
        }
*/

//      DEBUG
        if(code == KeyEvent.VK_T){
            if (!checkDrawTime) {
                checkDrawTime = true;
            }
            else {
                checkDrawTime = false;
            }
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();

        if(code == KeyEvent.VK_W){
            upPressed = false;
        }

        if(code == KeyEvent.VK_A){
            leftPressed = false;
        }

        if(code == KeyEvent.VK_S){
            downPressed = false;
        }

        if(code == KeyEvent.VK_D){
            rightPressed = false;
        }

/*        if(code == KeyEvent.VK_SPACE) {
            gp.player.dashOn = false;
        }
*/
    }
}
