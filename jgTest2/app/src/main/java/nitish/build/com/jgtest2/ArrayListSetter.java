package nitish.build.com.jgtest2;

import android.widget.Toast;


import static nitish.build.com.jgtest2.AllStringsArrays.*;

public class ArrayListSetter {
    static String[] setedlist;
    public static String[] setBranchList(int coursepos) {
     switch (coursepos){
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
        String codeStr = Integer.toString(clickedpos);
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
}
