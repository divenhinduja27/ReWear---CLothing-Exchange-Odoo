
package com.example.Re_wear.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Admins")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long adminid;
    private String name;
    private String email;
    private String password;
    private String action_type; // e.g., 'approve', 'reject', 'remove'

    public Long getAdminid() { return adminid; }
    public void setAdminid(Long adminid) { this.adminid = adminid; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public String getAction_type() { return action_type; }
    public void setAction_type(String action_type) { this.action_type = action_type; }
}
