import com.alibaba.fastjson.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * Created by Will on 2017/1/11.
 */
class MeteDataCreat {

    // 常量定义关键索引字段
    public static final String KEY_1 = "msg_type";
    public static final String KEY_2 = "FsuId";
    public static final String KEY_3 = "CurrentVal";
    public static final String KEY_4 = "DevId";
    public static final String KEY_5 = "MeteId";
    public static final String KEY_6 = "MeteType";
    public static final String KEY_7 = "OccurTime";
    //常量定义其他字段
    public  static final String KEY_8 = "mete_name";
    public  static final String KEY_9 = "device_name";
    public  static final String KEY_10 = "device_type";
    public  static final String KEY_11 = "devicetype_name";
    public  static final String KEY_12 = "device_kind";
    public  static final String KEY_13 = "devicekind_name";
    public  static final String KEY_14 = "station_id";
    public  static final String KEY_15 = "station_name";
    public  static final String KEY_16 = "parent_path";
    public  static final String KEY_17 = "parent_path_name";
    public  static final String KEY_18 = "precinct_id";
    public  static final String KEY_19 = "precinct_name";
    public  static final String KEY_20 = "mete_type";
    public  static final String KEY_21 = "metetype_name";
    public  static final String KEY_22 = "report_unit";

    private Random rnd = new Random();

    private SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private final String startDate = "2016-01-01 00:00:00";

    private JSONObject avroMeteDataInfo = new JSONObject();

    // 遥信量 遥测量 遥控量 遥调量
    private String[][] dataKind = new String[][]{ { "0", "float" }, { "1", "int" }, { "2", "int" }, { "3", "int" } };// 数据类型

    // 及上报值数据类型
    private String[] deviceName = new String[]{ "iPowwrClient", "前置台ztc", "前置台zy" };
    public  JSONObject generateMeteData() {
        avroMeteDataInfo.put(KEY_1, "mete");
        avroMeteDataInfo.put(KEY_2, ("26869" + String.format("%02d", rnd.nextInt(99))));// FsuId
        Integer currentval = rnd.nextInt(100);
        avroMeteDataInfo.put(KEY_3, currentval.toString());// current val
        Integer devid = rnd.nextInt(deviceName.length);
        avroMeteDataInfo.put(KEY_4, devid.toString());// devid
        Integer meteid = rnd.nextInt(50);
        avroMeteDataInfo.put(KEY_5, meteid.toString());// meteid
        avroMeteDataInfo.put(KEY_6, rnd.nextInt(dataKind.length));// mete type
        avroMeteDataInfo.put(KEY_7, df.format(new rndDate(startDate, df.format(new Date())).randomDate()));
        avroMeteDataInfo.put(KEY_8,rnd.nextInt(100));
        avroMeteDataInfo.put(KEY_9,rnd.nextInt(100));
        avroMeteDataInfo.put(KEY_10,rnd.nextInt(100));
        avroMeteDataInfo.put(KEY_11,rnd.nextInt(100));
        avroMeteDataInfo.put(KEY_12,rnd.nextInt(100));
        avroMeteDataInfo.put(KEY_13,rnd.nextInt(100));
        avroMeteDataInfo.put(KEY_14,rnd.nextInt(100));
        avroMeteDataInfo.put(KEY_15,rnd.nextInt(100));
        avroMeteDataInfo.put(KEY_16,rnd.nextInt(100));
        avroMeteDataInfo.put(KEY_17,rnd.nextInt(100));
        avroMeteDataInfo.put(KEY_18,rnd.nextInt(100));
        avroMeteDataInfo.put(KEY_19,rnd.nextInt(100));
        avroMeteDataInfo.put(KEY_20,rnd.nextInt(100));
        avroMeteDataInfo.put(KEY_21,rnd.nextInt(100));
        avroMeteDataInfo.put(KEY_22,rnd.nextInt(100));
        return avroMeteDataInfo;
    }


}
