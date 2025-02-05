package com.mikuac.shiro.enums;

import lombok.Getter;

/**
 * @author zero
 */

@Getter
public enum ActionPathEnum implements ActionPath {
    /**
     * 发送私聊消息
     */
    SEND_PRIVATE_MSG("send_private_msg"),
    /**
     * 发送群消息
     */
    SEND_GROUP_MSG("send_group_msg"),
    /**
     * 撤回消息
     */
    DELETE_MSG("delete_msg"),
    /**
     * 获取消息
     */
    GET_MSG("get_msg"),
    /**
     * 群组踢人
     */
    SET_GROUP_KICK("set_group_kick"),
    /**
     * 群组单人禁言
     */
    SET_GROUP_BAN("set_group_ban"),
    /**
     * 群组全体禁言
     */
    SET_GROUP_WHOLE_BAN("set_group_whole_ban"),
    /**
     * 群组设置管理员
     */
    SET_GROUP_ADMIN("set_group_admin"),
    /**
     * 群组匿名
     */
    SET_GROUP_ANONYMOUS("set_group_anonymous"),
    /**
     * 设置群名片（群备注）
     */
    SET_GROUP_CARD("set_group_card"),
    /**
     * 设置群名
     */
    SET_GROUP_NAME("set_group_name"),
    /**
     * 退出群组
     */
    SET_GROUP_LEAVE("set_group_leave"),
    /**
     * 设置群组专属头衔
     */
    SET_GROUP_SPECIAL_TITLE("set_group_special_title"),
    /**
     * 处理加好友请求
     */
    SET_FRIEND_ADD_REQUEST("set_friend_add_request"),
    /**
     * 《处理加群请求／邀请
     */
    SET_GROUP_ADD_REQUEST("set_group_add_request"),
    /**
     * 《获取登录号信息
     */
    GET_LOGIN_INFO("get_login_info"),
    /**
     * 获取陌生人信息
     */
    GET_STRANGER_INFO("get_stranger_info"),
    /**
     * 获取好友列表
     */
    GET_FRIEND_LIST("get_friend_list"),
    /**
     * 删除好友
     */
    DELETE_FRIEND("delete_friend"),
    /**
     * 获取群信息
     */
    GET_GROUP_INFO("get_group_info"),
    /**
     * 获取群列表
     */
    GET_GROUP_LIST("get_group_list"),
    /**
     * 获取群成员信息
     */
    GET_GROUP_MEMBER_INFO("get_group_member_info"),
    /**
     * 获取群成员列表
     */
    GET_GROUP_MEMBER_LIST("get_group_member_list"),
    /**
     * 获取群荣誉信息
     */
    GET_GROUP_HONOR_INFO("get_group_honor_info"),
    /**
     * 检查是否可以发送图片
     */
    CAN_SEND_IMAGE("can_send_image"),
    /**
     * 检查是否可以发送语音
     */
    CAN_SEND_RECORD("can_send_record"),
    /**
     * 设置群头像
     */
    SET_GROUP_PORTRAIT("set_group_portrait"),
    /**
     * 检查链接安全性
     */
    CHECK_URL_SAFELY("check_url_safely"),
    /**
     * 发送群公告
     */
    SEN_GROUP_NOTICE("_send_group_notice"),
    /**
     * 获取群 @全体成员 剩余次数
     */
    GET_GROUP_AT_ALL_REMAIN("get_group_at_all_remain"),
    /**
     * 上传群文件
     */
    UPLOAD_GROUP_FILE("upload_group_file"),
    /**
     * 群组匿名用户禁言
     */
    SET_GROUP_ANONYMOUS_BAN("set_group_anonymous_ban"),
    /**
     * 下载文件到缓存目录
     */
    DOWNLOAD_FILE("download_file"),
    /**
     * 发送合并转发 (群)
     */
    SEND_GROUP_FORWARD_MSG("send_group_forward_msg");

    /**
     * 请求路径
     */
    private final String path;

    /**
     * 枚举构造函数
     *
     * @param path 请求路径
     */
    ActionPathEnum(String path) {
        this.path = path;
    }

    /**
     * 获取请求路径
     *
     * @return 请求路径
     */
    @Override
    public String getPath() {
        return this.path;
    }

}
