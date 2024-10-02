//importing prompt module
const prompt = require("prompt-sync")({sigint: true});

//creating a variable that will ask the user for his/her name
let username = prompt("Please enter your name : ")
console.log(`hello my name is ${username} and i am a computer engineering student studying at STI lipa`)