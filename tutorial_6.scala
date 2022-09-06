object tutorial_6 extends App{

	val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

	val shift = scala.io.StdIn.readLine("Shift By = ").toInt; 

	val inputText = scala.io.StdIn.readLine("Input the string = ")

	val outputText_1 = inputText.map( (c: Char) => { 

		val x = alphabet.indexOf(c.toUpper)

		if (x == -1){
			c
		}
		else{
			alphabet((x + shift) % alphabet.size)
			} 
	});


	val outputText_2 = outputText_1.map( (c: Char) => { 

		val x = alphabet.indexOf(c.toUpper)

		if ((x - shift)<0){
			alphabet((x - shift)+26)
		}
		else{
			alphabet((x - shift) % alphabet.size)
			} 
 
	});

	println("Encrypted string = "+outputText_1);
	println("Decrypted string = "+outputText_2);
}