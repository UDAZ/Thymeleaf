package work.contre.NoDI;

import javax.validation.constraints.NotEmpty;

public class ShainForm {

@NotEmpty(message = " 社員Noを入れてくださいね")
private String number;

public String getNumber() {
return number;
}

public void setNumber(String number) {
this.number = number;
}

}