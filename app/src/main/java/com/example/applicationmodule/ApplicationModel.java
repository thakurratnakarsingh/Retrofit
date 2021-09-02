package com.example.applicationmodule;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ApplicationModel {
    @SerializedName("id")
    @Expose

    int EntryId, ProjectExpenseTypeId, ControlTypeId, ParentId, OrderBy, DS, Created_By, Modified_By, DataValue;

    @SerializedName("name")
    @Expose
    String Name;

            String Created_Date, Modified_Date, ControlName, ControlTypeName;


    public int getEntryId() {
        return EntryId;
    }

    public void setEntryId(int entryId) {
        EntryId = entryId;
    }

    public int getProjectExpenseTypeId() {
        return ProjectExpenseTypeId;
    }

    public void setProjectExpenseTypeId(int projectExpenseTypeId) {
        ProjectExpenseTypeId = projectExpenseTypeId;
    }

    public int getControlTypeId() {
        return ControlTypeId;
    }

    public void setControlTypeId(int controlTypeId) {
        ControlTypeId = controlTypeId;
    }

    public int getParentId() {
        return ParentId;
    }

    public void setParentId(int parentId) {
        ParentId = parentId;
    }

    public int getOrderBy() {
        return OrderBy;
    }

    public void setOrderBy(int orderBy) {
        OrderBy = orderBy;
    }

    public int getDS() {
        return DS;
    }

    public void setDS(int DS) {
        this.DS = DS;
    }

    public int getCreated_By() {
        return Created_By;
    }

    public void setCreated_By(int created_By) {
        Created_By = created_By;
    }

    public int getModified_By() {
        return Modified_By;
    }

    public void setModified_By(int modified_By) {
        Modified_By = modified_By;
    }

    public int getDataValue() {
        return DataValue;
    }

    public void setDataValue(int dataValue) {
        DataValue = dataValue;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCreated_Date() {
        return Created_Date;
    }

    public void setCreated_Date(String created_Date) {
        Created_Date = created_Date;
    }

    public String getModified_Date() {
        return Modified_Date;
    }

    public void setModified_Date(String modified_Date) {
        Modified_Date = modified_Date;
    }

    public String getControlName() {
        return ControlName;
    }

    public void setControlName(String controlName) {
        ControlName = controlName;
    }

    public String getControlTypeName() {
        return ControlTypeName;
    }

    public void setControlTypeName(String controlTypeName) {
        ControlTypeName = controlTypeName;
    }


}

/*

  int userId,id;
    String title,body;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public ApplicationModel(int userId, int id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }
}




 */







