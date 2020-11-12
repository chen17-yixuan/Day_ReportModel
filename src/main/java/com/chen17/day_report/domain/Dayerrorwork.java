package com.chen17.day_report.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * dayerrorwork
 * @author 
 */
@Data
public class Dayerrorwork implements Serializable {
    private Integer errortableId;

    private String errortableCounty;

    private String errortableDianweiname;

    private String errortableHaikangpname;

    private String errortableHaixinpname;

    private String errortableDeviceType;

    private String errortableDeviceIp;

    private String errortableBuildCompany;

    private String errortableDeviceExpriation;

    private String errortableRepairStatus;

    private String errortableShow;

    private String errortableLastestcheckTime;

    private Date errortableRequestTime;

    private String errortableNote;

    private String errortableServercompany;

    private String errortableFaultclassification;

    private String errortableBelongPaltform;

    private String errortableNewcreate;

    private static final long serialVersionUID = 1L;
}