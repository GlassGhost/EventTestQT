/*_______________________________________________________________________License
	Copyright © 2022 Roy Pfund

	Licensed under the Apache License, Version 2.0 (the  "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

		http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable  law  or  agreed  to  in  writing,
	software distributed under the License is distributed on an  "AS
	IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,  either
	express or implied. See the License for  the  specific  language
	governing permissions and limitations under the License.
__________________________________________________________*/package EventTestQT;
import io.qt.widgets.*;
//Creating and using Your own custom events in Java.

//Optional: sender & receiver in same scope
/*________________________________________________________________*/class Test {
	public static void main(String[] args) {
		Catcher catcher = new Catcher();
		Thrower thrower = new Thrower();

		thrower.addThrowListener(catcher);

		thrower.Throw();
        QApplication.initialize(args);
        QMessageBox.information(null, "QtJambi", "Hello World!");
        QApplication.shutdown();
		
	}
}

