package com.example.demo.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 事故信息主表
 * </p>
 *
 * @author jobob
 * @since 2020-11-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("LRX.ACD_FILE")
public class AcdFile implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 事故编号
     */
    @TableField("SGBH")
    private String sgbh;

    /**
     * 行政区划
     */
    @TableField("XZQH")
    private String xzqh;

    /**
     * 登记编号
     */
    @TableField("DJBH")
    private String djbh;

    /**
     * 开始勘查时间
     */
    @TableField("KSKCSJ")
    private LocalDateTime kskcsj;

    /**
     * 结束勘查时间
     */
    @TableField("JSKCSJ")
    private LocalDateTime jskcsj;

    /**
     * 星期
     */
    @TableField("XQ")
    private Integer xq;

    /**
     * 事故发生时间
     */
    @TableField("SGFSSJ")
    private LocalDateTime sgfssj;

    /**
     * 路号
     */
    @TableField("LH")
    private String lh;

    /**
     * 路名
     */
    @TableField("LM")
    private String lm;

    /**
     * 公里数
     */
    @TableField("GLS")
    private Integer gls;

    /**
     * 米数
     */
    @TableField("MS")
    private Integer ms;

    /**
     * 起点米数
     */
    @TableField("QDMS")
    private Integer qdms;

    /**
     * 绝对位置
     */
    @TableField("JDWZ")
    private Integer jdwz;

    /**
     * 事故地点
     */
    @TableField("SGDD")
    private String sgdd;

    /**
     * 在道路横断面位置
     */
    @TableField("ZHDMWZ")
    private String zhdmwz;

    /**
     * 中央隔离设施
     */
    @TableField("ZYGLSS")
    private String zyglss;

    /**
     * 道路安全属性
     */
    @TableField("DLAQSX")
    private String dlaqsx;

    /**
     * 交通信号方式（控制）
     */
    @TableField("JTXHFS")
    private String jtxhfs;

    /**
     * 路侧防护设施类型
     */
    @TableField("FHSSLX")
    private String fhsslx;

    /**
     * 道路物理隔离
     */
    @TableField("DLWLGL")
    private String dlwlgl;

    /**
     * 路面状况
     */
    @TableField("LMZK")
    private String lmzk;

    /**
     * 路表情况
     */
    @TableField("LBQK")
    private String lbqk;

    /**
     * 路面结构
     */
    @TableField("LMJG")
    private String lmjg;

    /**
     * 路口路段类型 
     */
    @TableField("LKLDLX")
    private String lkldlx;

    /**
     * 道路线型 
     */
    @TableField("DLXX")
    private String dlxx;

    /**
     * 道路类型 
     */
    @TableField("DLLX")
    private String dllx;

    /**
     * 勘查人1
     */
    @TableField("KCR1")
    private String kcr1;

    /**
     * 勘查人2
     */
    @TableField("KCR2")
    private String kcr2;

    /**
     * 办案人1
     */
    @TableField("BAR1")
    private String bar1;

    /**
     * 办案人2
     */
    @TableField("BAR2")
    private String bar2;

    /**
     * 当场死亡人数
     */
    @TableField("SWRS")
    private Integer swrs;

    /**
     * 抢救无效死亡人数
     */
    @TableField("SWRSQ")
    private Integer swrsq;

    /**
     * 24小时死亡人数
     */
    @TableField("SWRS24")
    private Integer swrs24;

    /**
     * 24小时受伤人数
     */
    @TableField("SSRS24")
    private Integer ssrs24;

    /**
     * 3日内死亡人数
     */
    @TableField("SWRS3")
    private Integer swrs3;

    /**
     * 3日内受伤人数
     */
    @TableField("SSRS3")
    private Integer ssrs3;

    /**
     * 7日内死亡人数
     */
    @TableField("SWRS7")
    private Integer swrs7;

    /**
     * 7日内受伤人数
     */
    @TableField("SSRS7")
    private Integer ssrs7;

    /**
     * 30日内死亡人数
     */
    @TableField("SWRS30")
    private Integer swrs30;

    /**
     * 30日内受伤人数
     */
    @TableField("SSRS30")
    private Integer ssrs30;

    /**
     * 失踪人数
     */
    @TableField("SZRS")
    private Integer szrs;

    /**
     * 重伤人数
     */
    @TableField("ZSRS")
    private Integer zsrs;

    /**
     * 轻伤人数
     */
    @TableField("QSRS")
    private Integer qsrs;

    /**
     * 受伤人数
     */
    @TableField("SSRS")
    private Integer ssrs;

    /**
     * 机动车数量
     */
    @TableField("JDCSL")
    private Integer jdcsl;

    /**
     * 非机动车数量
     */
    @TableField("FJDCSL")
    private Integer fjdcsl;

    /**
     * 行人数量
     */
    @TableField("XRSL")
    private Integer xrsl;

    /**
     * 刑事管理部门
     */
    @TableField("XSGLBM")
    private String xsglbm;

    /**
     * 刑事办案单位
     */
    @TableField("XSBADW")
    private String xsbadw;

    /**
     * 刑事办案人
     */
    @TableField("XSBAR")
    private String xsbar;

    /**
     * 图片张数
     */
    @TableField("TPZS")
    private Integer tpzs;

    /**
     * 现场图张数
     */
    @TableField("XCTZS")
    private Integer xctzs;

    /**
     * 现场照片张数
     */
    @TableField("XCZPZS")
    private Integer xczpzs;

    /**
     * 直接财产损失
     */
    @TableField("ZJCCSS")
    private Integer zjccss;

    /**
     * 事故类型
     */
    @TableField("SGLX")
    private String sglx;

    /**
     * 路外事故类型
     */
    @TableField("LWSGLX")
    private String lwsglx;

    /**
     * 事故初查原因分类
     */
    @TableField("CCYYFL")
    private String ccyyfl;

    /**
     * 事故认定原因分类
     */
    @TableField("RDYYFL")
    private String rdyyfl;

    /**
     * 事故初查原因
     */
    @TableField("SGCCYY")
    private String sgccyy;

    /**
     * 事故认定原因
     */
    @TableField("SGRDYY")
    private String sgrdyy;

    /**
     * 简要案情
     */
    @TableField("JYAQ")
    private String jyaq;

    /**
     * 天气
     */
    @TableField("TQ")
    private String tq;

    /**
     * 能见度
     */
    @TableField("NJD")
    private String njd;

    /**
     * 现场
     */
    @TableField("XC")
    private String xc;

    /**
     * 涉外事故1是2否
     */
    @TableField("SWSG")
    private String swsg;

    /**
     * 事故形态 
     */
    @TableField("SGXT")
    private String sgxt;

    /**
     * 是否逃逸 1-否 2-驾车逃逸 3-弃车逃逸 X
     */
    @TableField("SFTY")
    private String sfty;

    /**
     * 车辆间事故
     */
    @TableField("CLJSG")
    private String cljsg;

    /**
     * 单车事故
     */
    @TableField("DCSG")
    private String dcsg;

    /**
     * 碰撞方式 1-单车 2-双车 3-多车 4-车人事故
     */
    @TableField("PZFS")
    private String pzfs;

    /**
     * 逃逸事故侦破1-是2-否
     */
    @TableField("TYSGZP")
    private String tysgzp;

    /**
     * 逃逸事故侦破时间
     */
    @TableField("TYZPSJ")
    private LocalDateTime tyzpsj;

    /**
     * 地形 
     */
    @TableField("DX")
    private String dx;

    /**
     * 照明条件
     */
    @TableField("ZMTJ")
    private String zmtj;

    /**
     * 调解人1
     */
    @TableField("TJR1")
    private String tjr1;

    /**
     * 调解人2
     */
    @TableField("TJR2")
    private String tjr2;

    /**
     * 是否运载危险物品1-是2否
     */
    @TableField("YZWXP")
    private String yzwxp;

    /**
     * 运载危险品事故后果
     */
    @TableField("YZWXPHG")
    private String yzwxphg;

    /**
     * 初次录入时间
     */
    @TableField("CCLRSJ")
    private LocalDateTime cclrsj;

    /**
     *  1-快报记录 2-快报/全项记录 3全项记录 9 不立案
     */
    @TableField("JLLX")
    private String jllx;

    /**
     * 上传时间段(天数)
     */
    @TableField("SCSJD")
    private BigDecimal scsjd;

    /**
     * 经办人
     */
    @TableField("JBR")
    private String jbr;

    /**
     * 提交时间
     */
    @TableField("TJSJ")
    private LocalDateTime tjsj;

    /**
     * 更新时间
     */
    @TableField("GXSJ")
    private LocalDateTime gxsj;

    /**
     * 所属中队
     */
    @TableField("SSZD")
    private String sszd;

    /**
     * 公路行政等级
     */
    @TableField("GLXZDJ")
    private String glxzdj;

    /**
     * 档案号
     */
    @TableField("DAH")
    private String dah;

    /**
     * 卷内号
     */
    @TableField("JNH")
    private Integer jnh;

    /**
     * 所辖乡镇
     */
    @TableField("SXXZ")
    private String sxxz;

    /**
     * 上报 1-是 2-否  为空3-上报但更新不成功
     */
    @TableField("SB")
    private String sb;

    /**
     * 统计事故编号
     */
    @TableField("TJSGBH")
    private String tjsgbh;

    /**
     * 管理部门
     */
    @TableField("GLBM")
    private String glbm;

    /**
     * 预留字段1
     */
    @TableField("YLZD1")
    private String ylzd1;

    /**
     * 预留字段2
     */
    @TableField("YLZD2")
    private String ylzd2;

    /**
     * 预留字段3
     */
    @TableField("YLZD3")
    private String ylzd3;

    /**
     * 预留字段4
     */
    @TableField("YLZD4")
    private String ylzd4;

    /**
     * 预留字段5
     */
    @TableField("YLZD5")
    private String ylzd5;

    /**
     * 电子坐标 格式为地址坐标X,地址坐标Y,地址经度,地址纬度
     */
    @TableField("DZZB")
    private String dzzb;

    /**
     * 特大预留1
     */
    @TableField("TDYL1")
    private String tdyl1;

    /**
     * 特大预留2
     */
    @TableField("TDYL2")
    private String tdyl2;

    /**
     * 特大预留3
     */
    @TableField("TDYL3")
    private String tdyl3;

    /**
     * 特大预留4
     */
    @TableField("TDYL4")
    private String tdyl4;

    /**
     * 特大预留5
     */
    @TableField("TDYL5")
    private String tdyl5;

    /**
     * 特大预留6
     */
    @TableField("TDYL6")
    private String tdyl6;

    /**
     * 特大预留7
     */
    @TableField("TDYL7")
    private String tdyl7;

    /**
     * 特大预留8
     */
    @TableField("TDYL8")
    private String tdyl8;

    /**
     * 特大预留9
     */
    @TableField("TDYL9")
    private String tdyl9;

    /**
     * 特大预留10
     */
    @TableField("TDYL10")
    private String tdyl10;

    /**
     * 办案联系方式
     */
    @TableField("BALXFS")
    private String balxfs;

    /**
     * 办案单位
     */
    @TableField("BADW")
    private String badw;

    /**
     * 县以下行政区划
     */
    @TableField("XYXDM")
    private String xyxdm;

    /**
     * 校验位
     */
    @TableField("JYW")
    private String jyw;

    /**
     * 是否二次事故 1-是 2-否 * X
     */
    @TableField("SFECSG")
    private String sfecsg;

    /**
     * 是否典型事故 1-是 2-否
     */
    @TableField("SFDXSG")
    private String sfdxsg;

    /**
     * 道路安全隐患等级
     */
    @TableField("DLAQYHDJ")
    private String dlaqyhdj;

    /**
     * 当事人总数
     */
    @TableField("DSRZS")
    private Integer dsrzs;

    /**
     * 发送机关
     */
    @TableField("FSJG")
    private String fsjg;

    /**
     * 分发机关
     */
    @TableField("FFJG")
    private String ffjg;

    /**
     * ???????????????????????????030190
     */
    @TableField("SDSGDSCWZ")
    private String sdsgdscwz;

    /**
     * ??????/?????????????????????030191
     */
    @TableField("HLZT")
    private String hlzt;

    @TableField("ZBLX")
    private String zblx;

    @TableField("AJMC")
    private String ajmc;


}
