package com.example.guowh.listview_test;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by guowh on 2016/11/3.
 */

public class MyDatabaseHelper extends SQLiteOpenHelper {


    private String[] str=new String[98];
    private void sqlstr(){
        str[0]="insert into stulisttb(id,name,state) values ('631406010102','莫天金',1);";
        str[1]="insert into stulisttb(id,name,state) values ('631406010103','吴国平',1);";
        str[2]="insert into stulisttb(id,name,state) values ('631406010104','孙文斌',1);";
        str[3]="insert into stulisttb(id,name,state) values ('631406010105','潘俊旭',1);";
        str[4]="insert into stulisttb(id,name,state) values ('631406010106','石佳磊',1);";
        str[5]="insert into stulisttb(id,name,state) values ('631406010107','赵权',1);";
        str[6]="insert into stulisttb(id,name,state) values ('631406010108','马鹏',1);";
        str[7]="insert into stulisttb(id,name,state) values ('631406010109','郭文浩',1);";
        str[8]="insert into stulisttb(id,name,state) values ('631406010110','李季',1);";

        str[9]="insert into stulisttb(id,name,state) values ('631406010111','陈仕豪',1);";
        str[10]="insert into stulisttb(id,name,state) values ('631406010112','杜菲',1);";
        str[11]="insert into stulisttb(id,name,state) values ('631406010113','李红兵',1);";
        str[12]="insert into stulisttb(id,name,state) values ('631406010114','蔡佳辰',1);";
        str[13]="insert into stulisttb(id,name,state) values ('631406010115','肖洒益',1);";
        str[14]="insert into stulisttb(id,name,state) values ('631406010117','伍凯荣',1);";
        str[15]="insert into stulisttb(id,name,state) values ('631406010118','张林',1);";
        str[16]="insert into stulisttb(id,name,state) values ('631406010119','王斌',1);";
        str[17]="insert into stulisttb(id,name,state) values ('631406010120','廖宇峰',1);";
        str[18]="insert into stulisttb(id,name,state) values ('631406010122','谭建',1);";
        str[19]="insert into stulisttb(id,name,state) values ('631406010123','左永和',1);";
        str[20]="insert into stulisttb(id,name,state) values ('631406010124','王增辉',1);";
        str[21]="insert into stulisttb(id,name,state) values ('631406010128','任中豪',1);";
        str[22]="insert into stulisttb(id,name,state) values ('631406010129','何泳桦',1);";
        str[23]="insert into stulisttb(id,name,state) values ('631406010130','张力',1);";
        str[24]="insert into stulisttb(id,name,state) values ('631406010131','任达',1);";
        str[25]="insert into stulisttb(id,name,state) values ('631404090425','李自力',1);";
        str[26]="insert into stulisttb(id,name,state) values ('631406010201','肖霞',1);";
        str[27]="insert into stulisttb(id,name,state) values ('631406010203','郑建峰',1);";
        str[28]="insert into stulisttb(id,name,state) values ('631406010206','程飘',1);";
        str[29]="insert into stulisttb(id,name,state) values ('631406010207','王浩',1);";
        str[30]="insert into stulisttb(id,name,state) values ('631406010208','李建鹏',1);";
        str[31]="insert into stulisttb(id,name,state) values ('631406010209','张向守',1);";
        str[32]="insert into stulisttb(id,name,state) values ('631406010210','邱凯',1);";
        str[33]="insert into stulisttb(id,name,state) values ('631406010211','罗七奇',1);";
        str[34]="insert into stulisttb(id,name,state) values ('631406010214','李佩科',1);";
        str[35]="insert into stulisttb(id,name,state) values ('631406010216','黄许飞',1);";
        str[36]="insert into stulisttb(id,name,state) values ('631406010217','钟富胜',1);" ;
        str[37]="insert into stulisttb(id,name,state) values ('631406010218','陈鸿',1);";
        str[38]="insert into stulisttb(id,name,state) values ('631406010219','易家洛',1);";
        str[39]="insert into stulisttb(id,name,state) values ('631406010220','邓强',1);";
        str[40]="insert into stulisttb(id,name,state) values ('631406010222','原晨',1);";
        str[41]="insert into stulisttb(id,name,state) values ('631406010223','袁益',1);";
        str[42]="insert into stulisttb(id,name,state) values ('631406010224','石峻臣',1);";
        str[43]="insert into stulisttb(id,name,state) values ('631406010226','张洋',1);";
        str[44]="insert into stulisttb(id,name,state) values ('631406010227','唐玉',1);";
        str[45]="insert into stulisttb(id,name,state) values ('631406010228','秦皓',1);";
        str[46]="insert into stulisttb(id,name,state) values ('631406010229','刘妍',1);";
        str[47]="insert into stulisttb(id,name,state) values ('631406010230','严伟安',1);";
        str[48]="insert into stulisttb(id,name,state) values ('631406010231','杨煌',1);";
        str[49]="insert into stulisttb(id,name,state) values ('631426140213','李中耀',1);";
        str[50]="insert into stulisttb(id,name,state) values ('631306050204','高杰',1);";
        str[51]="insert into stulisttb(id,name,state) values ('631406010301','李佳佳',1);";
        str[52]="insert into stulisttb(id,name,state) values ('631406010303','何友鹏',1);";
        str[53]="insert into stulisttb(id,name,state) values ('631406010306','郭耕佐',1);";
        str[54]="insert into stulisttb(id,name,state) values ('631406010307','杨飘',1);";
        str[55]="insert into stulisttb(id,name,state) values ('631406010308','李中清',1);";
        str[56]="insert into stulisttb(id,name,state) values ('631406010309','王亢',1);";
        str[57]="insert into stulisttb(id,name,state) values ('631406010311','郭睿',1);";
        str[58]="insert into stulisttb(id,name,state) values ('631406010312','江航',1);";
        str[59]="insert into stulisttb(id,name,state) values ('631406010313','张丰伟',1);";
        str[60]="insert into stulisttb(id,name,state) values ('631406010314','左琴',1);";
        str[61]="insert into stulisttb(id,name,state) values ('631406010315','徐红涛',1);";
        str[62]="insert into stulisttb(id,name,state) values ('631406010316','王梦迪',1);";
        str[63]="insert into stulisttb(id,name,state) values ('631406010317','陶军华',1);";
        str[64]="insert into stulisttb(id,name,state) values ('631406010318','黄震国',1);";
        str[65]="insert into stulisttb(id,name,state) values ('631406010319','张舰心',1);";
        str[66]="insert into stulisttb(id,name,state) values ('631406010321','杨升',1);";
        str[67]="insert into stulisttb(id,name,state) values ('631406010322','成黉',1);";
        str[68]="insert into stulisttb(id,name,state) values ('631406010323','丁莹',1);";
        str[69]="insert into stulisttb(id,name,state) values ('631406010324','冯明建',1);";
        str[70]="insert into stulisttb(id,name,state) values ('631406010326','陈雷',1);";
        str[71]="insert into stulisttb(id,name,state) values ('631406010327','孙作明',1);";
        str[72]="insert into stulisttb(id,name,state) values ('631406010328','李帆',1);";
        str[73]="insert into stulisttb(id,name,state) values ('631406010329','樊庆珂',1);";
        str[74]="insert into stulisttb(id,name,state) values ('631406010330','张建辉',1);";
        str[75]="insert into stulisttb(id,name,state) values ('631406010331','欧诗卿',1);";
        str[76]="insert into stulisttb(id,name,state) values ('631424210205','李嘉华',1);";
        str[77]="insert into stulisttb(id,name,state) values ('631406010401','刘翠芳',1);" ;
        str[78]="insert into stulisttb(id,name,state) values ('631406010402','李杰',1);";
        str[79]="insert into stulisttb(id,name,state) values ('631406010404','杨林',1);";
        str[80]="insert into stulisttb(id,name,state) values ('631406010405','刘佳',1);";
        str[81]="insert into stulisttb(id,name,state) values ('631406010408','刘钊宏',1);";
        str[82]="insert into stulisttb(id,name,state) values ('631406010409','董刚',1);";
        str[83]="insert into stulisttb(id,name,state) values ('631406010410','伍守增',1);";
        str[84]="insert into stulisttb(id,name,state) values ('631406010411','裴丹',1);";
        str[85]="insert into stulisttb(id,name,state) values ('631406010412','梁健',1);";
        str[86]="insert into stulisttb(id,name,state) values ('631406010413','李奕达',1);";
        str[87]="insert into stulisttb(id,name,state) values ('631406010416','陈劲',1);";
        str[88]="insert into stulisttb(id,name,state) values ('631406010417','朱彤',1);";
        str[89]="insert into stulisttb(id,name,state) values ('631406010418','张亮',1);";
        str[90]="insert into stulisttb(id,name,state) values ('631406010419','陈兴',1);";
        str[91]="insert into stulisttb(id,name,state) values ('631406010422','龚毅',1);";
        str[92]="insert into stulisttb(id,name,state) values ('631406010423','罗艺',1);";
        str[93]="insert into stulisttb(id,name,state) values ('631406010424','陈朝阳',1);";
        str[94]="insert into stulisttb(id,name,state) values ('631406010425','张宇',1);";
        str[95]="insert into stulisttb(id,name,state) values ('631406010426','向健',1);";
        str[96]="insert into stulisttb(id,name,state) values ('631406010428','廖旺',1);";
        str[97]="insert into stulisttb(id,name,state) values ('631406010430','陈建川',1);";
    }

    public MyDatabaseHelper(Context context) {
        super(context,"stulist.db", null, 1);
    }

    @Override//首次创建数据库时使用
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table stulisttb(id text primary key,name text,state integer default(0));");
        sqlstr();
        for(int i=0;i<str.length;i++){
            db.execSQL(str[i]);
        }
    }

    @Override//更新数据库
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
