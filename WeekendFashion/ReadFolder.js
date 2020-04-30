const testFolder = './SUBTITLE_SAMPLE/images/';
const fs = require('fs');

fs.readdir(testFolder, (err, files) => {
  files.forEach(file => {
    fs.appendFile('data.txt', '- images/' + file + '\n', function (err) {
	  
	});
  });
});