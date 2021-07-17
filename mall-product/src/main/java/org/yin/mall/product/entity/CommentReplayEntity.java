package org.yin.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

    import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 商品评价回复关系
 *
 * @author tty
 * @email tantangyin@gmail.com
 * @date 2021-07-16 17:53:23
 */
@Data
@ApiModel("CommentReplay实体类")
@TableName("pms_comment_replay")
public class CommentReplayEntity implements Serializable {
    private static final long serialVersionUID = 1L;

            /**
         * id
         */
                @TableId
            @ApiModelProperty("id")
    private Long id;
            /**
         * 评论id
         */
            @ApiModelProperty("评论id")
    private Long commentId;
            /**
         * 回复id
         */
            @ApiModelProperty("回复id")
    private Long replyId;
    
}
