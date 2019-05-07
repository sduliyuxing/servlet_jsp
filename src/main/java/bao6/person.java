package bao6;

/**
 * @Title person
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\10\15 0015 15:40
 */
public class person {
    private String name;
    private String address;
    private String card;
    private Integer phone;

    public person(String name, String address, String card, Integer phone) {
        this.name = name;
        this.address = address;
        this.card = card;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", card='" + card + '\'' +
                ", phone=" + phone +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public person() {

    }
}
