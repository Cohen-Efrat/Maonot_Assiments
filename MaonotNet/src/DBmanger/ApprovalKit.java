package DBmanger;

public class ApprovalKit {

    public int ID;

    public int StundetId ;

    public String FullName;

    public String RoomType;

    public String LivingWithReligious;

    public int LivingWithSmoker;

    public String ReligiousType;

    public String HealthCondition;

	public int PartnerId1 ;

	public int PartnerId2 ;

    public int PartnerId3 ;
    
    
    public ApprovalKit(int iD, int stundetId, String fullName, String roomType, String livingWithReligious,
			int livingWithSmoker, String religiousType, String healthCondition, int partnerId1, int partnerId2,
			int partnerId3) {
		ID = iD;
		StundetId = stundetId;
		FullName = fullName;
		RoomType = roomType;
		LivingWithReligious = livingWithReligious;
		LivingWithSmoker = livingWithSmoker;
		ReligiousType = religiousType;
		HealthCondition = healthCondition;
		PartnerId1 = partnerId1;
		PartnerId2 = partnerId2;
		PartnerId3 = partnerId3;
	}

@Override
public String toString() {
	return "ApprovalKit [ID=" + ID + ", StundetId=" + StundetId + ", FullName=" + FullName + ", RoomType="
			+ RoomType + ", LivingWithReligious=" + LivingWithReligious + ", LivingWithSmoker=" + LivingWithSmoker
			+ ", ReligiousType=" + ReligiousType + ", HealthCondition=" + HealthCondition + ", PartnerId1="
			+ PartnerId1 + ", PartnerId2=" + PartnerId2 + ", PartnerId3=" + PartnerId3 + "]";
}







}