package dto;

import java.sql.Timestamp;

public class UserDTO {
    private Integer id;
    private String account;
    private String password;
    private String nickname;
    private Timestamp created_at;
    private Timestamp deleted_at;
    private Boolean is_deleted;
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getId() {
        return this.id;
    }
    
    public void setAccount(String account) {
        this.account = account;
    }
    public String getAccount() {
        return this.account;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public String getNickName() {
        return this.nickname;
    }
    
    public void setCreatedAt(Timestamp created_at) {
        this.created_at = created_at;
    }
    public Timestamp getCreatedAt() {
        return this.created_at;
    }
    
    public void setDeletedAt(Timestamp deleted_at) {
        this.deleted_at = deleted_at;
    }
    public Timestamp getDeletedAt() {
        return this.deleted_at;
    }
    
    public void setIsDeleted(Boolean is_deleted) {
        this.is_deleted = is_deleted;
    }
    public Boolean getIsDeleted() {
        return this.is_deleted;
    }
}
