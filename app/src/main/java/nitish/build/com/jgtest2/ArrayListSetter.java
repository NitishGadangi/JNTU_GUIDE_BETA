package nitish.build.com.jgtest2;

import android.util.Log;
import android.widget.Switch;
import android.widget.Toast;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Field;

import static nitish.build.com.jgtest2.AllStringsArrays.*;

public class ArrayListSetter {
    static String[] setedlist;
    public static String[] setBranchList(int coursepos) {
     switch (coursepos%10){
        case 1:
        setedlist = BRANCHESBTECH;
        break;
        case 2:
        setedlist = BRANCHES_IDP;
        break;
        case 3:
        setedlist = BRANCHES_IDP;
        break;
        case 4:
        setedlist = BRANCHES_MTECH;
        break;
        case 5:
        setedlist = BRANCHES_MSC;
        break;
        default:
        setedlist = BRANCHESBTECH;
    }
        return setedlist;
    }

    public static String[] setYearList(int clickedpos) {
        String codeStr = Integer.toString(clickedpos%100);
        if (Integer.parseInt(codeStr.substring(0,1))==1){
            setedlist = YEARS;
        }else if (Integer.parseInt(codeStr.substring(0,1))==2||Integer.parseInt(codeStr.substring(0,1))==3) {
            setedlist = YEARS_IDP;
        } else if (Integer.parseInt(codeStr.substring(0,1))==4){
            setedlist = YEARS_MTECH;
        }else if (Integer.parseInt(codeStr.substring(0,1))==5){
            setedlist = YEARS_MSC;
        }
        return setedlist;
    }


    public static String[][] setSubjectList(String codeForSubject) throws IllegalAccessException {
        String[][] arrAr={};
        AllStringsArrays allStringsArrays = new AllStringsArrays();
        Class<?> cls=allStringsArrays.getClass();
        Field[] fields = cls.getFields();
        for(Field field : fields) {
            String name = field.getName();
            Log.i("codeeeeeSubject",codeForSubject);
            Log.i("fiednameee",name);
            if(name.equals(codeForSubject)) {
                String[][] subjList = (String[][]) field.get(allStringsArrays);
                arrAr=subjList;
            }
        }
        return arrAr;
    }

    public static String[] setSemList(int clickedpos){
        setedlist = SEMESTERS;
        return setedlist;
    }


    public static String getFinalCourseName(int codeFin){
        String finCourse,codeStr=Integer.toString(codeFin);
        int branch = Character.getNumericValue(codeStr.charAt(1)),
                year=Character.getNumericValue(codeStr.charAt(2));
        finCourse=COURSES[Integer.parseInt(codeStr.substring(0,1))-1]+
                setBranchList(Integer.parseInt(codeStr.substring(0,1)))[branch]+
                setYearList(Integer.parseInt(codeStr.substring(0,2)))[year]+
                SEMESTERS[Character.getNumericValue(codeStr.charAt(3))];
        return finCourse;
    }

    public static String extractCodeForSubject(int codeFinal){
        String finCodeOut,codeStr=Integer.toString(codeFinal%10000);
        int temCourseLoc=Character.getNumericValue(codeStr.charAt(0)),
                temBranchLoc=Character.getNumericValue(codeStr.charAt(1)),
                temYrLoc=Character.getNumericValue(codeStr.charAt(2)),
                temSemLoc=Character.getNumericValue(codeStr.charAt(3));
        finCodeOut="";
        if (temCourseLoc==1){
            finCodeOut+="B";
        }else if (temCourseLoc==2){
            finCodeOut+="I";
        }
        switch(temBranchLoc){
            case 0:
                finCodeOut+= (temCourseLoc==1)? "ECE": ((temCourseLoc==2)? "ECE": "");
                break;
            case 1:
                finCodeOut+= (temCourseLoc==1)? "CVL": ((temCourseLoc==2)? "CVL": "");
                break;
            case 3:
                finCodeOut+= (temCourseLoc==1)? "EEE": ((temCourseLoc==2)? "EEE": "");
                break;
            case 4:
                finCodeOut+= (temCourseLoc==1)? "MEC": ((temCourseLoc==2)? "MEC": "");
                break;
            case 5:
                finCodeOut+= (temCourseLoc==1)? "CSE": ((temCourseLoc==2)? "CSE": "");
                break;
            case 6:
                finCodeOut+= (temCourseLoc==1)? "MET": ((temCourseLoc==2)? "": "");
                break;
            case 7:
                finCodeOut+= (temCourseLoc==1)? "CEM": ((temCourseLoc==2)? "": "");
                break;
        }

        finCodeOut+=Integer.toString(temYrLoc+1);
        finCodeOut+= (temSemLoc==0)? "1": ((temSemLoc==1)? "2": "");

        return finCodeOut;
    }


    //---------------------JSON TASKS-----------------------------//
    public static String[] getStringSetFromJson(String jsonData,String code) throws JSONException {

        JSONObject joInit = new JSONObject(jsonData);
        String sheet1 = joInit.getString("Sheet1");
        JSONArray arr = new JSONArray(sheet1);
        String[] result = new String[arr.length()];
        JSONObject jotemp;
        for (int i =0 ; i<arr.length();i++){
            jotemp = arr.getJSONObject(i);
            result[i]=jotemp.getString(code);
        }
        return  result;
    }




}
