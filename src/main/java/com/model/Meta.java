/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author 2124519
 */
public class Meta {
    public String Information;
    public String Symbol;
    public String LastRefreshed;
    public String Interval;
    public String OutputSize;
    public String TimeZone;
    Map<Integer,Bolsa> TimeSeries; 

    public Meta() {
    }

    public Meta(String Information, String Symbol, String LastRefreshed, String Interval, String OutputSize, String TimeZone) {
        this.Information = Information;
        this.Symbol = Symbol;
        this.LastRefreshed = LastRefreshed;
        this.Interval = Interval;
        this.OutputSize = OutputSize;
        this.TimeZone = TimeZone;
    }
    

    public String getInformation() {
        return Information;
    }

    public void setInformation(String Information) {
        this.Information = Information;
    }

    public String getSymbol() {
        return Symbol;
    }

    public void setSymbol(String Symbol) {
        this.Symbol = Symbol;
    }

    public String getLastRefreshed() {
        return LastRefreshed;
    }

    public void setLastRefreshed(String LastRefreshed) {
        this.LastRefreshed = LastRefreshed;
    }

    public String getInterval() {
        return Interval;
    }

    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    public String getOutputSize() {
        return OutputSize;
    }

    public void setOutputSize(String OutputSize) {
        this.OutputSize = OutputSize;
    }

    public String getTimeZone() {
        return TimeZone;
    }

    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    public Map<Integer, Bolsa> getTimeSeries() {
        return TimeSeries;
    }

    public void setTimeSeries(Map<Integer, Bolsa> TimeSeries) {
        this.TimeSeries = TimeSeries;
    }

    @Override
    public String toString() {
        return "Meta{" + "Information=" + Information + ", Symbol=" + Symbol + ", LastRefreshed=" + LastRefreshed + ", Interval=" + Interval + ", OutputSize=" + OutputSize + ", TimeZone=" + TimeZone + ", TimeSeries=" + TimeSeries + '}';
    }
    
    
    
}
