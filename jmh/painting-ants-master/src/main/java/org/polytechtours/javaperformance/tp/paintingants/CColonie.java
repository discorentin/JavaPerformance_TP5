package org.polytechtours.javaperformance.tp.paintingants;

/*
 * CColonie.java
 *
 * Created on 11 avril 2007, 16:35
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */
import java.util.Vector;

import org.openjdk.jmh.annotations.*;

@BenchmarkMode(Mode.AverageTime)
@State(Scope.Thread)
public class CColonie implements Runnable {

  private Boolean mContinue = Boolean.TRUE;
  private Vector<CFourmi> mColonie;
  private PaintingAnts mApplis;

  public CColonie(){
    mColonie = new Vector<CFourmi>();
    mApplis = new PaintingAnts();
  }

  /** Creates a new instance of CColonie */
  public CColonie(Vector<CFourmi> pColonie, PaintingAnts pApplis) {
    mColonie = pColonie;
    mApplis = pApplis;
  }

  public void pleaseStop() {
    mContinue = false;
  }

  @Benchmark
  @Override
  public void run() {
    while (mContinue == true) {
      if (!mApplis.getPause()) {
        for (int i = 0; i < mColonie.size(); i++) {
          mColonie.get(i).deplacer();
          mApplis.compteur();
        }
      } else {
        /*
         * try { Thread.sleep(100); } catch (InterruptedException e) { break; }
         */
//        pleaseStop();
      }
    }
  }
}
