// https://stackoverflow.com/questions/52874/how-do-you-keep-the-machine-awake

import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class Idle extends Thread {
  public void run() {
    try {
    boolean flag = true;
    do {
        flag = !flag;

        Thread.sleep(6000);
        Toolkit.getDefaultToolkit().setLockingKeyState(KeyEvent. VK_NUM_LOCK, flag);
    }
    while(true);
    }
    catch(Exception e) {}
  }

  public static void main(String[] args) throws Exception {
    new Idle().start();
  }
}