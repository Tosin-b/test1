package mi.gmit;

public class employee {
    private String title;
    private String name;
    private String PPS_ID;
    private String phoneNumber;
    private String employmentType;
    private int age;

    public employee(String name,String PPS_ID,String phoneNumber
            ,String employmentType,int age,String title)
    {
        setTitle(title);
        setName(name);
        setPPS_ID(PPS_ID);
        setPhoneNumber(phoneNumber);
        setEmploymentType(phoneNumber);
        setAge(age);
    }

    private void setTitle(String title) {
        if(title.equals("Mr")){
            this.title = title;
        }
        else if(title.equals("Mrs")){
            this.title = title;
        }
        else{
            throw new IllegalStateException("this title is incorrect");
        }
    }

    public void setName(String name) {
        if(name.length() >=3){
            this.name =name;
        }
        else {
            throw new IllegalStateException("Incorrect name");
        }
    }

    public void setPPS_ID(String PPS_ID) {
        if(PPS_ID.length() >=8){
            this.PPS_ID =PPS_ID;
        }
        else {
            throw new IllegalStateException("Incorrect PPS_ID number");
        }
    }

    public void setPhoneNumber(String phoneNumber) {

        if(phoneNumber.length() ==8){
            this.phoneNumber =phoneNumber;
        }
        else {
            throw new IllegalStateException("Incorect phone number");
        }

    }

    public void setEmploymentType(String employmentType) {
        if(employmentType.equals("Full time")){
            this.employmentType = employmentType;
        }
        else if(employmentType.equals("part-Time")){
            this.employmentType = employmentType;
        }
        else if(employmentType.equals("Contract")){
            this.employmentType = employmentType;
        }
        else{
            throw new IllegalStateException("this employee type is incorrect");
        }
    }

    public void setAge(int age) {
        if(age >16){
            this.phoneNumber =phoneNumber;
        }
        else {
            throw new IllegalStateException("too young");
        }
    }



    public String getName() {
        return name;
    }

    public String getPPS_ID() {
        return PPS_ID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmploymentType() {
        return employmentType;
    }
    public int getAge() {
        return age;
    }

    public String getTitle() {
        return title;
    }
}