package bao8;

import java.util.List;

/**
 * @Title person
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\10\16 0016 10:54
 */
public class person {
    private String name;
    private List<authority> list;

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", list=" + list +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<authority> getList() {
        return list;
    }

    public void setList(List<authority> list) {
        this.list = list;
    }

    public person(String name, List<authority> list) {

        this.name = name;
        this.list = list;
    }

    public person() {

    }
}
