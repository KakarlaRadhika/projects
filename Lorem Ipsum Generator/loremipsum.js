document.getElementById('btn').addEventListener('click',()=>{
    var inputValue=document.getElementById('txt').value;
    generatePara(inputValue);


    
})
function generatePara(inputValue){
    var rand="lorem ipsum dummy text of the printing and typesetting."+
    "  text of the printing and typesetting industry ."+
    " Lorem Ipsum has been the industry's standard dummy text ever since the 1500s. when an unknown printer took a galley of type and scrambled it to make a type specimen book..";
     
    document.getElementById("paragraph").innerHTML="";   
    document.getElementById("paragraphDiv").style.boxShadow= "0px 2px 15px black"; 
        for(let i=1; i<=inputValue;i++){
             
            document.getElementById('paragraph').innerHTML += "<br/>"+i+"."+"<br>"+rand;
            
        }
    console.log(inputValue);
    console.log(rand);
}
