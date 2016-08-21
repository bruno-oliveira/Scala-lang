def balance(chars: List[Char]): Boolean = {
	def checks(chars: List[Char], aux:Int):Int={
	if(chars.isEmpty || aux<0) aux
	else{ 
	if(chars.head==')') {
		println("head is ) ")
		checks(chars.tail,aux-1)}
	else {
	println("head is ( ") 
	checks(chars.tail,aux+1)}
	}
}
checks(chars,0)==0}
