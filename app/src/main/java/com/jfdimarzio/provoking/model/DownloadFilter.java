package com.jfdimarzio.provoking.model;

import com.jfdimarzio.provoking.model.enumtype.MRFormType;

import java.io.Serializable;
import java.util.HashMap;

public class DownloadFilter implements Serializable {
    private boolean IsCurrent;
    private HashMap<MRFormType,MRFormType> TypeFilter;
    public DownloadFilter(boolean isCurrent,HashMap<MRFormType,MRFormType> typeFilter){
        IsCurrent=isCurrent;
        TypeFilter=typeFilter;
    }

    public boolean isCurrent(){return IsCurrent;}

    public void setCurrent(boolean current){IsCurrent=current;}

    public HashMap<MRFormType,MRFormType> getTypeFilter(){return TypeFilter;}

    public void setTypeFilter(HashMap<MRFormType,MRFormType> typeFilter){
        TypeFilter=typeFilter;
    }
}
