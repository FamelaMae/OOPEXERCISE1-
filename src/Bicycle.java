public class Bicycle
{
	private String ownerName,TagNo;

		public Bicycle() {
			ownerName = "Uknown";
			TagNo = "Unknown";
		}
		public String getOwnerName(){
			return ownerName;
		}
		public String getTagNo(){
			return TagNo;
		}

		public void setOwnerName(String name) {
			ownerName = name;
		}


		public void settagNo(String name){
			TagNo = name;
		}
}
