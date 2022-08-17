
let Elevatorfloor = 5;
let Elevatormine = 2;

if(Elevatorfloor <0 || Elevatorfloor > 15){
	alert()
}

document.getElementById("state_mine").innerHTML = `내 층수 : ${Elevatormine}`


function upbutton(){
	Elevatorfloor += 1;
	document.getElementById("state_Elevator").innerHTML = `엘리베이터 층수 : ${Elevatorfloor}`
}

function downbutton(){
	Elevatorfloor -= 1;
	document.getElementById("state_Elevator").innerHTML = `엘리베이터 층수 : ${Elevatorfloor}`
}