const saveBtn = document.getElementById("save")
const textInput = document.getElementById("text");
const fileInput = document.getElementById("file");

const modeBtn = document.getElementById("mode-btn");
const destroyBtn = document.getElementById("destroy-btn");
const eraserBtn = document.getElementById("eraser-btn");
// 배열을 생성해줌
const colorOptions = Array.from(document.getElementsByClassName("color-option"));

const canvas = document.querySelector("canvas");
const lineWidth = document.getElementById("line-width");
const color = document.getElementById("color");
// 켄버스에 그림을 그릴떄 씀 (context) 붓
const ctx = canvas.getContext("2d");

const CANVAS_WIDHT = 800;
const CANVAS_HEIGHT = 800;

canvas.width = CANVAS_WIDHT;
canvas.height = CANVAS_HEIGHT;
ctx.lineWidth =lineWidth.value; // 선 두꺠조절
ctx.lineCap = "round"; // 선끝을 둥글게해서 자연스럽게함
let isPainting = false;
let isFilling = false;

function onMove(e){
    if(isPainting){
        ctx.lineTo(e.offsetX, e.offsetY);
        ctx.stroke();
        return;
    }
    ctx.beginPath();// 눌럿따 땔 때마다 새로운 선 출력
    ctx.moveTo(e.offsetX, e.offsetY);
}
function onMouseDown(){
    isPainting = true;
}
function cancelPainting(){
    isPainting = false;
}
// 굵기 조절
function onLineWidthChange(e){
    ctx.lineWidth = e.target.value;
}
function onColorChange(e){
    ctx.strokeStyle = e.target.value;
    ctx.fillStyle = e.target.value;
}
function onColorClick(e){
    const colorValue = e.target.dataset.color; // 이게 html에서 정해준 색값 변경시켜줌
    ctx.strokeStyle = colorValue;
    ctx.fillStyle = colorValue;
    color.value = colorValue; // 색바꿔주면 html컬러 박스에 색깔값 표시
}
function onModeClick(){
    if(isFilling){
        isFilling = false;
        modeBtn.innerText = "색 채우기"
    }else{
        isFilling = true;
        modeBtn.innerText = "펜슬"
    }
}
function onCanvasClick(){
    if(isFilling){
        ctx.fillRect(0, 0, CANVAS_WIDHT, CANVAS_HEIGHT); // 그림판의 전체 크기채워줌 
    }                    // onModeClick 에서 true가 됫기떄문에 작동
}
function onDestroyClick(e){
    ctx.fillStyle = "white";
    ctx.fillRect(0, 0, CANVAS_WIDHT, CANVAS_HEIGHT);
}
function onEraserClick(){
    ctx.strokeStyle = "white";
    isFilling = false; // 지우개 누르면 채우기 모드 종료
    modeBtn.innerText = "색 채우기"
}
function onFileChange(e){
    const file = e.target.files[0];
    const url = URL.createObjectURL(file);
    const image = new Image();
    image.src = url; // <img src=""> 랑 같음
    image.onload = function(){
        ctx.drawImage(image, 0, 0, CANVAS_WIDHT, CANVAS_HEIGHT); // 사진 크기 설정
        fileInput.value = null; // 새사진 추가하면 이전사진 사라짐
    }
}
function onDoubleClick(e){
    const text = textInput.value;
    // text가 비어있지않으면 실행
    if(text !== ""){
        ctx.save(); // 현재 상태를 저장 
        ctx.lineWidth = 1; // 글자 기본굵기 1로 설정
        ctx.font = "68px serif"
        ctx.fillText(text, e.offsetX, e.offsetY); // text가 출력될 좌표를읽고 원하는곳에 생성해줌
        ctx.restore();
    }
    // save, restore : 이 사이의 명령은 실행될때만 쓰이고 그뒤에는 기존 실행에 영향 x
}
function onSaveClick(){
    const url = canvas.toDataURL();
    const a = document.createElement("a");
    a.href = url;
    a.download = "myDrawing.png";
    a.click();
}



// 마우스 움직일때
canvas.addEventListener("mousemove", onMove);
// 마우스 눌렀을때만 작동
canvas.addEventListener("mousedown", onMouseDown);
// 마우스를 땟을 때
canvas.addEventListener("mouseup", cancelPainting);
// 마우스가 떠나갔을때(마우스가 영역 밖 이탈 시 버그 방지)
canvas.addEventListener("mouseleave", cancelPainting);
// 굵기 조절
lineWidth.addEventListener("change", onLineWidthChange);
// 색깔 체인지
color.addEventListener("change", onColorChange);
// 정해진 색으로 체인지
colorOptions.forEach(color => color.addEventListener("click", onColorClick));
// 색 전체채우기 조건부 설정
modeBtn.addEventListener("click", onModeClick);
// 색 전체채우기 영역설정
canvas.addEventListener("mouseup", onCanvasClick);
// 전체 삭재
destroyBtn.addEventListener("click", onDestroyClick);
// 지우개
eraserBtn.addEventListener("click", onEraserClick);
// 사진 가져오기
fileInput.addEventListener("change", onFileChange)
// input text창 더블클릭
canvas.addEventListener("dblclick", onDoubleClick);
// 그림판 저장
saveBtn.addEventListener("click", onSaveClick);







//-------------------------------------------------------------
// 기본 연습

// const colors = [
//     "#ff3838",
//     "#ffb8b8",
//     "#c56cf0",
//     "#ff9f1a",
//     "#fff200",
//     "#32ff7e",
//     "#7efff5",
//     "#18dcff",
//     "#7d5fff",
//   ];


// function onClick(event){
//     ctx.beginPath();
//     ctx.moveTo(800,800);
//     const color = colors[Math.floor(Math.random() * colors.length)];
//     ctx.strokeStyle = color;
//     ctx.lineTo(event.offsetX, event.offsetY);
//     ctx.stroke();
// }

// canvas.addEventListener("mousemove", onClick);






// // 그림판 좌표 지정
// // stroke 선 fill 채우기
// ctx.fillRect(210, 200, 15, 100);
// ctx.fillRect(350, 200, 15, 100);
// ctx.fillRect(260, 200, 60, 200);

// ctx.arc(290, 140, 50, 0, 2*Math.PI);// 원 그려줌
// ctx.fill();

// ctx.beginPath();
// ctx.fillStyle = "white"
// ctx.arc(270, 150, 10, Math.PI, 2*Math.PI);
// ctx.arc(310, 150, 10, Math.PI, 2*Math.PI);
// ctx.fill();
// ctx.lineWidth = 2; 
// ctx.beginPath(); // 이전 경로와 단절 새 경로시작