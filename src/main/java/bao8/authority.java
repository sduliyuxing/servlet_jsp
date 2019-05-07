package bao8;

/**
 * @Title authority
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\10\16 0016 10:53
 */
public class authority {
    private String authorityname;
    private String url;
    private int flag;

    @Override
    public String toString() {
        return "authority{" +
                "authorityname='" + authorityname + '\'' +
                ", url='" + url + '\'' +
                ", flag=" + flag +
                '}';
    }

    public String getAuthorityname() {
        return authorityname;
    }

    public void setAuthorityname(String authorityname) {
        this.authorityname = authorityname;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public authority(String authorityname, String url, int flag) {

        this.authorityname = authorityname;
        this.url = url;
        this.flag = flag;
    }

    public authority() {

    }
}
