package com.mikuac.shiro.dto.event.notice;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Created on 2021/7/8.
 *
 * @author Zero
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
@EqualsAndHashCode(callSuper = true)
public class PrivateMsgDeleteNoticeEvent extends NoticeEvent {

    @JSONField(name = "user_id")
    private long userId;

    @JSONField(name = "message_id")
    private long msgId;

}
