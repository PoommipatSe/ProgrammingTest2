/**
 * Created by pruet on 18/11/2559.
 */
public class Request implements IRequest {

    private static String studentID;
    private static String courseID;
    private static int type;

    public static IRequest createRequest(int type, String studentID, String courseID) {
        IRequest tmp = new Request();
        //Request.studentID = studentID;
        tmp.setCourseID(courseID);
        //Request.courseID = courseID;
        tmp.setStudentID(studentID);
        //Request.type = type;
        tmp.setType(type);
        return tmp;
    }

    protected Request()
    {
        throw new UnsupportedOperationException("Please override this method");
    }

    @Override
    public String getStudentID() {
        return studentID;
    }

    @Override
    public String setStudentID(String studentID) {
        if (null != studentID){
            this.studentID = studentID;
            return studentID;
        } else throw new RuntimeException();
    }

    @Override
    public String getCourseID() {
        return courseID;
    }

    @Override
    public void setCourseID(String courseID) {
        if (null != courseID){
            this.courseID = courseID;
        }
    }

    @Override
    public int getRequestType() {
        return type;
    }

    @Override
    public int setType(int type) {
        if (type == 1 || type == 2) {
            this.type = type;
            return type;
    } else throw new RuntimeException();
    }
}
