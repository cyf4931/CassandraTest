package com.dbtest.Bean;

import java.sql.Timestamp;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;


@Table(value = "tb_engine_data")
public class EngineDataBean {
	@PrimaryKey
    private Long id;
    /** drc终端序列号 */
    @Column(value = "drc_id")
    private String terminalId;
    /** 拖拉机Id号 */
    @Column(value = "tractor_id")
    private String tractorId;
    /** 扭矩百分比 */
    @Column(value = "torque")
    private Integer torque;
    /** 转速 */
    @Column(value = "rpm")
    private Double rpm;
    /** 燃油率 */
    @Column(value = "fuel_consumption")
    private Float fuelConsumption;
    /** 机油压力 */
    @Column(value = "oil_pressure")
    private Integer oilPressure;
    /** 冷却液温度 */
    @Column(value = "coolant_temp")
    private Integer coolantTemp;
    /** 发动机运行时间 */
    @Column(value = "engine_online_hour")
    private Double engineOnlineHour;
    /** 踏板1位置 */
    @Column(value = "pedal_position")
    private Float pedalPosition;
    /** 时间戳 */
    @Column(value = "time_stamp")
    private Timestamp timeStamp;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getTractorId() {
        return tractorId;
    }

    public void setTractorId(String tractorId) {
        this.tractorId = tractorId;
    }

    public Integer getTorque() {
        return torque;
    }

    public void setTorque(Integer torque) {
        this.torque = torque;
    }

    public Double getRpm() {
        return rpm;
    }

    public void setRpm(Double rpm) {
        this.rpm = rpm;
    }

    public Float getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(Float fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public Integer getOilPressure() {
        return oilPressure;
    }

    public void setOilPressure(Integer oilPressure) {
        this.oilPressure = oilPressure;
    }

    public Integer getCoolantTemp() {
        return coolantTemp;
    }

    public void setCoolantTemp(Integer coolantTemp) {
        this.coolantTemp = coolantTemp;
    }

    public Double getEngineOnlineHour() {
        return engineOnlineHour;
    }

    public void setEngineOnlineHour(Double engineOnlineHour) {
        this.engineOnlineHour = engineOnlineHour;
    }

    public Float getPedalPosition() {
        return pedalPosition;
    }

    public void setPedalPosition(Float pedalPosition) {
        this.pedalPosition = pedalPosition;
    }

    public Timestamp getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Timestamp timeStamp) {
        this.timeStamp = timeStamp;
    }

}
