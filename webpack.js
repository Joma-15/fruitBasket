const prompt = require('prompt-sync')({sigint: true});
let word = prompt("Enter anything here : ");

if (word.startsWith('world', 6)) {
    console.log('yes its start with hello')
}

