package com.uitrs.game.majiang.web.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseGamerecord<M extends BaseGamerecord<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public void setRoomId(java.lang.Long roomId) {
		set("roomId", roomId);
	}

	public java.lang.Long getRoomId() {
		return get("roomId");
	}

	public void setJuNum(java.lang.Integer juNum) {
		set("juNum", juNum);
	}

	public java.lang.Integer getJuNum() {
		return get("juNum");
	}

	public void setType(java.lang.String type) {
		set("type", type);
	}

	public java.lang.String getType() {
		return get("type");
	}

	public void setGamerId(java.lang.Long gamerId) {
		set("gamerId", gamerId);
	}

	public java.lang.Long getGamerId() {
		return get("gamerId");
	}

	public void setWinPoints(java.lang.Integer winPoints) {
		set("winPoints", winPoints);
	}

	public java.lang.Integer getWinPoints() {
		return get("winPoints");
	}

	public void setNickName(java.lang.String nickName) {
		set("nickName", nickName);
	}

	public java.lang.String getNickName() {
		return get("nickName");
	}

	public void setEndTime(java.lang.String endTime) {
		set("endTime", endTime);
	}

	public java.lang.String getEndTime() {
		return get("endTime");
	}

	public void setReplayId(java.lang.Integer replayId) {
		set("replayId", replayId);
	}

	public java.lang.Integer getReplayId() {
		return get("replayId");
	}

}
