package bao10;

import com.google.gson.Gson;

/**
 * @Title bean
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\10\22 0022 11:05
 */
public class bean {
    private Integer id;
    private String name;
    private String desc;
    private String path;

    public static void main(String[] args) {
        bean b=new bean("abc.txt","123123","c:c");
        Gson gson=new Gson();
        String js=gson.toJson(b);
        System.out.println(js);
    }

    public bean() {
    }

    public bean(String name, String desc, String path) {

        this.name = name;
        this.desc = desc;
        this.path = path;
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

}
