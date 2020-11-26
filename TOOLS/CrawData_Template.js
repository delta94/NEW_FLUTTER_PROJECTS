var fs = require('fs');
const request = require('request');
const cheerio = require('cheerio');

var dir = './tmp';
var file = `${dir}/data.txt`;

try {
  // fs.unlinkSync(file);
} catch (error) {
  
}

for (let index = 400; index < 500; index++) {
  readWebData(index);
}

async function readWebData(index){
  request(`http://www.purine-direkt.de/index.php?r=food-purin%2Fview&id=${index}`, function (err, resp, html) {
    if (!err) {
      var selector = cheerio.load(html);
      var htmlStr = selector('body').html();
      // console.log(htmlStr)
      if(!htmlStr){
        console.log('---------------------------------->FILM NOT FOUND<-------------------------------');
      } else {
        const title = selector("body")
        .find(".food-purin-view")
        .find("h1")
        .text()
        .trim();
        
        const row = selector("body").find("table[id='w0']").find("tbody > tr");

        console.log(`-->index: ${index}`);
        if(row != null && row != '' && row != undefined){
          const value = row.children('td')[2].children[0].data;
  
          if (!fs.existsSync(dir)){
            fs.mkdirSync(dir);
          }
          writeDataToFile(file, title, value);
        } else {
          console.log(`error===========> index: ${index}`)
        }
      }
    } else {
      console.log(`error===========> index: ${index}`)
    }
  });
}

function writeDataToFile(file, title, value){
  title.replace(/'/g, '\'');
  fs.appendFile(`${file}`, `Food('${title}', ${value}),\r\n`, function (err) {
    if (err) return console.log(err);
  });
}



