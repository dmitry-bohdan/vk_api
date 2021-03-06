package com.example.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * Description: Группа
 * Creation date: 11.07.2016 8:34
 *
 * @author sks
 */
@Entity
@Table(name = "vk_group")
public class VkGroup implements Serializable {

    private Integer groupId;
    private String groupName;
    private String groupURI;
    private Integer groupClosed;
    private Integer lastPostId;

    @Id
    @Column(name = "group_id", nullable = false, unique = true)
    public Integer getGroupId() {
        return groupId;
    }

    @JsonProperty("id")
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    @NotNull
    @Size(max = 100, min = 2)
    @Basic
    @Column(name = "group_name", nullable = false, unique = false)
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @NotNull
    @Basic
    @Column(name = "group_uri", nullable = false, unique = false)
    public String getGroupURI() {
        return groupURI;
    }

    public void setGroupURI(String groupURI) {
        this.groupURI = groupURI;
    }

    @Basic
    @Column(name = "group_opened", nullable = false, unique = false)
    public Integer getGroupClosed() {
        return groupClosed;
    }

    @JsonProperty("is_closed")
    public void setGroupClosed(Integer groupClosed) {
        this.groupClosed = groupClosed;
    }

    @Override
    public String toString() {
        return String.format("VkGroup(groupId=%d groupName=%s groupURI=%s isClosed=%d lastPostId=%d)",
                groupId, groupName, groupURI, groupClosed, lastPostId);
    }

    @Basic
    @Column(name = "last_post_id", nullable = true, unique = false)
    public Integer getLastPostId() {
        return lastPostId;
    }

    public void setLastPostId(Integer lastPostId) {
        this.lastPostId = lastPostId;
    }
}
