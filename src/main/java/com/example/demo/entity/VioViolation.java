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
 * 违法记录表
 * </p>
 *
 * @author jobob
 * @since 2020-11-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("LRX.VIO_VIOLATION")
public class VioViolation implements Serializable {

    private static final long serialVersionUID = 1L;

//    public VioViolation(VioViolation vioViolation) {
//        this.wfbh = vioViolation.getWfbh();
//        this.jdslb = vioViolation.getJdslb();
//        this.jdsbh = vioViolation.getJdsbh();
//        this.wsjyw = vioViolation.getWsjyw();
//        this.ryfl = vioViolation.getRyfl();
//        this.jszh = vioViolation.getJszh();
//        this.dabh = vioViolation.getDabh();
//        this.fzjg = vioViolation.getFzjg();
//        this.zjcx = vioViolation.getZjcx();
//        this.dsr = vioViolation.getDsr();
//        this.zsxzqh = vioViolation.getZsxzqh();
//        this.zsxxdz = vioViolation.getZsxxdz();
//        this.dh = vioViolation.getDh();
//        this.lxfs = vioViolation.getLxfs();
//        this.clfl = vioViolation.getClfl();
//        this.hpzl = vioViolation.getHpzl();
//        this.hphm = vioViolation.getHphm();
//        this.jdcsyr = vioViolation.getJdcsyr();
//        this.syxz = vioViolation.getSyxz();
//        this.jtfs = vioViolation.getJtfs();
//        this.wfsj = vioViolation.getWfsj();
//        this.xzqh = vioViolation.getXzqh();
//        this.dllx = vioViolation.getDllx();
//        this.glxzdj = vioViolation.getGlxzdj();
//        this.wfdd = vioViolation.getWfdd();
//        this.lddm = vioViolation.getLddm();
//        this.ddms = vioViolation.getDdms();
//        this.ddjdwz = vioViolation.getDdjdwz();
//        this.wfdz = vioViolation.getWfdz();
//        this.wfxw = vioViolation.getWfxw();
//        this.wfjfs = vioViolation.getWfjfs();
//        this.fkje = vioViolation.getFkje();
//        this.scz = vioViolation.getScz();
//        this.bzz = vioViolation.getBzz();
//        this.znj = vioViolation.getZnj();
//        this.zqmj = vioViolation.getZqmj();
//        this.jkfs = vioViolation.getJkfs();
//        this.fxjg = vioViolation.getFxjg();
//        this.fxjgmc = vioViolation.getFxjgmc();
//        this.cljg = vioViolation.getCljg();
//        this.cljgmc = vioViolation.getCljgmc();
//        this.cfzl = vioViolation.getCfzl();
//        this.clsj = vioViolation.getClsj();
//        this.jkbj = vioViolation.getJkbj();
//        this.jkrq = vioViolation.getJkrq();
//        this.pzbh = vioViolation.getPzbh();
//        this.jsjqbj = vioViolation.getJsjqbj();
//        this.jllx = vioViolation.getJllx();
//        this.lrr = vioViolation.getLrr();
//        this.lrsj = vioViolation.getLrsj();
//        this.jbr1 = vioViolation.getJbr1();
//        this.jbr2 = vioViolation.getJbr2();
//        this.sgdj = vioViolation.getSgdj();
//        this.cldxbj = vioViolation.getCldxbj();
//        this.jdccldxbj = vioViolation.getJdccldxbj();
//        this.zdjlbj = vioViolation.getZdjlbj();
//        this.xxly = vioViolation.getXxly();
//        this.xrms = vioViolation.getXrms();
//        this.dkbj = vioViolation.getDkbj();
//        this.jmznjbj = vioViolation.getJmznjbj();
//        this.zdbj = vioViolation.getZdbj();
//        this.jsjg = vioViolation.getJsjg();
//        this.fsjg = vioViolation.getFsjg();
//        this.gxsj = vioViolation.getGxsj();
//        this.bz = vioViolation.getBz();
//        this.ywjyw = vioViolation.getYwjyw();
//        this.zjmc = vioViolation.getZjmc();
//        this.cclzrq = vioViolation.getCclzrq();
//        this.nl = vioViolation.getNl();
//        this.xb = vioViolation.getXb();
//        this.hcbj = vioViolation.getHcbj();
//        this.jd = vioViolation.getJd();
//        this.wd = vioViolation.getWd();
//        this.ylzz1 = vioViolation.getYlzz1();
//        this.ylzz2 = vioViolation.getYlzz2();
//        this.ylzz3 = vioViolation.getYlzz3();
//        this.ylzz4 = vioViolation.getYlzz4();
//        this.ylzz5 = vioViolation.getYlzz5();
//        this.ylzz6 = vioViolation.getYlzz6();
//        this.ylzz7 = vioViolation.getYlzz7();
//        this.ylzz8 = vioViolation.getYlzz8();
//        this.cjfs = vioViolation.getCjfs();
//        this.wfsj1 = vioViolation.getWfsj1();
//        this.wfdd1 = vioViolation.getWfdd1();
//        this.lddm1 = vioViolation.getLddm1();
//        this.ddms1 = vioViolation.getDdms1();
//        this.jsrxz = vioViolation.getJsrxz();
//        this.clyt = vioViolation.getClyt();
//        this.xcfw = vioViolation.getXcfw();
//        this.dzzb = vioViolation.getDzzb();
//        this.sfzdry = vioViolation.getSfzdry();
//        this.xysfzmhm = vioViolation.getXysfzmhm();
//        this.xyxm = vioViolation.getXyxm();
//        this.ylzz11 = vioViolation.getYlzz11();
//        this.ylzz12 = vioViolation.getYlzz12();
//        this.ylzz13 = vioViolation.getYlzz13();
//        this.ylzz14 = vioViolation.getYlzz14();
//        this.ylzz15 = vioViolation.getYlzz15();
//        this.ylzz16 = vioViolation.getYlzz16();
//        this.ylzz17 = vioViolation.getYlzz17();
//        this.ylzz18 = vioViolation.getYlzz18();
//        this.qzfs = vioViolation.getQzfs();
//        this.sjhm = vioViolation.getSjhm();
//        this.dcljg = vioViolation.getDcljg();
//        this.dcljgmc = vioViolation.getDcljgmc();
//        this.sfydcl = vioViolation.getSfydcl();
//        this.dclfzjg = vioViolation.getDclfzjg();
//        this.dzdasfcj = vioViolation.getDzdasfcj();
//
//    }

