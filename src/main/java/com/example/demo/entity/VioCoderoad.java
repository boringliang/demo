package com.example.demo.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 道路表
 * </p>
 *
 * @author jobob
 * @since 2020-11-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("SYS.VIO_CODEROAD")
public class VioCoderoad implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 道路代码
     */
    @TableField("DLDM")
    private String dldm;

    /**
     * 道路名称
     */
    @TableField("DLMC")
    private String dlmc;

    /**
     * 路口号
     */
    @TableField("LKH")
    private String lkh;

    /**
     * 部门代码
     */
    @TableField("BMDM")
    private String bmdm;

    /**
     * 数据主键，在表中唯一即可
     */
    @TableId("NID")
    private String nid;

    /**
     * 行政区划
     */
    @TableField("XZQH")
    private String xzqh;

    /**
     * 道路类型
(3124)
     */
    @TableField("DLLX")
    private String dllx;

    /**
     * 公路行政等级
(3116)
     */
    @TableField("GLXZDJ")
    private String glxzdj;

    /**
     * 地形
道路地形(3110)
     */
    @TableField("DX")
    private String dx;

    /**
     * 道路线型
(3123)
     */
    @TableField("DLXX")
    private String dlxx;

    /**
     * 路口路段类型
(3120)
     */
    @TableField("LKLDLX")
    private String lkldlx;

    /**
     * 道路物理隔离
(3121)
     */
    @TableField("DLWLGL")
    private String dlwlgl;

    /**
     * 路面结构
(3119)
     */
    @TableField("LMJG")
    private String lmjg;

    /**
     * 防护设施类型
(3127)
     */
    @TableField("FHSSLX")
    private String fhsslx;

    /**
     * 标准道路起始里程

     */
    @TableField("BZDLQSLC")
    private BigDecimal bzdlqslc;

    /**
     * 标准道路结束里程

     */
    @TableField("BZDLJSLC")
    private BigDecimal bzdljslc;

    /**
     * 里程起始

     */
    @TableField("QS")
    private BigDecimal qs;

    /**
     * 里程结束

     */
    @TableField("JS")
    private BigDecimal js;

    /**
     * 辖区里程

     */
    @TableField("XQLC")
    private BigDecimal xqlc;

    /**
     * 创建人

     */
    @TableField("CJR")
    private String cjr;

    /**
     * 创建时间

     */
    @TableField("CJSJ")
    private LocalDateTime cjsj;

    /**
     * 更新时间

     */
    @TableField("GXSJ")
    private LocalDateTime gxsj;

    /**
     * 记录状态 (3100)
     */
    @TableField("JLZT")
    private String jlzt;

    /**
     * 起始名称
     */
    @TableField("QSMC")
    private String qsmc;

    /**
     * 结束名称

     */
    @TableField("JSMC")
    private String jsmc;

    /**
     * 行政区划详细里程

     */
    @TableField("XZQHXXLC")
    private String xzqhxxlc;

    /**
     * 中央隔离设施
(3134)
     */
    @TableField("ZYGLSS")
    private String zyglss;

    /**
     * 所属管理部门

     */
    @TableField("SSGLBM")
    private String ssglbm;

    /**
     * 标准道路类型 (3115)
     */
    @TableField("BZDLLX")
    private String bzdllx;

    /**
     * 开始桩号
     */
    @TableField("STARTPOINT")
    private String startpoint;

    /**
     * 结束桩号
     */
    @TableField("ENDPOINT")
    private String endpoint;

    /**
     * 拼音首字母缩写查询
     */
    @TableField("FIRSTPINYIN")
    private String firstpinyin;

    /**
     * 道路名牌图片
     */
    @TableField("DLMP_IMAGE")
    private String dlmpImage;

    /**
     * 禁停标志图片，单向一张图片，双向两张图片
     */
    @TableField("JTBZ_IMAGE")
    private String jtbzImage;

    /**
     * 有效期止
     */
    @TableField("YXQ")
    private String yxq;

    /**
     * 禁停标志，1：单向；2：双向。
     */
    @TableField("JTBZ")
    private String jtbz;


}
