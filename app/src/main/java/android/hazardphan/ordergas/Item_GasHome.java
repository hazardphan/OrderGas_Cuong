package android.hazardphan.ordergas;

import java.io.Serializable;

/**
 * Created by CuongPhan on 3/29/2017.
 */

public class Item_GasHome implements Serializable{
    private String tencuahang;
    private String loaigas;
    private String motagia ;
    private String sodienthoai;
    private String tenchucuahang;
    private String diadiem;
    private String latlng;
    private String anh;

    public Item_GasHome() {
    }

    public Item_GasHome(String tencuahang, String motagia, String sodienthoai, String diadiem) {
        this.tencuahang = tencuahang;
        this.motagia = motagia;
        this.sodienthoai = sodienthoai;
        this.diadiem = diadiem;
    }

    public Item_GasHome(String tencuahang, String motagia, String sodienthoai, String diadiem, String anh) {
        this.tencuahang = tencuahang;
        this.motagia = motagia;
        this.sodienthoai = sodienthoai;
        this.diadiem = diadiem;
        this.anh = anh;
    }


    public String getTencuahang() {
        return tencuahang;
    }

    public void setTencuahang(String tencuahang) {
        this.tencuahang = tencuahang;
    }

    public String getLoaigas() {
        return loaigas;
    }

    public void setLoaigas(String loaigas) {
        this.loaigas = loaigas;
    }

    public String getMotagia() {
        return motagia;
    }

    public void setMotagia(String motagia) {
        this.motagia = motagia;
    }

    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    public String getTenchucuahang() {
        return tenchucuahang;
    }

    public void setTenchucuahang(String tenchucuahang) {
        this.tenchucuahang = tenchucuahang;
    }

    public String getDiadiem() {
        return diadiem;
    }

    public void setDiadiem(String diadiem) {
        this.diadiem = diadiem;
    }

    public String getLatlng() {
        return latlng;
    }

    public void setLatlng(String latlng) {
        this.latlng = latlng;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }
}
