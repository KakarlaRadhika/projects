document.getElementById('firstname').addEventListener('keypress',()=>
{
    if(document.getElementById('firstname').value.length<4){
    document.getElementById('disp').style.visibility='visible'
   
    }
    else{
        document.getElementById('disp').style.visibility='hidden'
    
    }
})

document.getElementById("lastname").addEventListener('keypress',()=>{
 if(document.getElementById("lastname").value.length<4){
    document.getElementById('disp1').style.visibility='visible'

}
else{
    document.getElementById('disp1').style.visibility='hidden'
    }
})
document.getElementById("num").addEventListener('keypress',()=>{
if(document.getElementById("num").value.length<9){
    document.getElementById('disp2').style.visibility='visible'
}
else{
    document.getElementById('disp2').style.visibility='hidden'

}
})
document.getElementById("email").addEventListener('keypress',()=>{
if(document.getElementById("email").value.indexOf("@",0)<0){
    document.getElementById("disp3").style.visibility='visible'
}
else{
    document.getElementById('disp3').style.visibility='hidden'

}
})
document.getElementById("email").addEventListener('keypress',()=>{
if(document.getElementById("email").value.indexOf(".",0)<0){
    document.getElementById("disp3").style.visibility='visible'
}
else{
    document.getElementById('disp3').style.visibility='hidden'

}
})
document.getElementById("pwd").addEventListener('keypress',()=>{
if(document.getElementById("pwd").value.length<6){

    document.getElementById('disp4').style.visibility='visible'
}
else{
    document.getElementById('disp4').style.visibility='hidden'

}})

function validate(){
    if(document.getElementById('firstname').value===""){
        alert('firstname compulsary')}
          
    
        if(document.getElementById('lastname').value===""){
            alert('lastname compulsary')}
            if(document.getElementById('num').value===""){
                alert('mobile number compulsary')}
                if(document.getElementById('email').value===""){
                    alert('password compulsary')}
                   
                if(document.getElementById('pwd').value===""){
                    alert('password compulsary')}
                    if(document.getElementById('confirmpwd').value===""){
                        alert('confirmpassword compulsary')}
                                               
    
    if(document.getElementById('pwd').value!==document.getElementById("confirmpwd").value){
        alert("invalid")
       
    }
    

    
}
