const prompt = require('prompt-sync')({signit: true})
let name = prompt('please enter your name : ')//return a string value by default
console.log(`hello my name is ${name}`)