/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

/**
 *
 * @author 2124519
 */
public class Bolsa {
     public String date;
     public float open;
     public float high;
     public float low;
     public float close;
     public float volume;
     public float unadjustedVolume;
     public float change;
     public float changePercent;
     public float vwap;
     public String label;
     public float changeOverTime;

    public Bolsa() {
    }

    public Bolsa(String date, float open, float high, float low, float close, float volume, float unadjustedVolume, float change, float changePercent, float vwap, String label, float changeOverTime) {
        this.date = date;
        this.open = open;
        this.high = high;
        this.low = low;
        this.close = close;
        this.volume = volume;
        this.unadjustedVolume = unadjustedVolume;
        this.change = change;
        this.changePercent = changePercent;
        this.vwap = vwap;
        this.label = label;
        this.changeOverTime = changeOverTime;
    }
    
    

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getOpen() {
        return open;
    }

    public void setOpen(float open) {
        this.open = open;
    }

    public float getHigh() {
        return high;
    }

    public void setHigh(float high) {
        this.high = high;
    }

    public float getLow() {
        return low;
    }

    public void setLow(float low) {
        this.low = low;
    }

    public float getClose() {
        return close;
    }

    public void setClose(float close) {
        this.close = close;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public float getUnadjustedVolume() {
        return unadjustedVolume;
    }

    public void setUnadjustedVolume(float unadjustedVolume) {
        this.unadjustedVolume = unadjustedVolume;
    }

    public float getChange() {
        return change;
    }

    public void setChange(float change) {
        this.change = change;
    }

    public float getChangePercent() {
        return changePercent;
    }

    public void setChangePercent(float changePercent) {
        this.changePercent = changePercent;
    }

    public float getVwap() {
        return vwap;
    }

    public void setVwap(float vwap) {
        this.vwap = vwap;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public float getChangeOverTime() {
        return changeOverTime;
    }

    public void setChangeOverTime(float changeOverTime) {
        this.changeOverTime = changeOverTime;
    }

    @Override
    public String toString() {
        return "Bolsa{" + "date=" + date + ", open=" + open + ", high=" + high + ", low=" + low + ", close=" + close + ", volume=" + volume + ", unadjustedVolume=" + unadjustedVolume + ", change=" + change + ", changePercent=" + changePercent + ", vwap=" + vwap + ", label=" + label + ", changeOverTime=" + changeOverTime + '}';
    }
     
    
     
     
}
