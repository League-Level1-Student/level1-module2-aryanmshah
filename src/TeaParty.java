
public class TeaParty {
        public String welcome(String name, boolean isWoman, boolean isKnighted) {
			if(isWoman==false&&isKnighted==true) {
				return "sir "+name;
				
			}
			else if(isWoman==true&&isKnighted==true) {
				return "Lady "+name;
        }
			else if(isWoman==true&&isKnighted==false) {
				return "Ms."+name;
        }
			else if(isWoman==false&&isKnighted==false) {
				return "Mr."+name;
        }
        
        }
}