    /**
     * 违法编号
     */
    @TableField("WFBH")
    private String wfbh;

    /**
     * 决定书类别
     */
    @TableField("JDSLB")
    private String jdslb;

    /**
     * 决定书编号
     */
    @TableField("JDSBH")
    private String jdsbh;

    /**
     * 文书校验位
     */
    @TableField("WSJYW")
    private String wsjyw;

    /**
     * 人员分类
     */
    @TableField("RYFL")
    private String ryfl;

    /**
     * 驾驶证号
     */
    @TableField("JSZH")
    private String jszh;

    /**
     * 档案编号
     */
    @TableField("DABH")
    private String dabh;

    /**
     * 发证机关
     */
    @TableField("FZJG")
    private String fzjg;

    /**
     * 准驾车型
     */
    @TableField("ZJCX")
    private String zjcx;

    /**
     * 当事人
     */
    @TableField("DSR")
    private String dsr;

    /**
     * 住所行政区划
     */
    @TableField("ZSXZQH")
    private String zsxzqh;

    /**
     * 住所详细地址
     */
    @TableField("ZSXXDZ")
    private String zsxxdz;

    /**
     * 电话
     */
    @TableField("DH")
    private String dh;

    /**
     * 联系方式
     */
    @TableField("LXFS")
    private String lxfs;

    /**
     * 车辆分类
     */
    @TableField("CLFL")
    private String clfl;

    /**
     * 号牌种类
     */
    @TableField("HPZL")
    private String hpzl;

    /**
     * 号牌号码
     */
    @TableField("HPHM")
    private String hphm;

    /**
     * 机动车所有人
     */
    @TableField("JDCSYR")
    private String jdcsyr;

    /**
     * 机动车使用性质
     */
    @TableField("SYXZ")
    private String syxz;

    /**
     * 交通方式
     */
    @TableField("JTFS")
    private String jtfs;

