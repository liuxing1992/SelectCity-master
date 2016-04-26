package com.zaaach.citypicker.model;

/**
 * Created by liu_yao on 16/4/26.
 */
public class PinnedBean {

    public static final int ITEM = 0;
    public static final int SECTION = 1;
    public static final int LOCATE = 2;
    public static final int HOT = 3;

    public int type;  //是se 还是 item
    public String text;  //
    public int getType() {
        return type;
    }
    public void setType(int type) {
        this.type = type;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public PinnedBean(int type, String text) {
        super();
        this.type = type;
        this.text = text;
    }

//    public static List<PinnedBean> getList(List<City> cityModels){
//        ArrayList<PinnedBean> list=new ArrayList<PinnedBean>();
//        for (int i = 0; i < cityModels.size(); i++) {
//            String currentStr = cityModels.get(i).getNameSort();
//            String previewStr = (i - 1) >= 0 ? cityModels.get(i - 1)
//                    .getNameSort() : " ";
//
//            if (!currentStr.equals(previewStr)) {
//
//                list.add(new PinnedBean(SECTION, currentStr));
//                list.add(new PinnedBean(ITEM, cityModels.get(i).getCityName()));
//            }else {
//                list.add(new PinnedBean(ITEM, cityModels.get(i).getCityName()));
//            }
//        }
//        return list;
//    }
}
