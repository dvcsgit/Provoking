package com.jfdimarzio.provoking.model.response;

public class DownloadParameter {
    private String JobUniqueID;
    private String RepairFormUniqueID;
    private String MaintenanceFormUniqueID;
    private boolean IsExceptChecked;

    public DownloadParameter(String jobUniqueID,boolean isExceptChecked,boolean isRepairForm){
        JobUniqueID=jobUniqueID;
        IsExceptChecked=isExceptChecked;

        this.RepairFormUniqueID="";
    }

    public DownloadParameter(String repairFormUniqueID){
        this.RepairFormUniqueID=repairFormUniqueID;
    }

    public DownloadParameter(String maintenanceFormUniqueID,int flag){
        this.MaintenanceFormUniqueID=maintenanceFormUniqueID;
    }
}
