var BOARD_SIZE = 375;
var noOffaces=3;
IMAGE_HEIGHT = 62
IMAGE_WIDTH = 62
var level=1;
var left= document.getElementById("leftSide");
var right=document.getElementById("rightSide");
var board=document.getElementById("board-container");

//  board.onclick=function gameOver(){
//      alert("Sorry try again")
//  }

function generateFace() {
    document.getElementById("level").innerHTML = "Level " + level;
    for (var i = 1; i <= noOffaces; i++) {
        var anImg = document.createElement("img");
        var randTop = Math.floor(Math.random() * (BOARD_SIZE - IMAGE_HEIGHT));
        var randLeft = Math.floor(Math.random() * (BOARD_SIZE - IMAGE_WIDTH));
        anImg.src ="smiley.png";
        anImg.style.top = randTop + "px";
        anImg.style.left = randLeft + "px";
        anImg.style.width = "10%"
        anImg.style.height = "10%"
        left.appendChild(anImg)
        right.appendChild(anImg.cloneNode(true))
    }
    
    var lanImg = document.createElement("img");
    var randTop = Math.floor(Math.random() * (BOARD_SIZE - IMAGE_HEIGHT));
    var randLeft = Math.floor(Math.random() * (BOARD_SIZE - IMAGE_WIDTH));
    lanImg.src ="smiley.png";
    lanImg.style.top = randTop + "px";
    lanImg.style.left = randLeft + "px";
    lanImg.style.width = "10%"
    lanImg.style.height = "10%"
    lanImg.onclick = rightImage
    left.appendChild(lanImg)
    
}

  

  function rightImage()
  {
      window.alert("you got the right image")
      noOffaces = noOffaces + 1
      level +=1
      while (left.firstChild) {
        left.removeChild(left.lastChild);
      }
      while (right.firstChild) {
        right.removeChild(right.lastChild);
      }
      generateFace();
  }
  