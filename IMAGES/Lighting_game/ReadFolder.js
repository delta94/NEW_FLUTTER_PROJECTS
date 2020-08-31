const testFolder = './';
const fs = require('fs');

fs.readdir(testFolder, (err, files) => {
  files.forEach(file => {
    fs.appendFile('data.txt', '- asset/images/' + file + '\n', function (err) {
	  
	});
  });
});