    /**
     * 违法时间
     */
    @TableField("WFSJ")
    private LocalDateTime wfsj;

    /**
     * 行政区划
     */
    @TableField("XZQH")
    private String xzqh;

    /**
     * 道路类型  DMLB= 3124
     */
    @TableField("DLLX")
    private String dllx;

    /**
     * 公路行政等级  DMLB3116
     */
    @TableField("GLXZDJ")
    private String glxzdj;

    /**
     * 违法地点
     */
    @TableField("WFDD")
    private String wfdd;

    /**
     * 路口路段代码  当为城市道路时存放路口号，为高速、省道等时存放公里数
     */
    @TableField("LDDM")
    private String lddm;

    /**
     * 地点米数
     */
    @TableField("DDMS")
    private String ddms;

    /**
     * 地点绝对位置
     */
    @TableField("DDJDWZ")
    private String ddjdwz;

    /**
     * 违法地址
     */
    @TableField("WFDZ")
    private String wfdz;

    /**
     * 违法行为
     */
    @TableField("WFXW")
    private String wfxw;

    /**
     * 违法记分数
     */
    @TableField("WFJFS")
    private Integer wfjfs;

    /**
     * 罚款金额
     */
    @TableField("FKJE")
    private Integer fkje;

    /**
     * 实测值
     */
    @TableField("SCZ")
    private Integer scz;

    /**
     * 标准值
     */
    @TableField("BZZ")
    private Integer bzz;

    /**
     * 滞纳金
     */
    @TableField("ZNJ")
    private BigDecimal znj;

    /**
     * 执勤民警
     */
    @TableField("ZQMJ")
    private String zqmj;

    /**
     * 交款方式
     */
    @TableField("JKFS")
    private String jkfs;

    /**
     * 发现机关
     */
    @TableField("FXJG")
    private String fxjg;

    /**
     * 发现机关名称
     */
    @TableField("FXJGMC")
    private String fxjgmc;

    /**
     * 处理机关
     */
    @TableField("CLJG")
    private String cljg;

    /**
     * 处理机关名称
     */
    @TableField("CLJGMC")
    private String cljgmc;

    /**
     * 处罚种类
     */
    @TableField("CFZL")
    private String cfzl;

    /**
     * 处理时间
     */
    @TableField("CLSJ")
    private LocalDateTime clsj;

    /**
     * 交款标记
     */
    @TableField("JKBJ")
    private String jkbj;

    /**
     * 交款日期
     */
    @TableField("JKRQ")
    private LocalDateTime jkrq;

    /**
     * 强制措施凭证号
     */
    @TableField("PZBH")
    private String pzbh;

    /**
     * 拒收拒签标记
     */
    @TableField("JSJQBJ")
    private String jsjqbj;

    /**
     * 记录类型
     */
    @TableField("JLLX")
    private String jllx;

    /**
     * 录入人
     */
    @TableField("LRR")
    private String lrr;

    /**
     * 录入时间
     */
    @TableField("LRSJ")
    private LocalDateTime lrsj;

    /**
     * 经办人1
     */
    @TableField("JBR1")
    private String jbr1;

    /**
     * 经办人2
     */
    @TableField("JBR2")
    private String jbr2;

    /**
     * 事故等级 code61
     */
    @TableField("SGDJ")
    private String sgdj;

    /**
     * 处理对象标记 0-本地;1-本省外地市;2-外省
     */
    @TableField("CLDXBJ")
    private String cldxbj;

    /**
     * 机动车处理对象标记
     */
    @TableField("JDCCLDXBJ")
    private String jdccldxbj;

    /**
     * 转递记录标记 0-本地;1-异地转入
     */
    @TableField("ZDJLBJ")
    private String zdjlbj;

    /**
     * 信息来源 1-现场处罚，2-非现场处罚
     */
    @TableField("XXLY")
    private String xxly;

    /**
     * 写入模式 1-系统写入;2-接口写入;3-内部其他系统写入
     */
    @TableField("XRMS")
    private String xrms;

    /**
     * 导库标记
     */
    @TableField("DKBJ")
    private String dkbj;

    /**
     * 减免滞纳金标记 code64
     */
    @TableField("JMZNJBJ")
    private String jmznjbj;

