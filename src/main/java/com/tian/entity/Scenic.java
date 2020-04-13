package com.tian.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "scenic")
public class Scenic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String id;
    @Column(name = "modified_time")
    private Date modifiedTime;
    @Column(name = "sign")
    private String sign;
    @Column(name = "detail_url")
    private String detailUrl;
    @Column(name = "name")
    private String name;
    @Column(name = "create_time")
    private Date createTime;
    @Column(name = "lng")
    private String lng;
    @Column(name = "lat")
    private String lat;
    @Column(name = "image")
    private String image;
    @Column(name = "open_time")
    private String openTime;
    @Column(name = "address")
    private String address;
    @Column(name = "tel")
    private String tel;
    @Column(name = "content")
    private String content;
    @Column(name = "web_site")
    private String webSite;
    @Column(name = "city")
    private String city;
    @Column(name = "is_deleted")
    private String isDeleted;
    private String star;
    private String score;
    private String feature;
    private String price;
    private String discounts;
    @Column(name = "name_standard")
    private String nameStandard;
    @Column(name = "detail_info")
    private String detailInfo;
    @Column(name = "service_sign")
    private String serviceSign;

    @Override
    public String toString() {
        return "Scenic{" +
                "id='" + id + '\'' +
                ", modifiedTime=" + modifiedTime +
                ", sign='" + sign + '\'' +
                ", detailUrl='" + detailUrl + '\'' +
                ", name='" + name + '\'' +
                ", createTime=" + createTime +
                ", lng='" + lng + '\'' +
                ", lat='" + lat + '\'' +
                ", image='" + image + '\'' +
                ", openTime='" + openTime + '\'' +
                ", nameStandard='" + nameStandard + '\'' +
                ", address='" + address + '\'' +
                ", tel='" + tel + '\'' +
                ", content='" + content + '\'' +
                ", webSite='" + webSite + '\'' +
                ", city='" + city + '\'' +
                ", isDeleted='" + isDeleted + '\'' +
                ", star='" + star + '\'' +
                ", score='" + score + '\'' +
                ", feature='" + feature + '\'' +
                ", discounts='" + discounts + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Scenic scenic = (Scenic) o;

        if (!sign.equals(scenic.sign)) return false;
        if (!webSite.equals(scenic.webSite)) return false;
        return city.equals(scenic.city);
    }

    @Override
    public int hashCode() {
        int result = sign.hashCode();
        result = 31 * result + webSite.hashCode();
        result = 31 * result + city.hashCode();
        return result;
    }

    public String getServiceSign() {
        return serviceSign;
    }

    public Scenic setServiceSign(String serviceSign) {
        this.serviceSign = serviceSign;
        return this;
    }

    public String getDetailInfo() {
        return detailInfo;
    }

    public Scenic setDetailInfo(String detailInfo) {
        this.detailInfo = detailInfo;
        return this;
    }

    public String getNameStandard() {
        return nameStandard;
    }

    public Scenic setNameStandard(String nameStandard) {
        this.nameStandard = nameStandard;
        return this;
    }

    public String getDiscounts() {
        return discounts;
    }

    public Scenic setDiscounts(String discounts) {
        this.discounts = discounts;
        return this;
    }

    public String getId() {
        return id;
    }

    public Scenic setId(String id) {
        this.id = id;
        return this;
    }

    public String getSign() {
        return sign;
    }

    public Scenic setSign(String sign) {
        this.sign = sign;
        return this;
    }

    public String getDetailUrl() {
        return detailUrl;
    }

    public Scenic setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
        return this;
    }

    public String getName() {
        return name;
    }

    public Scenic setName(String name) {
        this.name = name;
        return this;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public Scenic setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Scenic setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getLng() {
        return lng;
    }

    public Scenic setLng(String lng) {
        this.lng = lng;
        return this;
    }

    public String getLat() {
        return lat;
    }

    public Scenic setLat(String lat) {
        this.lat = lat;
        return this;
    }

    public String getImage() {
        return image;
    }

    public Scenic setImage(String image) {
        this.image = image;
        return this;
    }

    public String getOpenTime() {
        return openTime;
    }

    public Scenic setOpenTime(String openTime) {
        this.openTime = openTime;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Scenic setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getTel() {
        return tel;
    }

    public Scenic setTel(String tel) {
        this.tel = tel;
        return this;
    }

    public String getContent() {
        return content;
    }

    public Scenic setContent(String content) {
        this.content = content;
        return this;
    }

    public String getWebSite() {
        return webSite;
    }

    public Scenic setWebSite(String webSite) {
        this.webSite = webSite;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Scenic setCity(String city) {
        this.city = city;
        return this;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public Scenic setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
        return this;
    }

    public String getStar() {
        return star;
    }

    public Scenic setStar(String star) {
        this.star = star;
        return this;
    }

    public String getFeature() {
        return feature;
    }

    public Scenic setFeature(String feature) {
        this.feature = feature;
        return this;
    }

    public String getPrice() {
        return price;
    }

    public Scenic setPrice(String price) {
        this.price = price;
        return this;
    }

    public String getScore() {
        return score;
    }

    public Scenic setScore(String score) {
        this.score = score;
        return this;
    }
}
