public class Address {
	String street,city,state,housenumber,pin;
	Address(String a,String b,String c,String d, String e){
		housenumber=a;
		street=b;
		city=c;
		state=d;
		pin=e;		
	}
	public String getAddress() {
		return("Address: "+housenumber+" , "+street+" , "+city+" , "+state+" ,Pincode: "+pin);
	}

}