    /**
     * 转递标记
     */
    @TableField("ZDBJ")
    private String zdbj;

    /**
     * 接受机关
     */
    @TableField("JSJG")
    private String jsjg;

    /**
     * 发送机关
     */
    @TableField("FSJG")
    private String fsjg;

    /**
     * 更新时间
     */
    @TableField("GXSJ")
    private LocalDateTime gxsj;

    /**
     * 备注
     */
    @TableField("BZ")
    private String bz;

    /**
     * 校验位
     */
    @TableField("YWJYW")
    private String ywjyw;

    /**
     * 证件名称
     */
    @TableField("ZJMC")
    private String zjmc;

    /**
     * 初次领证日期
     */
    @TableField("CCLZRQ")
    private String cclzrq;

    /**
     * 年龄
     */
    @TableField("NL")
    private String nl;

    /**
     * 性别 code50
     */
    @TableField("XB")
    private String xb;

    /**
     * 0-否;1-是;2-未核查
     */
    @TableField("HCBJ")
    private String hcbj;

    /**
     * 精度
     */
    @TableField("JD")
    private String jd;

    /**
     * 维度
     */
    @TableField("WD")
    private String wd;

    /**
     * 预留字段
     */
    @TableField("YLZZ1")
    private String ylzz1;

    /**
     * 预留字段
     */
    @TableField("YLZZ2")
    private String ylzz2;

    /**
     * 预留字段
     */
    @TableField("YLZZ3")
    private String ylzz3;

    /**
     * 预留字段
     */
    @TableField("YLZZ4")
    private String ylzz4;

    /**
     * 预留字段
     */
    @TableField("YLZZ5")
    private String ylzz5;

    /**
     * 存放支队工作库接受时间
     */
    @TableField("YLZZ6")
    private String ylzz6;

    /**
     * 预留字段
     */
    @TableField("YLZZ7")
    private String ylzz7;

    /**
     * 预留字段
     */
    @TableField("YLZZ8")
    private String ylzz8;

    @TableField("CJFS")
    private String cjfs;

    @TableField("WFSJ1")
    private LocalDateTime wfsj1;

    @TableField("WFDD1")
    private String wfdd1;

    @TableField("LDDM1")
    private String lddm1;

    @TableField("DDMS1")
    private String ddms1;

    /**
     * 驾驶人性质
     */
    @TableField("JSRXZ")
    private String jsrxz;

    /**
     * 车辆用途
     */
    @TableField("CLYT")
    private String clyt;

    /**
     * 是否提供校车服务
     */
    @TableField("XCFW")
    private String xcfw;

    /**
     * 电子坐标
     */
    @TableField("DZZB")
    private String dzzb;

    /**
     * 是否指导人员
     */
    @TableField("SFZDRY")
    private String sfzdry;

    /**
     * 学员身份证明号码
     */
    @TableField("XYSFZMHM")
    private String xysfzmhm;

    /**
     * 学员姓名
     */
    @TableField("XYXM")
    private String xyxm;

    /**
     * ylzz11
     */
    @TableField("YLZZ11")
    private String ylzz11;

    /**
     * ylzz12
     */
    @TableField("YLZZ12")
    private String ylzz12;

    /**
     * ylzz13
     */
    @TableField("YLZZ13")
    private String ylzz13;

    /**
     * ylzz14
     */
    @TableField("YLZZ14")
    private String ylzz14;

    /**
     * ylzz15
     */
    @TableField("YLZZ15")
    private String ylzz15;

    /**
     * ylzz16
     */
    @TableField("YLZZ16")
    private String ylzz16;

    /**
     * ylzz17
     */
    @TableField("YLZZ17")
    private String ylzz17;

    /**
     * ylzz18
     */
    @TableField("YLZZ18")
    private String ylzz18;

    @TableField("QZFS")
    private String qzfs;

    @TableField("SJHM")
    private String sjhm;

    @TableField("DCLJG")
    private String dcljg;

    @TableField("DCLJGMC")
    private String dcljgmc;

    @TableField("SFYDCL")
    private String sfydcl;

    @TableField("DCLFZJG")
    private String dclfzjg;

    @TableField("DZDASFCJ")
    private String dzdasfcj;


}
