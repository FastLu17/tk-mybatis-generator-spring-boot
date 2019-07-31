package com.lxf.tkmybatisspringboot.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Data
@Table(name = "`user`")
public class User implements Serializable {
    /**
     * 主键ID
     */
    @Id
    @Column(name = "`test_id`")
    private Long testId;

    /**
     * 租户ID
     */
    @Column(name = "`tenant_id`")
    private Long tenantId;

    /**
     * 名称
     */
    @Column(name = "`name`")
    private String name;

    /**
     * 年龄
     */
    @Column(name = "`age`")
    private Integer age;

    /**
     * 测试下划线字段命名类型
     */
    @Column(name = "`test_type`")
    private Integer testType;

    /**
     * 日期
     */
    @Column(name = "`test_date`")
    private Date testDate;

    /**
     * 测试
     */
    @Column(name = "`role`")
    private Long role;

    /**
     * 手机号码
     */
    @Column(name = "`phone`")
    private String phone;

    private static final long serialVersionUID = 1L;
}