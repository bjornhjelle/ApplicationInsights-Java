//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
// 
//     Tool     : bondc, Version=3.0.1, Build=bond-git.retail.not
//     Template : Microsoft.Bond.Rules.dll#Java.tt
//     File     : com\microsoft\applicationinsights\extensibility\model\MessageData.java
//
//     Changes to this file may cause incorrect behavior and will be lost when
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------
package com.microsoft.applicationinsights.extensibility.model;


/**
* *****************************************************************************                                Message type***************************************************************************** Instances of Message represent printf-like trace statements that are    text-searched.     Log4Net, NLog and other text-based log file entries are be translated into    intances of this type.    The message does not have measurements, and there is an ongoing debate if    messages can have custom propertis
*/
@SuppressWarnings("all")
public class MessageData
{
    //
    // Fields
    //

    // 10: Required int32 ver
    private int ver;

    // 20: Required string message
    private String message;

    // 30: Optional com.microsoft.applicationinsights.extensibility.model.SeverityLevel severityLevel
    private com.microsoft.applicationinsights.extensibility.model.SeverityLevel severityLevel;

    // 100: Optional map<string, string> properties
    private java.util.HashMap<String, String> properties;

    /**
     * @return current value of ver property
     */
    public final int getVer() {
        return this.ver;
    }

    /**
     * @param value new value of ver property
     */
    public final void setVer(int value) {
        this.ver = value;
    }

    /**
     * @return current value of message property
     */
    public final String getMessage() {
        return this.message;
    }

    /**
     * @param value new value of message property
     */
    public final void setMessage(String value) {
        this.message = value;
    }

    /**
     * @return current value of severityLevel property
     */
    public final com.microsoft.applicationinsights.extensibility.model.SeverityLevel getSeverityLevel() {
        return this.severityLevel;
    }

    /**
     * @param value new value of severityLevel property
     */
    public final void setSeverityLevel(com.microsoft.applicationinsights.extensibility.model.SeverityLevel value) {
        this.severityLevel = value;
    }

    /**
     * @return current value of properties property
     */
    public final java.util.HashMap<String, String> getProperties() {
        return this.properties;
    }

    /**
     * @param value new value of properties property
     */
    public final void setProperties(java.util.HashMap<String, String> value) {
        this.properties = value;
    }

    // Constructor
    public MessageData() {
        reset();
    }

    /*
     * @see com.microsoft.bond.BondSerializable#reset()
     */
    public void reset() {
        reset("MessageData", "com.microsoft.applicationinsights.extensibility.model.MessageData");
    }

    protected void reset(String name, String qualifiedName) {
        
        ver = 1;
        message = "";
        if (properties == null) {
            properties = new java.util.HashMap<String, String>();
        } else {
            properties.clear();
        }
    }
} // class MessageData
