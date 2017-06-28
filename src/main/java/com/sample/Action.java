/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

/**
 *
 * @author ebrimatunkara
 */
public class Action {
    int count ;
    boolean ml = false;

    public Action() {
    }

    public Action(int count) {
        this.count = count;
    }

    public Action(int count, boolean ml) {
        this.count = count;
        this.ml = ml;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isMl() {
        return ml;
    }

    public void setMl(boolean ml) {
        this.ml = ml;
    }

    @Override
    public String toString() {
        return "Action{" + "count=" + count + ", ml=" + ml + '}';
    }
}
