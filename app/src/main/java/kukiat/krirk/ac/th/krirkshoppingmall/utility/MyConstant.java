package kukiat.krirk.ac.th.krirkshoppingmall.utility;

/**
 * Created by Cnz on 27/03/2018.
 */

public class MyConstant {

//     About URL
    private String urlAddUserString = "http://androidthai.in.th/kir/addDataUng.php";
    private String urlGetAllUserString = "http://androidthai.in.th/kir/getAllDataKu.php";


//    About Array

    private String[] columnUser = new String[]{"id", "Name", "User", "Password", "Mode"};

    public String[] getColumnUser() {
        return columnUser;
    }

    public String getUrlGetAllUserString() {
        return urlGetAllUserString;
    }

    public String getUrlAddUserString() {
        return urlAddUserString;
    }
} // Main Class
