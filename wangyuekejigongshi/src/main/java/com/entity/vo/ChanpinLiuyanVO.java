package com.entity.vo;

import com.entity.ChanpinLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 产品留言
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-30
 */
@TableName("chanpin_liuyan")
public class ChanpinLiuyanVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 产品id
     */

    @TableField(value = "chanpin_id")
    private Integer chanpinId;


    /**
     * 用户id
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 留言内容
     */

    @TableField(value = "chanpin_liuyan_content")
    private String chanpinLiuyanContent;


    /**
     * 回复内容
     */

    @TableField(value = "reply_content")
    private String replyContent;


    /**
     * 讨论时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：产品id
	 */
    public Integer getChanpinId() {
        return chanpinId;
    }


    /**
	 * 获取：产品id
	 */

    public void setChanpinId(Integer chanpinId) {
        this.chanpinId = chanpinId;
    }
    /**
	 * 设置：用户id
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户id
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：留言内容
	 */
    public String getChanpinLiuyanContent() {
        return chanpinLiuyanContent;
    }


    /**
	 * 获取：留言内容
	 */

    public void setChanpinLiuyanContent(String chanpinLiuyanContent) {
        this.chanpinLiuyanContent = chanpinLiuyanContent;
    }
    /**
	 * 设置：回复内容
	 */
    public String getReplyContent() {
        return replyContent;
    }


    /**
	 * 获取：回复内容
	 */

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }
    /**
	 * 设置：讨论时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：讨论时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
