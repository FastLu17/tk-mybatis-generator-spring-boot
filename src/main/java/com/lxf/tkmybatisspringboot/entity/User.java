package com.lxf.tkmybatisspringboot.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

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

    /**
     * 创建日期
     */
    @Column(name = "`create_date`")
    private Date createDate;

    /**
     * 创建日期
     */
    @Column(name = "`sex`")
    private String sex;

    private static final long serialVersionUID = 1L;
}