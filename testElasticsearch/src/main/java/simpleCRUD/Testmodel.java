package simpleCRUD;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;
/**
 * Created by Will on 2017/1/11.
 */
public class Testmodel {
    private long id;
    //次ID
    private int subId;
    /**
     * 系统名称
     */
    private String systemName;
    private String host;

    //日志描述
    private String desc;
    private List<Integer> catIds;
    public Testmodel(){
        Random random = new Random();
        this.id = Math.abs(random.nextLong());
        int subId = Math.abs(random.nextInt());
        this.subId = subId;
        List<Integer> list = new ArrayList<Integer>(5);
        for(int i=0;i<5;i++){
            list.add(Math.abs(random.nextInt()));
        }
        this.catIds = list;
        this.systemName = subId%1 == 0?"测试系统一":"测试系统二";
        this.host = subId%1 == 0?"host1":"host2";
        this.desc = "这是中文的描述：" + UUID.randomUUID().toString();
    }
    public Testmodel(long id,int subId,String sysName,String host,String desc,List<Integer> catIds){
        this.id = id;
        this.subId = subId;
        this.systemName = sysName;
        this.host = host;
        this.desc = desc;
        this.catIds = catIds;
    }

    public List<Integer> getCatIds() {
        return catIds;
    }

    public void setCatIds(List<Integer> catIds) {
        this.catIds = catIds;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getSubId() {
        return subId;
    }

    public void setSubId(int subId) {
        this.subId = subId;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
