package bao7;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

/**
 * @Title myhttp
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\10\18 0018 8:40
 */
public class myhttp extends HttpServletRequestWrapper {
    public myhttp(HttpServletRequest request) {
        super(request);
    }

    @Override
    public String getParameter(String name) {
        String value= super.getParameter(name);
        if (value.contains("yy")){
            value=value.replace("yy"," love ");
        }
        return value;
    }
}
