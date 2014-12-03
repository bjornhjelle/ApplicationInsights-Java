



//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
// 
//     Tool     : bondc, Version=3.0.1, Build=bond-git.retail.not
//     Template : Microsoft.Bond.Rules.dll#Java.tt
//     File     : com\microsoft\applicationinsights\extensibility\model\DataPoint.java
//
//     Changes to this file may cause incorrect behavior and will be lost when
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------
package com.microsoft.applicationinsights.extensibility.model;


/**
* *****************************************************************************                                Metric type*****************************************************************************
*/
@SuppressWarnings("all")
public class DataPoint
{
    //
    // Fields
    //

    // 10: Required string name
    private String name;

    // 20: Optional string kind
    private String kind;

    // 30: Required double value
    private double value;

    // 40: Optional nullable<int32> count
    private Integer count;

    // 50: Optional nullable<double> min
    private Double min;

    // 60: Optional nullable<double> max
    private Double max;

    // 70: Optional nullable<double> stdDev
    private Double stdDev;

    /**
     * @return current value of name property
     */
    public final String getName() {
        return this.name;
    }

    /**
     * @param value new value of name property
     */
    public final void setName(String value) {
        this.name = value;
    }

    /**
     * @return current value of kind property
     */
    public final String getKind() {
        return this.kind;
    }

    /**
     * @param value new value of kind property
     */
    public final void setKind(String value) {
        this.kind = value;
    }

    /**
     * @return current value of value property
     */
    public final double getValue() {
        return this.value;
    }

    /**
     * @param value new value of value property
     */
    public final void setValue(double value) {
        this.value = value;
    }

    /**
     * @return current value of count property
     */
    public final Integer getCount() {
        return this.count;
    }

    /**
     * @param value new value of count property
     */
    public final void setCount(Integer value) {
        this.count = value;
    }

    /**
     * @return current value of min property
     */
    public final Double getMin() {
        return this.min;
    }

    /**
     * @param value new value of min property
     */
    public final void setMin(Double value) {
        this.min = value;
    }

    /**
     * @return current value of max property
     */
    public final Double getMax() {
        return this.max;
    }

    /**
     * @param value new value of max property
     */
    public final void setMax(Double value) {
        this.max = value;
    }

    /**
     * @return current value of stdDev property
     */
    public final Double getStdDev() {
        return this.stdDev;
    }

    /**
     * @param value new value of stdDev property
     */
    public final void setStdDev(Double value) {
        this.stdDev = value;
    }

    // Constructor
    public DataPoint() {
        reset();
    }

    /*
     * @see com.microsoft.bond.BondSerializable#reset()
     */
    public void reset() {
        reset("DataPoint", "com.microsoft.applicationinsights.extensibility.model.DataPoint");
    }

    protected void reset(String name, String qualifiedName) {
        
        this.name = "";
        this.kind = "";
        this.value = 0;
        this.count = null;
        this.min = null;
        this.max = null;
        this.stdDev = null;
    }
} // class DataPoint
