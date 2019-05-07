package bao8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Title dao
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\10\16 0016 14:47
 */
public class dao {
    Map<String,person> map=new HashMap<String, person>();
    List<authority> authorityList=null;
    {
        authorityList=new ArrayList<authority>();
        authorityList.add(new authority("权限1","/jsp8/authority1.jsp",0));
        authorityList.add(new authority("权限2","/jsp8/authority2.jsp",0));
        authorityList.add(new authority("权限3","/jsp8/authority3.jsp",0));
        authorityList.add(new authority("权限4","/jsp8/authority4.jsp",0));
        person p=new person("aaa",authorityList.subList(0,2));
        map.put("aaa",p);
        p=new person("bbb",authorityList.subList(2,4));
        map.put("bbb",p);
    }

    public Map<String, person> getMap() {
        return map;
    }

    public void setMap(Map<String, person> map) {
        this.map = map;
    }

    public List<authority> getAuthorityList() {
        return authorityList;
    }

    public void setAuthorityList(List<authority> authorityList) {
        this.authorityList = authorityList;
    }

   public person getperson(String name){
        return map.get(name);
    }

    public List<authority> getallauthority(){
        return authorityList;
    }

    public void update(String name,List<authority> list){
        map.get(name).setList(list);
    }

   public List<authority> getauthority(String[] urls){
        List<authority> list=new ArrayList<authority>();
        for (authority a:authorityList){
            if (urls!=null){
                for (String s:urls){
                    if (s.equals(a.getUrl())){
                        list.add(a);
                    }
                }
            }
        }
        return list;
    }
}
